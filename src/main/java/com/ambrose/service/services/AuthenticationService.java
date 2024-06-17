package com.ambrose.service.services;



import com.ambrose.service.dto.request.RefreshTokenRequest;
import com.ambrose.service.dto.request.SignUp;
import com.ambrose.service.dto.request.SigninRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

public interface AuthenticationService {
  ResponseEntity<?> signin(SigninRequest signinRequest);

  ResponseEntity<?> signinGoogle(String email);
  ResponseEntity<?> refreshToken(RefreshTokenRequest refreshTokenRequest);

  public ResponseEntity<?> checkEmail(String email);
  public String checkResetVerifyToken(String email, Long id);
  public ResponseEntity<?> saveInfor(SignUp signUp);
}
