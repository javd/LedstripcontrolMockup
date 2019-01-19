package sample;

// A Java program for a Client

import java.net.*;
import java.io.*;

public class Client {
    // initialize socket and input output streams
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

    // constructor to put ip address and port
    public Client(int port) {
        // establish a connection
        try {
            socket = new Socket("127.0.0.1", port);
            System.out.println("Connected");

            // takes input from terminal
            input = new DataInputStream(System.in);

            // sends output to the socket
            out = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException u) {
            System.out.println(u);
        } catch (IOException i) {
            System.out.println(i);
        }

    }


    public void writeOut(String string) {
        try {
            out.writeUTF(string);
        } catch (IOException e1) {

        }
    }
}