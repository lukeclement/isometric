import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.canvas.*;
import javafx.animation.*;
import javafx.scene.image.*;
import javafx.scene.input.*;
import javafx.event.*;
import javafx.scene.paint.*;
import javafx.scene.effect.*;
import java.util.*;

class Block{
  private int height;
  private int objectType;
  private int orientation;
  private int posX;
  private int posY;
  private Image start;
  private ImageView iv;
  private SnapshotParameters params = new SnapshotParameters();
  private Reflection reflection=new Reflection();

  public Block(int h, int oT, int o, Image s,int x,int y){
    height=h;
    objectType=oT;
    orientation=o;
    start=s;
    reflection.setFraction(1);
    params.setFill(Color.TRANSPARENT);
    posX=x;
    posY=y;
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
  public List<Sprite> flat(int originX, int originY,int face){
    List<Sprite> out=new ArrayList<>();
    iv=new ImageView(start);
    //out.add(new Sprite(originX,originY-8,start,0));
    //out.add(new Sprite(originX-13,originY,start,180));
    iv.setEffect(reflection);
    switch(face){
      case 0:
      out.add(new Sprite(originX,originY,iv.snapshot(params,null),0+(120-Math.toDegrees(Math.atan(13.0/8.0))),-0.5));
      out.add(new Sprite(originX-7,originY+4,iv.snapshot(params,null),180+(120-Math.toDegrees(Math.atan(13.0/8.0))),-0.5));
      break;
      case 1:
      out.add(new Sprite(originX,originY-8,iv.snapshot(params,null),0,0));
      out.add(new Sprite(originX-13,originY-8,iv.snapshot(params,null),180,0));
      break;
      case 2:
      out.add(new Sprite(originX-15,originY+4,iv.snapshot(params,null),0-(120-Math.toDegrees(Math.atan(13.0/8.0))),-0.25));
      out.add(new Sprite(originX-22,originY-1,iv.snapshot(params,null),180-(120-Math.toDegrees(Math.atan(13.0/8.0))),-0.25));
      break;
    }
    return out;
  }
  public void draw(GraphicsContext g){
    switch(objectType){
      case 0:
      List<Sprite>test=flat(posX,posY,1);
      for(int i=0;i<test.size();i++){
        test.get(i).draw(g);
      }List<Sprite>testa=flat(posX,posY,0);
      for(int i=0;i<testa.size();i++){
        testa.get(i).draw(g);
      }List<Sprite>testb=flat(posX,posY,2);
      for(int i=0;i<testb.size();i++){
        testb.get(i).draw(g);
      }
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
