class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
        if(s1.length() < s2.length()){
            String temp = s1;
                   s1=s2;
                   s2=temp;
        }
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        
        one =Arrays.asList(s1.split(" "));
        two =Arrays.asList(s2.split(" "));
        
        int i=0 ,j=one.size()-1;
        int k=0 ,l=two.size()-1;
        
        while(i < one.size() && k < two.size() && one.get(i).equals(two.get(k))){
            i++;
            k++;
        }
        while(l >= k && one.get(j).equals(two.get(l))){
            j--;
            l--;
        }
        return l<k;
    }
}