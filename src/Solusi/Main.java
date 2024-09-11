package Solusi;

// Solusi dengan Interface Segregation Principle
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class HumanWorker implements Workable, Eatable {
    public void work() {
        System.out.println("Human working");
    }

    public void eat() {
        System.out.println("Human eating");
    }
}

class RobotWorker implements Workable {
    public void work() {
        System.out.println("Robot working");
    }
}

public class Main {
    public static void main(String[] args) {
        Workable human = new HumanWorker();
        Workable robot = new RobotWorker();

        human.work();
        // Casting to Eatable to call eat() if necessary
        if (human instanceof Eatable) {
            ((Eatable) human).eat();
        }

        robot.work();
        // Robot does not have an eat method
    }
}
