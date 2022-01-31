public class StringClasstesting {

    public static void main(String[] args) {

        StringBuffer s =new StringBuffer("geekforgeek");
        StringBuffer s2=new StringBuffer("geekforgeek");

        System.out.println(s==s2);
        System.out.println(s.equals(s2));

        s=s.append("ggsgs");

        System.out.println(s==s2);
        System.out.println(s.equals(s2));


    }
}
