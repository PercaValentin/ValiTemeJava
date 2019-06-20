package modelExpenses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import app.ApplicationSession;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;

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
		Iterator<Expenses> iterator = expenses.iterator();

		while (iterator.hasNext()) {
			Expenses s = iterator.next();
//			if (s.getName().equals(name)) {
//				iterator.remove();
//			}
		}

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
