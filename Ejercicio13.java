import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int checkDeseo;
        int num1, num2, suma, division;
        suma = 0;

        do{
            System.out.println("1. Suma");
            System.out.println("2. Division");
            System.out.println("3. Salir");
            checkDeseo = entrada.nextInt();

            if (checkDeseo == 1){

                System.out.println("Escribe 2 numeros para ser sumados");
                System.out.println("Escribe el primer numero");
                num1 = entrada.nextInt();

                System.out.println("Escribe el segundo numero");
                num2 = entrada.nextInt();

                System.out.println("La suma de los numeros es " + suma);

            } else if (checkDeseo == 2){
                System.out.println("Escribe 2 numeros, primero el dividendo y segundo el divisor");

                System.out.println("Escribe el dividendo");
                num1 = entrada.nextInt();
                System.out.println("Escribe el divisor");
                num2 = entrada.nextInt();

                if (num2 != 0){
                    division = num1/num2;
                } else{
                    System.out.println("Ingrese un divisor mayor a 0");
                }
            } else {
                if (checkDeseo == 3){
                    System.out.println("Adios");
                }
            }
        }while(checkDeseo !=3);
    }
}