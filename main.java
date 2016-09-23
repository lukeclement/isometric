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

    gc.drawImage(alpha,255,255);
    Sprite test=new Sprite(242,255,alpha,180);
    test.darken(0.5);
    test.draw(gc);

    new AnimationTimer(){
      public void handle(long currentNanoTime){

      }
    }.start();
    alphaStage.show();
  }
}
