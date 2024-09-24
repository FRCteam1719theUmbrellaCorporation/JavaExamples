import org.junit.Test;

public class Duck extends Bird{

    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("quack");
    }

    public void swim() {
        int x = (int) (Math.random() * 10);
        System.out.println("The duck swam " + x + " feet");
    }
}

