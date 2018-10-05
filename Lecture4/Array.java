package Lecture4;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row, col;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Rows :");
		row = in.nextInt();
		System.out.println("Enter Columns : ");
		col = in.nextInt();
		int[][] arr = takeinp(row, col);
		display(arr);
		spiral(arr);
	}

	public static int[][] takeinp(int row, int col) {
		Scanner in = new Scanner(System.in);
		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			System.out.println("Enter values for row  " + (i + 1));
			for (int j = 0; j < col; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		return arr;
	}
	public static void display(int[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void spiral(int[][] arr) {
		int top = 0, bottom = arr.length - 1;
		int right = arr[0].length-1,left = 0;
		int dir = 1;
		while (top <= bottom && left <= right) {
			if (dir == 5) {
				dir = 1;
			}
			if (dir == 1) {
				for (int i = left; i <= right; i++) {
					System.out.print(arr[top][i] + " , ");
				}
				top++;
			}
			else if (dir == 2) {
				for (int i = top; i <= bottom; i++) {
					System.out.print(arr[i][right] + " , ");
				}
				right--;
			}
			else if (dir == 3) {
				for (int i = right; i >= left; i--) {
					System.out.print(arr[bottom][i] + " , ");
				}
				bottom--;
			}
			else if (dir == 4) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(arr[i][left] + " , ");
				}
				left++;
			}
			dir++;
		}
		System.out.println(" END");
	}
}
