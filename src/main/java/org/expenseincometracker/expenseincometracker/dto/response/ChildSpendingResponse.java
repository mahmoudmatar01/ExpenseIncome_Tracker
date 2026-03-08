package org.expenseincometracker.expenseincometracker.dto.response;


import java.math.BigDecimal;

public record ChildSpendingResponse(
        Long childId,
        BigDecimal totalSpent
) {}