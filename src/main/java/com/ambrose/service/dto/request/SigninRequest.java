package com.ambrose.service.dto.request;

import lombok.Data;

@Data
public class SigninRequest {
  private String login;
  private String password;
}
