package sample;

public class ClientThread extends Thread {

    Client client=null;
    String ip;

    public ClientThread(String ip) {
        this.ip = ip;
    }

    public void run()
    {

        try
            {
                System.out.println("Creating Client...");
                client = new Client(1919, ip);
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
