package sample;

import java.awt.*;
import java.io.DataInputStream;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ClientThread extends Thread {

    Client client=null;

    public void run()
    {

        try
            {
                System.out.println("Creating Client...");
                client = new Client(1919);
                System.out.println("Client created");


            }
        catch (Exception e)
            {
                // Throwing an exception
            System.out.println ("Exception is caught");
        }


    }



    public void Turf() {
        client.writeOut("Turf");
    }

    public void Spies() {
        client.writeOut("Spies");
    }



}
