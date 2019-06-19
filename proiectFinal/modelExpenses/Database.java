package modelExpenses;

import java.util.List;

public interface Database {

	void addExpenses(Expenses expense);

	List<Expenses> expenses;

	void removeExpenses(Expenses expense);

	void addCategory(Category name);

	List<Category> categories;

	void removeCategory(Category name);

	List<Expenses> getExpenses();

}
