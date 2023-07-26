package com.smtest.service.v1.impl;

import com.smtest.entity.Account;
import com.smtest.repository.AccountRepository;
import com.smtest.request.AccountRequest;
import com.smtest.response.AccountResponse;
import com.smtest.service.v1.AccountService;
import com.smtest.utils.EntityUtil;
import com.smtest.utils.exceptions.BadRequestException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public String registeredAccount(AccountRequest request) {
        Account.AccountBuilder builder = Account.builder();
        builder.name(request.getName());
        builder.email(request.getEmail());
        builder.role(request.getRole());
        builder.password(passwordEncoder.encode(request.getPassword()));
        builder.username(request.getUsername());

        Account account = builder.build();
        EntityUtil.created(account, "SYSTEM");

        accountRepository.save(account);

        return "OK";
    }

    @Override
    public List<AccountResponse> getListAccount() {
        List<Account> accountList = accountRepository.findAllByActiveTrue();
        return accountList.stream()
                .map(account -> AccountResponse.builder()
                        .username(account.getUsername())
                        .email(account.getEmail())
                        .role(account.getRole().name())
                        .name(account.getName())
                        .id(account.getId())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public String updateAccount(String accountId, AccountRequest request) {
        Account account = accountRepository.findById(accountId)
                .orElseThrow(() -> new BadRequestException("Account Id Not Found"));

        account.setName(request.getName());
        EntityUtil.modifiedBy(account, "SYSTEM");
        accountRepository.save(account);
        return "Account Updated";
    }

    @Override
    public String deleteAccount(String accountId) {
        Account account = accountRepository.findById(accountId)
                .orElseThrow(() -> new BadRequestException("Account Id Not Found"));

        EntityUtil.deleted(account, "SYSTEM");
        accountRepository.save(account);
        return "Account Deleted";
    }
}
