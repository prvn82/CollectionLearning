import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapCaseinsnstiveKLeyHandling {

    public static void main(String[] args) {


        //This is eay to handle case senstive HaspMap key

        Map<String , String> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        map.put("UK","London");
        map.put("India","Delhi");
        map.put("US","newyork");
        map.put("Pakistan","Lahor");

      //  map.put(null, "Japan");
        //map.put(null, "newzeland");


        System.out.println(map.get("india"));

        map.keySet().stream().forEach(x-> System.out.println(map.get(x)));


        Map<String, String> map1 = new HashMap<>();
        map1.put("US","newYork");
        map1.put("India","Goa");
        map1.put("Britain","london");
        map1.put("China","Biziehn");

        Map<String, String> map2 = new HashMap<>();
        map2.put("US","newYork");
        map2.put("India","Goa");
        map2.put("Britain","london");
        map2.put("China","Biziehn");

        Map<String, String> map3 = new HashMap<>();
        map3.put("US","newYork");
        map3.put("India","Goa");
        map3.put("Britain","geek");
        map3.put("China","Biziehn");


        System.out.println(map1.equals(map2));
        System.out.println(map1.equals(map3));








    }
}
