package practicePrograms;

public class AbstractClassExample1Demo extends AbstractClassExample1 {
    static int a,b;
    public int subtract(int a,int b)
    {
        return a-b;
    }
    public void display()
    {
        System.out.println( "The value of a"+a);
        System.out.println("The Value of b"+b);
    }
    public static void main(String args[])
    {
        a=10;b=5;
        AbstractClassExample1Demo acd=new AbstractClassExample1Demo();
        System.out.println(acd.add(a,b));
        System.out.println(acd.add(a,b));
       acd.display();
    }

}
