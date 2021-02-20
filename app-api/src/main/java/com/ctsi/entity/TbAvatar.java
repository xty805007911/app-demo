package com.ctsi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;


@Data
public class TbAvatar {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String url;
    private Date createTime;
    private String name;
    private Integer enabled;
}
