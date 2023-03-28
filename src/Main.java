
abstract class Pizza{
    String name;
    String size;
    abstract String getName();
    abstract String getSize();
}

class OnionPizza extends Pizza{
    public OnionPizza(String size){
        this.name = "Onion";
        this.size = size;
    }
    @Override
    String getName(){
        return name;
    }

    @Override
    String getSize(){
        return size;
    }
}

class PaneerPizza extends Pizza{

    public PaneerPizza(String size){
        this.name = "Paneer";
        this.size = size;
    }
    @Override
    String getName(){
        return name;
    }

    @Override
    String getSize(){
        return size;
    }
}

abstract class PizzaFactory{
    abstract Pizza bakePizza(String type);
}

class RegularPizzaFactory extends PizzaFactory{
    @Override
    Pizza bakePizza(String type) throws IllegalArgumentException{
        if (type == "Onion"){
            return new OnionPizza("Regular");
        }
        else if(type == "Paneer"){
            return new PaneerPizza("Regular");
        }
        else{
            throw new IllegalArgumentException("Please Enter Right Pizza type");
        }
    }
}

class LargePizzaFactory extends PizzaFactory{
    @Override
    Pizza bakePizza(String type) throws IllegalArgumentException{
        if (type == "Onion"){
            return new OnionPizza("Large");
        }
        else if(type == "Paneer"){
            return new PaneerPizza("Large");
        }
        else{
            throw new IllegalArgumentException("Please Enter Right Pizza type");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PizzaFactory regularPizzaFactory = new RegularPizzaFactory();
        PizzaFactory largePizzaFactory = new LargePizzaFactory();

        //Baking Regular onion pizza
        Pizza onionPizza = regularPizzaFactory.bakePizza("Onion");
        System.out.println("Pizza Name: "+onionPizza.getName()+", Pizza size: "+onionPizza.getSize());

        //Baking Large Onion pizza
        Pizza paneerPizza = largePizzaFactory.bakePizza("Paneer");
        System.out.println("Pizza Name: "+paneerPizza.getName()+", Pizza size: "+paneerPizza.getSize());
    }
}