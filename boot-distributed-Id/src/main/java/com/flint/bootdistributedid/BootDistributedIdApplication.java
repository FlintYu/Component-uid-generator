package com.flint.bootdistributedid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.baidu.fsg"})
public class BootDistributedIdApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDistributedIdApplication.class, args);
	}

}
