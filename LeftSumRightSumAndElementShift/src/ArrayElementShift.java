import java.util.Arrays;

public class ArrayElementShift {


    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int numberOfShifts = 2;
        leftShiftedArray(array, numberOfShifts);
        rightShiftedArray(array1, numberOfShifts);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
    }

    public static void leftShiftedArray(int[] array, int numberOfShifts) {

        int lastIndex = array.length - 1;

        for(int i = 0; i < numberOfShifts; ++i) {
            int memorizedNumber = array[0];

            for(int j = 0; j < array.length - 1; ++j) {
                array[j] = array[j + 1];
            }

            array[lastIndex] = memorizedNumber;
        }

    }

    public static void rightShiftedArray(int[] array, int numberOfShifts) {

        int lastIndex = array.length - 1;

        for(int i = 0; i < numberOfShifts; ++i) {
            int memorizedNumber = array[lastIndex];

            for(int j = lastIndex; j > 0; --j) {
                array[j] = array[j - 1];
            }

            array[0] = memorizedNumber;
        }

    }}