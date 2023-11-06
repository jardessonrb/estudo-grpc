package lab.jrs;

import lab.jrs.grpc.server.SimpleExempleClient;
import lab.jrs.grpc.server.SimpleExempleServer;

import java.util.Scanner;

class RunServerThread extends Thread {
    private final int port;
    private SimpleExempleServer server;

    public RunServerThread(int port){
        this.port = port;
        this.server = new SimpleExempleServer(this.port);
    }

    @Override
    public void run() {
        this.server.createServer();
    }

    @Override
    public void interrupt() {
        this.server.destroyServer();
        super.interrupt();
    }
}

public class App
{
    public static void main( String[] args )
    {
        int port = 8080;
        SimpleExempleClient client = new SimpleExempleClient(port);
        RunServerThread runServerThread = new RunServerThread(port);

        runServerThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Digite o primeiro numero: ");
            double number1 = Double.parseDouble(input.nextLine());

            System.out.println("Digite o segundo numero: ");
            double number2 = Double.parseDouble(input.nextLine());

            if(number1 == 0 && number2 == 0){
                System.out.println("Fim da execução ...");
                break;
            }
            client.sendNumbers(number1, number2);
        }

        runServerThread.interrupt();

    }
}
