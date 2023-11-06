package lab.jrs.grpc.server;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lab.jrs.grpc.simpleexample.Request;
import lab.jrs.grpc.simpleexample.Response;
import lab.jrs.grpc.simpleexample.SimpleExempleGrpc;

import java.util.Scanner;

public class SimpleExampleClient {

    private int port;

    public SimpleExampleClient(int port){
        this.port = port;
    }

    public void sendNumbers(double number1, double number2){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", this.port)
                .usePlaintext()
                .build();
        SimpleExempleGrpc.SimpleExempleBlockingStub stub = SimpleExempleGrpc.newBlockingStub(channel);

        Response response = stub.sum(Request
                .newBuilder()
                .setNum1(number1)
                .setNum2(number2)
                .build()
        );

        System.out.println("Resultado");
        System.out.println(response.getResult());
    }

    public static void main(String[] args) {
        SimpleExampleClient simpleExempleClient = new SimpleExampleClient(8080);

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
            simpleExempleClient.sendNumbers(number1, number2);

        }
    }
}
