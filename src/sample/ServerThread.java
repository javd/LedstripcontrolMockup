package sample;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ServerThread extends Thread {

    private final int redLed;
    private final int greenLed;
    private final int blueLed;

    public ServerThread(int redLed, int greenLed, int blueLed) {
        this.redLed = redLed;
        this.greenLed = greenLed;
        this.blueLed = blueLed;
    }


    public void run()
    {
        Server server=null;
        try
        {
            server = new Server(1919);


        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }

        while(true) {
            String action = server.getLine();
            if("Turf".equals(action))
                Turf();
            if("Spies".equals(action))
                Spies();

        }
    }

    public Color getRandomColor() {
        Random r = new Random();
        float H= r.nextFloat();
        float S=0.99f;
        float B=0.99f;
        Color color = new Color(Color.HSBtoRGB(H,S,B));
        return color;
    }

    public void Turf() {
        Color color = getRandomColor();
        try {

        } catch (Exception e) {
        }
    }

    public void Spies() {
        int length= 30;
        for(int i=0; i<length; i++) {
            Turf();
            try {
                TimeUnit.MILLISECONDS.sleep(5000/length);
            }
            catch (InterruptedException e1) {}
        }
    }



}
