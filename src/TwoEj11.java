import java.util.Scanner;

public class TwoEj11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opcion");
        System.out.println("1. Convertir horas a minutos");
        System.out.println("2. Convertir minutos a segundo");
        System.out.println("3. Convertir horas a dias");
        int op = sc.nextInt();
        switch (op) {
            case 1: {
                System.out.println("Introduce las horas");
                int horas = sc.nextInt();
                int convercion = horas * 60;
                System.out.println(horas + " en minutos es = " + convercion);
                break;
            }
            case 2: {
                System.out.println("Introduce los minutos");
                int minutos = sc.nextInt();
                int convercion = minutos * 60;
                System.out.println(minutos + " en segundos es = " + convercion);
                break;
            }
            case 3: {
                System.out.println("Introduce las horas");
                int horas = sc.nextInt();
                int convercion = horas / 24;
                System.out.println(horas + " en dias es = " + convercion);
                break;
            }
            default: {
                System.out.println("Elige una opcion valida");
            }
        }
    }
}
