package com.Kakao_login.kakao_login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class KakaoLogApplication {

   public static void main(String[] args) {
      SpringApplication.run(KakaoLogApplication.class, args);
   }

}