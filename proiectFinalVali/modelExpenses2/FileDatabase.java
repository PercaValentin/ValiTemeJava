package modelExpenses2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import appExpenses.ApplicationSession;

public class FileDatabase implements Database {

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

//	public int getFirstFreeExpenseId() {
//		int nr = 0;
//		loop: while (true) {
//			for (Expenses e : expenses) {
//				if (e.getID() == nr) {
//					nr++;
//					continue loop;
//				}
//			}
//			return nr;
//		}
//	}

	@Override
	public Category getCategoryByName(String name) {

		return null;
	}

	@Override
	public void addExpenses(Date date, double sum, String description, Category category) {

		Expenses expense = new Expenses(date, sum, description, category);
		expenses.add(expense);
		System.out.println(expense);
		ApplicationSession.getInstance().getSerializer().save(this);
	}

}
