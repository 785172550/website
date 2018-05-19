package com.demo.domain.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "t_user")
public class User implements Serializable{

  @Id
  @GeneratedValue
  private String id; // primary key id

  private String username;
  private String password;
  private String salt; // salt to encrypt the password
  @Column(name = "mail")
  private String email;

  private boolean disabled; // is disabled ? 是否禁用
  private Date createTime; // user create time
  private Date lastTime; // user's last login time
}
