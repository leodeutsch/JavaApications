package randomizerwithtimer;

public class Cronometro {

    public static long timer(long momentoInicial){
        long tempoTotal1;
        tempoTotal1 = System.currentTimeMillis() - momentoInicial;

        return tempoTotal1;
    }
}
