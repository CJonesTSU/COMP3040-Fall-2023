package HeapSort;

public class HeapSort {

    public static void main(String[] args)
    {
        int[] numArr = {2,4,1,99,32,14,76,3,17,21,27};
        Heap theHeap = new Heap(31); // make a Heap; max size 31
        for(int i = 0; i < numArr.length; i++){
            theHeap.insert(numArr[i]);
        }
        int[] sortedNums = new int[numArr.length];
        for(int i = 0; i < numArr.length; i++){
            sortedNums[i] =  theHeap.remove().getKey();
        }
        System.out.println("Original order");
        printArray(numArr);
        System.out.println("Sorted");
        printArray(sortedNums);
    } // end main()
    private static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
} // end class HeapApp  
