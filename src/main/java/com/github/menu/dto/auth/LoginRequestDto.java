package com.github.menu.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequestDto {

  @NotBlank(message = "Username is required")
  @Schema(example = "admin")
  private String username;

  @NotBlank(message = "Password is required")
  @Schema(example = "12345678")
  private String password;
}
