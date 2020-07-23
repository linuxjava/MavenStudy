package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("AccountServiceImpl findAll");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("AccountServiceImpl saveAccount");
        accountDao.saveAccount(account);
    }
}
