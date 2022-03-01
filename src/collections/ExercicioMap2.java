package collections;

import java.util.*;

public class ExercicioMap2 {

    public static void main(String[] args) {
        Dado dado = new Dado();
        List<Integer> resultados = dado.multiplosLancamentos(100);

        Map<Integer,Integer> resultados1 = new HashMap<>();
        for(Integer resultado : resultados){
            if(resultados1.containsKey(resultado)) resultados1.put(resultado,resultados1.get(resultado) + 1);
            else resultados1.put(resultado,1);
        }

        System.out.println("=== Imprimindo resultados ===");
        for(Map.Entry<Integer, Integer> entry : resultados1.entrySet())
            System.out.printf("O número %d foi sorteado %d vezes\n",entry.getKey(),entry.getValue());
    }
}

class Dado{
    Random rand;
    public Dado() {
        rand = new Random();
    };

    public int lancarDado(){
        return rand.nextInt(6) + 1;
    }

    public List<Integer> multiplosLancamentos(int numeroLancamentos){
        List<Integer> resultados = new ArrayList<>();
        for(int i=0;i<numeroLancamentos;i++)
            resultados.add(lancarDado());
        return resultados;
    }
}
