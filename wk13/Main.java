
public class Main{
    public static void main(String[] args) {
        GameArena arena = new GameArena(512,512);
        Ball[] balls = new Ball[5];
        balls[0] = new Ball(256,256,24,"BLUE");
        arena.addBall(balls[0]);

        //double pos=ball.getXPosition();
        //int dir=1;
        //while(true){
        //     long t1=System.currentTimeMillis();
        //     while(System.currentTimeMillis()!=t1+50){}
        //     pos+=dir;
        //     if (pos==arena.getArenaWidth()){
        //         dir=-1;
        //     }
        //     else if(pos==0){
        //         dir=1;
        //     }
        //     ball.setXPosition(pos);
        // }
        balls[0].goTo(50, 200, 1000);
    }



    
}