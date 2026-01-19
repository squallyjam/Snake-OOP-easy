public class SnakeSegment {
  private int x;
  private int y;
  //konstruktor bauen 
  public SnakeSegment(int x, int y){
    this.x =x;
    this.y =y;
    }//ende konstruktor
  public int getx(){
    return x;
    }
  public int gety(){
    return y;
    }
  public void setPosition(int x, int y){
    this.x=x;
    this.y=y;
    }
  }