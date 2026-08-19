import java.util.Scanner;

public class PartsSales {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        int codPeca1, codPeca2, nPeca1, nPeca2;
        double preco1, preco2, total;
        
        codPeca1 = sc.nextInt();
        nPeca1 = sc.nextInt();
        preco1 = sc.nextDouble();
        
        codPeca2 = sc.nextInt();
        nPeca2 = sc.nextInt();
        preco2 = sc.nextDouble();
        
        total = preco1 * nPeca1 + preco2 * nPeca2;
        
        System.out.printf("Valor: R$ %.2f%n", total);
        
        sc.close();
  }
}

//PROGRAMA QUE CALCULA O CÓDIGO DE UMA PEÇA (codPeca), A QUANTIDADE (nPeca), O VALOR DE CADA PEÇA (preco) E DÁ O VALOR A SER PAGO
