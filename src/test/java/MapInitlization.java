import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapInitlization {


    static Map<String,Integer> map;
    static{
        map=new HashMap<>();
        map.put("Testing",7766);
        map.put("shshs",7744466);

    }

    public static void main(String[] args) {

        System.out.println(map.get("Testing"));
        Collections.singletonMap("Test",122);


        Map<Integer, Integer> ma1 = new ConcurrentHashMap<>();
        ma1.put(null,12322);




    }
}
