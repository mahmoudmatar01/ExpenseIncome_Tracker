package org.expenseincometracker.expenseincometracker.service;

import org.expenseincometracker.expenseincometracker.dto.response.ChildWalletResponse;
import org.springframework.security.core.Authentication;

public interface ChildWalletService {
    ChildWalletResponse getChildWallet(Authentication authentication);
}
