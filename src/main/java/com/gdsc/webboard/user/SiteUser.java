package com.gdsc.webboard.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SiteUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private  String username;

    // 자동으로 @Column이 붙음
    private String password;

    @Column(unique = true)
    private String email;

}
