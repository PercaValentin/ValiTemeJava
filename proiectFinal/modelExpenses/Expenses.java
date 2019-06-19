package modelExpenses;

import java.io.Serializable;
import java.util.Date;

public class Expenses implements Serializable {
	private static final long serialVersionUID = 1L;

	private Date date;
	private double sum;
	private String description;
	private Category category;

	public Expenses(Date date, double sum, String description, Category category) {
		super();
		this.date = date;
		this.sum = sum;
		this.description = description;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Expense [date:" + date + ", sum:" + sum + ", description:" + description + ", category:" + category
				+ "]";
	}

	// public String getName() {
	// return name;
//	}

}
