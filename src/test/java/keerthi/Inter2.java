package keerthi;

public class Inter2 implements Inter{
    @Override
    public void inter() {
        System.out.println("this is inter course");
    }

    @Override
    public void btech(int sem1, int sem2) {
        System.out.println("this is btech course"+sem1+sem2);
    }

    @Override
    public void mtech(String branch) {
        System.out.println("this is mtech course"+branch);
    }

    static void main() {
        Inter2 obj = new Inter2();
        obj.inter();
        obj.btech(1, 2);
        obj.mtech("cse");
    }
}
