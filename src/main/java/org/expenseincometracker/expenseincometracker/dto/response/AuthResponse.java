package org.expenseincometracker.expenseincometracker.dto.response;

import org.expenseincometracker.expenseincometracker.enums.Role;

public record AuthResponse(
        String accessToken,
        String refreshToken,
        Role role
) {
}
