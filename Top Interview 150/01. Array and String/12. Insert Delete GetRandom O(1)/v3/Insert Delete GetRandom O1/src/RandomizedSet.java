import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

class RandomizedSet {

    /*
     * Overall, HashMap helps with finding values (during insert and remove operations),
     * ArrayList helps with the random operation
     */

    //creates and initializes variables
    private ArrayList<Integer> items;
    private HashMap<Integer, Integer> hashItems;
    private Random random;

    //constructor, initializes the RandomizedSet object
    public RandomizedSet() {

        items = new ArrayList<>();
        hashItems = new HashMap<>();
        random = new Random();
    }

    //inserts an item val into the set if not present. Returns true if the item was not present, false otherwise
    public boolean insert(int val) {

        if(hashItems.containsKey(val)) {
            return false;
        }

        hashItems.put(val, items.size());
        items.add(val);

        return true;
    }

    //removes an item val from the set if present. Returns true if the item was present, false otherwise
    public boolean remove(int val) {

        if(!hashItems.containsKey(val)) {
            return false;
        }

        int valIdx = hashItems.get(val);
        int lastVal = items.getLast();

        items.set(valIdx, lastVal);
        items.removeLast();

        hashItems.replace(lastVal, valIdx);
        hashItems.remove(val);

        return true;
    }

    //removes an item val from the set if present. Returns true if the item was present, false otherwise
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