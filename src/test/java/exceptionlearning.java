public class exceptionlearning {

    static int age1 = 10;
    static int age2 = 30;

    public static void main(String[] args) {

        try {
            validateage(30);
            validateage(10);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void validateage(int age) throws YoungExCeption {
        if(age<18){
            throw new YoungExCeption("You are younger");
        }
        System.out.println("Perfect age");
    }
}
