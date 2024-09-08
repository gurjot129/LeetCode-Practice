#include <iostream>
#include "MergeSortedArray.h"
using namespace std;

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