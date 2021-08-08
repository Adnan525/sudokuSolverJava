public class SolveBoard {
    public static boolean solveTheBoard()
    {
        for(int i = 0; i<=8; i++)
        {
            for(int j =0; j<=8; j++)
            {
                if(Board.grid[i][j] == 0)
                {
                    for(int pos = 1; pos<=9; pos++)
                    {
                        if(Solver.checkifPossible(i, j, pos))
                        {
                            Board.grid[i][j] = pos;
                            if(solveTheBoard())
                                return true;
                            Board.grid[i][j] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return checkDone();
    }

    public static boolean checkDone()
    {
        for(int[] row : Board.grid)
        {
            for(int cell: row)
                if(cell == 0)
                    return false;
        }
        return true;
    }

}
