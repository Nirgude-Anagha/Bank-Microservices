package com.example.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity{

    @Column
    private Long customerId;

    @Id
    @Column
    private Long accountNo;

    @Column
    private String accountType;

    @Column
    private String branchAddress;
}