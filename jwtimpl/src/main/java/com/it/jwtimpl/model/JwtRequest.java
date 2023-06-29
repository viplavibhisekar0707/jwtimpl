package com.it.jwtimpl.model;

import lombok.*;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtRequest {

private String email;
private String password;


}
