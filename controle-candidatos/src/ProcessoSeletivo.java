import java.util.Locale;
import java.util.Scanner;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Proceso Seletivo");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual sua pretenção salarial? ");
        double pretencao = scanner.nextDouble();
        analisarCandidato(pretencao);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioPretendido < salarioBase) {
            System.out.println("Ligar para o candidato");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultados dos demais candidatos");
        }
    }

}