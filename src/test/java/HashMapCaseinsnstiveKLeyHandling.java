import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapCaseinsnstiveKLeyHandling {

    public static void main(String[] args) {


        //This

        Map<String , String> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        map.put("UK","London");
        map.put("India","Delhi");
        map.put("US","newyork");
        map.put("Pakistan","Lahor");

        System.out.println(map.get("india"));

    }
}
