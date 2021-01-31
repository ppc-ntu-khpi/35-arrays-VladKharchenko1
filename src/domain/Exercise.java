package domain;
/**
 * Клас для створення симетричного масиву
 * @author Vlad
 */
public final class Exercise implements ExerciseDodatok {
    private final int[] numbers;
/**
 * Присвоєння
 * @param length величина масиву
 */
    public Exercise(final int length) {
        this.numbers = new int[length];}
/**
 * Створення симетричного масиву
 * @return numbers 
 */
    @Override
    public int[] symmetricArray() {
        final int length = this.numbers.length;
        int count = (length % 2 == 0) ? 1 : 0;
        for (int i = length / 2; i < length; i++) {
            this.numbers[i] = this.numbers[length - i - 1] = count++; }
        return this.numbers;}
}
