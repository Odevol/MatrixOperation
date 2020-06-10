

public class Matrix {
    //поля класса
    int n = 0, m = 0;
    int massive[][];

    //перегруженный конструктор
    Matrix(int massive[][]) {
        this.massive = massive;
        this.n = massive.length;
        this.m = massive[0].length;

    }

    //конструктор по-умолчанию
    Matrix() {
        this.n = 2;
        this.m = 2;
        this.massive = new int[n][m];
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    //сложение
    Matrix summa(Matrix matrixA) {
        Matrix matrixResult = new Matrix(new int[this.getN()][this.getM()]);
        for (int i = 0; i < matrixResult.n; i++){
            for (int j = 0; j < matrixResult.m; j++) {
                matrixResult.massive[i][j] = this.massive[i][j] + matrixA.massive[i][j];
            }
        }
        return matrixResult;
    }

    //вычитание
    Matrix minus(Matrix matrixA) {
        Matrix matrixResult = new Matrix(new int[this.getN()][this.getM()]);
        for (int i = 0; i < matrixResult.n; i++){
            for (int j = 0; j < matrixResult.m; j++) {
                matrixResult.massive[i][j] = this.massive[i][j] - matrixA.massive[i][j];
            }
        }
        return matrixResult;
    }

    //вывод матрицы
    void printMatrix() {
        for (int i = 0; i < this.getN(); i++) {
            for (int j = 0; j < this.getM(); j++) {
                System.out.print(" " + this.massive[i][j] + " ");
            }
            System.out.println();
        }
    }

    //инверсия матрицы
    Matrix invers() {
        Matrix matrixResult = new Matrix(new int[this.getN()][this.getM()]);
        for (int i = 0; i < this.getN(); i++){
            for (int j = 0; j < this.getM(); j++) {
                matrixResult.massive[i][j] = this.massive[j][i];
            }
        }
        return matrixResult;
    }

    //вывод единичной матрицы
    static Matrix onceMatrix(int r) {
        Matrix matrixResult = new Matrix(new int[r][r]);
        for (int i = 0; i < matrixResult.n; i++){
            for (int j = 0; j < matrixResult.m; j++) {
                if (i == j)
                    matrixResult.massive[i][j] = 1;
                else matrixResult.massive[i][j] = 0;
            }
        }
        return matrixResult;
    }

    //вывод геттеров
    void printGetter() {
        System.out.println("Количество строк в матрице A:" + this.n);
        System.out.println("Количество столбцов в матрице A:" + this.m);
    }

    //умножение на матрицу
    Matrix multiplicationByMatrix(Matrix matrixA) {
        Matrix matrixResult = new Matrix(new int[this.n][matrixA.m]);
        for (int i = 0; i < matrixResult.n; i++){
            for (int j = 0; j < matrixResult.m; j++){
                for (int k = 0; k < matrixResult.n; k++) {
                    matrixResult.massive[i][j] += this.massive[i][k] * matrixA.massive[k][j];
                }
            }
        }
        return matrixResult;
    }

    //умножение на число
    Matrix multiplicationByNumber(int k) {
        Matrix matrixResult = new Matrix(new int[this.n][this.m]);
        for (int i = 0; i < matrixResult.n; i++){
            for (int j = 0; j < matrixResult.m; j++){
                matrixResult.massive[i][j] = this.massive[i][j] * k;
            }
        }
            return matrixResult;
    }

    //квадрат матрицы
    Matrix square() {
        Matrix matrixResult = new Matrix(new int [this.getN()][this.getM()]);
        for (int i = 0; i < matrixResult.n; i++){
            for (int j = 0; j < matrixResult.m; j++){
                for (int k = 0; k < matrixResult.n; k++){
                    matrixResult.massive[i][j] += this.massive[i][k] * this.massive[k][j];
                }
            }
        }
        return matrixResult;
    }

    //куб матрицы
    Matrix cube() {
        Matrix matrixFirst = new Matrix(new int[this.n][this.m]);
        matrixFirst.massive = this.massive;
        Matrix matrixSquare = new Matrix(new int[this.n][this.m]);
        matrixSquare = matrixFirst.square();
        Matrix matrixResult = new Matrix(new int[this.n][this.m]);
        matrixResult = matrixSquare.multiplicationByMatrix(matrixFirst);
        return matrixResult;
    }
}