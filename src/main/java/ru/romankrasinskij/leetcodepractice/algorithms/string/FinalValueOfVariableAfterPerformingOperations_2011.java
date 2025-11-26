package ru.romankrasinskij.leetcodepractice.algorithms.string;

public class FinalValueOfVariableAfterPerformingOperations_2011 {

    private static int X = 0;
    private static String[] operations = new String[]{"++X", "++X", "X++"};

    public static void main(String[] args) {
        System.out.println("Final value of X: " + getFinalValueOfX());
    }

    private static int getFinalValueOfX() {
        for (int i = 0, j = 1; i < operations.length; i++, j++) {
            if (operations[i].equals("X++")) {
                X++;
            } else if (operations[i].equals("++X")) {
                X++;
            } else if (operations[i].equals("X--")) {
                X--;
            } else if (operations[i].equals("--X")) {
                X--;
            } else {
                throw new ArithmeticException("Incorrect operation!");
            }

            System.out.println("Operation " + j + ": " + operations[i]);
        }

        return X;
    }
}
