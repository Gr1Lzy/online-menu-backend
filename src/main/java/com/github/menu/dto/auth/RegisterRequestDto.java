package com.github.menu.dto.auth;

import com.github.menu.entity.User;
import com.github.menu.mapper.DtoMapper;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequestDto {

  @Schema(example = "test")
  @NotBlank(message = "Username is required")
  private String username;

  @Schema(example = "test@gmail.com")
  @NotBlank(message = "Email is required")
  @Email(message = "Email is not correct")
  private String email;

  @Schema(example = "12345678")
  @NotBlank(message = "Password is required")
  @Size(min = 8, message = "Password must be at least 8 characters")
  private String password;

  public User toEntity() {
    return MAPPER.toEntity(this);
  }

  private static final DtoMapper<User, RegisterRequestDto> MAPPER =
      new DtoMapper<>(User.class,  RegisterRequestDto.class);
}
