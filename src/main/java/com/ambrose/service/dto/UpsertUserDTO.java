package com.ambrose.service.dto;



import com.ambrose.repository.entities.enums.Gender;
import com.ambrose.repository.entities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpsertUserDTO {
  private long id;
  private String fullname;
  //private String secondname;
  private String email;
  //private String password;
  private String country;
  //private String phone;
  private Gender gender;
  private Role role;
}
