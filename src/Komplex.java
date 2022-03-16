public class Komplex {
        double re;
        double im;

        public Komplex(double re, double im) {
            this.re = re;
            this.im = im;
        }
        public Komplex add(Komplex z2){
            return new Komplex(this.re+z2.re, this.re+z2.im);
        }

        @Override
        public String toString() {
            return "Komplex{" + "re=" + re + ", im=" + im + '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            return super.equals(obj);
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        public static void main(String[] args){
            Komplex z1 = new Komplex(3.5, 3.5);
        }
    }


