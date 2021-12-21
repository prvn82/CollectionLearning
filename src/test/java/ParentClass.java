public class ParentClass {

    public String check ="testin";
    private String Checkprovate ="private";
    protected String checkprotected="protected";
    String checkddefault="default";


    public ParentClass(String s){
        System.out.println("Parent");
    }

    public ParentClass(){
        System.out.println("Parent No");
    }

    public void test1(){
        System.out.println("test1");
    }

    private void test2(){
        System.out.println("test2");
    }

    protected void test3(){
        System.out.println("test3");
    }

    void test4(){
        System.out.println("test4");
    }

    void test5(){
        System.out.println("test5");
    }
}
