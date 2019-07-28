package com.p2p.reg;

import com.p2p.commons.entity.Users;
import com.p2p.commons.mapper.UsersMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class regTest {
    @Autowired
    UsersMapper usersMapper;

    @Test
    public void test(){
        for (int i = 0; i < 100; i++) {
            Users users = new Users();
            users.setUsername(i+"");
            usersMapper.insert(users);
        }

    }
}
