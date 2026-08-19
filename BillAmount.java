//Suponhamos que uma operadora fixou o valor da conta telefônica em 50 reais por 100 minutos, e cobre 2 reais a mais por cada minuto extra utilizado, qual seria o valor da conta?

import java.util.Scanner;
public class BillAmount {
  
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de minutos utilizada:");
      
        int m;
        m = sc.nextInt();
      
        double c = 50.0;
        if (m > 100) {
            c += (m - 100) * 2.0;
        }
  
        System.out.printf("Valor da conta = R$ %.2f%n", c);
        
        sc.close();
  }
}