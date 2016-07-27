class HelloWorld {
    public static void main(String[] args){
        System.out.println("Test");
        FoodFactory myFoods=new FoodFactory();
        Food food1=myFoods.getFood("FastFood");
        Food food2=myFoods.getFood("Fruits");
        System.out.println("My name is: "+food1.getClass().getName());
        System.out.println("My name is: "+food2.getClass().getName());
        System.out.println("Our superclass is: "+food1.getClass().getSuperclass().getName());
        food1.serveFood();
        food2.serveFood();
        
    }
}
class FoodFactory{
    public Food getFood(String foodName){
        Food output=null;
        if (foodName.equals("FastFood")) output=new FastFood();
        if (foodName.equals("Fruits")) output=new Fruit();
        return output;
    }
}
class Food {
    public void serveFood(){
        
    }
}
    
class FastFood extends Food{
    @Override
    public void serveFood(){
        System.out.println("I'm serving FastFood");
    }
}
class Fruit extends Food{
    @Override
    public void serveFood(){
        System.out.println("I'm serving Fruit");
    }
}