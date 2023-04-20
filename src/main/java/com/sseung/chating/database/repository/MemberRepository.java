package com.sseung.chating.database.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemberRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<String> getAllMember() {
        List<String> list = new ArrayList<>();
        list.addAll(jdbcTemplate.queryForList("select id from member;", String.class));

        return list;
    }
}
