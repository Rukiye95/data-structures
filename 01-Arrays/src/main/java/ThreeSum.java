import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
        int[] array1=new int[]{12, 3, 1, 2, -6, 5, -8, 6};
        System.out.println("Printing solution with two pointers...");
        threeNumberSum1(array1,6).forEach(System.out::println);
        System.out.println("Printing solution with HashMap......");
        threeNumberSum2(array1,6).forEach(System.out::println);

    }
    // O(n^2) time | O(n) space
    // this is a two pointer solution, for every i,
    // running two pointer solution as in the two sum problem
    public static List<List<Integer>>  threeNumberSum1(int[] array, int targetSum){
        // Overall complexity nlogn+ n x n = n^2
        Arrays.sort(array);// nlog n
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < array.length - 2; i++) {  // n times
            //Reset left and right pointer
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) { //n times
                int currentSum = array[i] + array[left] + array[right];
                if (currentSum == targetSum) {

                    triplets.add(Arrays.asList(array[i], array[left], array[right]));
                    left++;
                    right--;
                } else if (currentSum < targetSum) {
                    left++;
                } else if (currentSum > targetSum) {
                    right--;
                }
            }
        }
        return triplets;
    }


    // HashMap solution for 3Sum problem.
    // overall complexity is: nlogn + n + O(n^2) = O(n^2)
    public static List<List<Integer>> threeNumberSum2(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet();
        HashMap<Integer, Integer> map = new HashMap(); // Space
        Arrays.sort(nums);  // O(nlogn)

        // Put all numbers in a HashMap to create a look up table
        for(int i = 0 ; i < nums.length;i++){
            map.put(nums[i], i);   //O(n)
        }
        // In a nested loop try to find a match for each pair
        //  from hash map that adds up to target value
        for(int i = 0 ; i < nums.length-1; i++){   // O(n^2)
            for(int j = i+1; j< nums.length; j++){
                List<Integer> triplet = new ArrayList();
                int potentialMatch = target - nums[i] - nums[j];
                if(map.containsKey(potentialMatch) && map.get(potentialMatch)>j){
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(potentialMatch);
                    result.add(triplet);//set to prevent duplicates
                }
            }
        }
        return new ArrayList(result);
    }
}
