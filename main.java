import java.util.*;
import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.canvas.*;
import javafx.animation.*;
import javafx.scene.image.*;
import javafx.scene.input.*;
import javafx.event.*;
import javafx.scene.paint.*;
import javafx.scene.effect.*;

public class main extends Application{
  public static int width=1000;
  public static int height=1000;
  public static void main(String[] args){
    launch(args);
  }
  public void start(Stage alphaStage){
    alphaStage.setTitle("Isometric test");
    Group root=new Group();
    Scene scene=new Scene(root);

    alphaStage.setScene(scene);

    Canvas canvas=new Canvas(width,height);
    root.getChildren().add(canvas);

    GraphicsContext gc=canvas.getGraphicsContext2D();

    Image alpha=new Image("Textures2/01.png");
    final long startNanoTime=System.nanoTime();
    int[] map=new int[25];
    for(int z=0;z<4;z++){
      map[z]=0;
    }
    /*gc.drawImage(alpha,255,255);
    Sprite test=new Sprite(255,255,alpha,180);
    test.setRot(120-Math.toDegrees(Math.atan(13.0/8.0)));
    test.darken(0.5);
    test.draw(gc);
    */
    //Block test=new Block(0,0,0,alpha);
    //test.draw(gc);
    //gc.fillOval(255,255,2,2);

    new AnimationTimer(){
      public int i=0;
      public int j=0;
      public int z=0;
      public int magic=10;
      public void handle(long currentNanoTime){
        switch(map[z]){
          case 0:
          Block test=new Block(0,0,0,alpha,(i*13)+200,(j*8)+200);
          test.draw(gc);
          break;
        }
        i++;
        j++;
        if(i==magic){
          i=0;
          j=j-(magic-2);
          z++;
        }
      }
    }.start();
    alphaStage.show();
  }
}
