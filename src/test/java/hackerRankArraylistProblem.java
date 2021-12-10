import java.util.ArrayList;
import java.util.Scanner;

public class hackerRankArraylistProblem {


    static Scanner sc ;

    static ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

    public static void main(String[] args) {

        sc=new Scanner(System.in);
        int n = sc.nextInt();

        int count=1;

        while (n>=count){

            System.out.println("Enter Digit for "+count);

            int d = sc.nextInt();
            ArrayList<Integer> it = new ArrayList<>();
            for(int i=0;i<d;i++){
                int num=sc.nextInt();
                it.add(num);
            }

            lists.add(it);
            count++;

        }

        System.out.println("Answr is "+lists.get(0).get(3));


    }


}
