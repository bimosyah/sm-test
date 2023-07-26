package com.smtest.service.v1;

import com.smtest.request.AccountRequest;
import com.smtest.response.AccountResponse;

import java.util.List;

public interface AccountService {

    String registeredAccount(AccountRequest accountRequest);

    List<AccountResponse> getListAccount();

    String updateAccount(String accountId, AccountRequest accountRequest);

    String deleteAccount(String accountId);

}
