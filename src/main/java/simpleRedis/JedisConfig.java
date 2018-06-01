package simpleRedis;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import org.springframework.context.annotation.Configuration;

@Configuration
@DisconfFile(filename = "classpath:redis.properties")
public class JedisConfig {

}
