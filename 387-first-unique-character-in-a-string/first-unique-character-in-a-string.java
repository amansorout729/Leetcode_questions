class Solution {
    public int firstUniqChar(String s) {
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<s.length();i++){
            boolean h=true;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    h=false;
                    break;
                }
            }
            if(h==true){
                return i;

            }
        }
        return -1;

    }
}