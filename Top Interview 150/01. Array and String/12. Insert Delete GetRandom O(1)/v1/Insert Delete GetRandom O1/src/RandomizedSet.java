import java.util.ArrayList;

class RandomizedSet {

    private ArrayList<Integer> items;

    public RandomizedSet() {
        items = new ArrayList<Integer>();
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
        return items.get((int) (Math.random() * (items.size() - 1)));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */