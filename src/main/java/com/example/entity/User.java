package com.example.entity;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import java.util.Date;



@Data
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
    private Date deadline;
}
