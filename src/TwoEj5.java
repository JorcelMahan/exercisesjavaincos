import java.util.Scanner;

public class TwoEj5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        switch (num) {
            case 1: {
                System.out.println("Su opuesto es = 6");
                break;
            }
            case 2: {
                System.out.println("Su opuesto es = 5");
                break;
            }
            case 3: {
                System.out.println("Su opuesto es = 4");
                break;
            }
            case 4: {
                System.out.println("Su opuesto es = 3");
                break;
            }
            case 5: {
                System.out.println("Su opuesto es = 2");
                break;
            }
            case 6: {
                System.out.println("Su opuesto es = 1");
                break;
            }
            default: {
                System.out.println("Un DADO no tiene ese numero");
            }
        }
    }
}
