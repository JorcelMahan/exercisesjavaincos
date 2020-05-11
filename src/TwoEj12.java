import java.util.Scanner;

public class TwoEj12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu de opciones");
        System.out.println("1. Bolivianos a Dolares");
        System.out.println("2. Bolivianos a Euros");
        System.out.println("3. Bolivianos a Pesos chilenos");
        System.out.println("4. Pesos chilenos a Bolivianos");
        System.out.println("5. Euros a Bolivianos");
        System.out.println("6. Dolares a Bolivanos");
        int op = sc.nextInt();
        switch (op) {
            case 1: {
                System.out.println("Introduce el monto en bolivianos");
                double bolivianos = sc.nextFloat();
                double convercion = bolivianos / 6.90;
                System.out.println("En dolar tu dinero es = " + convercion);
                break;
            }
            case 2: {
                System.out.println("Introduce el monto en bolivianos");
                double bolivianos = sc.nextFloat();
                double convercion = bolivianos / 7.47;
                System.out.println("En euros tu dinero es = " + convercion);
                break;
            }
            case 3: {
                System.out.println("Introduce el monto en bolivianos");
                double bolivianos = sc.nextFloat();
                double convercion = bolivianos / 0.0083;
                System.out.println("En pesos chilenos tu dinero es = " + convercion);
                break;
            }
            case 4: {
                System.out.println("Introduce el monto en pesos chilenos");
                double pesoChileno = sc.nextFloat();
                double convercion = pesoChileno * 0.0083;
                System.out.println("En bolivianos tu dinero es = " + convercion);
                break;
            }
            case 5: {
                System.out.println("Introduce el monto en euros");
                double euro = sc.nextFloat();
                double convercion = euro * 7.47;
                System.out.println("En bolivianos tu dinero es = " + convercion);
                break;
            }
            case 6: {;

                System.out.println("Introduce el monto en dolares");
                double dolares = sc.nextFloat();
                double convercion = dolares * 6.90;
                System.out.println("En bolivianos tu dinero es = " + convercion);
                break;
            }
            default: {
                System.out.println("Elige una opcion valida");
            }
        }
    }
}
