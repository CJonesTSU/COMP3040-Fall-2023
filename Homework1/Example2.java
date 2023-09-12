public class Example2 {
    public static void main(String[] args){
        int[] arrOne = {12, 34, 2, 1, 5, 6, 7, 3, 2, 5, 19, 22, 23, -5, 100, -7, 14, 91};
        int[] arrTwo = {12, 34, 2, 1, 5, 6, 7, 3, 2, 5, 19, 22, 23, -5, 100, -7,  14, 91};
        System.out.print("Before bubble sort array is: ");
        printArray(arrOne);
        System.out.println("Bubble sort calculations: " + bubbleSort(arrOne));
        System.out.print("After bubble sort array is: ");
        printArray(arrOne);
        System.out.print("Before insertion sort array is: ");
        printArray(arrTwo);
        System.out.println("Insertion sort calculations: " + insertionSort(arrTwo));
        System.out.print("After insertion sort array is: ");
        printArray(arrTwo);
    }

    public static int bubbleSort(int[] arr){
        int calculations = 0;
        for(int outer = arr.length -1; outer > 1; outer--){
            for(int inner = 0; inner < outer; inner++){
                calculations++;
                if(arr[inner] > arr[inner+1]){
                    arr = swap(arr,inner);
                }
            }
        }
        return calculations;
    }

    public static int insertionSort(int[] arr){
        int calculations = 0;
        int in, out;
        for(out = 1; out < arr.length; out++)
        {
            int temp = arr[out];
            in = out;
            while(in>0 && arr[in-1] >= temp)
            {
                calculations++;
                arr[in] = arr[in - 1];
                in--;
            }
            arr[in] = temp;
        }
        return calculations;
    }

    public static int[] swap(int[] arr, int i){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
        return arr;
    }

    public static void printArray(int[] arr){
        System.out.print("{");
        for(int i = 0; i < arr.length; i++){
            if(i < arr.length -1){
                System.out.print(arr[i] + ", ");
            }else{
                System.out.print(arr[i]);
            }
        }
        System.out.println("}");
    }
}
