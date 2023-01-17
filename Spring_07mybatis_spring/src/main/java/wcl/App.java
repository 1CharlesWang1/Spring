package wcl;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import wcl.dao.AccountDao;
import wcl.domain.Account;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {

        // 1.创建 SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 2.加载 SqlMapConfig.xml配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml.text");
        // 3.创建 SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        // 4.获取 SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 5.执行 SqlSession对象 查询,获取结果 User
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        List<Account> accounts = accountDao.selectAll();
        System.out.println(accounts);

        Account account = accountDao.selectById(1);
        System.out.println(account);

        // 6.释放资源
        sqlSession.close();

    }
}
