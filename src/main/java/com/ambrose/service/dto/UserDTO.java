package com.ambrose.service.dto;


import com.ambrose.repository.entities.Order;
import com.ambrose.repository.entities.enums.Gender;
import com.ambrose.repository.entities.enums.Role;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
  private Long id;
  private String fullname;
  //private String login;
  private String address;
  private String email;
  //private String password;
  private String phone;
  private Gender gender;
  private Role role;
  private String DOB;
  private List<Order> orders;
}
