import java.util.ArrayList;
import java.util.Random;

class RandomizedSet {

    //creates and initializes variables
    private ArrayList<Integer> items;
    private Random random;

    public RandomizedSet() {
        items = new ArrayList<Integer>();
        random = new Random();
    }

    public boolean insert(int val) {

        if(items.contains(val)) {
            return false;
        } else {
            items.add(val);
            return true;
        }
    }

    public boolean remove(int val) {

        int valIdx = items.indexOf(val);

        if(valIdx != -1) {
            items.remove(valIdx);
            return true;
        } else {
            return false;
        }
    }

    public int getRandom() {
        return items.get(random.nextInt(items.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */