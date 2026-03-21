package Module9;

public class MazePath {
    static int n = 3;
    static int[][] maze = {
        {1, 1, 0},
        {1, 1, 1},
        {0, 1, 1}
    };

    static void solve(int i, int j, String path) {
        if (i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0) return;

        if (i == n - 1 && j == n - 1) {
            System.out.println(path);
            return;
        }

        maze[i][j] = 0; // mark visited

        solve(i + 1, j, path + "D"); // down
        solve(i, j + 1, path + "R"); // right
        solve(i - 1, j, path + "U"); // up
        solve(i, j - 1, path + "L"); // left

        maze[i][j] = 1; // backtrack
    }

    public static void main(String[] args) {
        solve(0, 0, "");
    }
}