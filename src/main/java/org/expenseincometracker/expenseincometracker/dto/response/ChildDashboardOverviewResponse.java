package org.expenseincometracker.expenseincometracker.dto.response;

import java.math.BigDecimal;

public record ChildDashboardOverviewResponse(
        BigDecimal walletBalance,
        BigDecimal spendingLimit,
        BigDecimal totalSpent,
        BigDecimal remainingLimit
) {
}
