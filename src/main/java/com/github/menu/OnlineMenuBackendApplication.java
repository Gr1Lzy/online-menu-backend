package com.github.menu;

import lombok.extern.slf4j.Slf4j;
import org.h2.tools.Server;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class OnlineMenuBackendApplication implements ApplicationRunner {

  public static void main(String[] args) {
    SpringApplication.run(OnlineMenuBackendApplication.class, args);
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    log.info("http://localhost:8080/swagger-ui.html");
    Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092").start();
  }
}
