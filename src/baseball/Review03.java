package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam  yakuruto= new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam  dena= new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam  hannsinn= new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam kyozinn= new BaseBallTeam("読売ジャイアンツ", 68 ,72, 3);
        BaseBallTeam kapu= new BaseBallTeam("広島東洋カープ", 66 ,74 , 3);
        BaseBallTeam doragonnzu= new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);
        
        
        
        
        yakuruto.report();
        dena.report();
        hannsinn.report();
        kyozinn.report();
        kapu.report();
        doragonnzu.report();
        
    }

}
