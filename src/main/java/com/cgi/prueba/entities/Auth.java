package com.cgi.prueba.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "auth_users")
@Getter
@Setter
public class Auth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auth_user_id")
    private Long id;
    @Column(name = "final_date")
    private String finalDate;
    @Column(name = "final_hour")
    private String finalHour;
    @Column(name = "validation_registers")
    private String validationRegisters;

    public Auth() {
    }

    public Auth(Long id, String finalDate, String finalHour, String validationRegisters) {
        this.id = id;
        this.finalDate = finalDate;
        this.finalHour = finalHour;
        this.validationRegisters = validationRegisters;
    }
}
