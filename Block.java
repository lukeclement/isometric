import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.canvas.*;
import javafx.animation.*;
import javafx.scene.image.*;
import javafx.scene.input.*;
import javafx.event.*;
import javafx.scene.paint.*;
import javafx.scene.effect.*;

class Block{
  private int height;
  private int objectType;
  private int orientation;
  private Image start;
  private ImageView iv;
  private SnapshotParameters params = new SnapshotParameters();

  public Block(int h, int oT, int o, Image s){
    height=h;
    objectType=oT;
    orientation=o;
    start=s;
  }
  //Getters
  public  int getHeight(){
    return height;
  }
  public int getObjectType(){
    return objectType;
  }
  public int getOrientation(){
    return orientation;
  }
  //Setters
  public void setHeight(int h){
    height=h;
    return;
  }
  public void setObjectType(int oT){
    objectType=oT;
    return;
  }
  public void setOrientation(int o){
    orientation=o;
    return;
  }
  //Drawing
  public void rotate(int degrees){
    return;
  }
  public void draw(GraphicsContext g){
    switch(objectType){
      case 0:

      break;
      case 1:

      break;
      case 2:

      break;
      case 3:

      break;
    }
    return;
  }
}
