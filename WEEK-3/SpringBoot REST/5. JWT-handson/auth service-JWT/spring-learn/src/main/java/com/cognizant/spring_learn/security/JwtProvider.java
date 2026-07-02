package com.cognizant.spring_learn.security;


import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class JwtProvider {
    private final String secret_key = "7bM4x9WpK2vN1zQ8fR6sYwE3mXjC5vB4tG9hA1kL8qM=";
    private final SecretKey secretKey = Keys.hmacShaKeyFor(secret_key.getBytes());
    private final long exp_date = 86400000;

    public String generateToken(String name) {
        return Jwts.builder()
                .subject(name)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + exp_date))
                .signWith(secretKey, Jwts.SIG.HS256)
                .compact();
    }

}
