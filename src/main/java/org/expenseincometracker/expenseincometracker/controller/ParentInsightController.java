package org.expenseincometracker.expenseincometracker.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.expenseincometracker.expenseincometracker.dto.response.*;
import org.expenseincometracker.expenseincometracker.service.ParentInsightService;
import org.expenseincometracker.expenseincometracker.util.model.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/parent/insights")
@RequiredArgsConstructor
@PreAuthorize("hasRole('PARENT')")
@SecurityRequirement(name = "bearerAuth")
@Tag(name = "Parent – Insights Analytics", description = "Analytics endpoints for parent spending overview, category breakdown, income vs expense, children analysis, and monthly trends")
public class ParentInsightController {

    private final ParentInsightService insightService;


    @GetMapping("/overview")
    @Operation(summary = "Parent overview insights",
            description = "Returns average monthly spending, top spending category, and total children spending.")
    public ResponseEntity<?> getOverview(
            Authentication authentication
    ) {
        ParentDashboardOverviewResponse response = insightService.getOverview(authentication);
        return ResponseEntity.ok(
                ApiResponse.success(response)
        );
    }


    @GetMapping("/spending-by-category")
    @Operation(summary = "Spending by category",
            description = "Returns expense transactions grouped by category with summed amounts.")
    public ResponseEntity<?> getSpendingByCategory(
            Authentication authentication
    ) {
        List<CategorySpendingResponse> response = insightService.getSpendingByCategory(authentication);
        return ResponseEntity.ok(
                ApiResponse.success(response)
        );
    }

    @GetMapping("/income-expense")
    @Operation(summary = "Income vs expense (last 6 months)",
            description = "Returns income and expense totals per month for the last 6 months.")
    public ResponseEntity<?> getIncomeVsExpense(
            Authentication authentication
    ) {
        List<IncomeExpenseResponse> response = insightService.getIncomeVsExpense(authentication);
        return ResponseEntity.ok(
                ApiResponse.success(response)
        );
    }


    @GetMapping("/children-analysis")
    @Operation(summary = "Children spending analysis",
            description = "Returns each child's spending limit and actual expense for the current month.")
    public ResponseEntity<?> getChildrenAnalysis(
            Authentication authentication
    ) {
        List<ChildSpendingResponse> response = insightService.getChildrenAnalysis(authentication);
        return ResponseEntity.ok(
                ApiResponse.success(response)
        );
    }


}
