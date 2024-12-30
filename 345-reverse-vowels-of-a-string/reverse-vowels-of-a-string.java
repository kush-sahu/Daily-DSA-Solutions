class Solution {
    public boolean isVovel(char c){
        if(c=='a'||c=='A'||c=='e'|| c=='E'||c=='I'||c=='i'|| c=='O'||c=='o'||c=='U'||c=='u')return true;
        else return false;
    }
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char arr[]=s.toCharArray();
        while(i<j){
            while(i<j && isVovel(s.charAt(i))==false){
                i++;
            }
            while(j>i && isVovel(s.charAt(j))==false){
                j--;
            }

            if(i<j){
               char c=arr[i];
                  arr[i]=arr[j];
                  arr[j]=c;
                  i++;
                  j--;
            }

        }
        return new String(arr);
    }
}