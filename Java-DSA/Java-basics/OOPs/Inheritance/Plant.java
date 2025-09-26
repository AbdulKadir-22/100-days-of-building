package Inheritance;

public class Plant extends Organisms{
    
    boolean Photosynthesis = true;

    @Override
    void sleeps(){
        System.out.println("This organism doesn't sleep");
    }
}
