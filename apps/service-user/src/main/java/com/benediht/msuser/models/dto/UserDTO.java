package com.benediht.msuser.models.dto;

import com.benediht.msuser.models.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserDTO(Long id, @NotBlank String firstName, @NotBlank String lastName, @NotBlank @Email String email, @NotBlank String password, @NotBlank Role role) {
}