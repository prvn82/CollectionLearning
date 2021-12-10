import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraylistTesting {

    public static void main(String[] args) {

      List<Student> studentList = new ArrayList<>();
      studentList.add(new Student("Mohan","Sohan"));
        studentList.add(new Student("Praveen","pravee"));
        studentList.add(new Student("Ram","Ram"));
        studentList.add(new Student("Rohit","Rohit"));

        System.out.println(studentList.get(3).getStudentRank());

        Iterator<Student> it = studentList.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getStudentName());
        }



    }

}
