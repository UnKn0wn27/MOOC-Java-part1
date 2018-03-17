import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};

        sort(values);
    }
    
    public static int smallest(int[] array){
        int nr = array[0];
        
        for(int i : array){
            if(nr > i)
                nr = i;
        }
        return nr;
    }
    
    public static int indexOfTheSmallest(int[] array){
        int smallnr = smallest(array);
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == smallnr){
                index = i;
                break;
            }
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int[] new_array = new int[array.length - index];
        int j = 0;
        
        for(int i = index; i < array.length; i++){
            new_array[j++] = array[i];
        } 
        
        int smallnr = smallest(new_array);
        int nrindex = indexOfTheSmallest(new_array) + index;
        
        return nrindex;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int nr1 = array[index1];
        int nr2 = array[index2];
        
        array[index1] = nr2;
        array[index2] = nr1;
    }
    
    public static void sort(int[] array) {
        int j = 0;
        
        for(int i = 0; i < array.length; i++){
            int k = indexOfTheSmallestStartingFrom(array, j);
            swap(array, k, j);
            System.out.println(Arrays.toString(array));
            j++;
        }
    }
}
