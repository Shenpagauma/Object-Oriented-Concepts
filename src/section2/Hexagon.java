
package section2;
import section1.*;
public  class Hexagon extends Shape{
    Integer side;
    public Hexagon(String shapeName,Integer side) {
        super(shapeName);
        this.side=side;
     
    }
    public Integer getSide() {
        return side;
    }
    public void setSide(Integer side) {
        this.side = side;
    }
    
    

}
