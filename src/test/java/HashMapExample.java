import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("USA", "Washington D.C.");
        capitalCities.put("France", "Paris");
        capitalCities.put("Japan", "Tokio");
        System.out.println("Capital of France: " + capitalCities.get("France"));
        capitalCities.remove("USA");
        for (String country : capitalCities.keySet()) {
            System.out.println(country + " : " + capitalCities.get(country));
        }

    }
}
