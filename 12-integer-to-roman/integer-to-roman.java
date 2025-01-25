class Solution {
    public String intToRoman(int num) {
      int arr[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
      String s[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
      String sb="";
       for(int i=0;i<arr.length;i++){
           if(num==0)break;
           if(arr[i]<=num){
            int dev=num/arr[i];
            while(dev>0){
                sb=sb+s[i];
                dev--;
            }
            num=num%arr[i];
            
           }
       }
       return sb;

    }
}