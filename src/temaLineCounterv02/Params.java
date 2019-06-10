package temaLineCounterv02;

import java.io.File;

public class Params {
	private boolean ignoreComments;
	private boolean ignoreSpaces;
	private File folder;
	private String[] args;

	public Params(String[] args) {
		super();
		this.args = args;
	}

	public boolean parse() {
		for (int i = 0; i < args.length; i++) {
			String param = args[i];
			switch (param) {
			case "-ignoreComments":
				ignoreComments = true;
				break;
			case "-ignoreSpaces":
				ignoreSpaces = true;
				break;

			default:
				if (i < args.length - 1) {
					return false;
				} else {
					File path = new File(param);
					if (!path.exists()) {
						return false;
					}
					folder = path;
				}

			}

		}
		return true;

	}

	public File getFolder() {
		return folder;
	}

	public boolean isIgnoreSpaces() {
		return ignoreSpaces;

	}

	public boolean isIgnoreComments() {
		return ignoreComments;

	}
}
