public class MatrixCalculate {

    public static void main(String[] args) {
        Matrix matrixA = new Matrix();
        matrixA.n = 3;
        matrixA.m = 3;
        matrixA.massive = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Matrix matrixB = new Matrix();
        matrixB.n = 3;
        matrixB.m = 3;
        matrixB.massive = new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};

        Matrix matrixResult = new Matrix();
        Matrix matrixSquare = new Matrix();

        System.out.println("Матрица А:");
        matrixA.printMatrix(matrixA);
        System.out.println();

        System.out.println("Матрица B:");
        matrixB.printMatrix(matrixB);
        System.out.println();

        matrixA.summa(matrixA, matrixB, matrixResult, 0, 0);

        System.out.println("Сумма матриц А и В:");
        matrixResult.printMatrix(matrixResult);
        System.out.println();

        matrixA.minus(matrixA, matrixB, matrixResult, 0, 0);

        System.out.println("Разница матриц А и В:");
        matrixResult.printMatrix(matrixResult);
        System.out.println();

        matrixA.invers(matrixA, matrixResult, 0, 0);

        System.out.println("Инвертированная матрица А:");
        matrixResult.printMatrix(matrixResult);
        System.out.println();

        matrixResult.onceMatrix(matrixResult, 0, 0);

        System.out.println("Единичная матрица:");
        matrixResult.printMatrix(matrixResult);
        System.out.println();

        matrixA.printGetter(matrixA);
        System.out.println();

        matrixA.multiplicationByMatrix(matrixA, matrixB, matrixResult, 0, 0, 0);

        System.out.println("Произведение матриц А на матрицу В:");
        matrixResult.printMatrix(matrixResult);
        System.out.println();

        matrixA.multiplicationByNumber(matrixA, matrixResult, 0, 0, 5);

        System.out.println("Произведение матрицы А на 5:");
        matrixResult.printMatrix(matrixResult);
        System.out.println();
        matrixResult.zero(matrixResult, 0, 0);

        matrixA.square(matrixA, matrixResult, 0, 0, 0);

        System.out.println("Квадрат матрицы А:");
        matrixResult.printMatrix(matrixResult);
        System.out.println();
        matrixResult.zero(matrixResult, 0, 0);

        matrixA.cube(matrixA, matrixSquare, matrixResult, 0, 0, 0);

        System.out.println("Куб матрицы А:");
        matrixResult.printMatrix(matrixResult);
        System.out.println();
    }
}