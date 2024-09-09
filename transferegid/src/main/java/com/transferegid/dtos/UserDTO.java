package com.transferegid.dtos;

import java.math.BigDecimal;

import com.transferegid.domain.user.UserType;

public record UserDTO(String name, String Document, BigDecimal balance, String email, String password, UserType userType) {

}
