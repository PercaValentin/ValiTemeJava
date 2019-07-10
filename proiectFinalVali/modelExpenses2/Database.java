package modelExpenses2;

import java.util.Date;
import java.util.List;

public interface Database {

	void addExpenses(Expenses expense);

	List<Expenses> getExpenses();

	void removeExpenses(Expenses expense);

	void addCategory(Category name);

	List<Category> getCategories();

	Category getCategoryByName(String name);

	void addExpenses(Date date, double sum, String description, Category category);

	// void viewExpensesByMonthAndCategory(Expenses expense);

	// void compareWithPreviousMonth(Expenses expense);
}
