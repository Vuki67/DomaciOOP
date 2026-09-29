public class Program {
    public static void main(String[] args) {
        int a = 24;
        int b = 12;
        char operation = '+';

        if (operation == '+') {
            int rezultat = a + b;
            System.out.println("Sabiranje: " + a + " + " + b + " = " + rezultat);
        } else if (operation == '-') {
            int veci = Math.max(a, b);
            int manji = Math.min(a, b);
            int rezultat = veci - manji;
            System.out.println("Oduzimanje: " + veci + " - " + manji + " = " + rezultat);
        } else if (operation == '*') {
            int rezultat = a * b;
            System.out.println("Množenje: " + a + " * " + b + " = " + rezultat);
        } else if (operation == '/') {
            double rezultat = (double) a / b;
            System.out.println("Deljenje: " + a + " / " + b + " = " + rezultat);
        } else {
            System.out.println("Uneta je nevažeća operacija.");
        }
    }
}
