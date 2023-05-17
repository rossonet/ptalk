package net.rossonet.ptalk.channel.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: ptalk-channel-api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RpcChannelUnitV1Grpc {

  private RpcChannelUnitV1Grpc() {}

  public static final String SERVICE_NAME = "channel.RpcChannelUnitV1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.grpc.ChannelMessageRequest,
      net.rossonet.ptalk.channel.grpc.ChannelMessageReply> getCallSyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallSync",
      requestType = net.rossonet.ptalk.channel.grpc.ChannelMessageRequest.class,
      responseType = net.rossonet.ptalk.channel.grpc.ChannelMessageReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.grpc.ChannelMessageRequest,
      net.rossonet.ptalk.channel.grpc.ChannelMessageReply> getCallSyncMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.grpc.ChannelMessageRequest, net.rossonet.ptalk.channel.grpc.ChannelMessageReply> getCallSyncMethod;
    if ((getCallSyncMethod = RpcChannelUnitV1Grpc.getCallSyncMethod) == null) {
      synchronized (RpcChannelUnitV1Grpc.class) {
        if ((getCallSyncMethod = RpcChannelUnitV1Grpc.getCallSyncMethod) == null) {
          RpcChannelUnitV1Grpc.getCallSyncMethod = getCallSyncMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.grpc.ChannelMessageRequest, net.rossonet.ptalk.channel.grpc.ChannelMessageReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallSync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.grpc.ChannelMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.grpc.ChannelMessageReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcChannelUnitV1MethodDescriptorSupplier("CallSync"))
              .build();
        }
      }
    }
    return getCallSyncMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcChannelUnitV1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcChannelUnitV1Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcChannelUnitV1Stub>() {
        @java.lang.Override
        public RpcChannelUnitV1Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcChannelUnitV1Stub(channel, callOptions);
        }
      };
    return RpcChannelUnitV1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcChannelUnitV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcChannelUnitV1BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcChannelUnitV1BlockingStub>() {
        @java.lang.Override
        public RpcChannelUnitV1BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcChannelUnitV1BlockingStub(channel, callOptions);
        }
      };
    return RpcChannelUnitV1BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcChannelUnitV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcChannelUnitV1FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcChannelUnitV1FutureStub>() {
        @java.lang.Override
        public RpcChannelUnitV1FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcChannelUnitV1FutureStub(channel, callOptions);
        }
      };
    return RpcChannelUnitV1FutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void callSync(net.rossonet.ptalk.channel.grpc.ChannelMessageRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.grpc.ChannelMessageReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallSyncMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RpcChannelUnitV1.
   */
  public static abstract class RpcChannelUnitV1ImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RpcChannelUnitV1Grpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RpcChannelUnitV1.
   */
  public static final class RpcChannelUnitV1Stub
      extends io.grpc.stub.AbstractAsyncStub<RpcChannelUnitV1Stub> {
    private RpcChannelUnitV1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcChannelUnitV1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcChannelUnitV1Stub(channel, callOptions);
    }

    /**
     */
    public void callSync(net.rossonet.ptalk.channel.grpc.ChannelMessageRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.grpc.ChannelMessageReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallSyncMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RpcChannelUnitV1.
   */
  public static final class RpcChannelUnitV1BlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RpcChannelUnitV1BlockingStub> {
    private RpcChannelUnitV1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcChannelUnitV1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcChannelUnitV1BlockingStub(channel, callOptions);
    }

    /**
     */
    public net.rossonet.ptalk.channel.grpc.ChannelMessageReply callSync(net.rossonet.ptalk.channel.grpc.ChannelMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallSyncMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RpcChannelUnitV1.
   */
  public static final class RpcChannelUnitV1FutureStub
      extends io.grpc.stub.AbstractFutureStub<RpcChannelUnitV1FutureStub> {
    private RpcChannelUnitV1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcChannelUnitV1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcChannelUnitV1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.grpc.ChannelMessageReply> callSync(
        net.rossonet.ptalk.channel.grpc.ChannelMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallSyncMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALL_SYNC = 0;

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
        case METHODID_CALL_SYNC:
          serviceImpl.callSync((net.rossonet.ptalk.channel.grpc.ChannelMessageRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.grpc.ChannelMessageReply>) responseObserver);
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
          getCallSyncMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              net.rossonet.ptalk.channel.grpc.ChannelMessageRequest,
              net.rossonet.ptalk.channel.grpc.ChannelMessageReply>(
                service, METHODID_CALL_SYNC)))
        .build();
  }

  private static abstract class RpcChannelUnitV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcChannelUnitV1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.rossonet.ptalk.channel.grpc.PtaskChannelApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcChannelUnitV1");
    }
  }

  private static final class RpcChannelUnitV1FileDescriptorSupplier
      extends RpcChannelUnitV1BaseDescriptorSupplier {
    RpcChannelUnitV1FileDescriptorSupplier() {}
  }

  private static final class RpcChannelUnitV1MethodDescriptorSupplier
      extends RpcChannelUnitV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RpcChannelUnitV1MethodDescriptorSupplier(String methodName) {
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
      synchronized (RpcChannelUnitV1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcChannelUnitV1FileDescriptorSupplier())
              .addMethod(getCallSyncMethod())
              .build();
        }
      }
    }
    return result;
  }
}
