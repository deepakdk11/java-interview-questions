package Patterns;

public class NumberPatterns {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int count = 1;
        boxNumber(row, col, count);
        System.out.println("..............");
        triangle1(row, col, count);
        System.out.println("..............");
        triangle2(row, col, count);
        System.out.println("..............");
        triangle3(row, col, count);
    }

    public static void boxNumber(int row, int col, int count) {
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void triangle1(int row, int col, int count) {
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(i < j) System.out.print(" ");
                else System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    public static void triangle2(int row, int col, int count) {
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(i > j) System.out.print(" ");
                else System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    public static void triangle3(int row, int col, int count)  {
        for (int i = 1; i <= row ; i++){
            for(int j = 1; j <= col; j++) {
                if (i == 3) System.out.print(count);
                else if (i == 2 && j == 2) System.out.print(count);
                else System.out.print(" ");
                count++;
            }
            System.out.println();
        }
    }
}
