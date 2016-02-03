package modul5_task2;

public class SortBubbleArray {
    public void sortBubbleArray(){
        int array[] = new int[]{-2, 16, 45, -41, 3, 21};
        boolean arrayStatus = true;
        while(arrayStatus){
            arrayStatus = false;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    int arrayNumber = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = arrayNumber;
                    arrayStatus = true;
                }
            }
        }
        for(int s : array){
            System.out.println(s);
        }
    }
}
