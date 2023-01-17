package wcl.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import wcl.domain.Account;

import java.util.List;

@Repository("accountDao")
public interface AccountDao {

    @Select("select * from dbspring")
    List<Account> selectAll();

    @Select("select * from dbspring where id=#{id}")
    Account selectById(int id);
}















