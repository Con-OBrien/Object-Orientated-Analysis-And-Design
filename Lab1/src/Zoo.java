public class Zoo {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Sparrow sparrow = new Sparrow();

        chicken.fly();
        chicken.eat();
        chicken.sleep();

        sparrow.fly();
        sparrow.eat();
        sparrow.sleep();

        Fish fish = new Fish();

        fish.swim();

        Animal sparrow1 = new Sparrow(1,'F',3);
    }
}
