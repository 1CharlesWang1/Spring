package wcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wcl.config.SpringConfig;
import wcl.dao.AccountDao;
import wcl.domain.Account;
import wcl.service.AccountService;
import wcl.service.impl.AccountServiceImpl;

public class SpringApp {
    public static void main(String[] args) {

        //创建容器
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        //获取容器中的 bean
        AccountDao accountDao = (AccountDao) context.getBean("accountDao");

        AccountService accountService = context.getBean(AccountService.class);

        //查询
        //利用数据层调用方法
        System.out.println(accountDao.selectAll());

        //利用业务层调用方法
        System.out.println(accountService.selectById(1));
        System.out.println(accountService.selectAll());

    }
}
