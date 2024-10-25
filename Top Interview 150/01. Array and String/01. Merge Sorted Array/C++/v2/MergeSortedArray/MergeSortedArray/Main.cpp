#include <iostream>
#include "MergeSortedArray.h"
# include <vector>

using namespace std;

int main()
{
	/******************************
	* TEST DATA
	******************************/
	
	//TEST #1
	vector<int> nums1 = { 1,2,3,0,0,0 };
	int m = 3;
	vector<int> nums2 = { 2,5,6 };
	int n = 3;

	//TEST #2
	//vector<int> nums1 = { 1 };
	//int m = 1;
	//vector<int> nums2 = { };
	//int n = 0;

	//TEST #3
	//vector<int> nums1 = { 0 };
	//int m = 0;
	//vector<int> nums2 = { 1 };
	//int n = 1;

	/******************************
	* Creates and run solution
	******************************/
	class Solution solution;
	solution.merge(nums1, m, nums2, n);

	cout << "nums1 array result:\n";
	cout << "[ ";

	for (int i = 0; i < nums1.size(); ++i) {
		cout << nums1[i];

		if (i == nums1.size() - 1) {
			cout << " ]";
		}
		else {
			cout << ", ";
		}
	}

	cout << "\n";

}
