package com.cgi.prueba.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "user_code")
    private String userCode;
    @OneToOne
    @JoinColumn(name = "auth")
    private Auth auth;

    public User() {
    }

    public User(Long id, String phoneNumber, String email, String userCode, Auth auth) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.userCode = userCode;
        this.auth = auth;
    }
}
