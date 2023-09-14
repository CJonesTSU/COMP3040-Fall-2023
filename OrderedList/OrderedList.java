package OrderedList;

public class OrderedList {
    private int[] arr;  // will hold our data
    private int numElem; // contains the number of elements currently in the list

    public OrderedList(int max) {
        arr = new int[max];
        numElem = 0;
    } // constructor

    public int getSize(){
        return numElem;
    } // getSize()

    /*
     * This method preforms a binary search of the list
     * This is a non-recursive version, this can also 
     * be done recursively
     */
    public int find(int searchKey){
        int lowerBound = 0;
        int upperBound = numElem - 1;
        int curIndex;

        while(true){
            curIndex = (lowerBound + upperBound) / 2; // find center element
            if(arr[curIndex] == searchKey){
                return curIndex; // found it, return index
            } else if(lowerBound > upperBound) { // went all the way through the list, didn't find it
                return -1;
            }else { // haven't found it yet, pick a half of the list to continue searching
                if(arr[curIndex] < searchKey){ // key is to right of current index (i.e. higher value)
                    lowerBound = curIndex + 1; // exclude the left half from next attempt
                } else { // key must be to the left of curIndex
                    upperBound = curIndex - 1; // exclude the right half from next attempt
                }
            }
        } // while(true)
    } // find

    public void insert(int value){
        int i;
        for(i = 0; i < numElem; i++){
            if(arr[i] > value){
                System.out.println(i);
                break; // i now contains the location one to the right of the insertion point (or numElem)
            }
        } // for loop to find where we need to insert
        for(int j = numElem; j > i; i--) {// move larger items up (if any)
            arr[j] = arr[j -1];
        } // move items up
        arr[i] = value; // insert the value
        numElem++;
    } // inswert

    public boolean delete(int value){
        int index = find(value);
        if(index == -1) { // didn't find the value, can't delete
            return false;
        }  else { // found the element
            for(int i = index; i< numElem; i++){ // move elements down
                arr[i] = arr[i + 1];
            }
            numElem--;
            return true; // found and deleted the value
        } // else
    } // end delete()

    @Override
    public String toString(){
        String result = "";
        System.out.println("numElem: " + numElem);
        for(int i = 0; i < numElem; i++){
            result = result + i + " ";
        }
        return result;
    } // toString()
}
