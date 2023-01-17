package wcl.service;

import wcl.domain.Account;

import java.util.List;

public interface AccountService {
    public List<Account> selectAll();
    public Account selectById(int id);
}
