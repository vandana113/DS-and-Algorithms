package Backtracking;

import java.util.Scanner;

public class Backtracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void ratInAMaze() {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int maze[][] = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				maze[i][j] = s.nextInt();
			}
		}
		int path[][] = new int[N][N];
		path[0][0] = 1;
		rat(maze, path, 0, 0);

	}

	public static void rat(int maze[][], int path[][], int r, int c) {
		int N = maze.length;
		if (r == N - 1 && c == N - 1) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(path[i][j] + " ");
				}
			}
			System.out.println();
			return;
		}
		if (r < 0 || c < 0 || r > N - 1 || c > N - 1) {
			return;
		}
		if (r + 1 < N && maze[r + 1][c] == 1 && path[r + 1][c] == 0) { // Down move
			path[r + 1][c] = 1;
			rat(maze, path, r + 1, c);
			path[r + 1][c] = 0;
		}
		if (c + 1 < N && maze[r][c + 1] == 1 && path[r][c + 1] == 0) { // Right Move
			path[r][c + 1] = 1;
			rat(maze, path, r, c + 1);
			path[r][c + 1] = 0;
		}
		if (c - 1 >= 0 && maze[r][c - 1] == 1 && path[r][c - 1] == 0) { // Left Move
			path[r][c - 1] = 1;
			rat(maze, path, r, c - 1);
			path[r][c - 1] = 0;
		}
		if (r - 1 >= 0 && maze[r - 1][c] == 1 && path[r - 1][c] == 0) { // Up Move
			path[r - 1][c] = 1;
			rat(maze, path, r - 1, c);
			path[r - 1][c] = 0;
		}
	}
}