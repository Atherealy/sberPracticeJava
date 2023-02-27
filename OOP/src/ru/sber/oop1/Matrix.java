package ru.sber.oop1;
public class Matrix {
    private double[][] matrix;
    public int rowCount;
    public int columnCount;

    public Matrix(int rowCount, int columnCount) throws IllegalArgumentException {
        if (rowCount < 0) {
            throw new IllegalArgumentException(String.format("Недопустимое количество строк: %d", rowCount));
        }

        if (columnCount < 0) {
            throw new IllegalArgumentException(String.format("Недопустимое количество столбцов: %d", columnCount));
        }

        this.matrix = new double[rowCount][columnCount];
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }
    public Matrix setValue(int row, int column, double value){
        if(row >= rowCount || row < 0){
            return this;
        }
        if(column >= columnCount || column < 0){
            return this;
        }
        matrix[row][column] = value;
        return this;
    }

    public Matrix summ(Matrix secondMatrix){
        int row = Math.min(rowCount, secondMatrix.rowCount);
        int column = Math.min(columnCount, secondMatrix.columnCount);
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                matrix[i][j] += secondMatrix.matrix[i][j];
                }
        }
        return this;
    }

    public Matrix multiplication(double number) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= number;
            }
        }

        return this;
    }

    public Matrix multiplication(Matrix secondMatrix) {
        int row = Math.min(rowCount, secondMatrix.rowCount);
        int column = Math.min(columnCount, secondMatrix.columnCount);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] *= secondMatrix.matrix[i][j];
            }
        }

        return this;
    }

    public Matrix print() {
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print(matrix [i][j]);
                System.out.print(" ");
            }

            System.out.print("\n");
        }
        System.out.print("\n");
        return this;
    }

}
