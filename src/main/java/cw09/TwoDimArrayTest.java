package cw09;

/**
 * Created by Evgeniy on 28.10.2016.
 */
public class TwoDimArrayTest {
    public static void main(String[] args) {
        int[][] arr1 = {
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0}
        };

        int[][] arr2 = new int[5][5];
        arr2[0] = new int[]{0, 0, 0, 0, 0};
        arr2[1] = new int[5];
        arr2[2] = new int[5];
        arr2[3] = new int[5];
        arr2[4] = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
