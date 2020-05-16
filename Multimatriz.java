
package multimatriz;

import java.util.Scanner;

/**
 *
 * @author Jackie Piña
 */
public class Multimatriz {

    
    public static void main(String[] args) {
      int[][] m1 = {{1,0,2},{-1,3,1}};
      int[][] m2 = {{3,1},{2,1},{1,0}};
      Scanner sr = new Scanner(System.in);
        System.out.println("Introducir valores");
      
      int fil_m1 = m1.length;
      int col_m1 = m1[0].length;
 
    int fil_m2 = m2.length;
    int col_m2 = m2[0].length;
      
    int[][] multiplicacion = new int[fil_m1][col_m2];
    for (int x=0; x < multiplicacion.length; x++) {
  for (int y=0; y < multiplicacion[x].length; y++) {
    
  }
}
    for (int x=0; x < multiplicacion.length; x++) {
  for (int y=0; y < multiplicacion[x].length; y++) {
    for (int z=0; z<col_m1; z++) {
      multiplicacion [x][y] += m1[x][z]*m2[z][y]; 
    }
  }
}
    }
    
}
