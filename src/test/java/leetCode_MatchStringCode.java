import java.util.HashMap;
import java.util.Map;

public class leetCode_MatchStringCode {


    public static void main(String[] args) {

        System.out.println(wordPattern("abba","dog cat cat dog"));

    }


    public static boolean wordPattern(String parttern, String s){

//        if(parttern.length()!=s.length()){
//            return false;
//        }

        String[] word = s.split(" ");
        Map<Character , String> map =new HashMap<>();
        Map<String , Boolean> used = new HashMap<>();

        for(int i=0;i<parttern.length();i++){
            char a = parttern.charAt(i);
            if(map.containsKey(a)==false){
                if(used.containsKey(word[i])==true){
                    return false;
                }
                else{
                    used.put(word[i],true);
                    map.put(a,word[i]);
                }
            }
            else{
                String str =map.get(a);
                if(str.equals(word[i])==false){
                    return false;
                }

            }
        }

        return true;
    }
}
