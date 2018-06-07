package service;

import config.SimpleConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author yangyao
 */
@Service
@Scope("singleton")
public class SimpleDemoService implements InitializingBean, DisposableBean {

    protected static final Logger LOGGER = LoggerFactory
            .getLogger(SimpleDemoService.class);

    /**
     * 分布式配置
     */
    @Autowired
    private SimpleConfig simpleConfig;

    /**
     * 关闭
     */
    @Override
    public void destroy() throws Exception {

        System.out.println("destroy ==> ");
    }

    /**
     * 进行连接
     */
    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("connect ==> ");
    }

    /**
     * 后台更改值
     */
    public void changeConfig() {

        System.out.println(String.format("start to change hosts to: %s : %s", simpleConfig.getHost(), simpleConfig.getPort()));

        System.out.println("change ok.");
    }
}