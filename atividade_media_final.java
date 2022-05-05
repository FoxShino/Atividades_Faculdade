import java.util.Scanner;
public class atividade_media_final {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double mediaS;
        
        do {
            System.out.print("Qual foi a média do seu semestre? ");
            mediaS = sc.nextDouble();
            if (mediaS <0 || mediaS >10) {
                System.out.println("Media incorreta. Informe de 0 a 10.\n");
            }
        } while (mediaS <0 || mediaS >10);
        
        if (mediaS >=3 && mediaS <6){
            System.out.print("Sua nota final: ");
            double notaF = sc.nextDouble();
            double mediaF = (mediaS + notaF) /2;
            
            if (mediaF >=6) {
                System.out.println("Aprovado (final) ");
            }
            else {
                System.out.println("Reprovado (final)");
            }
        }
        else {
            if (mediaS >=6) {
                System.out.println("Aprovado");
            }
            else {
                System.out.println("Reprovado");
            }
        }

        sc.close();

    }
}
