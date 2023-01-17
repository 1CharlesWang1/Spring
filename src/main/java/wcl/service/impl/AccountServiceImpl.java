package wcl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wcl.dao.AccountDao;
import wcl.domain.Account;
import wcl.service.AccountService;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    //业务层 自动装配
    @Autowired
    private AccountDao accountDao;

    public List<Account> selectAll(){
        return accountDao.selectAll();
    }

    public Account selectById(int id){
        return accountDao.selectById(id);
    }
}










