import java.util.Scanner;

public class TwoEj2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la calificacion del estudiante");
        int nota = sc.nextInt();
        if(nota >=0 && nota <=59) System.out.println("Reprobado");
        else if(nota >=60 && nota <=69) System.out.println("Malo");
        else if(nota >=70 && nota <=79) System.out.println("Regular");
        else if(nota >=80 && nota <=89) System.out.println("Bueno");
        else if(nota >=90 && nota <=99) System.out.println("Muy bueno");
        else if(nota == 100) System.out.println("Excelente");
        else System.out.println("Introduce una nota valida, las notas tienen que estar entre  0 y 100");

    }
}
