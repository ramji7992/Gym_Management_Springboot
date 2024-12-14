package com.rj.binding;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "TransactionDetails")
public class TransactionBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer txnNo;
    private Integer registrationId;
    private Float amount;
    private String customerName;
    private Date date;
}
