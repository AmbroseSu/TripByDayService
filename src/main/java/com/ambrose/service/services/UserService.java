package com.ambrose.service.services;



import com.ambrose.repository.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
  UserDetailsService userDetailsService();

  void saveUserVerificationToken(User theUser, String verificationToken);
  //void saveUserVerificationTokenSMS(User theUser, String token);

  String validateToken(String theToken, Long id);
  //String validateTokenSms(String theToken, Long id);

}
