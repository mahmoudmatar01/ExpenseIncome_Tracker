package org.expenseincometracker.expenseincometracker.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public record UpdateProfileRequest(
        @Schema(description = "a new user name", example = "Mahmoud Matar")
        @Size(min = 3, max = 150)
        String name,

        @Schema(description = "a new user email", example = "mahmoud@example.com")
        @Email
        String email,

        @Schema(description = "current user password", example = "ljahfkjafkjk8@@#")
        String currentPassword,

        @Size(min = 8)
        @Schema(description = "a new user password", example = "jkshkjnvmnkl@#@$@jdn")
        String newPassword
) {}
