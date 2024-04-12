import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Counter {
    public void count() {
        Random rand = new Random();
        int[] array = new int[20];
        Map<Integer, Integer> elements = new HashMap<>();

        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(15) + 1;
        }

        System.out.println(Arrays.toString(array));

        for(int num : array) {
            if (elements.containsKey(num)){
                elements.put(num, elements.get(num) + 1);
            } else {
                elements.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : elements.entrySet()){
            if (entry.getValue() > 1) {
                System.out.println("Число '" + entry.getKey() + "' встречается " + entry.getValue() + " раза");
            }
        }
    }
}
