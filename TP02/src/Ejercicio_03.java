import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        Integer age = Integer.parseInt(scan.nextLine());

        if(age<12){
            System.out.println("Niño");
        }else if(age>=12 && age<=17){
            System.out.println("Adolescente");
        }else if(age>=18 && age<=59){
            System.out.println("Adulto");
        }else{
            System.out.println("Adulto mayor");
        }

    }
}
