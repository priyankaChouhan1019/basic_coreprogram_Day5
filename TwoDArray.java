import java.util.Scanner; 
class TwoDArray {
  public static void main(String args[]) {
    // initialize 
    int row, col, i, j;
    int arr[][] = new int[10][10];
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter row for the array ");
    row = sc.nextInt();
    System.out.print("Enter column for the array ");
    col = sc.nextInt();

    System.out.println("Enter " + (row * col) + " Array Elements : ");
    for (i = 0; i < row; i++) {
      for (j = 0; j < col; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.print("The Array is :\n");
    for (i = 0; i < row; i++) {
      for (j = 0; j < col; j++) {
        System.out.print(arr[i][j] + "  ");
      }
      System.out.println();
    }
  }
}