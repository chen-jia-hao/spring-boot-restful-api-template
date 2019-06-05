package com.chen.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;

    @Column(name = "nick_name")
    private String nickName;

    private Integer sex;

    @Column(name = "register_date")
    private Date registerDate;

    private static final long serialVersionUID = 1L;
}