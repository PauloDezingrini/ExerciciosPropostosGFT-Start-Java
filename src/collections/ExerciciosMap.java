package collections;
import java.util.*;

public class ExerciciosMap {
    public static void main(String[] args) {
        Map<String,Integer> estadosNE = new HashMap<>() {{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};

        estadosNE.put("RN",3534165);
        System.out.println("=====Atualizando a população do RN=====");
        System.out.println(estadosNE);

        if(!estadosNE.containsKey("PB")) estadosNE.put("PB",4039277);
        System.out.println("=====Inserindo o estado de PB no Map=====");
        System.out.println(estadosNE);

        System.out.println("=====Exibindo população de PE=====");
        System.out.println("População do estado de Pernambuco : " + estadosNE.get("PE"));

        Map<String,Integer> estadosNE1 = new LinkedHashMap<>() {{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};

        System.out.println("=====Exibindo na ordem de inserção=====");
        System.out.println(estadosNE1);

        Map<String,Integer> estadosNE2 = new TreeMap<>() {{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};

        System.out.println("=====Exibindo em ordem alfabética=====");
        System.out.println(estadosNE2.toString());

        Collection<Integer> populacao = estadosNE.values();
        int populacaoMax = Collections.max(populacao);
        int populacaoMin = Collections.min(populacao);
        String estadoMaisPopuloso = "";
        String estadoMenosPopuloso = "";
        for(Map.Entry<String,Integer> entry : estadosNE.entrySet()){
            if(entry.getValue() == populacaoMax) estadoMaisPopuloso = entry.getKey();
            if(entry.getValue() == populacaoMin) estadoMenosPopuloso = entry.getKey();
        }

        System.out.printf("O estado com maior população é %s e possui %d habitantes\n",estadoMaisPopuloso,populacaoMax);
        System.out.printf("O estado com menor população é %s e possui %d habitantes\n",estadoMenosPopuloso,populacaoMin);

        int soma = 0;
        for (Integer integer : estadosNE.values()) soma += integer;

        System.out.println("=====Exibindo a soma e a média das populações=====");
        System.out.printf("A soma das populações é %d \n",soma);
        System.out.printf("A média das populações é %d \n",soma/estadosNE.size());

        estadosNE.values().removeIf(integer -> integer <= 4000000);

        System.out.println("======Exibindo após remover os estados com população inferior a 4 milhões=====");
        System.out.println(estadosNE);

        estadosNE.clear();
        System.out.println("O dicionário está vazio : " + estadosNE.isEmpty());

    }
}
