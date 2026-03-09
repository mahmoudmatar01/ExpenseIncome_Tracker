package org.expenseincometracker.expenseincometracker.dto.response;

import java.math.BigDecimal;


public record ParentDashboardOverviewResponse(
        BigDecimal averageMonthlySpending,
        String topCategory,
        BigDecimal totalChildrenSpending
){

}
