package keerthi;

public class B implements A,C {

    B(){
        System.out.println("this is constructor");
    }

    @Override
    public void add() {
        System.out.println("thi is add");
    }

    @Override
    public void sub() {
        System.out.println("thi is sub");

    }

    static void main() {
        B obj = new B();

    }
}
