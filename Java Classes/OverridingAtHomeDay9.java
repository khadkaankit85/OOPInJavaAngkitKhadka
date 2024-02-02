public class OverridingAtHomeDay9 {
    public static void main(String[] args) {
    SoccerPlayer angkit=new SoccerPlayer();
    angkit.myGame();
    angkit.tournaments();
    }
}

class Player{
    public void myGame(){
        System.out.println("I play all the games.");
    }
}
class SoccerPlayer extends Player{
    @Override
    public void myGame() {
//            super.myGame(); super keyword is used to call the method of superclass
        System.out.println("I play soccer.");
    }
    public void tournaments(){
        System.out.println("I play ten major tournaments every year.");
    }
}
