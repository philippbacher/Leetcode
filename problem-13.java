class Solution {
    public int romanToInt(String s) {
    
        char charArr[] = s.toCharArray();
        int result = 0;
        
        for(int i = 0; i<charArr.length;i++){
            
            switch(charArr[i]){
                case 'I':
                    if (i == charArr.length-1){
                       result++;
                    }else if (charArr[i+1] == 'V'){
                        result+=4;
                        i++;
                    }else if (charArr[i+1] == 'X'){
                        result+=9;
                        i++;
                    }else result++;
                    break;
                case 'V':
                    result+=5;
                    break;
                case 'X':
                    if (i == charArr.length-1){
                       result+=10;
                    }else if (charArr[i+1] == 'L'){
                        result+=40;
                        i++;
                    }else if (charArr[i+1] == 'C'){
                        result+=90;
                        i++;
                    }else result+=10;
                    break;
                case 'L':
                    result+=50;
                    break;
                case 'C':
                    if (i == charArr.length-1){
                       result+=100;
                    }else if (charArr[i+1] == 'D'){
                        result+=400;
                        i++;
                    }else if (charArr[i+1] == 'M'){
                        result+=900;
                        i++;
                    }else result+=100;
                    break;
                case 'D':
                    result+=500;
                    break;
                case 'M':
                    result+=1000;
                    break;
                default:
                    break;
                    
            }
        
        }
        return result;
    }
}
