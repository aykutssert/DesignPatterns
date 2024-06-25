package Adapter;

public class Main {
    public static void main(String[] args) {
        AmericanSocket americanSocket = new AmericanSocket();
        EuroSocket euroSocket = new SocketAdapter(americanSocket);

        euroSocket.provideElectricity();
    }
}
