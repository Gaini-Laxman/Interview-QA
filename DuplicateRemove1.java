class DuplicateRemove1 {

    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 1, 2, 4, 5 };
        int temp[] = new int[a.length];
        int tempSize = 0; // To keep track of the size of the unique elements

        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < tempSize; j++) {
                if (a[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[tempSize] = a[i];
                tempSize++;
            }
        }

        for (int i = 0; i < tempSize; i++) {
            System.out.print(temp[i] + " ");
        }
//==================================================================================================================




    }
}
//===============================================================================================================