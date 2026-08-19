import java.util.Scanner;

public class WeekdayIdentifier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
        String dia;

        System.out.println("Digite o número do dia");
        
        int x = sc.nextInt();

        switch (x) {
          case 1:
            dia = "Domingo";
            break;
        case 2:
            dia = "Segunda";
            break;
        case 3:
            dia = "Terça";
            break;
        case 4:
            dia = "Quarta";
            break;
        case 5: 
            dia = "Quinta";
            break;
        case 6: 
            dia = "Sexta";
            break;
        case 7:
            dia = "Sábado";
            break;
        default:
            dia = "Data inválida";
            break;
        }

        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}