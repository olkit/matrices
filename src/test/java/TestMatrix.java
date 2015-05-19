import com.epam.olki.*;

/**
 * This test class model of Matrix.
 *
 * @author olki
 * @version 1.0.0
 */
public class TestMatrix {

    public static void main(String[] args) {
        //MatrixStore mtxStore = MatrixStore.getSingletonInstance();
        Matrix matrixA = ArraylistMatrixFactory.getRandomFilledMatrix(2, 3);
        Matrix matrixB = ArraylistMatrixFactory.getRandomFilledMatrix(3, 1);
        showRunTimeMultiplication(matrixA, matrixB);
        System.out.println("----------------------------");
        Matrix matrixC = SimpleArrayMatrixFactory.getRandomFilledMatrix(2, 3);
        Matrix matrixD = SimpleArrayMatrixFactory.getRandomFilledMatrix(3, 1);
        showRunTimeMultiplication(matrixC, matrixD);
    }

    public static void showRunTimeMultiplication(Matrix firstMatrix, Matrix secondMatrix) {
        long startTime = System.currentTimeMillis();
        System.out.println(firstMatrix.toString());
        System.out.println(secondMatrix.toString());

        System.out.println("<Result of Multiplication:>");
        System.out.println(MatrixCalc.multiplication(firstMatrix, secondMatrix).toString());

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }

}
