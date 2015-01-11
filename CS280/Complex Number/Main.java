
public class Main {

    public static void main(String[] args) {

        ComplexNumber x = new ComplexNumber(1, -2);
        ComplexNumber y = new ComplexNumber(2, 3);

        float i = 5;

        System.out.println(x + " + " + y + " = " + x.add(y));
        System.out.println(x + " - " + y + " = " + x.sub(y));
        System.out.println(x + " * " + y + " = " + x.mul(y));
        System.out.println(x + " / " + y + " = " + x.div(y));

        System.out.println(x + " + " + i + " = " + x.add(i));
        System.out.println(x + " - " + i + " = " + x.sub(i));
        System.out.println(x + " * " + i + " = " + x.mul(i));
        System.out.println(x + " / " + i+ " = " + x.div(i));
    }
}