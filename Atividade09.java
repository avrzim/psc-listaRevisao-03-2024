import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, calculo;

        System.out.print("Digite um número: ");
        num = input.nextInt();

        for(int i = 1; i <= 10; i++){
            calculo = num * i;
            System.out.println(num + " * " + i + " = " + calculo);
        }

        input.close();
    }
}