import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Pangramtesting {

    public static void main(String[] args) {

        System.out.println("Given String is Pangram" +isPangram("GeeksForGeeks"));


    }

    public static boolean isPangram(String s){

        s=s.toUpperCase();

        Set<Character> set = new HashSet<>();
        char[] str = s.toCharArray();
        for(int i=0;i<=str.length-1;i++){

            if(Character.isAlphabetic(str[i])) {
                set.add(str[i]);
            }
        }

        System.out.println(set.size());

        set.stream().forEach(sd-> System.out.println(sd));
        if(set.size()==26){
            return true;
        }

        return false;

    }
}
