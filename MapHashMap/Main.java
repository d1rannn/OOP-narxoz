package MapHashMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();

        for (int i = 0; i < 5; i++) {
            String carName = in.next();
            int carCost = in.nextInt();
            hm.put(carName, hm.getOrDefault(carName, 0) + carCost);
        }

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " costs " + entry.getValue() + " USD");
        }
    }
}

