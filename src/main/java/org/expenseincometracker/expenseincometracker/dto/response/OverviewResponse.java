package org.expenseincometracker.expenseincometracker.dto.response;

import java.math.BigDecimal;


public record OverviewResponse (
        BigDecimal averageMonthlySpending,
        String topCategory,
        BigDecimal totalChildrenSpending
){

}
