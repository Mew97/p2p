package com.p2p.commons.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 系统信息表
 * </p>
 *
 * @author zhu
 * @since 2019-07-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId("id")
    private Long id;

    /**
     * 系统参数
     */
    @TableField("sys_parameter")
    private String sysParameter;

    /**
     * 图片水印
     */
    @TableField("img_water_making")
    private String imgWaterMaking;

    /**
     * 附件
     */
    @TableField("attach")
    private String attach;

    /**
     * 自定义属性
     */
    @TableField("user_attribute")
    private String userAttribute;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 短信
     */
    @TableField("note")
    private String note;


}
