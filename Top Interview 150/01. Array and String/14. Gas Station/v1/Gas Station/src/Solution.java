public class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        //this code implementation iterates through each valid gas station
        for(int i = 0; i < gas.length - 1; ++i) {

            //car starts from empty tank
            int gasTank = 0;

            //starts at the ith gas station, calculates and checks if the car is able to travel around the circuit
            for(int j = 0; j < gas.length - 1; ++j) {
                gasTank += gas[(i + j) % (gas.length)];
                gasTank -= cost[(i + j) % (gas.length)];

                //if the car is out of gas, start again but at the next gas station
                if(gasTank <= 0) break;
            }

            //if the car is able to travel around the circuit, return starting ith gas station
            if(gasTank >= 0) return i;
        }

        //if no starting gas station is able to travel around the circuit, return -1
        return -1;
    }

}
