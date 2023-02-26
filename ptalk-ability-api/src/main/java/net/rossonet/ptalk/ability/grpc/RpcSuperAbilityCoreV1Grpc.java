package net.rossonet.ptalk.ability.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: ptalk-ability-api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RpcSuperAbilityCoreV1Grpc {

  private RpcSuperAbilityCoreV1Grpc() {}

  public static final String SERVICE_NAME = "ability.RpcSuperAbilityCoreV1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.PushConfigurationRequest,
      net.rossonet.ptalk.ability.grpc.PushConfigurationReply> getPushConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PushConfiguration",
      requestType = net.rossonet.ptalk.ability.grpc.PushConfigurationRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.PushConfigurationReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.PushConfigurationRequest,
      net.rossonet.ptalk.ability.grpc.PushConfigurationReply> getPushConfigurationMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.PushConfigurationRequest, net.rossonet.ptalk.ability.grpc.PushConfigurationReply> getPushConfigurationMethod;
    if ((getPushConfigurationMethod = RpcSuperAbilityCoreV1Grpc.getPushConfigurationMethod) == null) {
      synchronized (RpcSuperAbilityCoreV1Grpc.class) {
        if ((getPushConfigurationMethod = RpcSuperAbilityCoreV1Grpc.getPushConfigurationMethod) == null) {
          RpcSuperAbilityCoreV1Grpc.getPushConfigurationMethod = getPushConfigurationMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.PushConfigurationRequest, net.rossonet.ptalk.ability.grpc.PushConfigurationReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PushConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.PushConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.PushConfigurationReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcSuperAbilityCoreV1MethodDescriptorSupplier("PushConfiguration"))
              .build();
        }
      }
    }
    return getPushConfigurationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcSuperAbilityCoreV1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcSuperAbilityCoreV1Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcSuperAbilityCoreV1Stub>() {
        @java.lang.Override
        public RpcSuperAbilityCoreV1Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcSuperAbilityCoreV1Stub(channel, callOptions);
        }
      };
    return RpcSuperAbilityCoreV1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcSuperAbilityCoreV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcSuperAbilityCoreV1BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcSuperAbilityCoreV1BlockingStub>() {
        @java.lang.Override
        public RpcSuperAbilityCoreV1BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcSuperAbilityCoreV1BlockingStub(channel, callOptions);
        }
      };
    return RpcSuperAbilityCoreV1BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcSuperAbilityCoreV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcSuperAbilityCoreV1FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcSuperAbilityCoreV1FutureStub>() {
        @java.lang.Override
        public RpcSuperAbilityCoreV1FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcSuperAbilityCoreV1FutureStub(channel, callOptions);
        }
      };
    return RpcSuperAbilityCoreV1FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RpcSuperAbilityCoreV1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void pushConfiguration(net.rossonet.ptalk.ability.grpc.PushConfigurationRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.PushConfigurationReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPushConfigurationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPushConfigurationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.PushConfigurationRequest,
                net.rossonet.ptalk.ability.grpc.PushConfigurationReply>(
                  this, METHODID_PUSH_CONFIGURATION)))
          .build();
    }
  }

  /**
   */
  public static final class RpcSuperAbilityCoreV1Stub extends io.grpc.stub.AbstractAsyncStub<RpcSuperAbilityCoreV1Stub> {
    private RpcSuperAbilityCoreV1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcSuperAbilityCoreV1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcSuperAbilityCoreV1Stub(channel, callOptions);
    }

    /**
     */
    public void pushConfiguration(net.rossonet.ptalk.ability.grpc.PushConfigurationRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.PushConfigurationReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPushConfigurationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RpcSuperAbilityCoreV1BlockingStub extends io.grpc.stub.AbstractBlockingStub<RpcSuperAbilityCoreV1BlockingStub> {
    private RpcSuperAbilityCoreV1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcSuperAbilityCoreV1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcSuperAbilityCoreV1BlockingStub(channel, callOptions);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.PushConfigurationReply pushConfiguration(net.rossonet.ptalk.ability.grpc.PushConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPushConfigurationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RpcSuperAbilityCoreV1FutureStub extends io.grpc.stub.AbstractFutureStub<RpcSuperAbilityCoreV1FutureStub> {
    private RpcSuperAbilityCoreV1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcSuperAbilityCoreV1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcSuperAbilityCoreV1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.PushConfigurationReply> pushConfiguration(
        net.rossonet.ptalk.ability.grpc.PushConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPushConfigurationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUSH_CONFIGURATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RpcSuperAbilityCoreV1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RpcSuperAbilityCoreV1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUSH_CONFIGURATION:
          serviceImpl.pushConfiguration((net.rossonet.ptalk.ability.grpc.PushConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.PushConfigurationReply>) responseObserver);
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

  private static abstract class RpcSuperAbilityCoreV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcSuperAbilityCoreV1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.rossonet.ptalk.ability.grpc.PtaskAbilityApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcSuperAbilityCoreV1");
    }
  }

  private static final class RpcSuperAbilityCoreV1FileDescriptorSupplier
      extends RpcSuperAbilityCoreV1BaseDescriptorSupplier {
    RpcSuperAbilityCoreV1FileDescriptorSupplier() {}
  }

  private static final class RpcSuperAbilityCoreV1MethodDescriptorSupplier
      extends RpcSuperAbilityCoreV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RpcSuperAbilityCoreV1MethodDescriptorSupplier(String methodName) {
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
      synchronized (RpcSuperAbilityCoreV1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcSuperAbilityCoreV1FileDescriptorSupplier())
              .addMethod(getPushConfigurationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
