package com.Kakao_login.kakao_login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Kakao_login.kakao_login.model.oauth.OauthToken;
import com.Kakao_login.kakao_login.service.UserService;


@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    // 프론트에서 인가코드 받아오는 url
   @GetMapping("/oauth/token")
   public OauthToken getLogin(@RequestParam("code") String code) {

       // 넘어온 인가 코드를 통해 access_token 발급
       OauthToken oauthToken = userService.getAccessToken(code);

       String User = userService.saveUser(oauthToken.getAccess_token());

       return User;
   }

}