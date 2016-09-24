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

  public Block(int h, int oT, int o){
    height=h;
    objectType=oT;
    orientation=o;
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
  public void draw(GraphicsContext g){
    
  }
}
