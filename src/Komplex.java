import java.util.Objects;

public class Komplex {
    double re;
    double im;

    public Komplex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public String toString() {
        return "Komplex{" + re + " " + "+" + " " + im + "i" + '}';
    }
    public Komplex add (Komplex add){
        add.re = re + add.re;
        add.im = im + add.im;
        return add;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Komplex komplex = (Komplex) o;
        return Double.compare(komplex.re, re) == 0 && Double.compare(komplex.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
    public Komplex multi (Komplex multi) {
        multi.re = re * multi.re - im * multi.im;
        multi.im = im * multi.re + multi.im * re;
        return multi;
    }
}
