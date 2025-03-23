package com.github.menu.dto.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RefreshRequestDto {

  @NotBlank
  @JsonProperty("refresh_token")
  private String refreshToken;
}
