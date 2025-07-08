class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveC=0,tenC=0;
        for (int i=0;i<bills.length;i++){
            int bill=bills[i];
            switch(bill){
                case 5:
                fiveC++;
                break;
                 case 10:
                    if (fiveC== 0) return false;
                    fiveC--;
                    tenC++;
                    break;
                case 20:
                    if (tenC>0&& fiveC> 0) {
                        tenC--;
                        fiveC--;
                    } else if (fiveC>=3) {
                        fiveC-=3;
                    } else {
                        return false;
                    }
                    break;
                default:
                    return false; 
            }
        }
        return true;
    }
}


        
