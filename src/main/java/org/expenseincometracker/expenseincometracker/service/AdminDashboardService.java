package org.expenseincometracker.expenseincometracker.service;

import org.expenseincometracker.expenseincometracker.dto.response.*;
import org.springframework.data.domain.Page;

import java.util.List;

public interface AdminDashboardService {
    AdminDashboardResponse getDashboardStatistics();
    UserDistributionResponse getUserDistribution();
    Page<RecentUserResponse> getRecentUsers(int page, int size);
    List<MonthlyTransactionVolumeResponse> getTransactionsVolumeLast12Months();
    List<MonthlyUserRegistrationResponse> getMonthlyUserRegistrations();
}

