package Java2Sessions;

import java.io.Serializable;

public class Person implements Serializable {
	private String name;
	private int age;
	private boolean glasses;

	public Person(String name, int age, boolean glasses) {
		super();
		this.name = name;
		this.age = age;
		this.glasses = glasses;
	}

	public Person(String text) {
		String[] splits = text.split(",");
		name = splits[0];
		age = Integer.parseInt(splits[1]);
		glasses = Boolean.parseBoolean(splits[2]);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", glasses=" + glasses + "]";
	}

	public String toFileFormat() {
		return name + "," + age + "," + glasses;
	}

}
