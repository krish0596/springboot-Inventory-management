package com.kris.movieapi.mapper;

import org.springframework.stereotype.Service;

import com.kris.movieapi.model.User;
import com.kris.movieapi.rest.dto.UserDto;

@Service
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toUserDto(User user) {
        if (user == null) {
            return null;
        }
        return new UserDto(user.getId(), user.getUsername(), user.getName(), user.getEmail(), user.getRole());
    }
}
