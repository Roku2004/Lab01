package Lab01;

import java.util.Arrays;
import java.util.Scanner;

public class conghaimatran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang cua ma tran: ");
        int rows = sc.nextInt();
        System.out.println("Nhap so cot cua ma tran: ");
        int cols = sc.nextInt();
        int[][] a1 = new int[rows][cols];
        int[][] a2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];
        System.out.println("Nhap gia tri ma tran 1: ");
        for(int i = 0;i<rows;i++){
            for(int j = 0 ; j< cols;j++){
                System.out.println("matrix1[" + i + "][" + j + "] = " );
                a1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Nhap gia tri ma tran 2: ");
        for(int i = 0;i<rows;i++){
            for(int j = 0 ; j< cols;j++){
                System.out.println("matrix2[" + i + "][" + j + "] = " );
                a2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Tong cua 2 ma tran la: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a1[i][j] + a2[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("sum[" + i + "]["  + j + "] = " + sum[i][j]);
            }
        }
    }
}
/*ket qua
Nhap so hang cua ma tran:
2
Nhap so cot cua ma tran:
2
Nhap gia tri ma tran 1:
matrix1[0][0] =
1
matrix1[0][1] =
2
matrix1[1][0] =
6
matrix1[1][1] =
3
Nhap gia tri ma tran 2:
matrix2[0][0] =
2
matrix2[0][1] =
3
matrix2[1][0] =
1
matrix2[1][1] =
5
Tong cua 2 ma tran la:
sum[0][0] = 3
sum[0][1] = 5
sum[1][0] = 7
sum[1][1] = 8
 */