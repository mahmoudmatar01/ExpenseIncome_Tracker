package org.expenseincometracker.expenseincometracker.service;

import org.expenseincometracker.expenseincometracker.dto.response.CategorySpendingResponse;
import org.expenseincometracker.expenseincometracker.dto.response.ChildDashboardOverviewResponse;
import org.springframework.security.core.Authentication;

import java.util.List;

public interface ChildrenInsightService {
    ChildDashboardOverviewResponse getDashboard(Authentication authentication);
    List<CategorySpendingResponse> getCategorySpending(Authentication authentication);

}
