public class MatrixAction {
    private byte[][] matrixA;
    private byte[][] matrixB;

    public MatrixAction(byte[][] matrixA, byte[][] matrixB) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
    }

    public byte[][] xorFunc() {
        try {
            if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
                throw new IllegalArgumentException("Для виконання операції XOR матриці повинні бути одного розміру.");
            }

            int rows = matrixA.length;
            int cols = matrixA[0].length;
            byte[][] matrixC = new byte[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrixC[i][j] = (byte) (matrixA[i][j] ^ matrixB[i][j]);
                }
            }
            return matrixC;
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
        catch (Exception e) {
            System.out.println("Несподівана помилка:" + e.getMessage());
            return null;
        }
    }
}
