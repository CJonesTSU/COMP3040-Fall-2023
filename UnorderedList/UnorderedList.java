package UnorderedList;

public class UnorderedList {
    private int[] arr;
    private int numElem;

    public UnorderedList(int max){
        arr = new int[max];
        numElem = 0;
    } // constructor

    public boolean find(int searchKey) {
        int i;
        for(i = 0; i < numElem; i++){
            if(arr[i] == searchKey) { // found item?
                break;
            }
        }
        if(i == numElem) { // got to end of list without finding value
            return false;
        } else {
            return true;
        }
    } // find

    public void insert(int value) {
        arr[numElem] = value;
        numElem++;
    } // insert

    public boolean delete(int value) {
        int i;
        for(i = 0; i < numElem; i++) {
            if(arr[i] == value) { // found it
                break; // let's us keep the value of i
            }
        }
        if(i == numElem) { // went through list didn't find
            return false;
        } else { // we found the value
            for(int j = i; j < numElem; j++) {
                arr[j] = arr[j + 1]; // move items toward front of list 
            }
            numElem--; // decrement number of elements
            return true;
        }
    } // delete

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < numElem; i++) {
            result = result + arr[i] + " ";
        }
        return result;
    }// toString()

}
