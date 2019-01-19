package sample;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ServerThread extends Thread {


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

    public String getRandomColor() {
        Random r = new Random();
        float H= r.nextFloat();
        float S=0.99f;
        float B=0.99f;
        Color color = new Color(Color.HSBtoRGB(H,S,B));
        String hex =  String.format("%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
        return hex;
    }

    public void Turf() {
        String color = getRandomColor();
        Main.root.setStyle("-fx-background-color: #" + color);
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
