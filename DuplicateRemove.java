class DuplicateRemove {
    static void removeDups(int[] arr, int n) {
        int newSize = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < newSize; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }

        for (int i = 0; i < newSize; i++) {
            int minIndex = i;

            for (int j = i + 1; j < newSize; j++) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 30, 20, 50, 5, 10, 5, 50, 60 };

        int n = arr.length;
        removeDups(arr, n);
    }
}
