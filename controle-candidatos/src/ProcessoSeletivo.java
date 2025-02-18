import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Matheus", "Luana", "Kayki", "Igor", "Pedro", "Rafael", "Muryllo", "Lucas", "Angelo", "Ailton"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " tem salario pretendido: " + salarioPretendido);
            System.out.println(" ");
            if (salarioPretendido <= salarioBase){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                System.out.println(" ");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
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