package org.example;

import org.example.dto.Expense;
import org.example.dto.Income;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BudgetManager {
    private final List<Income> incomes;
    private final List<Expense> expenses;

    public BudgetManager() {
        incomes = new ArrayList<>();
        expenses = new ArrayList<>();
    }

    public void addIncome(Income income) {
        incomes.add(income);
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public Optional<BigDecimal> averageIncome() {
        if (incomes.isEmpty()) {
            return Optional.empty();
        }
        var incomeCount = incomes.size();
        return Optional.of(getTotalIncome().divide(BigDecimal.valueOf(incomeCount), RoundingMode.FLOOR));
    }

    public BigDecimal getTotalIncome() {
        return incomes.stream()
                .map(Income::amount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal getTotalExpense() {
        return expenses.stream()
                .map(Expense::amount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal getBalance() {
        return getTotalIncome().subtract(getTotalExpense());
    }
}
