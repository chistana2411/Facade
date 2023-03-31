// Facade class
public class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;

    public Facade() {
        subsystemA = new ConcreteSubsystemA();
        subsystemB = new ConcreteSubsystemB();
    }

    // Facade method that calls the operations of subsystems A and B
    public void operation() {
        subsystemA.operationA();
        subsystemB.operationB();
    }
}

