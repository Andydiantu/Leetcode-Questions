import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap <String,String> indexes = new HashMap<String, String>();

        indexes.put("England","London");
        indexes.put("Scotland","Edinburgh");
        indexes.put("China","Beijing");

        System.out.println(indexes);

        for(String i : indexes.keySet()){
            System.out.println("The key is " + i + " and value is " + indexes.get(i));
            System.out.println(indexes.containsKey("China"));
        }
    }
}
