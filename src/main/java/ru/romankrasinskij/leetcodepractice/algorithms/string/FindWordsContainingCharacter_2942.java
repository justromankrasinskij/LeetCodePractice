package ru.romankrasinskij.leetcodepractice.algorithms.string;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter_2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indexesOfSuitableWords = new ArrayList<>(50);

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                indexesOfSuitableWords.add(i);
            }
        }

        return indexesOfSuitableWords;
    }
}
