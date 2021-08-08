import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solver {
    public static Map<int[], int[]> check = new HashMap<>();

    public static void populate()
    {
        check.put(new int[] {0,0}, new int[] {1,1,1,2,2,1,2,2});
        check.put(new int[] {0,1}, new int[] {1,0,1,2,2,0,2,2});
        check.put(new int[] {0,2}, new int[] {1,0,1,1,2,0,2,1});

        check.put(new int[] {1,0}, new int[] {0,1,0,2,2,1,2,2});
        check.put(new int[] {1,1}, new int[] {0,0,0,2,2,0,2,2});
        check.put(new int[] {1,2}, new int[] {0,0,0,1,2,0,2,1});

        check.put(new int[] {2,0}, new int[] {0,0,0,1,1,0,1,1});
        check.put(new int[] {2,1}, new int[] {0,0,0,2,1,0,1,2});
        check.put(new int[] {2,2}, new int[] {0,0,0,1,1,0,1,1});
    }
    public static boolean checkRow(int row, int n)
    {
        int[] curRow = Board.grid[row];
        for (int value : curRow)
        {
            if(value == n)
                return false;
        }
        return true;
    }

    public static boolean checkColumn(int column, int n)
    {
        for(int[] row: Board.grid)
        {
            if(row[column] == n)
                return false;
        }
        return true;
    }
    public static boolean checkSquare(int row, int column, int n )
    {
        int rowDivide = row/3;
        int rowRemainder = row%3;
        int startRow = rowDivide*rowRemainder;

        int columnDivide = column/3;
        int columnRemainder = column%3;
        int startColumn = columnDivide*columnRemainder;

        ArrayList<Integer> temp = new ArrayList();

        for(int i = startRow; i<=startRow+3; i++)
        {
            for(int j = startColumn; j<=startColumn+3; j++)
            {
                temp.add(Board.grid[i][j]);
            }
        }

        if(temp.contains(n))
            return false;
        return true;
    }
}
