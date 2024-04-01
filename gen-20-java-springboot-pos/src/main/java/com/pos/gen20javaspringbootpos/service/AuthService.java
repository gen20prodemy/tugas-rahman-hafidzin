package com.pos.gen20javaspringbootpos.service;


import com.pos.gen20javaspringbootpos.dto.RequestResponse;
import com.pos.gen20javaspringbootpos.entity.OurUsers;
import com.pos.gen20javaspringbootpos.repository.OurUsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class AuthService {
    @Autowired
    private OurUsersRepo ourUsersRepo;
    @Autowired
    private JWTUtils jwtUtils;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;

    public RequestResponse signup(RequestResponse registrationRequest){
        RequestResponse resp = new RequestResponse();
        try {
            OurUsers ourUsers = new OurUsers();
            ourUsers.setEmail(registrationRequest.getEmail());
            ourUsers.setPassword(passwordEncoder.encode(registrationRequest.getPassword()));
            ourUsers.setRole(registrationRequest.getRole());
            OurUsers ourUsersResult = ourUsersRepo.save(ourUsers);
            if(ourUsersResult != null && ourUsersResult.getId()>0){
                resp.setOurUsers(ourUsersResult);
                resp.setMessage("User berhasil ditambahkan!");
                resp.setStatusCode(200);
            }
        } catch (Exception e){
            resp.setStatusCode(500);
            resp.setError(e.getMessage());
        }
        return resp;
    }

    public RequestResponse signIn(RequestResponse signinRequest){
        RequestResponse response = new RequestResponse();

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(signinRequest.getEmail(), signinRequest.getPassword()));
            var user = ourUsersRepo.findByEmail(signinRequest.getEmail()).orElseThrow();
            System.out.println("USER IS: " + user);
            var jwt = jwtUtils.generateToken(user);
            var refreshToken = jwtUtils.generateRefreshToken(new HashMap<>(), user);
            response.setStatusCode(200);
            response.setToken(jwt);
            response.setRefreshToken(refreshToken);
            response.setExpirationTime("24Hr");
            response.setMessage("Berhasil sign in");
        } catch (Exception e){
            response.setStatusCode(500);
            response.setError(e.getMessage());
        }
        return response;
    }

    public RequestResponse refreshToken(RequestResponse refreshTokenRequest){
        RequestResponse response = new RequestResponse();
        String ourEmail = jwtUtils.extractUserName(refreshTokenRequest.getToken());
        OurUsers users = ourUsersRepo.findByEmail(ourEmail).orElseThrow();
        if(jwtUtils.isTokenValid(refreshTokenRequest.getToken(), users)){
            var jwt = jwtUtils.generateToken(users);
            response.setStatusCode(200);
            response.setToken(jwt);
            response.setRefreshToken(refreshTokenRequest.getToken());
            response.setExpirationTime("24Hr");
            response.setMessage("Berhasil refresh token");
        }
        response.setStatusCode(500);
        return response;
    }
}
