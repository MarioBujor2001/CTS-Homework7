package Strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortingManager manager = new SortingManager();
        int[] array = {5, 2, 9, 1, 3};
        manager.setSortStrategy(new BubbleSortStrategy());
        manager.sortArray(array);

        System.out.println("Sorted array:" + Arrays.toString(array));

        int[] array2 = {7, 4, 8, 2, 1};
        manager.setSortStrategy(new QuickSortStrategy());
        manager.sortArray(array2);

        System.out.println("Sorted array:" + Arrays.toString(array2));
    }
}
