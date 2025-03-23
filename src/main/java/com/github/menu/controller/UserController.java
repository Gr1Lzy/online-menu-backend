package com.github.menu.controller;

import com.github.menu.dto.user.UserResponseDto;
import com.github.menu.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "User Controller")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

  private final UserService userService;

  @Operation(summary = "Get current user")
  @GetMapping
  public ResponseEntity<UserResponseDto> getCurrentUser() {
    return ResponseEntity.ok(userService.getCurrentUser());
  }
}
