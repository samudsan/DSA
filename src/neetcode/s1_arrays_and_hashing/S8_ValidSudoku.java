package neetcode.s1_arrays_and_hashing;

import java.util.HashSet;

public class S8_ValidSudoku {
    public static void main(String[] args) {

        String[][] strs = {
                {"5", "3", ".", ".", "7", ".", ".", ".", "."},
                {"6", ".", ".", "1", "9", "5", ".", ".", "."},
                {".", "9", "8", ".", ".", ".", ".", "6", "."},
                {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
                {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
                {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
                {".", "6", ".", ".", ".", ".", "2", "8", "."},
                {".", ".", ".", "4", "1", "9", ".", ".", "5"},
                {".", ".", ".", ".", "8", ".", ".", "7", "9"}
        };
        System.out.println(isValidSudoku(strs));
    }

    public static boolean isValidSudoku(String strs[][]){
        HashSet<String> rowSet = null;
        HashSet<String> colSet = null;
        String rowStr = "";
        String colStr = "";

        for (int i = 0; i < 9; i++) {
            rowSet = new HashSet<>();
            colSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                rowStr = strs[i][j];
                colStr = strs[j][i];

                if (!rowStr.equals(".")){
                    if( rowSet.contains(rowStr)) {
                        System.out.println("Row String"+rowStr +" "+ rowSet);
                        System.out.println("failed in row "+i +" "+j);
                        return false;
                    }
                    else rowSet.add(rowStr);
                }

                if (!colStr.equals(".")){
                    if( colSet.contains(colStr)) {
                        System.out.println("failed in column "+i +" "+j);
                        return false;
                    }
                    else colSet.add(colStr);
                }
            }
//            System.out.println(i+" Row Set :" + rowSet);
//            System.out.println(i+"Column Set: " + colSet);
        }
        //loop controls advance by 3 each time to jump through the boxes
        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                //checkBlock will return true if valid
                if (!isValidBlock(i, j, strs)) {
                    return false;
                }
            }
        }
        // passed all the tests
        return true;
    }
    public static boolean isValidBlock(int idxI, int idxJ, String[][] board) {
        HashSet<String> blockSet = new HashSet<>();
        //if idxI = 3 and indJ = 0
        //rows = 6 and cols = 3
        int rows = idxI + 3;
        int cols = idxJ + 3;
        //and because i initializes to idxI but only goes to rows, we loop 3 times (once for each row)
        for (int i = idxI; i < rows; i++) {
            //same for columns
            for (int j = idxJ; j < cols; j++) {
                if (!board[i][j].equals(".")) {
                    if (blockSet.contains(board[i][j])) {
                        System.out.println("element" + board[i][j] + " " + blockSet);
                        System.out.println("failed in block " + i + " " + j);
                        return false;
                    }
                    blockSet.add(board[i][j]);
                }
            }
        }
        return true;
    }
}
