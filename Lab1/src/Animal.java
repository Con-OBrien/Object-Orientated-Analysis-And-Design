public class Animal {
    String name;
    int age;
    char gender;
    int weightPounds;

    public Animal(int Age, char Gender, int WeightInPounds) {
        age = Age;
        gender = Gender;
        weightPounds = WeightInPounds;
    }

    public void eat() {
        System.out.println("I am eating\n");
    }
    public void sleep() {
        System.out.println("I am sleeping\n");
    }
}
