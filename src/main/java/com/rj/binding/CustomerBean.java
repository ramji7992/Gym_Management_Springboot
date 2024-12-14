package com.rj.binding;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "CustomerDetails")
public class CustomerBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    @Column(name = "Email")
    private String mail;
    private Long phone;
    @Column(name = "RegistrationDate")
    private Date date;
    private String remarks;

}
