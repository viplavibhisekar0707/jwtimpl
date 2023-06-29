package com.it.jwtimpl.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtResponse {

    private String jwtToken;
    private String username;


}
