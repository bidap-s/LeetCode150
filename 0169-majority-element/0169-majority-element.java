import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
       int j=1;
       int maxCount=0;
       int result=nums[0];
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        //map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            //System.out.println(map);
            int count = map.getOrDefault(nums[i], 0) + 1;
                map.put(nums[i], count);
                 
            if(count>maxCount){
                maxCount=count;
                result=nums[i];
            }
        }
        return result ;
       }
        
    }
