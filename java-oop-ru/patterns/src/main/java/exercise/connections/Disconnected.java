package exercise.connections;

// BEGIN
public class Disconnected implements Connection {
    @Override
    public Connection connect() {
        return new Connected();
    }

    @Override
    public Connection disconnect() {
        System.out.println("Try to disconnect when connection disconnected. Message must contains word Error");
        return new Disconnected();
    }

    @Override
    public String toString() {
        return "disconnected";
    }

    @Override
    public void write(String data) {
        System.out.println("Try to write to disconnected connection. Message must contains word Error");
    }
}
// END
