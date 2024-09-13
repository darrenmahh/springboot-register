package org.example.springbootregister.config;

import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfig {
    // 注入Country对象
    @Bean
    public Country country(){
        return new Country("wang", "zhang");
    }

    @Bean
    public Province province(){
        return new Province();
    }
}

