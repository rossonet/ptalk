package net.rossonet.ptalk.ability.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: ptalk-ability-api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RpcAbilityUnitV1Grpc {

  private RpcAbilityUnitV1Grpc() {}

  public static final String SERVICE_NAME = "ability.RpcAbilityUnitV1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.AbilityMessageRequest,
      net.rossonet.ptalk.ability.grpc.AbilityMessageReply> getCallSyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallSync",
      requestType = net.rossonet.ptalk.ability.grpc.AbilityMessageRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.AbilityMessageReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.AbilityMessageRequest,
      net.rossonet.ptalk.ability.grpc.AbilityMessageReply> getCallSyncMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.AbilityMessageRequest, net.rossonet.ptalk.ability.grpc.AbilityMessageReply> getCallSyncMethod;
    if ((getCallSyncMethod = RpcAbilityUnitV1Grpc.getCallSyncMethod) == null) {
      synchronized (RpcAbilityUnitV1Grpc.class) {
        if ((getCallSyncMethod = RpcAbilityUnitV1Grpc.getCallSyncMethod) == null) {
          RpcAbilityUnitV1Grpc.getCallSyncMethod = getCallSyncMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.AbilityMessageRequest, net.rossonet.ptalk.ability.grpc.AbilityMessageReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallSync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.AbilityMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.AbilityMessageReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcAbilityUnitV1MethodDescriptorSupplier("CallSync"))
              .build();
        }
      }
    }
    return getCallSyncMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcAbilityUnitV1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcAbilityUnitV1Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcAbilityUnitV1Stub>() {
        @java.lang.Override
        public RpcAbilityUnitV1Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcAbilityUnitV1Stub(channel, callOptions);
        }
      };
    return RpcAbilityUnitV1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcAbilityUnitV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcAbilityUnitV1BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcAbilityUnitV1BlockingStub>() {
        @java.lang.Override
        public RpcAbilityUnitV1BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcAbilityUnitV1BlockingStub(channel, callOptions);
        }
      };
    return RpcAbilityUnitV1BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcAbilityUnitV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcAbilityUnitV1FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcAbilityUnitV1FutureStub>() {
        @java.lang.Override
        public RpcAbilityUnitV1FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcAbilityUnitV1FutureStub(channel, callOptions);
        }
      };
    return RpcAbilityUnitV1FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RpcAbilityUnitV1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void callSync(net.rossonet.ptalk.ability.grpc.AbilityMessageRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.AbilityMessageReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallSyncMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCallSyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.AbilityMessageRequest,
                net.rossonet.ptalk.ability.grpc.AbilityMessageReply>(
                  this, METHODID_CALL_SYNC)))
          .build();
    }
  }

  /**
   */
  public static final class RpcAbilityUnitV1Stub extends io.grpc.stub.AbstractAsyncStub<RpcAbilityUnitV1Stub> {
    private RpcAbilityUnitV1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcAbilityUnitV1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcAbilityUnitV1Stub(channel, callOptions);
    }

    /**
     */
    public void callSync(net.rossonet.ptalk.ability.grpc.AbilityMessageRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.AbilityMessageReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallSyncMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RpcAbilityUnitV1BlockingStub extends io.grpc.stub.AbstractBlockingStub<RpcAbilityUnitV1BlockingStub> {
    private RpcAbilityUnitV1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcAbilityUnitV1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcAbilityUnitV1BlockingStub(channel, callOptions);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.AbilityMessageReply callSync(net.rossonet.ptalk.ability.grpc.AbilityMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallSyncMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RpcAbilityUnitV1FutureStub extends io.grpc.stub.AbstractFutureStub<RpcAbilityUnitV1FutureStub> {
    private RpcAbilityUnitV1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcAbilityUnitV1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcAbilityUnitV1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.AbilityMessageReply> callSync(
        net.rossonet.ptalk.ability.grpc.AbilityMessageRequest request) {
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
    private final RpcAbilityUnitV1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RpcAbilityUnitV1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALL_SYNC:
          serviceImpl.callSync((net.rossonet.ptalk.ability.grpc.AbilityMessageRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.AbilityMessageReply>) responseObserver);
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

  private static abstract class RpcAbilityUnitV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcAbilityUnitV1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.rossonet.ptalk.ability.grpc.PtaskAbilityApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcAbilityUnitV1");
    }
  }

  private static final class RpcAbilityUnitV1FileDescriptorSupplier
      extends RpcAbilityUnitV1BaseDescriptorSupplier {
    RpcAbilityUnitV1FileDescriptorSupplier() {}
  }

  private static final class RpcAbilityUnitV1MethodDescriptorSupplier
      extends RpcAbilityUnitV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RpcAbilityUnitV1MethodDescriptorSupplier(String methodName) {
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
      synchronized (RpcAbilityUnitV1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcAbilityUnitV1FileDescriptorSupplier())
              .addMethod(getCallSyncMethod())
              .build();
        }
      }
    }
    return result;
  }
}
