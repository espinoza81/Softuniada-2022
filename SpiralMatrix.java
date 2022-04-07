import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int rows = Integer.parseInt(console.nextLine());
        int colons = Integer.parseInt(console.nextLine());
        int[][] matrix = new int[rows][colons];
        for (int i=0; i<rows; i++){
            for( int j=0; j<colons; j++){
                matrix[i][j] = console.nextInt();
            }
        }
        int allNumbers = rows*colons;
        int index = 0;
        while (true){
            for (int j=index; j<colons-index; j++){
                System.out.print(matrix[index][j]);
                allNumbers--;
                if(allNumbers==0){
                    return;
                }
                else System.out.print(" ");
            }
            for (int i=index+1; i<rows-1-index; i++){
                System.out.print(matrix[i][colons-1-index]);
                allNumbers--;
                if(allNumbers==0){
                    return;
                }
                else System.out.print(" ");
            }
            for (int j=colons-1-index; j>=index; j--){
                System.out.print(matrix[rows-1-index][j]);
                allNumbers--;
                if(allNumbers==0){
                    return;
                }
                else System.out.print(" ");
            }
            for (int i=rows-2-index; i>=index+1; i--){
                System.out.print(matrix[i][index]);
                allNumbers--;
                if(allNumbers==0){
                    return;
                }
                else System.out.print(" ");
            }
            index++;
        }
    }
}
