import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode_2 {


    public static void main(String[] args) {

        String s ="oi###mupo##rszty#s#xu###bxx##dqc#gdjz"; // cafg;
        String t="oi###mu#ueo##pk#o##rsztu#y#s#xu###bxx##dqc#gz#djz";

        System.out.println(removeElement(s));
        System.out.println(removeElement(t));



        System.out.println(removeElement(s).equals(removeElement(t)));
    }



    public static String removeElement(String s) {

        List<String> hs = new ArrayList<>();
        String[] split = s.split("");
        for(int i=0;i<split.length;i++){
           // System.out.println(split[i]);
            if(!split[i].equals("#")){
                hs.add(split[i]);
            }
            else{
                if(hs.size()!=0){
                    hs.remove(hs.get(hs.size()-1));
                }
            }
        }

        return hs.stream()
                .map(Object::toString)
                .collect(Collectors.joining("\t"));

    }
}
