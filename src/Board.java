import java.util.Arrays;
import java.util.StringJoiner;

public class Board {
    public static int[][] grid = {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
    };

    public static String getGrid()
    {
        String temp = "";
        for(int[] row : grid)
        {
            for(int cell: row)
                temp+=Integer.toString(cell)+" ";
            temp+="\n";
        }
        return temp.toString();
    }

    public static void main(String[] args) {
        System.out.println(getGrid());
        System.out.println("=====================test=====================");
        SolveBoard.solveTheBoard();
        System.out.println(getGrid());
//        System.out.println(Solver.checkSquare(0,8,9));
    }

}
