// import java.util.Arrays;

// public class Array {
//     public static void main(String[] args) {
//         int arr[] = { 8, -3, 4, 8, 2, 8, 4, 9 };

//         System.out.println("Before replacing with zero");

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + ",");

//         }
//         // System.out.println();
//         // for (int num : arr) {

//         // System.out.print(num + "_");
//         // }

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     arr[j] = 0;
//                 }
//             }
//         }
//         System.out.println("After replacing with 0");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + ",");

//         }
//     }
// }

//2 

// public class Array{
//     public static void main(String[] args) {
//         int arr[]={23,8,9,1,0,-2,12,45,25,7};

//         int min = arr[0];
//         int max = arr[0];

//         for (int i = 1; i<arr.length;i++){
//             if(arr[i]>max){
//                  max = arr[i];
//             }
//             if(arr[i]<min){
//                 min = arr[i];
//             }
//         }

//         System.out.println("The max and min are: "+max+","+min);
//     }
// }

//3

// public class Array {

//     public static void main(String[] args) {
//         int arr[] = { 2, 7, 2, 9, 8, 4, 12, 3, 7, 8, 5 };

//         int countEven = 0;
//         int countOdd = 0;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] % 2 == 0) {
//                 countEven++;

//             } else {
//                 countOdd++;
//             }
//         }

//         int even[] = new int[countEven];
//         int odd[] = new int[countOdd];

//         int eIndex = 0;
//         int oIndex = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] % 2 == 0) {
//                 even[eIndex++] = arr[i];
//             } else {
//                 odd[oIndex++] = arr[i];
//             }
//         }

//         System.out.print("Even array is ");
//         for (int i = 0; i < even.length; i++) {
//             System.out.print(even[i] + ",");
//         }
//         System.out.println();
//         System.out.print("Even array is ");
//         for (int i = 0; i < odd.length; i++) {
//             System.out.print(odd[i] + ",");
//         }
//     }
// }

//sort in ascending order

public class Array {

    public static void main(String[] args) {
        int[] arr = { 9, 0, 3, 2, -1, 8 };

        printArray(arr);

        for(int i=0;i<arr.length;i++){
            for(int j= i +1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("\n After ascending ");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
  













// }

// public class Array {
//     public static void main(String[] args) {
//         int[] arr = {9, -5, 7, 9, -5, 5, 7};

//         System.out.println("Original array:");
//         printArray(arr);

//         // Sorting logic (Bubble Sort)
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] > arr[j]) {
//                     // swap arr[i] and arr[j]
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }

//         System.out.println("\nArray after sorting in ascending order:");
//         printArray(arr);
//     }

//     // Helper method to print array
//     public static void printArray(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }
