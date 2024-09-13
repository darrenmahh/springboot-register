package org.example.springbootregister;

import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootRegisterApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringbootRegisterApplication.class, args);

        Country country = context.getBean(Country.class);
        System.out.println(country);

        Province province = context.getBean(Province.class);
        System.out.println(province);

        System.out.println(context.getBean("province"));
    }
}


