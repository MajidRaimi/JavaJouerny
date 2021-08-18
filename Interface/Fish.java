public class Fish implements Prey , Predetor {

    @Override
    public void hunt() {
       System.out.println("This Fish Is Hunting A Smaller Fish");
        
    }

    @Override
    public void flee() {
        System.out.println("This Fish Is Fleeing From A Larger Fish");
        
    }

}
