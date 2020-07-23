package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

public interface IAccountService {
    List<Account> findAll();

    void saveAccount(Account account);
}
