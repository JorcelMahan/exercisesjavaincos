import java.util.Scanner;

public class TwoEj7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el monto a pagar");
        double monto = sc.nextDouble();
        System.out.println("Ingrese el color de la bolita para el descuento");
        sc.nextLine();
        String colorBolita = sc.nextLine();
        double descuento = 0;
        if (colorBolita.equals("verde")) {
            descuento = monto - (monto * 0.20);
            System.out.println("Monto a pagar es = " + descuento);
        } else if (colorBolita.equals("amarilla")) {
            descuento = monto - (monto * 0.25);
            System.out.println("Monto a pagar es = " + descuento);
        } else if (colorBolita.equals("negra")) {
            descuento = monto - (monto * 0.30);
            System.out.println("Monto a pagar es = " + descuento);
        } else {
            System.out.println("El monto a pagar es = " + monto + " no tiene ningun descuento");
        }
    }
}
