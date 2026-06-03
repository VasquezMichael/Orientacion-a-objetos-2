package Framework.ejercicio1SingleThreadTCPFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class SingleThreadTCPServer {

    public abstract void handleMessage(String message, PrintWriter out);

    public final void startLoop(String[] args) {
        checkArguments(args);

        int portNumber = Integer.parseInt(args[0]);

    
        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            displaySocketInformation(portNumber);
            while (true) {
                Socket clientSocket = acceptAndDisplaySocket(serverSocket);
                handleClient(clientSocket);
            }
        } catch (IOException e) {
            displayAndExit(portNumber);
        }
    }

    protected void displayAndExit(int portNumber) {
        System.err.println("Could not listen on port " + portNumber);
        System.exit(-1);
    }

    protected Socket acceptAndDisplaySocket(ServerSocket serverSocket) throws IOException {
        Socket clientSocket = serverSocket.accept();
        displaySocketData(clientSocket);
        return clientSocket;
    }

    protected void displaySocketData(Socket clientSocket) {
        System.out.println("Client connected from: " + clientSocket.getInetAddress().getHostAddress() + ":"
                + clientSocket.getPort());
    }

    protected void displaySocketInformation(int portNumber) {
        System.out.println(this.getClass().getName() + " server listening on port: " + portNumber);
    }

    protected void checkArguments(String[] args) {
        if (args.length != 1) {
            displayUsage();
            System.exit(1);
        }
    }

    protected void displayUsage() {
        System.err.println("Usage: java"+this.getClass().getName() +"<port number>");
    }

    

    protected final void handleClient(Socket clientSocket) {

        try (
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream())
            );
        ) {
            this.conexionAbierta(clientSocket);

            String inputLine;

            while ((inputLine = this.leerMensaje(in)) != null) {
                this.mensajeRecibido(inputLine, clientSocket);

                if (this.finDeSesion(inputLine, clientSocket)) {
                    break;
                }

                this.antesDeProcesarMensaje(inputLine, clientSocket);

                this.handleMessage(inputLine, out);

                this.despuesDeProcesarMensaje(inputLine, clientSocket);
            }

            this.conexionCerrada(clientSocket);

        } catch (IOException e) {
            this.problemaDeComunicacion(e, clientSocket);

        } finally {
            this.cerrarConexion(clientSocket);
        }
    }
    

protected void conexionAbierta(Socket clientSocket) {
    System.out.println("Connection opened with "
            + clientSocket.getInetAddress().getHostAddress() + ":"
            + clientSocket.getPort());
}

protected String leerMensaje(BufferedReader in) throws IOException {
    return in.readLine();
}

protected void mensajeRecibido(String inputLine, Socket clientSocket) {
    System.out.println("Received message: " + inputLine + " from "
            + clientSocket.getInetAddress().getHostAddress() + ":"
            + clientSocket.getPort());
}

protected boolean finDeSesion(String inputLine, Socket clientSocket) {
    return inputLine.isEmpty();
}

protected void antesDeProcesarMensaje(String inputLine, Socket clientSocket) {
    // Hook opcional.
}

protected void despuesDeProcesarMensaje(String inputLine, Socket clientSocket) {
    // Hook opcional.
}

protected void conexionCerrada(Socket clientSocket) {
    System.out.println("Connection closed with "
            + clientSocket.getInetAddress().getHostAddress() + ":"
            + clientSocket.getPort());
}

protected void problemaDeComunicacion(IOException e, Socket clientSocket) {
    System.err.println("Problem with communication with client: " + e.getMessage());
}

protected void cerrarConexion(Socket clientSocket) {
    try {
        clientSocket.close();
    } catch (IOException e) {
        System.err.println("Error closing socket: " + e.getMessage());
    }
}
    
}
