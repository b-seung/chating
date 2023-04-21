package com.sseung.chating.database.member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

//lombok 어노테이션
@Getter
@NoArgsConstructor
//JPA 어노테이션
@Entity
public class Member {
    @Id
    @Column(length = 50)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(length = 50, nullable = false)
    private String password;

    @Column(length = 50, nullable = false)
    private String nickname;

    @Column(nullable = false)
    private Date birthday;

    @Builder
    public Member(String id, String password, String nickname, Date birthday) {
        this.id = id;
        this.password = password;
        this.nickname = nickname;
        this.birthday = birthday;
    }
}
