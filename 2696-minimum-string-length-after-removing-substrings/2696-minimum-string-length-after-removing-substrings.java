class Solution {
    public int minLength(String s) {
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<s.length();i++){
            char element = s.charAt(i);
            
            if(stack.isEmpty()){
                stack.push(element);
                continue;
            }
            if(element =='B' && stack.peek() == 'A'){
                stack.pop();
            }else if(element == 'D' && stack.peek() == 'C'){
                stack.pop();
            }else{
                stack.push(element);
            }
        }
        return stack.size();
    }
}