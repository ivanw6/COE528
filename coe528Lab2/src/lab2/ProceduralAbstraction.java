package lab2;

/**
 *
 * @author ivan wang 501086429
 */
public class ProceduralAbstraction {

    //Requires: x is a postive int
    //Modifies: None
    //Effects: Returns the smallest positive integer n for which n!
    // (i.e. 1*2*3*...*n) is greater than or equal to x, for positive
    // integer x. Otherwise returns 1.
    public static int reverseFactorial(int x) {
        int n = 1;
        if (x > 0) {
            while (n < x) {
                x /= n;
                n++;
            }
            return n;
        } else {
            return 1;
        }
    }

    //Requires: arr is a 2D array of int
    //Modifies: None
    //Effects: If the matrix arr satisfies Nice property, prints the sum and
    // returns true. Otherwise returns false
    public static boolean isMatrixNice(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[0][i];
        }
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < arr.length; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            if (rowSum != sum || colSum != sum) {
                //System.out.println("False");
                return false;
            }
            int diag1 = 0;
            int diag2 = 0;
            for (int k = 0; k < arr.length; k++) {
                diag1 += arr[k][k];
                diag2 += arr[k][arr.length - k - 1];
            }
            if (diag1 != sum || diag2 != sum) {
                //System.out.println("False");
                return false;
            }
        }
        System.out.println("The sum of each row, column, and diagonal is: " + sum);
        return true;
    }

    public static void main(String args[]) {
        System.out.println("reverseFactorial Test Run"); //formatting    
        //Testing reverseFactorial method
        int factorialTest1 = reverseFactorial(24);
        int factorialTest2 = reverseFactorial(119);
        int factorialTest3 = reverseFactorial(0);
        System.out.println(factorialTest1);
        System.out.println(factorialTest2);
        System.out.println(factorialTest3);

        System.out.println(""); //formatting

        System.out.println("isMatrixNice Test Run"); //formatting
        //Testing isMatrixNice method
        int[][] arrayTest1 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int[][] arrayTest2 = {{-3, 1, 0}, {4, -3, 4}, {7, -9, 0}};
        isMatrixNice(arrayTest1);
        isMatrixNice(arrayTest2);
    }
}
