package ru.romankrasinskij.leetcodepractice.algorithms.string;

import java.util.ArrayList;
import java.util.List;

public class ScoreOfAString_3110 {

    private static String s = "hello";
    private static int charCount = s.length();

    public static void main(String[] args) {
        System.out.println("String: " + s + "\nScore of a string: " + getScoreOfAString(s));
    }

    private static List<Integer> getCharCodeList() {
        List<Integer> charCodeList = new ArrayList<>(charCount);

        for (int i = 0; i < charCount; i++) {
            int charCode = s.charAt(i);
            charCodeList.add(charCode);
        }

        return charCodeList;
    }

    private static List<Integer> getDifferenceExpressionList() {
        List<Integer> differenceExpressionList = new ArrayList<>();

        for (int i = 0, j = 0; i < (charCount - 1); i++) {
            int differenceExpression = (int) Math.abs((getCharCodeList().get(j) - getCharCodeList().get(++j)));
            differenceExpressionList.add(differenceExpression);
        }

        return differenceExpressionList;
    }

    private static int getScoreOfAString(String s) {
        int sum = getDifferenceExpressionList().stream().mapToInt(Integer::intValue).sum();
        return sum;
    }
}
