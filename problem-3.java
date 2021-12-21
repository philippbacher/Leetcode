class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> letterMap = new HashMap<Character, Integer>();
        int length = 0;
        int maxLength = 0;
        /*
        for(char c: s.toCharArray()){
            System.out.println(c);
            if(letterMap.get(c) == null){
                //System.out.println("Incrementing" + c);
                length++;
                letterMap.put(c,true);
            }else{
              length=1;
              letterMap.clear();
              letterMap.put(c,true);
            } 
            if(length>maxLength){
                maxLength = length;
            }
        } 
        */
        
        int iteration = 0;
        char failedAt = 'x';
        if(s.length()>0)
         failedAt = s.charAt(0);
        for(int i = 0;i<s.length();i++){
            System.out.println(s.substring(i) + " " + failedAt);
            if(maxLength > s.length() - i) break;
            
            if(s.substring(i).charAt(0) != failedAt) continue;
            for(char c: s.substring(i).toCharArray()){
                
                if(letterMap.get(c) == null){
                    length++;
                    letterMap.put(c,i+iteration);
                }else{               
                  length=0;  
                  failedAt=c;
                  if( s.length() - iteration + i + 1 < maxLength ) break;
                } 
                if(length>maxLength){
                    maxLength = length;
                }
                iteration++;
            }    
            length=0;
            iteration=0;
            letterMap.clear();
        }
        
       return maxLength;
    }
}
