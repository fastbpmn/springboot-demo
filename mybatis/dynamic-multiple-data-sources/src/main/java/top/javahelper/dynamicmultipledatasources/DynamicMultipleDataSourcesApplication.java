package top.javahelper.dynamicmultipledatasources;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "top.javahelper.dynamicmultipledatasources.mapper")
public class DynamicMultipleDataSourcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicMultipleDataSourcesApplication.class, args);
    }

}
