package com.github.menu.entity;

import lombok.Getter;

@Getter
public enum Role {
  ADMIN(1),
  USER(2);

  private final Integer id;

  Role(Integer id) {
    this.id = id;
  }

  public static Role fromId(Integer id) {
    for (Role role : Role.values()) {
      if (role.getId().equals(id)) {
        return role;
      }
    }

    throw new IllegalArgumentException("Invalid role id: " + id);
  }
}
