import java.util.Arrays;
import java.util.Random;

/*
 * Alihan Durmus
 * 20120205028
 * This program generates a minesweeper board
 */

public class Minesweeper {

    boolean[][] mineField; // board with mines marked as true
    int rows; // number of rows of the board
    int cols; // number of columns of the board
    int numMines;

    public Minesweeper(int rows, int cols, int numMines) {

        this.rows = rows;
        this.cols = cols;
        this.numMines = numMines;
        mineField = new boolean[rows][cols];

        generateBoard();
    }

    /*
     * Class Constructor
     *
     * @param int rows Number of rows of the board
     *
     * @param int cols Number of columns of the board
     *
     * @param int numMines Number of mines to be placed on the board
     *
     */


    /*
     * Generates the mineField
     *
     * @param int numMines Number of mines to be placed on the mineField
     *
     * @return boolean[][] Game board with mines placed at random position
     */


    public void generateBoard() {

        Random r = new Random();

        int row = 0;
        int col = 0;

        for(int i = 0;i<rows;i++) {
            System.out.println();
            for (int j = 0; j < cols; j++) {
                mineField[i][j] = false;
                System.out.print(mineField[i][j]+" ");
            }
        }

        for(int i = 1;i!=numMines+1;i++) {

            row = r.nextInt(rows);
            col = r.nextInt(cols);

            if(mineField[row][col]!=true)
                mineField[row][col] = true;
            else
                i--;

        }
        for(int i = 0;i<rows;i++) {
            System.out.println();
            for (int j = 0; j < cols; j++) {

                System.out.print(mineField[i][j]+" ");
            }
        }




    }

    /*
     * Creates the game
     *
     * @return int[][] The board with cell values computed
     */
    public int[][] generateClues() {
        int[][] clues = new int[rows][cols];

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                clues[i][j] = countMines(i,j);

            }
        }
        return clues;
    }

    /*
     * counts the number of adjacent mines to a given cell position
     *
     * @param int r row position
     *
     * @param int c column position
     *
     * @return int number of mines in the surrounding cells
     */
    public int countMines(int r, int c) {
        int count = 0;
        if(mineField[r][c])
            return -1;
        else {
            for (int i = 0;i<rows ;i++)
            {
                for(int j = 0;j<cols;j++)
                {
                    if((i==r+1||i==r-1||i==r)&&(j==c+1||j==c-1||i==c)) {
                        if (mineField[i][j])
                            count++;


                    }

                }

            }

        }

        return count;
    }

    /*
     * prints the game mine is represented by *
     *
     * @param int[][] game The game board
     */
    public static void printClues(int[][] clues) {

    }



    public static void main(String[] args) {
        Minesweeper m = new Minesweeper(3, 3, 2);
        int[ ][ ] clues = m.generateClues();
        for(int i = 0;i<m.rows;i++){
            System.out.println();
            for(int j = 0;j<m.cols;j++)
                System.out.print(clues[i][j]);
        }



    }

}