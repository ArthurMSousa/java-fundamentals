import java.util.Scanner;

public class DivFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o número para calcular todos os seus divisores: ");

		int n = sc.nextInt();
		
		System.out.println("Os divisores de " + n + " são:");

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
