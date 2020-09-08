package cn.idwarf.dubbo.provider.service.impl;

import cn.idwarf.dubbo.provider.service.ProviderService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String helloDubbo() {
        return "Hello Dubbo";
    }
}
