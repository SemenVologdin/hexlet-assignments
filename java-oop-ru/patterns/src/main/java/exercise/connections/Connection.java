package exercise.connections;

public interface Connection {
    // BEGIN
    public Connection connect();
    public Connection disconnect();
    public void write(String data);
    // END
}
