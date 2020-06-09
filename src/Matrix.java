

public class Matrix {
    //поля класса
    int n, m;
    int massive[][] = new int[n][m];

    //перегруженный конструктор
    Matrix(int n, int m, int massive[][]) {
        this.n = n;
        this.m = m;
        this.massive[n][m] = massive[n][m];
    }

    //конструктор по-умолчанию
    Matrix() {
        this.n = 2;
        this.m = 2;
    }

    //сложение
    void summa(Matrix matrixA, Matrix matrixB, Matrix matrixResult, int i, int j) {
        matrixResult.n = Math.max(matrixA.n, matrixB.n);
        matrixResult.m = Math.max(matrixA.m, matrixB.m);
        matrixResult.massive = new int[matrixResult.n][matrixResult.m];
        for (i = 0; i < matrixResult.n; i++)
            for (j = 0; j < matrixResult.m; j++) {
                matrixResult.massive[i][j] = matrixA.massive[i][j] + matrixB.massive[i][j];
            }
    }

    //вычитание
    void minus(Matrix matrixA, Matrix matrixB, Matrix matrixResult, int i, int j) {
        matrixResult.n = Math.max(matrixA.n, matrixB.n);
        matrixResult.m = Math.max(matrixA.m, matrixB.m);
        matrixResult.massive = new int[matrixResult.n][matrixResult.m];
        for (i = 0; i < matrixResult.n; i++)
            for (j = 0; j < matrixResult.m; j++) {
                matrixResult.massive[i][j] = matrixA.massive[i][j] - matrixB.massive[i][j];
            }
    }

    //вывод матрицы
    void printMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.n; i++) {
            for (int j = 0; j < matrix.m; j++) {
                System.out.print(" " + matrix.massive[i][j] + " ");
            }
            System.out.println();
        }
    }

    //инверсия матрицы
    void invers(Matrix matrixA, Matrix matrixResult, int i, int j) {
        for (i = 0; i < n; i++)
            for (j = 0; j < m; j++) {
                matrixResult.massive[i][j] = matrixA.massive[j][i];
            }
    }

    //вывод единичной матрицы
    void onceMatrix(Matrix matrixResult, int i, int j) {
        for (i = 0; i < n; i++)
            for (j = 0; j < m; j++) {
                if (i == j)
                    matrixResult.massive[i][j] = 1;
                else matrixResult.massive[i][j] = 0;
            }
    }

    //вывод геттеров
    void printGetter(Matrix matrixResult) {
        System.out.println("Количество строк в матрице A:" + matrixResult.n);
        System.out.println("Количество столбцов в матрице A:" + matrixResult.m);
    }

    //умножение на матрицу
    void multiplicationByMatrix(Matrix matrixA, Matrix matrixB, Matrix matrixResult, int i, int j, int k) {
        matrixResult.n = matrixA.n;
        matrixResult.m = matrixB.m;
        for (i = 0; i < matrixResult.n; i++)
            for (j = 0; j < matrixResult.m; j++)
                for (k = 0; k < matrixResult.n; k++) {
                    matrixResult.massive[i][j] += matrixA.massive[i][k] * matrixB.massive[k][j];
                }
    }

    //умножение на число
    void multiplicationByNumber(Matrix matrixA, Matrix matrixResolt, int i, int j, int k) {
        for (i = 0; i < matrixResolt.n; i++)
            for (j = 0; j < matrixResolt.m; j++)
                matrixResolt.massive[i][j] = matrixA.massive[i][j] * k;
    }

    //обнуление матрицы
    void zero(Matrix matrix, int i, int j) {
        for (i = 0; i < matrix.n; i++)
            for (j = 0; j < matrix.m; j++)
                matrix.massive[i][j] = 0;
    }

    //квадрат матрицы
    void square(Matrix matrixA, Matrix matrixResult, int i, int j, int k) {
        matrixResult.n = matrixA.n;
        matrixResult.m = matrixA.m;
        for (i = 0; i < matrixResult.n; i++)
            for (j = 0; j < matrixResult.m; j++)
                for (k = 0; k < matrixResult.n; k++)
                    matrixResult.massive[i][j] += matrixA.massive[i][k] * matrixA.massive[k][j];
    }

    //куб матрицы
    void cube(Matrix matrixA, Matrix matrixSquare, Matrix matrixResult, int i, int j, int k) {
        matrixA.multiplicationByMatrix(matrixA, matrixA, matrixResult, 0, 0, 0);
        matrixSquare = matrixResult;
        matrixResult.multiplicationByMatrix(matrixA, matrixSquare, matrixResult, 0, 0, 0);
    }
}