package com.kris.movieapi.rest.dto;

public record UserDto(Long id, String username, String name, String email, String role) {
}