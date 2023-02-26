package net.rossonet.ptalk.base.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: ptalk-base-api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RpcSlaveUnitV1Grpc {

  private RpcSlaveUnitV1Grpc() {}

  public static final String SERVICE_NAME = "base.RpcSlaveUnitV1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.base.grpc.GenericMessageRequest,
      net.rossonet.ptalk.base.grpc.GenericMessageReply> getMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Message",
      requestType = net.rossonet.ptalk.base.grpc.GenericMessageRequest.class,
      responseType = net.rossonet.ptalk.base.grpc.GenericMessageReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.base.grpc.GenericMessageRequest,
      net.rossonet.ptalk.base.grpc.GenericMessageReply> getMessageMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.base.grpc.GenericMessageRequest, net.rossonet.ptalk.base.grpc.GenericMessageReply> getMessageMethod;
    if ((getMessageMethod = RpcSlaveUnitV1Grpc.getMessageMethod) == null) {
      synchronized (RpcSlaveUnitV1Grpc.class) {
        if ((getMessageMethod = RpcSlaveUnitV1Grpc.getMessageMethod) == null) {
          RpcSlaveUnitV1Grpc.getMessageMethod = getMessageMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.base.grpc.GenericMessageRequest, net.rossonet.ptalk.base.grpc.GenericMessageReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Message"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.base.grpc.GenericMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.base.grpc.GenericMessageReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcSlaveUnitV1MethodDescriptorSupplier("Message"))
              .build();
        }
      }
    }
    return getMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcSlaveUnitV1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcSlaveUnitV1Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcSlaveUnitV1Stub>() {
        @java.lang.Override
        public RpcSlaveUnitV1Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcSlaveUnitV1Stub(channel, callOptions);
        }
      };
    return RpcSlaveUnitV1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcSlaveUnitV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcSlaveUnitV1BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcSlaveUnitV1BlockingStub>() {
        @java.lang.Override
        public RpcSlaveUnitV1BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcSlaveUnitV1BlockingStub(channel, callOptions);
        }
      };
    return RpcSlaveUnitV1BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcSlaveUnitV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcSlaveUnitV1FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcSlaveUnitV1FutureStub>() {
        @java.lang.Override
        public RpcSlaveUnitV1FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcSlaveUnitV1FutureStub(channel, callOptions);
        }
      };
    return RpcSlaveUnitV1FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RpcSlaveUnitV1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void message(net.rossonet.ptalk.base.grpc.GenericMessageRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.GenericMessageReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.base.grpc.GenericMessageRequest,
                net.rossonet.ptalk.base.grpc.GenericMessageReply>(
                  this, METHODID_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class RpcSlaveUnitV1Stub extends io.grpc.stub.AbstractAsyncStub<RpcSlaveUnitV1Stub> {
    private RpcSlaveUnitV1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcSlaveUnitV1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcSlaveUnitV1Stub(channel, callOptions);
    }

    /**
     */
    public void message(net.rossonet.ptalk.base.grpc.GenericMessageRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.GenericMessageReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RpcSlaveUnitV1BlockingStub extends io.grpc.stub.AbstractBlockingStub<RpcSlaveUnitV1BlockingStub> {
    private RpcSlaveUnitV1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcSlaveUnitV1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcSlaveUnitV1BlockingStub(channel, callOptions);
    }

    /**
     */
    public net.rossonet.ptalk.base.grpc.GenericMessageReply message(net.rossonet.ptalk.base.grpc.GenericMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RpcSlaveUnitV1FutureStub extends io.grpc.stub.AbstractFutureStub<RpcSlaveUnitV1FutureStub> {
    private RpcSlaveUnitV1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcSlaveUnitV1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcSlaveUnitV1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.base.grpc.GenericMessageReply> message(
        net.rossonet.ptalk.base.grpc.GenericMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RpcSlaveUnitV1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RpcSlaveUnitV1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MESSAGE:
          serviceImpl.message((net.rossonet.ptalk.base.grpc.GenericMessageRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.GenericMessageReply>) responseObserver);
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

  private static abstract class RpcSlaveUnitV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcSlaveUnitV1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.rossonet.ptalk.base.grpc.PtalkBaseObject.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcSlaveUnitV1");
    }
  }

  private static final class RpcSlaveUnitV1FileDescriptorSupplier
      extends RpcSlaveUnitV1BaseDescriptorSupplier {
    RpcSlaveUnitV1FileDescriptorSupplier() {}
  }

  private static final class RpcSlaveUnitV1MethodDescriptorSupplier
      extends RpcSlaveUnitV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RpcSlaveUnitV1MethodDescriptorSupplier(String methodName) {
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
      synchronized (RpcSlaveUnitV1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcSlaveUnitV1FileDescriptorSupplier())
              .addMethod(getMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
