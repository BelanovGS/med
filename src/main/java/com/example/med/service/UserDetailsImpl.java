package com.example.med.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.example.med.entity.User;
import com.example.med.repository.UserRepository;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@Service
@Slf4j
public class UserDetailsImpl implements UserDetailsService{
    @Autowired
    private UserRepository userRepository;

    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(userRepository.getRole());
        return Arrays.asList(authority);
    }

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);

        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }
        UserDetails userDetails = (UserDetails) new org.springframework.security.core.userdetails.User(user.getEmail(),
                user.getPassword(), mapRolesToAuthorities(user));
        return userDetails;
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(User user) {

        return Collections.singletonList(new SimpleGrantedAuthority(user.getRole()));

    }

}
