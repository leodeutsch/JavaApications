package randomizerwithtimer;

import java.util.List;

public class NovaPalavra {

    public static void geraNovaPalavra(List<String> resultado, String palavra, int tamanho, String palavraAtual) {

        String palavraCorrente = palavraAtual;
        for (int i = 0; i < palavra.length(); i++) {
            palavraCorrente += palavra.charAt(i);
            if (palavraCorrente.length() >= tamanho) {
                int contadorDeLetra = 0;
                char letra;
                for (int j = 0; j < palavraCorrente.length(); j++) {
                    letra = palavraCorrente.charAt(j);
                    for (int k = 0; k < palavraCorrente.length(); k++) {
                        if (letra == palavraCorrente.charAt(k)) {
                            contadorDeLetra += 1;
                        }
                    }
                }
                if (contadorDeLetra == palavraCorrente.length()) {
                    resultado.add(palavraCorrente);
                }
                palavraCorrente = palavraAtual;
            } else {
                geraNovaPalavra(resultado, palavra, tamanho, palavraCorrente);
                palavraCorrente = palavraAtual;
            }
        }
    }
}
