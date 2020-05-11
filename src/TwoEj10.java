import java.util.Scanner;

public class TwoEj10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        char c = sc.next().charAt(0);
        System.out.println("Introduce un numeroo");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro numero");
        int num2 = sc.nextInt();
        switch (c){
            case '+':{
                int operacion = num1 + num2;
                System.out.println("La suma es = "+ operacion);
                break;
            }
            case '-':{
                int operacion = num1 - num2;
                System.out.println("La resta es = "+ operacion);
                break;
            }
            case '*':{
                int operacion = num1 * num2;
                System.out.println("La multiplicacion es = "+ operacion);
                break;
            }
            case '/':{
                float operacion = (float) num1 / num2;
                System.out.println("La divicion es = "+ operacion);
                break;
            }
            default: {
                System.out.println("Error");
            }
        }

    }
}
