package tema04;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuItem {
	private List<MenuItem> items = new ArrayList<>();

	public Menu(String key, String option) {
		super(option, key);
	}

	public void addMenuItem(MenuItem item) {
		items.add(item);

	}
}
