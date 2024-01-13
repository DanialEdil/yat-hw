import Module2.MainClass;

public class HWE {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {4, 5, 6, 5},
                {7, 8, 9, 11},
                {10, 11, 2, 0}
        };

        boolean isCenter = false;
        boolean IsDone = false;
        int i = 3, c = 0, k = 0;
        while (!IsDone || k != 0) {
            int sumDiagonal = 0;
            System.out.println("yes");
            System.out.println(i);
            for (int j = i, d = c; d <= k; d++, j++) {
                System.out.println(j + " " + d + " kkk" + k);
                sumDiagonal += arr[j][d];


            }
            if (k < 3 && !isCenter) {
                isCenter = true;
                i--;
                k++;
            } else {
                i = 0;
                c = 1;
                k--;
                if (k == 0) {
                    IsDone = true;
                }
            }

            System.out.println("----");
//            System.out.println(sumDiagonal);
//            System.out.println("----");

        }
    }
}
