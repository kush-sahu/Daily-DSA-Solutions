class Solution {
// ho kya tum yaha ? ha   kha error aa raha ? run karo n test case pass nhi ho rahe 3rd vali
  public boolean isPalandrome(String s ,int i,int j){
    while(i<j){
            if(s.charAt(i)==s.charAt(j)){
         i++;
         j--;
            
        }
        else
        return false;

  }
  return true;

  }

    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
         i++;
         j--;
            
        }
        else{

            return isPalandrome(s,i+1,j) || isPalandrome(s,i,j-1);
        }
       // return false;
        }
  return true;
        }
        
    
}