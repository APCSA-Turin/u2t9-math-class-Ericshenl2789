public class CoinFlip {
    public CoinFlip(){}

    public String flip(){
        int x = (int) (Math.random() * 2) + 1;
        if (x == 0){
            return "heads";
        }
        return "tails";
    }

    public double stimulate(int flips) {
        int headNum = 0;
        int tailNum = 0;
        for (int i = 0; i < flips; i++) {
            if (flip().equals("tails")){
                tailNum ++;
            } else {
                headNum ++;
            }
        }
        return (double) headNum / flips;
    }
}
