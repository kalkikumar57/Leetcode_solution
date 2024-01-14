class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> set = new HashSet<>(); 
        List<String> result = new ArrayList<>(); 
        for(String word : words){
            set.add(word);
        }
    
        for(String word : words){ 
            int sz = word.length();
        
            boolean[] flags = new boolean[sz + 1]; 
            flags[0] = true;
            
            for(int i = 0; i < sz; i++){
            
                if(!flags[i]){ 
                    continue;
                }
            
                for(int k = i + 1; k <= sz; k++){
                  if(k - i < sz && set.contains(word.substring(i, k))){
                      flags[k] = true; 
                  }  
                }
           
                if(flags[sz]){ 
                    result.add(word); 
                    break;
                }
            }
        }
        return result;
    }
}