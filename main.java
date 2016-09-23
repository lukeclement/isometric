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

    mainStage.setScene(scene);

    Canvas canvas=new Canvas(width,height);
    root.getChildren().add(canvas);

    GraphicsContext gc=canvas.getGraphicsContext2D();

    Image alpha=new Image("Textures2/01.png");
    final long startNanoTime=System.nanoTime();

    gc.drawImage(alpha,255,255);

    ImageView iv=new ImageView(alpha);
    iv.setRotate(180);
    SnapshotParameters params = new SnapshotParameters();
    params.setFill(Color.TRANSPARENT);
    Image rotated=iv.snapshot(params, null);
    gc.drawImage(rotated,242,255)

    new AnimationTimer(){
      public void handle(long currentNanoTime){

      }
    }
  }
}
