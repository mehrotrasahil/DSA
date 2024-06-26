/* 
1282. Group the People Given the Group Size They Belong To
There are n people that are split into some unknown number of groups. Each person is labeled with a unique ID from 0 to n - 1.

You are given an integer array groupSizes, where groupSizes[i] is the size of the group that person i is in. For example, if groupSizes[1] = 3, then person 1 must be in a group of size 3.

Return a list of groups such that each person i is in a group of size groupSizes[i].

Each person should appear in exactly one group, and every person must be in a group. If there are multiple answers, return any of them. It is guaranteed that there will be at least one valid solution for the given input.

 

Example 1:

Input: groupSizes = [3,3,3,3,3,1,3]
Output: [[5],[0,1,2],[3,4,6]]
Explanation: 
The first group is [5]. The size is 1, and groupSizes[5] = 1.
The second group is [0,1,2]. The size is 3, and groupSizes[0] = groupSizes[1] = groupSizes[2] = 3.
The third group is [3,4,6]. The size is 3, and groupSizes[3] = groupSizes[4] = groupSizes[6] = 3.
Other possible solutions are [[2,1,6],[5],[0,4,3]] and [[5],[0,6,2],[4,3,1]]. */

package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
 The Java program groups individuals based on specified group sizes stored in the groupSizes array. It initializes a HashMap to map group sizes to lists of person IDs and iterates through each person, adding them to their respective groups. If a group reaches its specified size, it is added to the result list. For example, with groupSizes = [3, 3, 3, 3, 3, 1, 3], persons 0, 1, and 2 are grouped together, as are persons 3, 4, and 6, and person 5 forms a group by themselves. This dynamic grouping ensures every person is in a group of the correct size, adhering to the input specifications. The final output, [[0, 1, 2], [3, 4, 6], [5]], reflects the groups formed based on the input groupSizes, demonstrating effective management and allocation of individuals into appropriate groups.
 */
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
       List<List<Integer>> result = new ArrayList<>();
    
    // HashMap to map group sizes to lists of person IDs
    Map<Integer, List<Integer>> sizeToGroup = new HashMap<>();
    
    // Iterate through each person's group size
    for (int i = 0; i < groupSizes.length; i++) {
        int size = groupSizes[i]; // Get the required group size for person i
        
        // Check if sizeToGroup already contains a list for this group size
        if (!sizeToGroup.containsKey(size)) {
            // If not, create a new list for this group size
            sizeToGroup.put(size, new ArrayList<>());
        }
        
        // Get the list of person IDs for this group size
        List<Integer> group = sizeToGroup.get(size);
        
        // Add the current person's ID to the group list
        group.add(i);
        
        // Check if the group is now complete (size equals the required size)
        if (group.size() == size) {
            // Add the complete group to the result list
            result.add(new ArrayList<>(group));
            
            // Clear the group list to prepare for the next group of the same size
            group.clear();
        }
    }
    
    // Return the list of groups formed
    return result;
    }
}


public class GroupSize {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] groupSizes = {3, 3, 3, 3, 3, 1, 3};
        List<List<Integer>> groups = solution.groupThePeople(groupSizes);
        System.out.println(groups); // Output: [[0, 1, 2], [3, 4, 6], [5]]
    }
}
