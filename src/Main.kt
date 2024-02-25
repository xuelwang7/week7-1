//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import model.Expense
import service.ExpenseService
import java.time.LocalDate

fun main() {
    val expenseService = ExpenseService()
    while (true) {
        println("1. Add Expense\n2. List Expenses\n3. Delete Expense\n4. Exit")
        when (readLine()) {
            "1" -> {
                println("Enter ID: ")
                val id = readLine()?.toInt() ?: 0
                println("Enter Description: ")
                val description = readLine() ?: ""
                println("Enter Amount: ")
                val amount = readLine()?.toDouble() ?: 0.0
                expenseService.addExpense(Expense(id, description, amount))
                println("Expense added.")
            }
            "2" -> {
                println("Expenses:")
                expenseService.listExpenses()
            }
            "3" -> {
                println("Enter ID of Expense to Delete: ")
                val id = readLine()?.toInt() ?: 0
                expenseService.deleteExpense(id)
                println("Expense deleted.")
            }
            "4" -> return
            else -> println("Invalid option, please try again.")
        }
    }
}