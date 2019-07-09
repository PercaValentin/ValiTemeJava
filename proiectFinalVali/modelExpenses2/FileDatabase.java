package modelExpenses2;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import app.ApplicationSession;
import modelExpenses.Category;
import modelExpenses.Expenses;

public class FileDatabase implements Database, Serializable {

	private List<Expenses> expenses = new ArrayList<>();
	private List<Category> categories = new ArrayList<>();

	@Override
	public void addExpenses(Expenses expense) {
		expenses.add(expense);
		System.out.println(expense);
		ApplicationSession.getInstance().getSerializer().save(this);

	}

	@Override
	public List<Expenses> getExpenses() {

		return expenses;
	}

	@Override
	public void removeExpenses(Expenses expense) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCategory(Category name) {
		categories.add(name);
		System.out.println(name);
		ApplicationSession.getInstance().getSerializer().save(this);

	}

	@Override
	public List<Category> getCategories() {

		return categories;
	}

	@Override
	public void removeCategory(Category name) {
		Iterator<Category> iterator = categories.iterator();

		while (iterator.hasNext()) {
			Category s = iterator.next();
			if (s.getCategory().equals(name)) {
				iterator.remove();
			}
		}

		ApplicationSession.getInstance().getSerializer().save(this);

	}

	@Override
	public void addExpense(LocalDate date, double sum, String description, Category category) {
		// TODO Auto-generated method stub

	}

	@Override
	public Category getCategoryByName(String categoryName) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getFirstFreeExpenseId() {
		int nr = 0;
		loop: while (true) {
			for (Expenses e : expenses) {
				if (e.getId() == nr) {
					nr++;
					continue loop;
				}
			}
			return nr;
		}
	}
}
