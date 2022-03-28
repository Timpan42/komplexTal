
/**
 * This is a class
 * Created 2020-02-06
 *
 * @author Magnus Silverdal
 */
public class test {

    public static void main(String[] args) {
        Komplex a;
        Komplex b;
        a = new Komplex(3.0,2.0);
        b = new Komplex(4.0,1.0);

        System.out.println("talet borde vara 3 + 2i:\n" + a +"\n" + "talet borde vara 4 + 1i:\n" + b+"\n");

         Komplex c = a.add(b);
        Komplex d = new Komplex(7,3);
        System.out.println(c + "\n" + d + "\n");

        System.out.println(c);
        if (c.equals(d)) {
            System.out.println("add funkar!!");
        }

        a = new Komplex(3.0,2.0);
        b = new Komplex(4.0,1.0);

        c = a.multi(b);
        d = new Komplex(10,11);

        System.out.println("(3*4=12) - (2*1=2) = 10" + "\n" + "(2*4=8) + (3*1=3) = 11" + "\n");
        System.out.println(c);
        if (c.equals(d)) {
            System.out.println("multiply funkar!!");
        }
/*
        System.out.println("Argumentet till 3+2i är " + a.arg());
        if (a.arg() == Math.atan(2.0/3)) {
            System.out.println("arg() funkar!!");
        }*/
    }
}