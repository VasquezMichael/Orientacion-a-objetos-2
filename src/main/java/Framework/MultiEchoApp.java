package Framework;

import Framework.tcp.server.reply.EchoHandler;
import Framework.tcp.server.reply.MultiConnectionHandler;
import Framework.tcp.server.reply.TCPControlLoop;

public class MultiEchoApp  {

    public static void main(String[] args) {

        new TCPControlLoop(new MultiConnectionHandler(new EchoHandler())).startLoop(args);
    }
}
