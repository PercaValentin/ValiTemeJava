package modelExpenses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.savnet.utils.demo.app.ApplicationSession;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;

	private List<Expenses> expenses = new ArrayList<>();
	private List<Category> categories = new ArrayList<>();

	@Override
	public List<Expenses> getExpenses() {
		return expenses;
	}

	@Override
	public void addExpenses(Expenses expense) {
		expenses.add(expense);
		System.out.println(expense);
		ApplicationSession.getInstance().getSerializer().save(this);

	}

	@Override
	public void removeExpenses(Expenses expense) {
		Iterator<Expenses> iterator = expenses.iterator();

		while (iterator.hasNext()) {
			Expenses s = iterator.next();
			if (s.getName().equals(name)) {
				iterator.remove();
			}
		}

		ApplicationSession.getInstance().getSerializer().save(this);
	}

	@Override
	public void addCategory(Category name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeCategory(Category name) {
		// TODO Auto-generated method stub

	}

}
