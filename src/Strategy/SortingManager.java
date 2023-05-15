package Strategy;

public class SortingManager {
    private SortingStrategy strategy;

    public void setSortStrategy(SortingStrategy strategy){
        this.strategy = strategy;
    }

    public void sortArray(int[] array){
        strategy.sort(array);
    }
}
