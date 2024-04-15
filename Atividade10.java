public class Atividade10 {
    public static void main(String[] args) {

        int calculo = 0;

        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
                calculo += i;
            }
        }
        System.out.println("A soma dos números pares é: " + calculo);
    }
}