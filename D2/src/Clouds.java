
public class Clouds
{
    Circle circle1 = new Circle();
    Circle circle2 = new Circle();
    Circle circle3 = new Circle();
    public void createCloud(){
        circle1.changeColor("black");
        circle2.changeColor("black");
        circle3.changeColor("black");

        circle1.moveHorizontal(-120);
        circle2.moveHorizontal(-90);
        circle3.moveHorizontal(-100);

        circle1.moveVertical(-40);
        circle2.moveVertical(-40);
        circle3.moveVertical(-60);

        circle1.changeSize(40);
        circle2.changeSize(50);
        circle3.changeSize(45);

        circle1.makeVisible();
        circle2.makeVisible();
        circle3.makeVisible();
    }

    public void moveClouds(){
        for (;;){
            for (int i = 0; i <= 200; i++){
                circle1.slowMoveHorizontal(1);
                circle2.slowMoveHorizontal(1);
                circle3.slowMoveHorizontal(1);
            }
            for (int i = 200; i >= 0; i--){
                circle1.slowMoveHorizontal(-1);
                circle2.slowMoveHorizontal(-1);
                circle3.slowMoveHorizontal(-1);
            }
        }
    }

}
