public class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        //car's gas tank
        int gasTank = 0;

        //totals all the gas and cost elements to quickly check if the car is able to travel around the circuit
        for(int i = 0; i < gas.length; ++i) gasTank += gas[i] - cost[i];

        //if car's gas tank falls below zero, there is no solution that allows it to travel around the circuit
        if(gasTank < 0) return -1;

        int startGasStn = 0;
        gasTank = 0;

        //this calculates which gas station allows the car to travel around the circuit
        for(int i = 0; i < gas.length; ++i) {

            gasTank += gas[i] - cost[i];

            //if gas tank is below zero, the next gas station may have a better start and allow the car to travel around the circuit
            if(gasTank < 0) {
                gasTank = 0;
                startGasStn = i + 1;
            }
        }

        return startGasStn;
    }
}