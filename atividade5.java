import java.util.Scanner;
public class atividade5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double salario;
        double percentual_aumento;
        double salario_aumentado;
        double resultado;

        System.out.print("Valor do salário: R$");
        salario = sc.nextDouble();
        System.out.print("Percentual de almento: %");
        percentual_aumento = sc.nextDouble();

        resultado = salario * percentual_aumento / 100;
        salario_aumentado = salario + resultado;

        System.out.print("Salário com aumento: R$" + salario_aumentado);

        sc.close();

    }
}
