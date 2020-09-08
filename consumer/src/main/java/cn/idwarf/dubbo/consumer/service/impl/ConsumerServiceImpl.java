package cn.idwarf.dubbo.consumer.service.impl;

import cn.idwarf.dubbo.consumer.service.ConsumerService;
import cn.idwarf.dubbo.provider.service.ProviderService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Reference
    private ProviderService providerSerice;

    @Override
    public String hello() {
        return providerSerice.helloDubbo();
    }
}
