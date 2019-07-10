package modelExpenses2;

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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expenses other = (Expenses) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (Double.doubleToLongBits(sum) != Double.doubleToLongBits(other.sum))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Expenses [date=" + date + ", sum=" + sum + ", description=" + description + ", category=" + category
				+ "]";
	}

}
