class Solution {
    public String removeDuplicates(String s) {
      Stack <Character> st = new Stack<>();
      // step 1
      st.push(s.charAt(0)); 
      // step 2

      for(int i=1;i<s.length();i++){
        if(st.size()==0){
            st.push(s.charAt(i));
        }else if( s.charAt(i)!=st.peek()){
            st.push(s.charAt(i));
        }else{
      while(st.size()>0 && st.peek()==s.charAt(i) ){
               st.pop(); 
         }
        }
     }


     StringBuilder sb = new StringBuilder();
     while(st.size()>=0 && st.size()>0){
        sb.append(st.pop());
     }
     sb.reverse();
     return sb.toString();
    }
}
 

  // fro example s="aaaaaaaaa"
  //  so answer "a"  aaiga but it must be "" <= empty ? rigth ? yes
  //  but if string s =    s=" aa  aa  aa aa   a"  <= that means only pair wale same letter cance hoge ?ha 
  //  but ye mention he nhi hai question me ? 
  // sogai kya ?ok
 //nhi n
 // ans galat aa raha 
 // sogai na ? \U0001f926‍♂️\U0001f926‍♂️O.O
//Donee
 // hogya solve bs reverse krna hai string 
//   run hua to mere isme nhi dikhta n     //accha ok error a raha hai --compile time    // are u there ?
// run time araha  --compile error   ha  wait mai pen se dry run krta -ok
//       Discursion me jao or check kro 
//       Nexro naam k user ne waha pe eak test case dala hai wo thoda alag hai 
// yes          
// think yousing stack -- when we add one element in stack check whether the same cgar present in the stack or not if present then pop all element until they become diff 


//samjha  ?yes got it

// do it -- i will try, bt dont know how to implement logic

//step 1 initialixze stack
// step 2 add one eleent 
// step 3 start from 1st index and apply this logic (think yousing stack -- when we add one element in stack check whether the same cgar present in the stack or not if present then pop all element until they become diff )

// understood ? yes 
// start writting code ! -hm   itna time easy e logi to interviver bhaga dega :)  -humm
// ?
// kush nhi yaar

// kya hua kha problem arahi ? muze kaise kya karu kuch yaad nhi aa raha -- ok mai batata -tum karo mai dekhti -- or samjho bhi ok -ha ok-