class Solution {
    public void nextPermutation(int[] nums) {
        
        int index = -1;
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            Arrays.sort(nums);
        }
        else{
            for(int i = nums.length - 1; i > index; i--){
                if(nums[i] > nums[index]){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break; 

                }
            }

            int l = index + 1;
            int r = nums.length - 1;

            while(l < r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
        }

    }
}