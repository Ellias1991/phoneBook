import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
public class phoneBook {
    public static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    private void add(String name, Integer phoneNum) {


        ArrayList<Integer> phoneNums = phoneBook.getOrDefault(name, new ArrayList<>());
        phoneNums.add(phoneNum);
        phoneBook.put(name, phoneNums);
    }

    public ArrayList<Integer> find(String name) {

        return phoneBook.getOrDefault(name, new ArrayList<>());

    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {

        return phoneBook;

    }
}
class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {


    }
    public static void heapify(int[] sortArray, int length, int i){
        int left = 2*i+1;
        int right = 2*i+2;
        int largest = i;
        if (left<length && sortArray[left]>sortArray[largest]){
            largest = left;
        }
        if(right<length && sortArray[right]>sortArray[largest]){
            largest = right;
        }
        if(largest != i){
            int tmp = sortArray[i];
            sortArray[i] = sortArray[largest];
            sortArray[largest] = tmp;
            heapify(sortArray, length, largest);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {

        if (sortLength == 0){
            return;
        }
        int length = sortLength;
        for (int i = length/2-1; i>=0; i--){
            heapify(sortArray,length,i);
        }
        for (int i = length - 1; i>=0; i--){
            int tmp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = tmp;
            heapify(sortArray,i,0);
        }
    }

}



