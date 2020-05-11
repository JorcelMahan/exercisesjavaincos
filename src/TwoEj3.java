import java.util.Scanner;

public class TwoEj3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dia de tu nacimiento");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes de su nacimiento");
        sc.nextLine();
        String mes = sc.nextLine();
        String signoZodiacal = "";
        switch (mes){
            case "enero": {
                if(dia>0 && dia <=20) signoZodiacal = "Capricornio";
                else if(dia>20&& dia<=31) signoZodiacal = "Acuario";
                else System.out.println("Introduce un dia valido");
                break;
            }
            case "febrero": {
                if(dia>0 && dia <=19) signoZodiacal = "Acuario";
                else if(dia>=20&& dia<=29) signoZodiacal = "Piscis";
                else System.out.println("Introduce un dia valido");
                break;
            }
            case "marzo": {
                if(dia>0 && dia <=20) signoZodiacal = "Piscis";
                else if(dia>=21&& dia<=31) signoZodiacal = "Aries";
                else System.out.println("Introduce un dia valido");
                break;
            }
            case "abril": {
                if(dia>0 && dia <=20) signoZodiacal = "Aries";
                else if(dia>=21&& dia<=30) signoZodiacal = "Tauro";
                else System.out.println("Introduce un dia valido");
                break;
            }
            case "mayo": {
                if(dia>0 && dia <=21) signoZodiacal = "Tauro";
                else if(dia>=22&& dia<=31) signoZodiacal = "Geminis";
                else System.out.println("Introduce un dia valido");
                break;
            }
            case "junio": {
                if(dia>0 && dia <=21) signoZodiacal = "Geminis";
                else if(dia>=22&& dia<=30) signoZodiacal = "Cancer";
                else System.out.println("Introduce un dia valido");
                break;
            }
            case "julio": {
                if(dia>0 && dia <=23) signoZodiacal = "Cancer";
                else if(dia>=24&& dia<=31) signoZodiacal = "Leo";
                else System.out.println("Introduce un dia valido");
                break;
            }
            case "agosto": {
                if(dia>0 && dia <=23) signoZodiacal = "Leo";
                else if(dia>=24&& dia<=31) signoZodiacal = "Virgo";
                else System.out.println("Introduce un dia valido");
                break;
            }
            case "septiembre": {
                if(dia>0 && dia <=23) signoZodiacal = "Virgo";
                else if(dia>=24&& dia<=30) signoZodiacal = "Libra";
                else System.out.println("Introduce un dia valido");
                break;
            }
            case "octubre": {
                if(dia>0 && dia <=23) signoZodiacal = "Libra";
                else if(dia>+24&& dia<=31) signoZodiacal = "Escorpio";
                else System.out.println("Introduce un dia valido");
                break;
            }
            case "noviembre": {
                if(dia>0 && dia <=22) signoZodiacal = "Escorpio";
                else if(dia>=23&& dia<=30) signoZodiacal = "Sagitario";
                else System.out.println("Introduce un dia valido");
                break;
            }
            case "diciembre": {
                if(dia>0 && dia <=21) signoZodiacal = "Sagitario";
                else if(dia>=22&& dia<=31) signoZodiacal = "Capricornio";
                else System.out.println("Introduce un dia valido");
                break;
            }
            default: {
                System.out.println("Introduce un mes valido");
            }
        }
        System.out.println("Tu signo zodical es: " + signoZodiacal);
    }
}
