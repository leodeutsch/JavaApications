package randomizerwithtimer;

import java.util.*;

public class RandomizerWithTimer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        NovaPalavra geraNovaPalavra = new NovaPalavra();
        Cronometro timer = new Cronometro();
        String frase;
        int q;

        System.out.println("##Bem vindo##");
        System.out.println("Escreva quantas letras deseja inserir: ");
        q = s.nextInt();
        System.out.println("Escreva as letras desejadas: ");
        frase = s.next();
        long momentoInicial = System.currentTimeMillis();
        Cronometro.timer(momentoInicial);

        List<String> resultado = new ArrayList<String>();
        geraNovaPalavra.geraNovaPalavra(resultado, frase, frase.length(), "");
        
        System.out.println("\n");
        for (String palavra : resultado) {
            System.out.println(palavra);
        }
        long tempoDeExecucao = Cronometro.timer(momentoInicial);
        System.out.println("\nN�mero de elementos: "+resultado.size());
        System.out.println("Tempo total de execu��o: "+tempoDeExecucao+" milissegundos.");

    }
}