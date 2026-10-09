class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int first=st.pop();
                int second=st.peek();
                st.push(first);
                st.push(first+second);
            }else if(operations[i].equals("D")){
                int res=st.peek();
                st.push(res*2);
            }else if(operations[i].equals("C")){
                st.pop();
                
            }else{
                int num=Integer.parseInt(operations[i]);
                st.push(num);
            }
        }
        int ans=0;
        while(!st.isEmpty()){
          ans=ans+st.pop();
        }
        return ans;
    }
}