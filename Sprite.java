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
  private double rotation;
  private ImageView iv;
  private ColorAdjust ca;
  private SnapshotParameters params = new SnapshotParameters();

  public Sprite(int x,int y, Image i, double r,double d){
    posx=x;
    posy=y;
    image=i;
    rotation=r;
    darkness=d;
    iv=new ImageView(image);
    ca=new ColorAdjust();
    params.setFill(Color.TRANSPARENT);
    iv.setRotate(rotation);
    ca.setBrightness(darkness);
    iv.setEffect(ca);
  }
  //The Dark Knight arrives
  public void darken(){
    darkness=darkness-0.1;
    ca.setBrightness(darkness);
    iv.setEffect(ca);
    return;
  }
  public void darken(double amount){
    darkness=darkness-amount;
    ca.setBrightness(darkness);
    iv.setEffect(ca);
    return;
  }
  //Getters
  public int getPosX(){
    return posx;
  }
  public int getPosY(){
    return posy;
  }
  public double getRot(){
    return rotation;
  }
  public double getDark(){
    return darkness;
  }
  //Setters
  public void setRot(double r){
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
