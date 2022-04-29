import java.util.Scanner;
public class atividade4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        final double VALOR_GASOLINA = 7.199;
        final double VALOR_ETANOL = 5.419;
        final double VALOR_GNV = 4.259;
        
        double litroGasolina;
        double litroEtanol;
        double metroCubicoGNV;

        double v_Gasolina, v_Etanol, v_GNV;

        System.out.print("Litros Gasolina: ");
        litroGasolina = sc.nextDouble();
        System.out.print("Litros Etanol: ");
        litroEtanol = sc.nextDouble();
        System.out.print("Metro Cúbico de GNV: ");
        metroCubicoGNV = sc.nextDouble();

        v_Gasolina = VALOR_GASOLINA * litroGasolina;
        v_Etanol = VALOR_ETANOL * litroEtanol;
        v_GNV = VALOR_GNV * metroCubicoGNV;

        System.out.printf("\nValor Gasolina: %.3f", v_Gasolina); //duvida de como adicionar quebra de linha???????
        System.out.printf("\nValor Etanol: %.3f", v_Etanol);
        System.out.printf("\nValor GNV: %.3f", v_GNV);

        sc.close();
    }

}