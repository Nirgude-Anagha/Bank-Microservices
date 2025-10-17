package com.example.accounts.service;

import com.example.accounts.dto.CustomerDto;

public interface IAccountService {

    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNo);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNo);

}
