import java.util.Scanner;

public class TwoEj9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una letra mayuscula");
        char letra = sc.next().charAt(0);
        switch (letra){
            case 'A':
            case 'E':
            case 'F':
            case 'H':
            case 'I':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'T':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z': {
                System.out.println("Letra RECTA");
                break;
            }
            case 'C':
            case 'O':
            case 'S':
            case 'U':
            case 'Q':{
                System.out.println("Letra CURVA");
                break;
            }
            case 'B':
            case 'D':
            case 'G':
            case 'J':
            case 'P':
            case 'R':{
                System.out.println("Letra CURVA Y RECTA");
                break;
            }
            default: {
                System.out.println("Introduce una letra valida, asegurate que este en MAYUSCULA");
            }
        }
    }
}
