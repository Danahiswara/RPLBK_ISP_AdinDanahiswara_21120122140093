package Melanggar;

// Pelanggaran Interface Segregation Principle
interface Worker {
    void work();
    void eat();
}

class HumanWorker implements Worker {
    public void work() {
        System.out.println("Human working");
    }

    public void eat() {
        System.out.println("Human eating");
    }
}

class RobotWorker implements Worker {
    public void work() {
        System.out.println("Robot working");
    }

    // Robot tidak membutuhkan metode eat()
    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat");
    }
}

public class Main {
    public static void main(String[] args) {
        Worker human = new HumanWorker();
        Worker robot = new RobotWorker();

        human.work();
        human.eat();

        robot.work();
        try {
            robot.eat();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}

