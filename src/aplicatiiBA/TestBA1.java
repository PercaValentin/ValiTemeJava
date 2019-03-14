package aplicatiiBA;

public class TestBA1 {

	public static double avg(int[] sir) {

		double suma = 0;
		for (double element : sir) {

			suma += element;
		}

		{
			return suma / sir.length;
		}
	}

	public static void main(String[] args) {
		System.out.println(avg(new int[] { 4, 2, 3 }));
		System.out.println(avg(new int[] { 1, 7, 3, 6 }));
		System.out.println(avg(new int[] { 1, 2 }));
	}
}
