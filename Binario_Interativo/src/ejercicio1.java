
import java.util.Scanner;


public class ejercicio1 {


    public static void main(String[] args) {
     Scanner in = new Scanner (System.in);
     int n;
     int arreglos [] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Ingrese el numero a buscar");
        n = in.nextInt();
        int posicionIn = 0;
        int posicionFinal = arreglos.length -1;
        int poscionCentral;
        while (posicionIn <= posicionFinal)  // 0 <= 8 
        {
            poscionCentral = (posicionFinal + posicionIn)/2;
            if (arreglos[poscionCentral] == n){
                System.out.println("dato encontrado en el indice: " + poscionCentral);
                break;
           }else{
              if (n < arreglos[poscionCentral]) // arreglos[poscionCentral] = 5
               posicionFinal = poscionCentral -1;   // posicionIn = 3       
            else
                posicionIn= poscionCentral +1;
            }       
        }
             
    }
}

