package exercise.connections;

// BEGIN
public class Connected implements Connection {
    @Override
    public Connection connect() {
        System.out.println("Try to connect when connection already established. Message must contains word Error");
        return new Connected();
    }

    @Override
    public Connection disconnect() {
        return new Disconnected();
    }

    @Override
    public String toString() {
        return "connected";
    }

    @Override
    public void write(String data) {

    }
}
// END
