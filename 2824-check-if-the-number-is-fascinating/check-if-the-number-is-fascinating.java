class Solution {
    public boolean isFascinating(int n) {


 String str = n+""+(n*2)+""+(n*3);  
 boolean flag = true;
    for( char ch ='1';ch <='9' ;ch++){  
    int count =0;
    for(int i =0;i<str.length();i++){
        char c =str.charAt(i);
        if(c ==ch)  {
            count++;
        }                

    } //wait kyu
    if(count !=1){
        flag =false;
        break;
    }        
    } 
    return flag;
    }
}

// kro ngaye thi