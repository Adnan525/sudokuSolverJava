public class SolveBoard {
    public static void solveTheBoard()
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
                            solveTheBoard();
                        }
                    }
                }
            }
        }
    }

}
