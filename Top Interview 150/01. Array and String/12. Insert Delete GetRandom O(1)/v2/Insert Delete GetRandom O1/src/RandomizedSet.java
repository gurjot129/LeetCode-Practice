import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class RandomizedSet {

    //creates and initializes variables
    private ArrayList<Integer> items;
    private HashMap<Integer, Integer> hashItems;
    private Random random;

    public RandomizedSet() {

        items = new ArrayList<>();
        hashItems = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {

        if(hashItems.containsValue(val)) {
            return false;
        }

        items.add(val);
        hashItems.put(items.size(), val);

        return true;
    }

    public boolean remove(int val) {

        if(!hashItems.containsValue(val)) {
            return false;
        }

        int idx = items.indexOf(val);
        items.remove(idx);

        for(Map.Entry<Integer, Integer> e : hashItems.entrySet()) {
            if(e.getValue().equals(val)) {
                hashItems.remove(e.getKey());
                break;
            }
        }

        return true;
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