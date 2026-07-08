class Solution {
    public int firstUniqChar(String s) {
        int[] freq=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq[ch-97]++;

        }

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(freq[ch-97]==1){
                return i;
            }
        }
        return -1;
        
        
        // for(int i=0;i<s.length();i++){
        //     boolean h=true;
        //     for(int j=0;j<s.length();j++){
        //         if(i!=j && s.charAt(i)==s.charAt(j)){
        //             h=false;
        //             break;
        //         }
        //     }
        //     if(h==true){
        //         return i;

        //     }
        // }
        // return -1;

    }
}