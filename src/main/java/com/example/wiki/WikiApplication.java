//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.wiki;

import org.apache.juli.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class WikiApplication {
    public WikiApplication() {
    }
    private static final Logger logger = LoggerFactory.getLogger(WikiApplication.class);
    public static void main(String[] args) {


        SpringApplication.run(WikiApplication.class, args);
//        SpringApplication application=new SpringApplication(WikiApplication.class);
//        Environment environment=application.run(args).getEnvironment();
//        Log.info("启动成功！");
//        Log.info("地址是：\thttp://127.0.0.1:{}",environment.getProperty("server.port"));
        //使用slf4j.logger
//        logger.info(environment.toString());//应该是环境有错
        logger.info("启动成功！");
        logger.info("地址是：\thttp://127.0.0.1:{}");
    }
}
