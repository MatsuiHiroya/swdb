package com.web.swdb.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepository implements ITestRepository{
    @Autowired
    JdbcTemplate jdbc;

    @Override
    public int insert(String userName, String userPass) {
        var sql = "insert into USER values (?, ?)";
        var n = jdbc.update(sql, userName, userPass);
        return n;
    }


}
