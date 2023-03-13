import java.util.ArrayList;

public class Peasant extends Hero {

    
    private int delivery;

    public Peasant(String name) {
        super(
                name,
                1,
                3,
                1,
                1,
                1);
        this.delivery = 1;
    }
    public Peasant() {
        super();
    }
    
    @Override
    public String getInfo() {
        return String.format("%s  Delivery: %d ", super.getInfo(), this.delivery);
    }

    @Override
    public void step(ArrayList<Hero> team,ArrayList<Hero> team2) {
        System.out.println("Step peasant!");
    }

    @Override
    public void Attack(Hero target) {
        System.out.println("Attack peasant!");
    }


    public int getDelivery() {
        return delivery;
    }
    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }
    
}
