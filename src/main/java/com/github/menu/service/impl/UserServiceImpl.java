package com.github.menu.service.impl;

import com.github.menu.dto.user.UserResponseDto;
import com.github.menu.entity.User;
import com.github.menu.repository.UserRepository;
import com.github.menu.service.UserService;
import com.github.menu.util.UserUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Override
  public UserResponseDto getCurrentUser() {
    Long userId = UserUtil.getCurrentUserId();

    User user = userRepository.findById(userId)
        .orElseThrow(() -> new RuntimeException("User not found"));

    return user.toDto();
  }
}
