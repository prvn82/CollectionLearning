public class Childclass extends ParentClass{

    public String childcheck ="testin";
    private String childCheckprovate ="private";
    protected String childcheckprotected="protected";
    String childcheckddefault="default";



    public Childclass(){
       // super();
        System.out.println("Child");
    }

    @Override
    public void test1(){
        System.out.println("Childtest1");
    }

    //@Override
    public void test2(){
        System.out.println("Childtest2");
    }

    protected void test3(){
        System.out.println("Childtest3");
    }

    void test4(){
        System.out.println("Childtest4");
    }
}
