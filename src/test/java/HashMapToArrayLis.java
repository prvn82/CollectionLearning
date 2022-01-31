import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapToArrayLis {

    public static void main(String[] args) {


        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Amazon",1234443);
        map.put("Face",1234443);
        map.put("Nike",1234443);
        map.put("US",1234443);

        for(Map.Entry<String, Integer> s : map.entrySet()){
            System.out.println(s.getKey()+" has valud "+s.getValue());
        }

        map.compute("Amazon",(key, val)
                -> val+1);
        for(Map.Entry<String, Integer> s : map.entrySet()){
            System.out.println(s.getKey()+" has valud "+s.getValue());
        }

        System.out.println(map.getOrDefault("shshs",12322));

        System.out.println("************");
        for(Map.Entry<String, Integer> s : map.entrySet()){
            System.out.println(s.getKey()+" has valud "+s.getValue());
        }


        ArrayList<String> strings = new ArrayList<>(map.keySet());
        Collections.sort(strings);

        for(String s : strings){
            System.out.println("key "+s+" has value "+map.get(s));
        }


        System.out.println("*******");

        String name ="praveen";
        String n = new String("praveen");

        System.out.println(name.equals(n));
        System.out.println(name.compareTo(n));
        System.out.println(name==n);
        System.out.println(name.contains(n));
        System.out.println(name.contentEquals(n));

        String str = "Deepka";
        System.out.println(str.lastIndexOf(4));



    }
}
