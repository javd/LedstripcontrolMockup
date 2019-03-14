package sample;


public class Main {
    public static void main(String[] args) {
        ServerThread st = new ServerThread(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        st.start();


    }
}
