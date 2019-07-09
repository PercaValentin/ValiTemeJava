package modelExpenses2;

import java.time.LocalDate;
import java.util.List;

import modelExpenses.Category;
import modelExpenses.Expenses;

public interface Database {

	void addExpenses(Expenses expense);

	List<Expenses> getExpenses();

	void removeExpenses(Expenses expense);

	void addCategory(Category name);

	List<Category> getCategories();

	void removeCategory(Category name);

	void addExpense(LocalDate date, double sum, String description, Category category);

	Category getCategoryByName(String categoryName);
}
