import java.util.Scanner;
public class atividade_carro_pipa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        final double NIVEL1 = 12.5;
        final double NIVEL2 = 25;
        final double NIVEL3 = 50;
        
        double capacidadeReservatorio;
        int nivelRegulagem;
        double tempoEnchimento;

        System.out.print("Capacidade do reservatório: ");
        capacidadeReservatorio = sc.nextDouble();
        System.out.print("Nivel de regulágem [1 a 3]: ");
        nivelRegulagem = sc.nextInt();

        if (nivelRegulagem == 1) {
            tempoEnchimento = capacidadeReservatorio / NIVEL1;

        }else{
            if (nivelRegulagem == 2) {
                tempoEnchimento = capacidadeReservatorio / NIVEL2;

            }else{
                tempoEnchimento = capacidadeReservatorio / NIVEL3;

            }
        }
        System.out.print("Tempo para enchimento: " + tempoEnchimento);



        sc.close();        

    }
}
