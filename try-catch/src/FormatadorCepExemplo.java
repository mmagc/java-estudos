import javax.swing.*;

public class FormatadorCepExemplo {
    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("011001");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("o cep não corresponde com as regras de negócio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();


            return "01100-101";
    }
}
