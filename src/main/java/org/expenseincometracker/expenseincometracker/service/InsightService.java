package org.expenseincometracker.expenseincometracker.service;

import org.expenseincometracker.expenseincometracker.dto.response.*;
import org.springframework.security.core.Authentication;

import java.util.List;

public interface InsightService {

    OverviewResponse getOverview(Authentication authentication);
    List<CategorySpendingResponse> getSpendingByCategory(Authentication authentication);
    List<IncomeExpenseResponse> getIncomeVsExpense(Authentication authentication);
    List<ChildSpendingResponse> getChildrenAnalysis(Authentication authentication);
}
