package Arrays;
/* *
 * Find the element in the pascal triangle 
 * Pascal Triangle - 
 *              1
 *           1     1
 *        1     2     1
 *     1     3     3    1
 *  1     4     6     4    1
 * 
 * Given -
 *      Number of rows 
 *      Number of column
 * 
 * Ex - R = 5, c = 3
 * output should be  = 6
 * 
 * 
 * Solution -
 *              1. Print the entire pascal triangle and get the value
 *              2. Factorial formula - NcR -> N! / R! * (N - R)!
 * 
 */

class Solution{
    public static int findElement(int n, int r){
        int result = 1;
        for(int i = 0; i < r; i++){
            result = result * (n - i);
            result = result / (i + 1);
        }

        System.out.println(result);
        return result;
    }
}

public class PascalTriFindElement{

    public static void main(String[] args){
        int row = 5;
        int col = 4;
        int result = Solution.findElement(row-1, col-1);

        System.out.println("Element of at " + row + " and column " + col +" is " + result);

    }

}