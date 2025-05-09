/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author alexv
 */
public class Vasquez_Alexander_Estructura {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in).useDelimiter("\n");
        Random rand = new Random();// nueva funcion random
        int contador1=0;
        int contador2=0;
        int contador3=0;// inicializo los contadores de uso de cada opcion
        int contador4=0;
        
        while (true){
            System.out.println("\n====Menu====");// las 5 opciones
            System.out.println("1) Palabra Alreves");
            System.out.println("2) Numero Perfecto");
            System.out.println("3) Numeros Primos");
            System.out.println("4) Votaciones");
            System.out.println("5) Salir");
            System.out.println("Ingrese una opcion: 1-5.");
            int opcion = scanner.nextInt();
            
            if(opcion==1){// primera opcion
                contador1++;
                
                System.out.println("\n***Bienvenido a Palabras Alreves***");
                
                System.out.println("\nIngrese el numero de palabras: ");
                int numero = scanner.nextInt();
                
                String palabraMayor="";
                int mayorN=0;
                
                
                
                
                
                for(int i=1;i<=numero;i++){
                     String palabraInvertida="";
                     System.out.println("Ingrese palabra: #"+i);
                     String palabra= scanner.next();
                     for(int j=palabra.length()-1 ;j>=0;j--){
                         palabraInvertida+=palabra.charAt(j);//le damos vuelta a la palabra
                     }
                     if(palabra.length()>mayorN){ 
                         mayorN=palabra.length();//actualizamos variables mayores
                         palabraMayor=palabra;
                     }
                     System.out.println("al reves: " + palabraInvertida);
                }
                String invertida = "";
                for (int j = palabraMayor.length() - 1;j >= 0; j--){
                    invertida += palabraMayor.charAt(j);
                }

                System.out.println("Palabra mas larga: " + palabraMayor);
                if (palabraMayor.equalsIgnoreCase(invertida)){
                    System.out.println("Es palindromo");
                } else {
                    System.out.println("No es palindromo");
                }
            }else if     (opcion==2){//opciom 2
                contador2++;
                System.out.println("\n***Bienvenido a Numero Perfecto***");
                System.out.print("Ingrese un numero: ");
                int numeroOpcion2= scanner.nextInt();
                int suma=0;
                int i = 1;
                while (i<numeroOpcion2) {
                    if (numeroOpcion2 % i == 0){
                        suma += i;// calcula cuantos primos hay
                    }
                    i++;
                }
                if (suma == numeroOpcion2) {
                    System.out.println(numeroOpcion2 + " es un numero perfecto.");
                } else {
                    System.out.println(numeroOpcion2 + " no es un numero perfecto.");
                }
            
            }else if (opcion==3){//opcion 3
                contador3++;
                System.out.println("\n***Bienvenido a Numeros Primos***");
                 int numeroAleatorio=rand.nextInt(100)+1;//genera el numero aleatorio
                 System.out.println("Numero generado: "+ numeroAleatorio);

                 int divisores=0;
                 System.out.print("Los divisores son: ");
                 for (int j = 1;j <= numeroAleatorio;j++){
                     if (numeroAleatorio%j == 0) {
                        System.out.print(j1+ " ");
                        divisores++;// da los divisores del numero
                    }
                 }
                 System.out.println();
                 if (divisores==2) {
                     System.out.println(numeroAleatorio+" es primo");
                 } else {
                    System.out.println(numeroAleatorio+" no es primo");
                 }

            }else if(opcion==4){//opcion 4
                contador4++;
                System.out.println("\n***Bienvenido a Votaciones***");
                System.out.print("Ingrese la cantidad de votantes: ");
                int votantes = scanner.nextInt();

                int azul = 0;
                int rojo = 0;
                int negro = 0;
                int amarillo = 0;
                int nulo = 0;

                for (int i = 1;i <= votantes;i++){
                    System.out.print("Voto #" +i+ " (AZUL, ROJO, NEGRO, AMARILLO): ");
                    String voto = scanner.next();//empieza la votacion
                    if (voto.equalsIgnoreCase("AZUL")){
                        azul++;
                    }else if (voto.equalsIgnoreCase("ROJO")){
                        rojo++;
                    }else if (voto.equalsIgnoreCase("NEGRO")){
                        negro++;
                    }else if (voto.equalsIgnoreCase("AMARILLO")){
                        amarillo++;
                    }else{
                        nulo++;
                    }
                }

                int validos = azul + rojo + negro + amarillo;
                if (validos*100>= votantes*60){//calcula quien gana
                    String ganador = "";
                    if(azul> rojo && azul>negro && azul> amarillo){
                        ganador = "AZUL";
                    } else if (rojo>azul && rojo>negro && rojo> amarillo){
                        ganador = "ROJO";
                    } else if(negro >azul && negro> rojo && negro>amarillo){
                        ganador = "NEGRO";
                    } else{
                        ganador = "AMARILLO";
                    }
                    System.out.println("Planilla ganadora: " + ganador);
                }else{
                    System.out.println("VOTACION  FALLIDA");
                }
            }else if(opcion==5){
                System.out.println("Saliste del programa");
                System.out.println("Veces Usadas: ");
                System.out.println("1) Palabra Alreves: " + contador1);
                System.out.println("2) Numero Perfecto: " + contador2);//pantalla final
                System.out.println("3) Primos: " + contador3);
                System.out.println("4) Votaciones: " + contador4);
                break;
            }else{
                System.out.println("invalido");

            }
        }
    }
}
