package lab.jrs.grpc.simpleexample;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: simple_example.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SimpleExempleGrpc {

  private SimpleExempleGrpc() {}

  public static final java.lang.String SERVICE_NAME = "simpleexample.SimpleExemple";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<lab.jrs.grpc.simpleexample.Request,
      lab.jrs.grpc.simpleexample.Response> getSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sum",
      requestType = lab.jrs.grpc.simpleexample.Request.class,
      responseType = lab.jrs.grpc.simpleexample.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab.jrs.grpc.simpleexample.Request,
      lab.jrs.grpc.simpleexample.Response> getSumMethod() {
    io.grpc.MethodDescriptor<lab.jrs.grpc.simpleexample.Request, lab.jrs.grpc.simpleexample.Response> getSumMethod;
    if ((getSumMethod = SimpleExempleGrpc.getSumMethod) == null) {
      synchronized (SimpleExempleGrpc.class) {
        if ((getSumMethod = SimpleExempleGrpc.getSumMethod) == null) {
          SimpleExempleGrpc.getSumMethod = getSumMethod =
              io.grpc.MethodDescriptor.<lab.jrs.grpc.simpleexample.Request, lab.jrs.grpc.simpleexample.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jrs.grpc.simpleexample.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jrs.grpc.simpleexample.Response.getDefaultInstance()))
              .setSchemaDescriptor(new SimpleExempleMethodDescriptorSupplier("sum"))
              .build();
        }
      }
    }
    return getSumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SimpleExempleStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimpleExempleStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimpleExempleStub>() {
        @java.lang.Override
        public SimpleExempleStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimpleExempleStub(channel, callOptions);
        }
      };
    return SimpleExempleStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SimpleExempleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimpleExempleBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimpleExempleBlockingStub>() {
        @java.lang.Override
        public SimpleExempleBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimpleExempleBlockingStub(channel, callOptions);
        }
      };
    return SimpleExempleBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SimpleExempleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimpleExempleFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimpleExempleFutureStub>() {
        @java.lang.Override
        public SimpleExempleFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimpleExempleFutureStub(channel, callOptions);
        }
      };
    return SimpleExempleFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sum(lab.jrs.grpc.simpleexample.Request request,
        io.grpc.stub.StreamObserver<lab.jrs.grpc.simpleexample.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSumMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SimpleExemple.
   */
  public static abstract class SimpleExempleImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SimpleExempleGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SimpleExemple.
   */
  public static final class SimpleExempleStub
      extends io.grpc.stub.AbstractAsyncStub<SimpleExempleStub> {
    private SimpleExempleStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleExempleStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimpleExempleStub(channel, callOptions);
    }

    /**
     */
    public void sum(lab.jrs.grpc.simpleexample.Request request,
        io.grpc.stub.StreamObserver<lab.jrs.grpc.simpleexample.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SimpleExemple.
   */
  public static final class SimpleExempleBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SimpleExempleBlockingStub> {
    private SimpleExempleBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleExempleBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimpleExempleBlockingStub(channel, callOptions);
    }

    /**
     */
    public lab.jrs.grpc.simpleexample.Response sum(lab.jrs.grpc.simpleexample.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSumMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SimpleExemple.
   */
  public static final class SimpleExempleFutureStub
      extends io.grpc.stub.AbstractFutureStub<SimpleExempleFutureStub> {
    private SimpleExempleFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleExempleFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimpleExempleFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lab.jrs.grpc.simpleexample.Response> sum(
        lab.jrs.grpc.simpleexample.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM:
          serviceImpl.sum((lab.jrs.grpc.simpleexample.Request) request,
              (io.grpc.stub.StreamObserver<lab.jrs.grpc.simpleexample.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              lab.jrs.grpc.simpleexample.Request,
              lab.jrs.grpc.simpleexample.Response>(
                service, METHODID_SUM)))
        .build();
  }

  private static abstract class SimpleExempleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SimpleExempleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lab.jrs.grpc.simpleexample.SimpleExempleProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SimpleExemple");
    }
  }

  private static final class SimpleExempleFileDescriptorSupplier
      extends SimpleExempleBaseDescriptorSupplier {
    SimpleExempleFileDescriptorSupplier() {}
  }

  private static final class SimpleExempleMethodDescriptorSupplier
      extends SimpleExempleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SimpleExempleMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SimpleExempleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SimpleExempleFileDescriptorSupplier())
              .addMethod(getSumMethod())
              .build();
        }
      }
    }
    return result;
  }
}
