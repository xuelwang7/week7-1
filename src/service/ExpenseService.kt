package service

import model.Expense
import java.time.LocalDate

class ExpenseService {
    private val expenses = mutableListOf<Expense>()

    fun addExpense(expense: Expense) {
        expenses.add(expense)
    }

    fun listExpenses() {
        expenses.forEach { println(it) }
    }

    fun deleteExpense(expenseId: Int) {
        expenses.removeAll { it.id == expenseId }
    }
}
