import java.util.Scanner;

public class TwoEj4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opcion");
        System.out.println("1. Perimetro de un triangulo equilatero");
        System.out.println("2. Perimetro de un circulo");
        System.out.println("3. Perimetro de un cuadrado");
        System.out.println("4. Area de un circulo");
        System.out.println("5. Area de un rectangulo");
        int op = sc.nextInt();
        switch (op) {
            case 1: {
                //perimetro = suma de sus 3 lados
                System.out.println("Introduce un lado");
                float lado = sc.nextFloat();
                float perimetro = 3 * lado;
                System.out.println("El perimetro de un triangulo equilatero es = " + perimetro);
                break;
            }
            case 2: {
                System.out.println("Introduce el radio");
                int radio = sc.nextInt();
                double perimetro = 2 * Math.PI * radio;
                System.out.println("El perimetro del circulo es = " + perimetro);
            }
            case 3: {
                System.out.println("Introduce un lado");
                int lado = sc.nextInt();
                int perimetro = lado * 4;
                System.out.println("El perimetro del cuadrado es  = "+ perimetro);
                break;
            }
            case 4: {
                System.out.println("Introduce el radio");
                int radio = sc.nextInt();
                double area = Math.PI * Math.pow(radio, 2);
                System.out.println("El area del circulo es = "+ area);
                break;
            }
            case 5: {
                System.out.println("Introduce un lado");
                int lado = sc.nextInt();
                System.out.println("Introduce el otro lado");
                int lado2 = sc.nextInt();
                int area = lado * lado2;
                System.out.println("El area de un rectangulo es = "+area);
                break;
            }
            default: {
                System.out.println("Introduce una opcion valida");
            }
        }
    }
}
