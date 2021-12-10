import java.util.ArrayList;
import java.util.List;

public class Student {

    private String StudentName;
    private String StudentAddress;
    private  static int StudentRank=100; // Ussing Static to make StudentRank Unquie for each object.
    private List<Integer> Rankregistere = new ArrayList<>();
  //  private final int

    public Student(String StudentName,String StudentAddress){
        this.StudentAddress=StudentAddress;
        this.StudentName=StudentName;
        StudentRank++;


    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        StudentAddress = studentAddress;
    }

    public int getStudentRank() {
        return StudentRank;
    }

    public void setStudentRank(int studentRank) {
        if(Rankregistere.contains(StudentRank)) {


            StudentRank = studentRank;
            Rankregistere.add(studentRank);
        }
        else{
            System.out.println("Student ID already exits. Please choose neew onw");
        }
    }
}
