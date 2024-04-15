import java.util.Scanner;
import java.util.Random;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int aleatorio, inserido;

        aleatorio = random.nextInt(10) + 1;

        do{
            System.out.print("Digite um número entre 1 e 10: ");
            inserido = input.nextInt();

            if (inserido == aleatorio) {
                System.out.println("Você ganhou! O número era: " + aleatorio);
                break;
            } else{
                System.out.println("Tente novamente! ");
            }
        } while(inserido != aleatorio);
        

        input.close();
    }
}