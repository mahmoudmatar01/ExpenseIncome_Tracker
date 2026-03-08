package org.expenseincometracker.expenseincometracker.service;

import org.expenseincometracker.expenseincometracker.dto.request.UpdateProfileRequest;
import org.springframework.security.core.Authentication;

public interface ParentProfileService {
    void updateProfile(Authentication authentication, UpdateProfileRequest request);
}
