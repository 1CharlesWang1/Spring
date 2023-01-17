package wcl.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration                          //加载bean
@ComponentScan("wcl")                   //扫描bean类型
@PropertySource({"jdbc.properties"})    //加载外部属性值
@Import({JdbcConfig.class, MybatisConfig.class})        //引用 jdbc,Mybatis外部配置类

public class SpringConfig {
    /**
     * 定义 bean
     * @component
     *     @Controller 表现层
     *     @Service 业务层
     *     @Repository 数据层
     */
}
