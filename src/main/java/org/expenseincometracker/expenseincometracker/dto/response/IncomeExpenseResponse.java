package org.expenseincometracker.expenseincometracker.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record IncomeExpenseResponse(
        LocalDateTime month,
        BigDecimal income,
        BigDecimal expense
) {}