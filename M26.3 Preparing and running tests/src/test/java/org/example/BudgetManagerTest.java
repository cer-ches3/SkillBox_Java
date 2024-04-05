package org.example;


import org.example.dto.Expense;
import org.example.dto.Income;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Optional;

import static junit.framework.Assert.assertEquals;

public class BudgetManagerTest {
    private BudgetManager manager;

    @BeforeEach
    public void setUp() {
        manager = new BudgetManager();
    }

    @Test
    @DisplayName("Test add expense")
    public void testAddExpense(){
        Expense expense = new Expense(new BigDecimal("200"), "Обед");
        manager.addExpense(expense);
        var totalExpense = manager.getTotalExpense();
        assertEquals(new BigDecimal("200"), totalExpense);
    }

    @Test
    @DisplayName("Test add income")
    public void testAddIncome(){
        Income income = new Income(new BigDecimal("1000"), "ЗП", "Опсание");
        manager.addIncome(income);
        var totalIncome = manager.getTotalIncome();
        assertEquals(new BigDecimal("1000"), totalIncome);
    }

    @Test
    @DisplayName("Test get balance")
    public void testGetBalance() {
        Expense expense = new Expense(new BigDecimal("200"), "Обед");
        manager.addExpense(expense);

        Income income = new Income(new BigDecimal("1000"), "ЗП", "Опсание");
        manager.addIncome(income);

        assertEquals(new BigDecimal("800"), manager.getBalance());
    }

    @Test
    @DisplayName("Test average income if not incomes")
    public void testAverageIncomeIfNotIncomes() {
        assertEquals(Optional.empty(), manager.averageIncome());
    }

    @Test
    @DisplayName("Test average income if few incomes")
    public void testAverageIncomeIfFewIncomes() {
        assertEquals(Optional.empty(), manager.averageIncome());
        manager.addIncome(new Income(new BigDecimal("20"), "ЗП", "Опсание"));
        manager.addIncome(new Income(new BigDecimal("40"), "ЗП", "Опсание"));

        BigDecimal actual = manager.averageIncome().get();
        assertEquals(new BigDecimal("30"), actual);
    }
}
