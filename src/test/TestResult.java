package test;

import domain.Exercise;
import domain.ExerciseDodatok;
import java.util.Arrays;
/**
 * Клас для взаємодії програма-користовувач, програма-програміст
 * @author Vlad
 */
public class TestResult {
/**
 * Тут можна задати величину масиву в строкі final int length = ***;
 * Виводить результат
 * @param args аргументи 
 */
    public static void main(String[] args) {
        final int length = 15;
        final ExerciseDodatok numberArray = new Exercise(length);
        final int[] array = numberArray.symmetricArray();
        System.out.println(Arrays.toString(array));
    }
}
