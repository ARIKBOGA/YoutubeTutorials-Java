package Abstraction_Geeks;

public interface Face {
    int A = 1;
    static void print(){
        System.out.println("hhj");
    }
}
abstract class demo
{
    public int a;
    demo()
    {
        a = 10;
    }

    abstract public void set(int a);

    abstract  public void get();

}

class Test extends demo
{


    @Override
    public void set(int a) {
        this.a = a;
    }

    public void get()
    {
        System.out.println("a = " + a);
    }



    public static void main(String[] args)
    {
        Test obj = new Test();
        obj.set(20);
        obj.get();
    }
}