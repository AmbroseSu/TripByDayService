package com.ambrose.service.dto.response;


import com.ambrose.service.dto.UserDTO;
import lombok.Data;

@Data
public class JwtAuthenticationResponse {
  private UserDTO userDTO;
  private String token;
  private String refreshToken;
}
