class Solution {
    public char operation(char op1, char op2, char sign)
        {
            
     if (sign == '&') {  // AND operation
            return (op1 == 't' && op2 == 't') ? 't' : 'f';
        } else if (sign == '|') {  // OR operation
            return (op1 == 't' || op2 == 't') ? 't' : 'f';
        } else if (sign == '!') {  // NOT operation (unary)
            return (op1 == 't') ? 'f' : 't';
        }
        return 'f';  // Default case
    }
        
    public boolean parseBoolExpr(String expression) {
        Stack<Character>st1=new Stack<>();
        Stack<Character>st2=new Stack<>();
        int n=expression.length();
        char ao1='\0';
        char o2='\0';
        char operator='\0';
        for(int i=0;i<n;i++){
            char ch=expression.charAt(i);
            if(ch==')'){
                operator=st2.pop();
                ao1 = '\0';
                o2 = '\0';
                while(st1.peek()!='('){
                    char ch2=st1.pop();
                    if(ao1=='\0'){
                        ao1=ch2;
                    }else{
                        o2=ch2;
                      
                    ao1=operation(ao1,o2,operator);
                    }
                }
                    st1.pop();
                    if (operator == '!') {
                    ao1 = operation(ao1, '\0', operator);
                }
                    st1.push(ao1);
                    
                 
             }

            else if(ch=='&' || ch=='!' || ch=='|'){
                st2.push(ch);
             }else if(ch=='t' || ch=='f' || ch=='('){
                st1.push(ch);
             }
        }

         return st1.pop() == 't';
    }
}