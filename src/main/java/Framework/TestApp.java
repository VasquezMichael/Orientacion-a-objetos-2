package Framework;

import Framework.tcp.server.reply.TCPControlLoop;

public class TestApp  {

    public static void main(String[] args) {

        new TCPControlLoop().startLoop(args);

    }
}
