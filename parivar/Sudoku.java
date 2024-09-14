package parivar;
import java.util.Scanner;

public class Sudoku {
   static int[][] grid = new int[9][9];

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter the sudoku puzzle (0 for empty cells):");
      for (int i = 0; i < 9; i++) {
         for (int j = 0; j < 9; j++) {
            grid[i][j] = input.nextInt();
         }
      }

      if (solveSudoku()) {
         System.out.println("Sudoku solved:");
         printGrid();
      } else {
         System.out.println("No solution exists for the given sudoku puzzle.");
      }
   }

   static boolean solveSudoku() {
      for (int i = 0; i < 9; i++) {
         for (int j = 0; j < 9; j++) {
            if (grid[i][j] == 0) {
               for (int k = 1; k <= 9; k++) {
                  if (isValid(i, j, k)) {
                     grid[i][j] = k;

                     if (solveSudoku()) {
                        return true;
                     } else {
                        grid[i][j] = 0;
                     }
                  }
               }
               return false;
            }
         }
      }
      return true;
   }

   static boolean isValid(int row, int col, int num) {
      for (int i = 0; i < 9; i++) {
         if (grid[row][i] == num || grid[i][col] == num) {
            return false;
         }
      }

      int rowStart = (row / 3) * 3;
      int colStart = (col / 3) * 3;
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            if (grid[rowStart + i][colStart + j] == num) {
               return false;
            }
         }
      }

      return true;
   }

   static void printGrid() {
      for (int i = 0; i < 9; i++) {
         for (int j = 0; j < 9; j++) {
            System.out.print(grid[i][j] + " ");
         }
         System.out.println();
      }
   }
} 