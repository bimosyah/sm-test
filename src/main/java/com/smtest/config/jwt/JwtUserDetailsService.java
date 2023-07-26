package com.smtest.config.jwt;

import com.smtest.entity.Account;
import com.smtest.repository.AccountRepository;
import com.smtest.utils.exceptions.BadRequestException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class JwtUserDetailsService implements UserDetailsService {
    private final AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.findByUsername(username)
                .orElseThrow(() -> new BadRequestException("Username Not Found"));

        return new User(account.getUsername(),account.getPassword(), new ArrayList<>());
    }
}
