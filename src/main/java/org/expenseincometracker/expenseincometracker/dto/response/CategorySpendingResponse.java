package org.expenseincometracker.expenseincometracker.dto.response;

import java.math.BigDecimal;


public record CategorySpendingResponse(
        String category,
        BigDecimal amount
) {}