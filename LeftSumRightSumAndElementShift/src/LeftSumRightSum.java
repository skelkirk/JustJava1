public class LeftSumRightSum {


    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 1, 2, 1};
        int[] array1 = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        System.out.println(checkBalance(array));
        System.out.println(checkBalance(array1));
    }

    public static boolean checkBalance(int[] array) {
        int endIndex = array.length - 1;
        int leftSum = array[0];
        int rightSum = array[endIndex];

        for(int i = 0; i < array.length; --endIndex) {
            if (i + 1 == endIndex - 1) {
                leftSum += array[i + 1];
                break;
            }

            if (i + 1 == endIndex) {
                break;
            }

            leftSum += array[i + 1];
            rightSum += array[endIndex - 1];
            ++i;
        }

        return leftSum == rightSum;
    }
}