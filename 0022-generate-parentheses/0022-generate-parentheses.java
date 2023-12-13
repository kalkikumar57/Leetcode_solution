class Solution {
    List<String> answer = new ArrayList();
    public List<String> generateParenthesis(int n) {
        find("",n,n);
        return answer;
    }
    private void find(String s, int a, int b) {
        if (a != 0) find(s + "(", a-1, b);
        if (b != 0 && a < b) find(s + ")", a, b-1);
        if (a == 0 && b == 0) answer.add(s);
    }
}