
import java.util.Scanner;

public class Matriz{
    public static void main(string args[]){

        int m = 2;
        int n = 2;

        int[][] data = new int[m][n]; //matriz

        for (int i=0; i < m; i++) { 
            for (int j=0; j < n; j++) {

                data[i][j] = (int) (Math.random() * 9 + 0);
            }
        }

         // mostrar matriz
        for (int i=0; i < m; i++) { 
            for (int j=0; j < n; j++) {

                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

    }
}