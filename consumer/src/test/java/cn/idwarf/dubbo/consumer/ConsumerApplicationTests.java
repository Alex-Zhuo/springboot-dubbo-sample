package cn.idwarf.dubbo.consumer;

import cn.idwarf.dubbo.consumer.service.ConsumerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerApplicationTests {
    @Autowired
    private ConsumerService consumerService;

    @Test
    void contextLoads() {
        System.out.println(consumerService.hello());
    }

}
