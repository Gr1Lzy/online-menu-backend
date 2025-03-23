package com.github.menu.service;

import com.github.menu.dto.auth.LoginResponseDto;
import com.github.menu.dto.auth.LoginRequestDto;
import com.github.menu.dto.auth.RefreshRequestDto;
import com.github.menu.dto.auth.RegisterRequestDto;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {

  LoginResponseDto login(LoginRequestDto requestDto);

  void register(RegisterRequestDto requestDto);

  LoginResponseDto refresh(RefreshRequestDto requestDto);
}
