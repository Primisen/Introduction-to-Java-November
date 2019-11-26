package com.primisen.java_november.part3.matrix.testing;

public class MatrixTesting {

    public static boolean checkRectangular(double[][] matrix) {

        boolean rectangular = true;

        for (int i = 0; i < matrix.length - 1; i++) {

            if (matrix[i].length > matrix[i + 1].length || matrix[i].length < matrix[i + 1].length) {
                rectangular = false;
            }
        }

        return rectangular;
    }

    public static boolean checkAllPositiveElement(double[][] matrix){

        boolean allPositiveElement = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if(matrix[i][j] < 0){
                    allPositiveElement = false;
                }
            }
        }

        return allPositiveElement;
    }
}
