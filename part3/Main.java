package com.primisen.java_november.part3;

import com.primisen.java_november.part3.matrix.logic.MatrixLogic;
import com.primisen.java_november.part3.matrix.testing.MatrixTesting;
import com.primisen.java_november.part3.matrix.view.MatrixPrint;

public class Main {
    public static void main(String[] args) {

        int row = 4;
        int column = 3;

        double[][] matrixTest = new double[row][column];

        matrixTest = MatrixLogic.initialize(matrixTest, 64);
//        double[][] matrixTest =
//                        {{1, 19, 2},
//                        {9, 99, 6},
//                        {5, 6, 8}};

        MatrixPrint.printMatrix(matrixTest);

        MatrixPrint.printMaxValue(matrixTest);
        MatrixPrint.printMinValue(matrixTest);

        MatrixPrint.printArithmeticMean(matrixTest);

        if (MatrixTesting.checkAllPositiveElement(matrixTest)) {
            MatrixPrint.printGeometricMean(matrixTest);
        }

        if (MatrixTesting.checkRectangular(matrixTest)) {
            MatrixPrint.printPositionOfFirstLocalMin(matrixTest);
        }
        if (MatrixTesting.checkRectangular(matrixTest)){
            MatrixPrint.printPositionOfFirstLocalMax(matrixTest);
        }

        if (MatrixTesting.checkRectangular(matrixTest)) {
            MatrixPrint.printTransposedMatrix(matrixTest);
        }
    }
}
