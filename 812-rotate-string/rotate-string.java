// This approch is useless or duplicate characters

// class Solution {
//     public boolean rotateString(String s, String goal) {
//         HashMap<Character,Integer>hm=new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             hm.put(s.charAt(i),i);
//         }
//         int v1=-1;
//         int v2=-1;
//         int a=0;
//         for(int i=0;i<goal.length();i++){
//             if(hm.containsKey(goal.charAt(i))==true){
//                  a=hm.get(goal.charAt(i));
//             }else return false;

//             if(a>=i && v1==-1){
//                 v1=a-i;
//             }else if(a>=i && v1!=-1){
//                 if(v1!=a-i)return false;
//             }

//              if(a<i && v2==-1){
//                 v2=i-a;
//             }else if(a<i && v2!=-1){
//                 if(v2!=i-a)return false;
//             }
//         }
//         return true;
//     }
// }




// This approch is usefull or duplicate characters

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
       String a=s+s;
       return a.contains(goal);
    }
}