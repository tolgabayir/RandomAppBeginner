package com.tolcode.RandomApp.helper;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.tolcode.RandomApp.model.entity.Users;
import org.springframework.stereotype.Service;

@Service
public class JWTHelper {
    private final String secretKey = "112233";


    public String generateToken(Users user){
        return JWT.create().withClaim("id",user.getId()).withClaim("username",user.getUsername()).sign(Algorithm.HMAC256(secretKey.getBytes()));
    }

    public DecodedJWT decodedJWT(String token){
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(secretKey.getBytes())).build();
        return verifier.verify(token);
    }
}
