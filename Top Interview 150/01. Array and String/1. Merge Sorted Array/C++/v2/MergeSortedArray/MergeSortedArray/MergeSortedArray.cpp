#include <iostream>
#include "MergeSortedArray.h"
using namespace std;

void Solution::merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
	
	// Ensures the following constraints are met:
	// * nums1.length == m + n
	// * nums2.length == n
	// * nums2.empty == false
	if (nums1.size() == (m + n) && !nums2.empty() && nums2.size() == n) {
	
		//keeps track of the current element you're comparing
		int i = nums1.size() - 1;

		//Starts with the last index
		int nums1Idx = nums1.size() - 1;
		int nums2Idx = nums2.size() - 1;

		//Evaluates the element values from each array, and decides which element is going to be stored in nums1 array
		while (i >= 0 && nums1Idx >= 0) {
		
			//Evaluates the elements from the nums1 and nums2 array
			if (nums2Idx >= 0 && nums1[i] < nums2[nums2Idx]) {
				
				nums1[i] = nums2[nums2Idx];

				--nums2Idx;
				--i;
			}

			//Evaluates the elements from the nums1 array
			else if (nums1Idx >= 0 && nums1[i] > nums1[nums1Idx])  {
				
				int tempNum = nums1[i];

				nums1[i] = nums1[nums1Idx];
				nums1[nums1Idx] = tempNum;

				--nums1Idx;
				--i;
			}
			else if (i == nums1Idx) {
				--nums1Idx;
				--i;
			}
			else {
				--nums1Idx;
			}

		}

	}


	cout << "\n" << "merge() function reached the end!" << "\n\n";
}







/*
void Solution::merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {

	vector<int> nums1tmp;
	nums1tmp.assign(nums1.size(), 0);

	// Ensures the following constraints are met:
	// * nums1.length == m + n
	// * nums2.length == n
	// * nums2.empty == false
	if (nums1.size() == (m + n) && !nums2.empty() && nums2.size() == n) {

		// Copies the elements from nums1 array to the temp array
		for (int i = 0; i < nums1.size(); ++i) {
			nums1tmp[i] = nums1[i];
		}

		int i = 0;
		int nums1Cmp_Idx = 0;
		int nums2Cmp_Idx = 0;

		while(i < nums1.size()) {

			if (nums1tmp[nums1Cmp_Idx] <= nums2[nums2Cmp_Idx] && nums1tmp[nums1Cmp_Idx] != 0) {

				nums1[i] = nums1tmp[nums1Cmp_Idx];
				++nums1Cmp_Idx;
				++i;
			}
			else {
				nums1[i] = nums2[nums2Cmp_Idx];
				++nums2Cmp_Idx;
				++i;
			}
		}


	}
	cout << "\n" << "merge() function reached the end!" << "\n\n";
}


*/