import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.canvas.*;
import javafx.animation.*;
import javafx.scene.image.*;
import javafx.scene.input.*;
import javafx.event.*;
import javafx.scene.paint.*;
import javafx.scene.effect.*;

class Sprite{
  private double darkness=0;
  private int posx;
  private int posy;
  private Image image;
  private int rotation;
  private ImageView iv;
  private ColorAdjust ca;
  private SnapshotParameters params = new SnapshotParameters();

  public Sprite(int x,int y, Image i, int r){
    posx=x;
    posy=y;
    image=i;
    rotation=r;
    iv=new ImageView(image);
    ca=new ColorAdjust();
    params.setFill(Color.TRANSPARENT);
    iv.setRotate(rotation);
  }
  //The Dark Knight arrives
  public void darken(){
    darkness=darkness-0.1;
    ca.setBrightness(darkness);
    iv.setEffect(ca);
  }
  public void darken(double amount){
    darkness=darkness-amount;
    ca.setBrightness(darkness);
    iv.setEffect(ca);
  }
  //Getters
  public int getPosX(){
    return posx;
  }
  public int getPosY(){
    return posy;
  }
  public int getRot(){
    return rotation;
  }
  public int getDark(){
    return darkness;
  }
  //Setters
  public void setRot(int r){
    rotation=r;
    iv.setRotate(rotation);
    return;
  }
  public void setPosX(int x){
    posx=x;
    return;
  }
  public void setPosY(int y){
    posy=y;
    return;
  }
  public void setPos(int x,int y){
    posx=x;
    posy=y;
    return;
  }
  //Drawing
  public void draw(GraphicsContext g){
    image=iv.snapshot(params,null);
    g.drawImage(image,posx,posy);
    return;
  }

}
