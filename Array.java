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

public class Array{
    public static void main(String[] args) {
        int arr[]={23,8,9,1,0,-2,12,45,25,7};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i<arr.length;i++){
            if(arr[i]>max){
                 max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("The max and min are: "+max+","+min);
    }
}