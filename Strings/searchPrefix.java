public class searchPrefix {
        public String longestCommonPrefix(String[] strs) {
            if(strs.length==0) return "";
            if(strs.length==1) return strs[0] ;
            String ans="";
            boolean isPresent=true;
            for(int i=0; i<strs[0].length();i++){
                char ch=strs[0].charAt(i);
                for(int j=1;j<strs.length;j++){
                    if(strs[j].length()==i|| strs[j].charAt(i)!=ch){
                        return ans;
                    }else{
                        if(strs[j].charAt(i)==ch){
                            isPresent=true;
                        }
                    }
                        
            }
                    
                if(isPresent) ans+=ch;
            }
            return ans;
            
        }
}

