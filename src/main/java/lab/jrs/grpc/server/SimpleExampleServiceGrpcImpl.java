package lab.jrs.grpc.server;

import lab.jrs.grpc.simpleexample.Request;
import lab.jrs.grpc.simpleexample.Response;
import lab.jrs.grpc.simpleexample.SimpleExempleGrpc;
public class SimpleExampleServiceGrpcImpl extends SimpleExempleGrpc.SimpleExempleImplBase {

    @Override
    public void sum(Request request, io.grpc.stub.StreamObserver<Response> responseObserver) {
        double number1 = request.getNum1();
        double number2 = request.getNum2();

        double result = number1 + number2;

        String messageResult = "The sum between numbers "+number1+" and "+number2+" is "+result;

        Response response = Response
                .newBuilder()
                .setResult(messageResult)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
