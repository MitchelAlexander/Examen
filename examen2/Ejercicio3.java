package examen2;

import java.util.Scanner;

public class Ejercicio3 {
    static Scanner lt=new Scanner(System.in);

    public static void pintadodeXapuntes() {
        int alturadeX=0;
        System.out.println("Ingrese la altura de la X, recuerde que esta debe ser mayor a 3, y debe ser impar: ");
        alturadeX= lt.nextInt();
        if ((alturadeX<3) || (alturadeX%2==0)) {
            System.out.println("Error, recuerde las indicaciones que te dejamos arriba");
            alturadeX=lt.nextInt();
        }
        while (alturadeX < 3);
    for (int fil = 1; fil <= alturadeX; fil++){
      for (int col = 1; col <= alturadeX; col++){
        if ((fil == col) || (col == (alturadeX-fil)+1)){
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    }
    //este es el lugar, donde estuve probando método por método para corroborar que funcionará, no debe tomarse muy en cuenta
    public static void main(String[] args) {
        pintadodeXapuntes();
    }
} 
