public class Main {
    public static void main(String[] args) {

        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sub(45, 12));
        System.out.println(intsCalc.mult(2, 10));
        System.out.println(intsCalc.div(144, 12));
        System.out.println(intsCalc.pow(2, 10));
    }
}

