#include <iostream>
#include "MergeSortedArray.h"
# include <vector>

using namespace std;

int main()
{
	/******************************
	* TEST DATA
	******************************/
	vector<int> nums1 = { 1,2,3,0,0,0 };
	int m = 3;

	vector<int> nums2 = { 2,5,6 };
	int n = 3;

	/******************************
	* Creates and run solution
	******************************/
	class Solution solution;
	solution.merge(nums1, m, nums2, n);



}
