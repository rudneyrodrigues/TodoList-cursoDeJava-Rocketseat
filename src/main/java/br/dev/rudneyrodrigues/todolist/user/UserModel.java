package br.dev.rudneyrodrigues.todolist.user;

import java.util.UUID;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
// import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;

@Data
@Entity(name="tb_users")
public class UserModel {

  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;

  // Em caso de o nome na tabela precisar ser diferente do codigo
  // @Column(name = "usuario")
  private String name;
  @Column(unique = true)
  private String username;
  private String password;

  @CreationTimestamp
  private LocalDateTime createdAt;

}
