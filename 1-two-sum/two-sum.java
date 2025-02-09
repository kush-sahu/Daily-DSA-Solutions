class Solution {
    public int[] twoSum(int[] nums, int target) {
       // Approch 

       // target=num1+num2    <=ye pta hai na? - ha
    // ok so we will find  num1=target-num2   

    //eg  nums = [2,7,11,15], target = 9

         // <ye samjha  -ha
                   // so step 1 we put every element in hashset -ok -- aage niche code dekho na
 
     // initialization of length of arrayt  
     HashMap<Integer,Integer>hm=new HashMap<>();
      
    for(int i=0;i<nums.length;i++){
          //     num1=9-num[0]
                 //   =9-2
                   // =7  
        int a=target-nums[i];
        if(hm.containsKey(a)){
           return new int[]{hm.get(a),i};
            
        }
        hm.put(nums[i],i);
    }
    return new int[]{};
   

            //      <= ye samjha na ?   set me nums array k pure elemet dale
            // samjha kya ? -ha


        // jo return type hai wo 2 length ka array rehega  kya?   ha but-  Q  given hai  - ha index ki value n sum of two arr[i] ki  samjha kya ? 

    }
}