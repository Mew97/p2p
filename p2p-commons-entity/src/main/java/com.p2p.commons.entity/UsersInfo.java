package com.p2p.commons.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 用户详细信息表
 * </p>
 *
 * @author zhu
 * @since 2019-07-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UsersInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    @TableField("user_id")
    private String userId;

    /**
     * qq
     */
    @TableField("qq")
    private Long qq;

    /**
     * 昵称
     */
    @TableField("nickname")
    private String nickname;

    /**
     * 真实姓名
     */
    @TableField("real_name")
    private String realName;

    /**
     * 性别
     */
    @TableField("sex")
    private String sex;

    /**
     * 籍贯
     */
    @TableField("native_place")
    private String nativePlace;

    /**
     * 婚姻状况
     */
    @TableField("marital_status")
    private String maritalStatus;

    /**
     * 子女
     */
    @TableField("children")
    private String children;

    /**
     * 学历
     */
    @TableField("education_background")
    private String educationBackground;

    /**
     * 月收入
     */
    @TableField("monthly_income")
    private String monthlyIncome;

    /**
     * 社保
     */
    @TableField("social_security")
    private String socialSecurity;

    /**
     * 社保电脑号
     */
    @TableField("social_security_computer_number")
    private Long socialSecurityComputerNumber;

    /**
     * 住房条件
     */
    @TableField("housing_conditions")
    private String housingConditions;

    /**
     * 是否购车
     */
    @TableField("whether_car")
    private String whetherCar;

    /**
     * 逾期记录
     */
    @TableField("overdue_record")
    private String overdueRecord;

    /**
     * 房产资料
     */
    @TableField("house_information")
    private String houseInformation;

    /**
     * 单位资料
     */
    @TableField("unit_information")
    private String unitInformation;

    /**
     * 私营主业资料
     */
    @TableField("private_information")
    private String privateInformation;

    /**
     * 财务状况
     */
    @TableField("financial_condition")
    private String financialCondition;

    /**
     * 联系方式
     */
    @TableField("tel")
    private String tel;


}
