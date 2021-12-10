import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraylistTesting {

    public static void main(String[] args) {

      List<Student> studentList = new ArrayList<>();
      studentList.add(new Student("Mohan","Sohan"));
        studentList.add(new Student("Praveen","pravee"));
        studentList.add(new Student("Ram","Ram"));
        studentList.add(new Student("Rohit","Rohit"));

        System.out.println(studentList.get(3).getStudentRank());

        ListIterator<Student> it = studentList.listIterator();
        while (it.hasNext()){
            if(it.next().getStudentName().equals("Rohit")){
                it.remove();
            }
        }

        System.out.println("after removal "+ studentList);

        Object[] objects = studentList.toArray();

        CopyOnWriteArrayList<Student> arr = new CopyOnWriteArrayList<>();


        //remobving duplicate from Arraylis
        List<Integer> list = new ArrayList<>(Arrays.asList(2,2,3,5,4,2,3,4,5,7,2,3,1,4,5));
        Set<Integer> listnew = new LinkedHashSet<>();
         for(int i : list){

             listnew.add(i);

         }

        System.out.println(listnew);

        List<Integer> newliust =list.stream().distinct().collect(Collectors.toList());

        System.out.println(newliust);


        //Compare two arrays:
        List<String> Str1 = new ArrayList<>(Arrays.asList("praveen","Moh","Mohs"));
        List<String> Str2 = new ArrayList<>(Arrays.asList("praveen","Moh","Mohss"));

        System.out.println(Str1.retainAll(Str2));



    }

}
