package com.primisen.java_november.part3.matrix.logic;

import java.util.Random;

public class MatrixLogic {

    public static double[][] initialize(double [][] matrix, int limit){

        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = random.nextInt(limit);
            }
        }

        return matrix;
    }

    public static double getMaxValue(double[][] matrix) {
        double max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public static double getMinValue(double[][] matrix) {
        double min = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public static double getArithmeticMean(double[][] matrix) {

        double sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        return sum / getNumberOfElements(matrix); //метод getNumberOfElements() применяется на случай зубчатой матрицы
    }

    public static double getGeometricMean(double[][] matrix) {

        double multiplication = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                multiplication *= matrix[i][j];
            }
        }

        return Math.pow(multiplication, 1.0 / getNumberOfElements(matrix)); //метод getNumberOfElements() применяется на случай зубчатой матрицы
    }

    public static int[] getPositionOfFirstLocalMin(double[][] matrix) {

        int positionRow = -1;
        int positionColumn = -1;

        int i = 1;
        //отсчет от единицы и до (длина - 1) сделан для того, чтобы исключить границы
        while (positionRow == -1 && i < matrix.length - 1) {

            for (int j = 1; j < matrix[i].length; j++) {

                if(j < matrix[i].length - 1) {
                    if (matrix[i][j] < matrix[i][j + 1] && matrix[i][j] < matrix[i][j - 1]) {
                        if (matrix[i][j] < matrix[i + 1][j] && matrix[i][j] < matrix[i][j - 1]) {

                            positionRow = i;
                            positionColumn = j;
                        }
                    }
                }
            }

            i++;
        }

        return new int[]{positionRow, positionColumn};
    }

    public static int[] getPositionOfFirstLocalMax(double[][] matrix) {

        int positionRow = -1;
        int positionColumn = -1;

        int i = 1;

        while (positionRow == -1 && i < matrix.length - 1) {

            for (int j = 1; j < matrix[i].length; j++) {

                if(j < matrix[i].length - 1) {
                    if (matrix[i][j] > matrix[i][j + 1] && matrix[i][j] > matrix[i][j - 1]) {
                        if (matrix[i][j] > matrix[i + 1][j] && matrix[i][j] > matrix[i][j - 1]) {

                            positionRow = i;
                            positionColumn = j;
                        }
                    }
                }
            }

            i++;
        }

        return new int[]{positionRow, positionColumn};
    }

    public static double[][] transpose(double[][] matrix) {

        double[][] newMatrix = new double[matrix[0].length][matrix.length]; //если матрица не зубчатая

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                newMatrix[j][i] = matrix[i][j];
            }
        }

        return newMatrix;
    }

    private static int getNumberOfElements(double[][] matrix) {

        int numberOfElements = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                numberOfElements++;
            }
        }

        return numberOfElements;
    }
}
