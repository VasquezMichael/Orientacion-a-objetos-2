package Framework;

import Framework.tcp.server.reply.EchoHandler;
import Framework.tcp.server.reply.SingleConnectionHandler;
import Framework.tcp.server.reply.TCPControlLoop;

public class EchoApp  {
   

    public static void main(String[] args) {

        new TCPControlLoop(new SingleConnectionHandler(new EchoHandler())).startLoop(args);
        
    }

}
