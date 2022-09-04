package com.Kakao_login.kakao_login.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Kakao_login.kakao_login.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

 // JPA findBy 규칙
 // select * from user_master where kakao_email = ?
 public User findByKakaoEmail(String kakaoEmail);

 public User findByUserCode(String userCode);
}