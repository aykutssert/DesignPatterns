package Adapter;

public class SocketAdapter implements EuroSocket {
    private AmericanSocket americanSocket;

    public SocketAdapter(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    @Override
    public void provideElectricity() {
        americanSocket.providePower();
    }
}
