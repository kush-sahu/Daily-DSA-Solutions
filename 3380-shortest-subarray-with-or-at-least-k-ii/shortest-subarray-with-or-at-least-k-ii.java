class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int minLen=Integer.MAX_VALUE;
        int n=nums.length;

        Map<Integer, int[]> map=new HashMap();
      

        int[] bit32=new int[32];
        map.put(0, bit32);

        for(int i=1; i<n+1; i++){
            map.put(i, bitFuncAdd(nums[i-1], map.get(i-1)));
        }
       

        int num=0, cnt=0;
        int m=n+1;
        int i=0, j=1;
        //Used sliding window
        while(i<j && i<m && j<m){
            num=bitToDec( bitFuncMinus(map.get(i), map.get(j)) );
            if(  num >= k ){
                cnt=j-i;
                minLen=Math.min(minLen, cnt);     
                i++;                
            }
            else{
                j++;
            }            
        }
        return minLen==Integer.MAX_VALUE?-1:minLen;
    }



    int[] bitFuncAdd(int num, int[] bit32){
        int m=31;
        int[] arr=new int[32];
        for(int i=0; i<32; i++){
            arr[i]=bit32[i];
        }
        String bitStr=Integer.toBinaryString(num);        
        for(int i=bitStr.length()-1; i>=0; i--){
            arr[m] = bit32[m] + (bitStr.charAt(i)-'0');
            m--;
        }
        return arr;
    }


    int[] bitFuncMinus(int[] bitI, int[] bitJ){
        int[] arr=new int[32];        
        for(int i=31; i>=0; i--){
            arr[i] = bitJ[i] - bitI[i];
        }           
        return arr;
    }


    int bitToDec(int[] bit32){
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<32; i++){
            sb.append( (bit32[i]>0)?1:0 );
        }
        return Integer.parseInt(sb.toString(), 2);
    }

}