import java.util.Scanner;

public class odev1 {
	public static void main(String[] args) {
		int dgr, sayac = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		dgr = in.nextInt();

		for (int i = 0; i < dgr; i++) {
			sayac = i;
			if (i == (dgr - 1) || i == 0) {
				for (int j = 0; j < dgr; j++) {
					System.out.print("*");
				}
				System.out.println("");
			} else {
				for (int j = 0; j < dgr; j++) {
					sayac++;
					if (j == 0 || j == (dgr - 1)) {
						System.out.print("*");
					} else {
						if (sayac % 2 == 1) {
							System.out.print("+");

						} else {
							System.out.print(" ");

						}
					}
				}
				System.out.println("");
			}
		}

	}

}
