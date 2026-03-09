package org.expenseincometracker.expenseincometracker.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.expenseincometracker.expenseincometracker.service.ChildWalletService;
import org.expenseincometracker.expenseincometracker.util.model.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/child/wallet")
@RequiredArgsConstructor
@PreAuthorize("hasRole('CHILD')")
@SecurityRequirement(name = "bearerAuth")
@Tag(name = "Child – Wallet Management", description = "APIs for managing wallets owned by the authenticated parent's children")
public class ChildWalletController {

    private final ChildWalletService childWalletService;

    @GetMapping
    public ResponseEntity<?> getWallet(Authentication authentication) {
        return ResponseEntity.ok(
                ApiResponse.success(
                        childWalletService.getChildWallet(authentication)
                )
        );
    }
}