package Patterns;

// Iterative
public class RightTriangle {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }
    }
}

// Recursive
class RightTriangleRecursive {
    // print stars in single row
    public static void printStars(int stars) {
        if (stars == 0) return;
        System.out.print("# ");
        printStars(stars - 1);
    }
    // print rows
    public static void printTriangle(int currentRow, int totalRows) {
        if (currentRow > totalRows) return;
        printStars(currentRow);
        System.out.println();
        printTriangle(currentRow + 1, totalRows);
    }
    public static void main(String[] args) {
        int rows = 5;
        printTriangle(1, rows);
    }
}

// Strings
class RightTriangleString {
    public static void main(String[] args) {
        int n = 5;
        String row = "@ ";

        for (int i = 1; i <= n; i++) {
            System.out.println(row);
            row += "@ ";
        }
    }
}





























