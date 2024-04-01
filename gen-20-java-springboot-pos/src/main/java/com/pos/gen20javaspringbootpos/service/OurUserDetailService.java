package com.pos.gen20javaspringbootpos.service;


import com.pos.gen20javaspringbootpos.repository.OurUsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class OurUserDetailService implements UserDetailsService {

    @Autowired
    private OurUsersRepo ourUsersRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return ourUsersRepo.findByEmail(username).orElseThrow();
    }
}
