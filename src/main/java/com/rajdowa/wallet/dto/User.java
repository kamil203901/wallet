package com.rajdowa.wallet.dto;

import lombok.*;

@AllArgsConstructor
@Builder
@Setter
@Getter
@NoArgsConstructor
@ToString
public class User {

    private String userName;

    private String userPassword;

}
