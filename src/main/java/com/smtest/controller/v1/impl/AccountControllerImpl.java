package com.smtest.controller.v1.impl;

import com.smtest.controller.v1.AccountController;
import com.smtest.request.AccountRequest;
import com.smtest.response.BaseResponse;
import com.smtest.service.v1.AccountService;
import com.smtest.utils.ResponseHelper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RestController
public class AccountControllerImpl implements AccountController {

    private final AccountService accountService;

    @Override
    public ResponseEntity<BaseResponse> registeredAccount(AccountRequest accountRequest) {
        return ResponseHelper.buildOkResponse(accountService.registeredAccount(accountRequest));
    }

    @Override
    public ResponseEntity<BaseResponse> geAccountList() {
        return ResponseHelper.buildOkResponse(accountService.getListAccount());
    }

    @Override
    public ResponseEntity<BaseResponse> updateAccount(String accountId, AccountRequest accountRequest) {
        return ResponseHelper.buildOkResponse(accountService.updateAccount(accountId, accountRequest));
    }

    @Override
    public ResponseEntity<BaseResponse> deleteAccount(String accountId) {
        return ResponseHelper.buildOkResponse(accountService.deleteAccount(accountId));
    }
}
