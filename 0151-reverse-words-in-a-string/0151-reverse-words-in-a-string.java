// class Solution {
//     public String reverseWords(String s) {
//         int left=0;
//         int right=s.length()-1;
//         String temp="";
//         String ans="";
//         while(left<=right){
//             char ch=s.charAt(left);
//             if(ch !=' '){
//                 temp += ch;
//             }else if(ch == ' '){
//                 if(!ans.equals("")){
//                     ans=temp+" "+ans;
//                 }
//             }else{
//                 ans=temp;
//             }
//             temp="";
//         }
//         left++;
//     }
//     if(!temp.equals("")){
//         if(!ans.equals("")){
//             ans=temp+" "+ans;
//         }else{
//             ans=temp;
//         }
//     }
//            return ans;
// }

class Solution {
    public String reverseWords(String s) {
        int left = 0;
        int right = s.length() - 1;
        String temp = "";
        String ans = "";

        while (left <= right) {
            char ch = s.charAt(left);

            if (ch != ' ') {
                temp += ch;
            } else {
                if (!temp.equals("")) {
                    if (!ans.equals("")) {
                        ans = temp + " " + ans;
                    } else {
                        ans = temp;
                    }
                    temp = ""; // Reset temp after adding the word
                }
            }
            left++;
        }

        // Add the last word to ans if any remains in temp
        if (!temp.equals("")) {
            if (!ans.equals("")) {
                ans = temp + " " + ans;
            } else {
                ans = temp;
            }
        }

        return ans;
    }
}
