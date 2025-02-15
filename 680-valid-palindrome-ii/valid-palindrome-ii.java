class Solution {
    public boolean isPalandrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;

            } 
            i++;
            j--;
                

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

            return (isPalandrome(s,i+1,j) || isPalandrome(s,i,j-1));
        }
        }
        
        return true;
        }
        
    // wrong kyu aa raha mera to submit hogya - pata nhi yaar   kro ab run -nope   -Q husaar submit ho gaya tha n  are wo sirf run kiya tha ha ha



    // wo test case konse me fail ho raha tha ?  write kro yaha pe -"atbbga"
    // thumae bhi test case dikh rahe hongi n  - Q thumari submit ho ga

}
// ye kya all cases // chup ab dry run krne do case k liye -ok *_*