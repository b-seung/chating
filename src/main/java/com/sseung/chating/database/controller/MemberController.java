package com.sseung.chating.database.controller;

import com.sseung.chating.database.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/member")
public class MemberController {
    @Autowired
    MemberRepository memberRepository;

    @GetMapping
    public String member() {
        return "allMember";
    }

    @GetMapping(path = "/all")
    public List<String> allMember() {
        return memberRepository.getAllMember();
    }
}
