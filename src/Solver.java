public class Solver {
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
//    public static boolean checkSquare(int )
//    {
//
//    }
}
