import java.util.Scanner;
public class atividade7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        double valorParcela;
        int jurosParcelaAtraso;
        int diaAtraso;
        double valorTotalPagamento;

        System.out.print("Qual o valor da parcela?: ");
        valorParcela = sc.nextDouble();
        System.out.print("Dias de atraso: ");
        diaAtraso = sc.nextInt();
        System.out.print("Valor do juros: ");
        jurosParcelaAtraso = sc.nextInt();

        valorTotalPagamento = valorParcela + (diaAtraso * jurosParcelaAtraso);
        
        System.out.println("Valor total do juros: " + jurosParcelaAtraso + "R$");
        System.out.println("Valor total do Pagamento: " + valorTotalPagamento + "R$");



        sc.close();

    }
}
