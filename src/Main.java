//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Shark();
        animals[1] = new Turtle();
        animals[2] = new Eagle();


        for (Animal animal : animals) {
            if (animal instanceof Shark) {

                Shark shark = (Shark) animal;
                shark.attack();
            } else if (animal instanceof Turtle) {

                Turtle turtle = (Turtle) animal;
                turtle.swim();
            } else if (animal instanceof Eagle) {

                Eagle eagle = (Eagle) animal;
                eagle.fly();
            }
        }


        for (Animal animal : animals) {
            System.out.println("The class of this object is: " + animal.getClass().getSimpleName());
        }


        Shark[] sharks = new Shark[1];
        Turtle[] turtles = new Turtle[1];
        Eagle[] eagles = new Eagle[1];

        int sharkIndex = 0, turtleIndex = 0, eagleIndex = 0;

        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                sharks[sharkIndex++] = (Shark) animal;
            } else if (animal instanceof Turtle) {
                turtles[turtleIndex++] = (Turtle) animal;
            } else if (animal instanceof Eagle) {
                eagles[eagleIndex++] = (Eagle) animal;
            }
        }


        System.out.println("\nSharks:");
        for (Shark shark : sharks) {
            if (shark != null) {
                shark.attack();
            }
        }

        System.out.println("\nTurtles:");
        for (Turtle turtle : turtles) {
            if (turtle != null) {
                turtle.swim();
            }
        }

        System.out.println("\nEagles:");
        for (Eagle eagle : eagles) {
            if (eagle != null) {
                eagle.fly();
            }
        }
    }
}
