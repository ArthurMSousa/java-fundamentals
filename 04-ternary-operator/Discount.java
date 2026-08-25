import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
        double price;
        double discount;

        System.out.println("Digite o preço");
        
        price = sc.nextDouble();

        discount = (price < 20.0)? price * 0.1 : price *0.05;
        
        System.out.printf("Valor do desconto: R$ %.2f%n", discount);
        sc.close();
    }
}
