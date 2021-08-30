package com.example.shiroredis.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @Describe：
 * @Date 2021/8/24
 * @Author xxy
 */
@Data
@TableName("Article")
public class Article{
    private String title;
    private String content;
    private String createTime;
    private String updateTime;
    private String creater;
    private Integer id;
}
