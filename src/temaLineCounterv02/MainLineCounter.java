package temaLineCounterv02;

public class MainLineCounter {
	public static void main(String[] args) {
		Params params = new Params(args);
		if (!params.parse()) {
			System.out.println("Invalid parameters");
			return;

		}
		LineCounter lc = new LineCounter(params);
		lc.search();
	}

}
