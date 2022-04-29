import java.util.Scanner;
public class atividade2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double alturaT, baseT, areaT;

        System.out.println("Valor da Base: ");
        baseT = sc.nextDouble();
        System.out.println("Valor da Altura: ");
        alturaT = sc.nextDouble();

        areaT = (baseT * alturaT) / 2;

        System.out.printf("A area do triângulo é: %.2f", areaT);

        sc.close();

    }

}
