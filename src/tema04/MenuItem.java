package tema04;

public abstract class MenuItem {

	private String key;
	private String option;

	public MenuItem(String option, String key) {
		super();
		this.key = key;
		this.option = option;
	}

	@Override
	public String toString() {
		return "";// option + ". " + MultilanguageSession.mls.getMessage(key);

	}

}
