package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTests {

    public static void main(String[] args) {
        List<String> jogadores = new ArrayList<>();
        Map<String, List<String>> time = new HashMap<>();
        int n = 3;

        for (int i = 0; i <= 20; i++){
            jogadores.add("jogador" + (i + 1));
        }

        int qtdJogadores = jogadores.size() / n;
        for (int i = 0; i < n; i++) {
            List<String> lista = new ArrayList<>(qtdJogadores);

            for (int j = 0; j < qtdJogadores; j++) {
                lista.add(jogadores.get(0));
                jogadores.remove(0);
            }
            time.put("time" + (i + 1), lista);
        }

        time.forEach(
                 (times, jogador) -> {
                     System.out.println(times);
                     jogador.forEach(System.out::println);
                     System.out.println();
                 }
        );

    }
}
