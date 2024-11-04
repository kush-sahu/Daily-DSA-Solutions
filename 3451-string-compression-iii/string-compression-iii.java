class Solution {
    public String compressedString(String word) {
        // HashMap<Character,Integer>hm=new HashMap<>();
        // for(int i=0;i<word.length();i++){
        //     hm.put(word.charAt(i),hm.getOrDefault(word.charAt(i),0)+1);
        // }
         StringBuilder sb= new StringBuilder();

        // for(int i=0;i<word.length();i++){
        //     char ch=word.charAt(i);

        //     if(hm.containsKey(ch)==true){
        //         int n=hm.get(ch);
        //         if(n>9){
        //             sb.append('9');
        //             sb.append(ch);
        //             hm.put(ch,n%9);
        //         }else{
        //             sb.append(n);
        //             sb.append(ch);
        //             hm.put(ch,0);
        //             if(hm.get(ch)==0){
        //                 hm.remove(ch);
        //             }
        //         }
        //     }
        // }
        // return sb.toString();



        int count=1;
        char ch=word.charAt(0);
        for(int i=1;i<word.length();i++){
            char ch2=word.charAt(i);
            if(ch==ch2){
                count++;
            }else{
                if(count>9){
                    while(count>9){
                        sb.append('9');
                        sb.append(ch);
                        count-=9;
                    }
                 }
                 if(count<=9){
                    sb.append(count);
                    sb.append(ch);
                 }

                 count=1;
                 ch=ch2;
            }
        }
        
       if(count>9){
              while(count>9){
                 sb.append('9');
                sb.append(ch);
                count-=9;
                    }
                 }
                 if(count<=9){
                    sb.append(count);
                    sb.append(ch);
                 }
        return sb.toString();
    }
}