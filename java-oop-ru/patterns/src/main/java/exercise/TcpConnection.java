package exercise;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.List;
import java.util.ArrayList;

// BEGIN
class TcpConnection {
    private String ipAdr;
    private int port;
    private Connection state;

    public TcpConnection(String ipAdr, int port) {
        this.ipAdr = ipAdr;
        this.port = port;
        this.state = new Disconnected();
    }

    public String getCurrentState() {
        return this.state.toString();
    }

    public void connect() {
        this.state = this.state.connect();
    }

    public void disconnect() {
        this.state = this.state.disconnect();
    }

    public void write( String data ) {
        this.state.write(data);
    }
}
// END
