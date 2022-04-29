import java.util.Scanner;
public class atividade3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double quant_V_P, preco_V, total_I;

        System.out.print("Quantidade vendida do produto: ");
        quant_V_P = sc.nextDouble();
        System.out.print("Preço da venda: ");
        preco_V = sc.nextDouble();

        total_I = quant_V_P * preco_V;

        System.out.printf("O total de itens é de: %.1f", total_I);

        sc.close();
    }
    
}
