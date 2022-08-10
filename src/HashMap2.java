import java.util.HashMap;
import java.util.Random;

public class HashMap2 {
    public static void main(String[] args) {
        // Задание А
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int ranNumber = random.nextInt(100)+1;
            if(hashMap.containsKey(ranNumber)){
                hashMap.put(ranNumber, hashMap.get(ranNumber) + 1);
            }else {
                hashMap.put(ranNumber,1);
            }
        }
        for (Integer i : hashMap.keySet()) {
            System.out.println(i + " - " + hashMap.get(i));
        }
    }
}
