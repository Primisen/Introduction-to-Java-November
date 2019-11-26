package com.primisen.java_november.part3.matrix.view;

import com.primisen.java_november.part3.matrix.logic.MatrixLogic;

import java.util.Arrays;

public class MatrixPrint {

    public static void printMaxValue(double matrix[][]) {
        System.out.println("Max element: " + MatrixLogic.getMaxValue(matrix));
    }

    public static void printMinValue(double matrix[][]) {
        System.out.println("Min element: " + MatrixLogic.getMinValue(matrix));
    }

    public static void printArithmeticMean(double matrix[][]) {
        System.out.println("Arithmetic mean: " + MatrixLogic.getArithmeticMean(matrix));
    }

    public static void printGeometricMean(double matrix[][]) {
        System.out.println("Geometric mean: " + MatrixLogic.getGeometricMean(matrix));
    }

    public static void printPositionOfFirstLocalMin(double[][] matrix) {

        int positionRow = MatrixLogic.getPositionOfFirstLocalMin(matrix)[0];
        int positionColumn = MatrixLogic.getPositionOfFirstLocalMin(matrix)[1];

        if (positionRow > -1) {
            System.out.println("Position of first local min: i = " + positionColumn +
                    ", j = " + positionRow);
        } else {
            System.out.println("Matrix haven't local min.");
        }
    }

    public static void printPositionOfFirstLocalMax(double[][] matrix) {

        int positionRow = MatrixLogic.getPositionOfFirstLocalMax(matrix)[0];
        int positionColumn = MatrixLogic.getPositionOfFirstLocalMax(matrix)[1];

        if (positionRow > -1) {
            System.out.println("Position of first local max: i = " + positionColumn +
                    ", j = " + positionRow);
        } else {
            System.out.println("Matrix haven't local max.");
        }
    }

    public static void printTransposedMatrix(double[][] matrix) {
        System.out.println("Transposed matrix: ");

        matrix = MatrixLogic.transpose(matrix);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void printMatrix(double[][] matrix){

        System.out.println("Your matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
