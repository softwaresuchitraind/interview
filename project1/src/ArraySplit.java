public class ArraySplit {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int subArraySize = 3;
        int totalSubArrays = (arr.length + subArraySize - 1) / subArraySize;

        int[][] result = new int[totalSubArrays][];
        int index = 0;

        for (int i = 0; i < totalSubArrays; i++) {
            int remainingElements = arr.length - index;
            int currentSubArraySize = remainingElements >= subArraySize ? subArraySize : remainingElements;
            result[i] = new int[currentSubArraySize];

            for (int j = 0; j < currentSubArraySize; j++) {
                result[i][j] = arr[index++];
            }
        }

        // Print the result
        for (int i = 0; i < result.length; i++) {
            System.out.print("[");
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
                if (j < result[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
        }
    }
}
