package org.expenseincometracker.expenseincometracker.dto.response;

import org.expenseincometracker.expenseincometracker.enums.Currency;

import java.math.BigDecimal;

public record ChildWalletResponse(
        Long walletId,
        String walletName,
        BigDecimal balance,
        Currency currency
) {
}
