public class SecondLargestNumberInAnArray {
   public static void main(String args[]){
      int temp, total;
      int array[] = {10, 20,30,40,50};
      total = array.length;

      for(int i = 0; i<total ; i++ ){
         for(int j = i+1; j<total ; j++){

            if(array[i]>array[j]){
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
      System.out.println("second largest number is:: "+array[total -4]);
   }
}