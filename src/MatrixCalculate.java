public class MatrixCalculate {

    public static void main(String[] args) {
        Matrix matrixA = new Matrix();
        matrixA.n = 3;
        matrixA.m = 3;
        matrixA.massive = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Matrix matrixB = new Matrix();
        matrixB.n = 3;
        matrixB.m = 3;
        matrixB.massive = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Матрица А:");
        matrixA.printMatrix();
        System.out.println();

        System.out.println("Матрица B:");
        matrixB.printMatrix();
        System.out.println();

        System.out.println("Сумма матриц А и В:");
        matrixA.summa(matrixB).printMatrix();
        System.out.println();

        matrixA.minus(matrixB).printMatrix();
        System.out.println();

        System.out.println("Инвертированная матрица А:");
        matrixA.invers().printMatrix();
        System.out.println();

        System.out.println("Единичная матрица:");
        Matrix.onceMatrix(5).printMatrix();
        System.out.println();

        matrixA.printGetter();
        System.out.println();

        System.out.println("Произведение матриц А на матрицу В:");
        matrixA.multiplicationByMatrix(matrixB).printMatrix();
        System.out.println();

        System.out.println("Произведение матрицы А на 5:");
        matrixA.multiplicationByNumber(5).printMatrix();
        System.out.println();

        System.out.println("Квадрат матрицы А:");
        matrixA.square().printMatrix();
        System.out.println();

        System.out.println("Куб матрицы А:");
        matrixA.cube().printMatrix();
        System.out.println();
    }
}