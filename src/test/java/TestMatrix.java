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
        showRunTimeSimpleArrayMultiplication();
        System.out.println("----------------------------");
        showRunTimeArraylistMultiplication();
    }

    public static void showRunTimeSimpleArrayMultiplication() {
        long startTime = System.currentTimeMillis();
        Matrix firstMatrix = ArraylistMatrixFactory.getRandomFilledMatrix(4, 4);
        Matrix secondMatrix = ArraylistMatrixFactory.getRandomFilledMatrix(4, 4);
        System.out.println(firstMatrix.toString());
        System.out.println(secondMatrix.toString());

        System.out.println("<Result of Multiplication:>");
        System.out.println(MatrixCalc.multiplication(firstMatrix, secondMatrix).toString());

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }

    public static void showRunTimeArraylistMultiplication() {
        long startTime = System.currentTimeMillis();
        Matrix firstMatrix = SimpleArrayMatrixFactory.getRandomFilledMatrix(4, 4);
        Matrix secondMatrix = SimpleArrayMatrixFactory.getRandomFilledMatrix(4, 4);
        System.out.println(firstMatrix.toString());
        System.out.println(secondMatrix.toString());

        System.out.println("<Result of Multiplication:>");
        System.out.println(MatrixCalc.multiplication(firstMatrix, secondMatrix).toString());

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }

}
