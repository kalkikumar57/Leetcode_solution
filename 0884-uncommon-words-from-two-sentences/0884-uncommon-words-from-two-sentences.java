class Solution {
public String[] uncommonFromSentences(String s1, String s2) {
    ArrayList<String> list=new ArrayList<>();
    HashMap<String,Integer> mp=new HashMap<>();
    String str1[] = s1.split(" ");
    for(String m:str1){
        mp.put(m,mp.getOrDefault(m,0)+1);
    }
    String str2[] = s2.split(" ");
    for(String n:str2){
        mp.put(n,mp.getOrDefault(n,0)+1);
    }
    
    for(String i : mp.keySet()){
        if(mp.get(i)==1){
            list.add(i);
        }
    }
    String[] ans=new String[list.size()];
    for(int i=0;i<list.size();i++){
        ans[i]=list.get(i);
    }
    return ans;
}
}