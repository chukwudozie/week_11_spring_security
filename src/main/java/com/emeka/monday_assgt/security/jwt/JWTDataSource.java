package com.emeka.monday_assgt.security.jwt;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class JWTDataSource {
    private String secretKey;
    private String tokenPrefix;
    private Long expirationDate;
}
