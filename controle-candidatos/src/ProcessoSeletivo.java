import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        selecaoCandidatos();
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Matheus", "Luana", "Kayki", "Igor", "Pedro"};

        System.out.println("Imprimindo a lista de candidatos informando  indice do elemento");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de n° " + (i+1) + " é " + candidatos[i]);
        }

        System.out.println("forma abreviada");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Matheus", "Luana", "Kayki", "Igor", "Pedro", "Rafael", "Muryllo", "Lucas", "Angelo", "Ailton"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println(" ");
            System.out.println("O candidato " + candidato + " tem salario pretendido: " + salarioPretendido);

            if (salarioPretendido <= salarioBase){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

}