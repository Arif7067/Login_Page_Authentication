package com.xopuntech.authentication.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtRequests {

    private String email;

    private String password;
}
