package com.spring.demo.dao.impl;


import com.spring.demo.po.User;
import org.springframework.jdbc.core.JdbcTemplate;

//@Repository
public class UserDaoImpl {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insertUser(User user) {
        String sql = "insert into User(name,password,nick_name) values(?,?,?)";
        jdbcTemplate.update(sql,user.getName(),user.getPassword(),user.getNickName());
    }
}
