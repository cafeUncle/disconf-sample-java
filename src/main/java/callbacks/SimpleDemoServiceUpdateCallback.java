package callbacks;

import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;
import config.SimpleConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.SimpleDemoService;


/**
 * 更新配置时的回调函数
 * @author yangyao
 */
@Service
@DisconfUpdateService(classes = {SimpleConfig.class})
public class SimpleDemoServiceUpdateCallback implements IDisconfUpdate {

    @Autowired
    private SimpleDemoService simpleDemoService;

    @Override
    public void reload() throws Exception {
        simpleDemoService.changeConfig();
    }

}