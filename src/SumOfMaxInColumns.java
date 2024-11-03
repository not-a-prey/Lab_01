public class SumOfMaxInColumns {
    public int columnSum(byte[][] matrix) {
        try {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                throw new IllegalArgumentException("Матриця не може бути пустою");
            }

            int cols = matrix[0].length;
            int sum = 0;

            for (int i = 0; i < cols; i++) {
                byte max = matrix[0][i];
                for (int j = 0; j < matrix.length; j++) {
                    if (matrix[j][i] > max) {
                        max = matrix[j][i];
                    }
                }
                System.out.println("Максимальне значення у стовпці[" + i + "]: " + max);
                sum += max;
            }
            return sum;
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 9999;
        }
        catch (Exception e) {
            System.out.println("Несподівана помилка:" + e.getMessage());
            return 9999;
        }
    }
}
