public class Leetcode_palindrome_number {

    public static void main(String[] args) {

        System.out.println(isPalindrome(121
        ));



    }

    public static boolean isPalindrome(int x){
        String s = Integer.toString(x);
        String revers = "";
        for(int i=s.length()-1;i>=0;i--){

            revers=revers+s.charAt(i);

        }

        return revers.equals(s);
    }
}
