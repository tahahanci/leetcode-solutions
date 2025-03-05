package medium;

public class CountTotalNumberOfColoredCells {

    /*
    There exists an infinitely large two-dimensional grid of uncolored unit cells. You are given a positive integer n, indicating that you must do the following routine for n minutes:

    At the first minute, color any arbitrary unit cell blue.
    Every minute thereafter, color blue every uncolored cell that touches a blue cell.
    Below is a pictorial representation of the state of the grid after minutes 1, 2, and 3.
     */

    public long coloredCells(int n) {
        return ((long) n * n) + ((long) (n - 1) * (n - 1));
    }

    public static void main(String[] args) {
        CountTotalNumberOfColoredCells totalNumberOfColoredCells = new CountTotalNumberOfColoredCells();
        long totalColoredCells = totalNumberOfColoredCells.coloredCells(6);
        System.out.println(totalColoredCells);
    }
}
