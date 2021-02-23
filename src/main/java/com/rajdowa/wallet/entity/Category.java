package com.rajdowa.wallet.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Table(name = "CATEGORIES")
@ToString
public class Category {

    @Id
    private String id;

    private String name;

}
