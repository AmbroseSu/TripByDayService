package com.ambrose.service.dto.request;



import com.ambrose.repository.entities.enums.Gender;
import lombok.Data;

@Data
public class SignUp {
  String email;
  String fullname;
  String phone;
  String password;
  String address;
  Gender gender;
  //Role role;
}
