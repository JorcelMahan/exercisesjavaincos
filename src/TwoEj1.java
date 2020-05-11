import java.util.Scanner;

public class TwoEj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del colegio, (A, B, C)");
        String colegio = sc.nextLine();
        System.out.println("Introduce si es particular o publico");
        String tipoDeColegio = sc.nextLine();
        int descuento = 0;
        if (colegio.equals("A")) {
            if (tipoDeColegio.equals("particular")) descuento = 50;
            else descuento = 25;
        }else if(colegio.equals("B")){
            if(tipoDeColegio.equals("particular")) descuento = 40;
            else descuento = 20;
        }else if(colegio.equals("C")){
            if(tipoDeColegio.equals("particular")) descuento = 30;
            else descuento = 15;
        }else{
            System.out.println("Introduce un nombre de colegio valido y en MAYUSCULAS");
        }
        System.out.println("El descuento es del: " + descuento);
    }
}
