class Solution {
    public boolean checkPerfectNumber(int num) {
        int div=0;
        
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                div=div+i;
            }

        }
        if(div==num){
            return true;
        }
        return false;
    }
}