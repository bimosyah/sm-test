package com.smtest.controller.v1;

import com.smtest.request.AccountRequest;
import com.smtest.response.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/account")
public interface AccountController {

    @PostMapping
    ResponseEntity<BaseResponse> registeredAccount(@RequestBody AccountRequest accountRequest);

    @GetMapping
    ResponseEntity<BaseResponse> geAccountList();

    @PutMapping("/{accountId}")
    ResponseEntity<BaseResponse> updateAccount(@PathVariable String accountId,
                                               @RequestBody AccountRequest accountRequest);

    @DeleteMapping("/{accountId}")
    ResponseEntity<BaseResponse> deleteAccount(@PathVariable String accountId);
}