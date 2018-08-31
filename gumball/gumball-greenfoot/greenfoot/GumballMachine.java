import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{
   
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ;
        
    }

    
    public void act() 
    {
        // Add your action code here.
       List <Coin> intersectionList = getIntersectingObjects(Coin.class);
       if (intersectionList.size() > 0)
       {
           this.getWorld().showText("Have coin", 367, 40); 
           for (Coin coin : intersectionList) 
           {
                coin.getImage().setTransparency(0);
           }
        }
       
        
        if (Greenfoot.mouseClicked(this))
        {
           List<Alien> alienList =  this.getWorld().getObjects(Alien.class);
           
           for (Alien alien: alienList) 
           {
               //alien.turn(10);
            }
        }
    } 
    
}
