
/**************** LINEAR SEARCH ******************/
// public class Array {
// public static int linearSearch(String menu[], String key){
// for(int i=0;i<menu.length;i++)
// if(menu[i] == key){
// return i;
// }
// return -1;
// }

// public static void main(String[] args){
//

// String menu[]={"dosa","idli","fried rice"
// ,"manchurian","sandwich","pizza","menduvada"};
// String key="coke";

// int index = linearSearch(menu, key);
// if(index == -1){
// System.out.println("saamaan nhi h");
// }else{
// System.out.println("found at index" + index);
// }
// }
// }

public class Array {

    /******************* LARGEST NUMBER ********************/
    // public static int getLargest(int numbers[]){
    // int largest=Integer.MIN_VALUE;
    // int smallest=Integer.MAX_VALUE;
    // for(int i=0; i<numbers.length; i++){
    // if(largest<numbers[i]){
    // largest=numbers[i];
    // }
    // if(smallest>numbers[i]){
    // smallest=numbers[i];
    // }
    // }
    // System.out.println("largest num is -> "+ smallest);
    // return largest;
    // }

    /******************* BINARY SEARCH ********************/
    // public static int binarySearch(int numbers[],int key){
    // int start=0 , end=numbers.length-1;
    // while(start <= end){
    // int mid = (start + end)/2;
    // if(numbers[mid]==key){
    // return mid;
    // }
    // if(numbers[mid]<=key){
    // start=mid+1;
    // }
    // if(numbers[mid]>=key){
    // end=mid-1;
    // }
    // }
    // return -1;
    // }
    // public static void main(String[] args) {
    // int numbers[]={1,4,7,13,19,23,29,35,40};
    // int key=19;
    // System.out.println("number found at -> "+ binarySearch(numbers,key));
    // }

    /******************* REVERSE ********************/
    // public static void reverse(int num[]) {
    //     int first = 0, last = num.length - 1;
    //     while (first < last) {
    //         int temp = num[last];
    //         num[last] = num[first];
    //         num[first] = temp;
    //         first++;
    //         last--;
    //     }

    // }

    // public static void main(String[] args) {
    //     int num[] = { 2, 3, 5, 6, 7, 9, 13 };

    //     reverse(num);
    //     for (int i = 0; i < num.length; i++) {
    //         System.out.print(num[i] + " ");
    //     }
    //     System.out.println();
    // }

    /*********************** SUBARRAY ****************************/

    public static void Subarray(int num[]){
         for(int i=0; i<num.length;i++){
            int start = i;
            for(int j=0; i<num.length;j++){
                int endd = j;
                for(int k=start; k<=endd; k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
                
         }
    }
    public static void main(String[] args) {
        int num[] = { 2, 3, 4, 5, 6,7};
        Subarray(num);
    }

}


