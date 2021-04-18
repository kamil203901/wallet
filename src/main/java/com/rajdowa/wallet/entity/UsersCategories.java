package com.rajdowa.wallet.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
public class UsersCategories {
    private String category1;
    private String category2;
    private String category3;
    private String category4;
    private String category5;
    private String newCategory;
}
