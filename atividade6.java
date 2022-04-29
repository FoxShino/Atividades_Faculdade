import java.util.Scanner;
public class atividade6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		
		final double tapiocaSimples = 5.00;
		final double tapiocaGourmet = 8.00;
		
		System.out.println("Tapioca Simples: 5,00 R$");
		System.out.println("Quantidade de Tapiocas: ");
			double totalTapiocaS = sc.nextDouble();
		double result1 = tapiocaSimples * totalTapiocaS;
		
		System.out.println("Tapioca Gourmet: 8,00 R$");
		System.out.println("Quantidade de Tapiocas: ");
			double totalTapiocaG = sc.nextDouble();
		double result2 = tapiocaGourmet * totalTapiocaG;
		
		System.out.println("Valor dos ingredientes: ");
		double ingredientes = sc.nextDouble();
		
		double quantidadeTotal = totalTapiocaS + totalTapiocaG;
		double valorBruto = result1 + result2;
		double valorLiquido = valorBruto - ingredientes;
		
		System.out.println("Quantidade total de tapiocas vendidas: " + quantidadeTotal);
		System.out.println("Valor apurado Tapioca Simples: " + result1 + " R$");
		System.out.println("Valor apurado Tapioca Gourmet: " + result2 + " R$");
		System.out.println("Valor total bruto de vendas: " + valorBruto + " R$");
		System.out.println("Valor total liquido de vendas: " + valorLiquido + " R$");


        sc.close();

    }
}
