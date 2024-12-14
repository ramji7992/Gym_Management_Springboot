package com.rj.binding;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;


@Data
@Entity
@Table(name = "OwnerDetails", uniqueConstraints = @UniqueConstraint(columnNames = {"userName"}))
public class OwnerBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String mail;
    private Long phone;
    private Timestamp regDate;
    private String userName;
    private String password;

}
