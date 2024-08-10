package com.kris.movieapi.mapper;

import com.kris.movieapi.model.User;
import com.kris.movieapi.rest.dto.UserDto;

public interface UserMapper {

    UserDto toUserDto(User user);
}