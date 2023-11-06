package lab.jrs.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class SimpleExampleServer {
    private int port;
    private Server server;
    public SimpleExampleServer(int port){
        this.port = port;
        this.server = ServerBuilder
                .forPort(this.port)
                .addService(new SimpleExampleServiceGrpcImpl())
                .build();
    }

    public void createServer(){

        try{
            System.out.println("Servidor rodando na porta "+this.port);
            this.server.start();
//            this.server.awaitTermination();
        } catch (Exception exception){
            exception.printStackTrace();
            System.out.println("Falha no servidor");
        }

    }

    public void destroyServer(){
        if(!this.server.isShutdown()){
            this.server.shutdown();
            System.out.println("Server stopped");
        }
    }

    public static void main(String[] args) {
        SimpleExampleServer simpleExempleServer = new SimpleExampleServer(8080);
        simpleExempleServer.createServer();
    }
}
