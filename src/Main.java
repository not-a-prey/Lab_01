//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public void forExecution(){
        /* Введіть значення матриць A та B, значення вводяться лише в межах від -128 до 127,
        *  інакше програма не буде навіть запускатись
        */
        byte[][] A = {
                {3, -4, 3, 19},
                {5, 6, 2, 20},
                {9, -10, 1, 10},
                {9, 9, 9, 90}
        };
        byte[][] B = {
                {2, 1, 2, 3},
                {-9, 7, 5, 7},
                {9, -1, 0, 15},
                {3, 5, 6, 30}
        };

        System.out.println("Матриця A: ");
        printMatrix(A);
        System.out.println("Матриця B: ");
        printMatrix(B);

        MatrixAction matrixXor = new MatrixAction(A, B);
        byte[][] C = matrixXor.xorFunc();

        if (C != null) {
            System.out.println("Матриця C (A xor B): ");
            printMatrix(C);

            SumOfMaxInColumns columnMaxElementSum = new SumOfMaxInColumns();
            int sum = columnMaxElementSum.columnSum(C);

            if (sum != 9999) {
                System.out.println("Сума найбільших елементів кожного стовпця матриці C: " + sum);
            }
        }
    }

    public void printMatrix(byte[][] matrix){
        for (byte[] row : matrix) {
            for (byte b : row) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int variant = 2213;
        int c5 = variant % 5;
        int c7 = variant % 7;
        int c11 = variant % 11;

        System.out.println("Номер варіанту: " + variant);
        System.out.println("C5: 2213 mod 5 = " + c5 + " - C = A виключне але B");
        System.out.println("C7: 2213 mod 7 = " + c7 + " - типи елементів матриці - byte");
        System.out.println("C11: 2213 mod 11 = " + c11 + " - дія з матрицею C - знайти суму найбільших елементів кожного стовпця\n");

        Main result = new Main();
        result.forExecution();
    }
}