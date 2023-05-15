package net.rossonet.ptalk.base.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: ptalk-base-api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RpcCoreV1Grpc {

  private RpcCoreV1Grpc() {}

  public static final String SERVICE_NAME = "base.RpcCoreV1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.base.grpc.RegisterRequest,
      net.rossonet.ptalk.base.grpc.RegisterReply> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = net.rossonet.ptalk.base.grpc.RegisterRequest.class,
      responseType = net.rossonet.ptalk.base.grpc.RegisterReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.base.grpc.RegisterRequest,
      net.rossonet.ptalk.base.grpc.RegisterReply> getRegisterMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.base.grpc.RegisterRequest, net.rossonet.ptalk.base.grpc.RegisterReply> getRegisterMethod;
    if ((getRegisterMethod = RpcCoreV1Grpc.getRegisterMethod) == null) {
      synchronized (RpcCoreV1Grpc.class) {
        if ((getRegisterMethod = RpcCoreV1Grpc.getRegisterMethod) == null) {
          RpcCoreV1Grpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.base.grpc.RegisterRequest, net.rossonet.ptalk.base.grpc.RegisterReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.base.grpc.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.base.grpc.RegisterReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcCoreV1MethodDescriptorSupplier("Register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.base.grpc.LogRequest,
      net.rossonet.ptalk.base.grpc.Status> getLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Log",
      requestType = net.rossonet.ptalk.base.grpc.LogRequest.class,
      responseType = net.rossonet.ptalk.base.grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.base.grpc.LogRequest,
      net.rossonet.ptalk.base.grpc.Status> getLogMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.base.grpc.LogRequest, net.rossonet.ptalk.base.grpc.Status> getLogMethod;
    if ((getLogMethod = RpcCoreV1Grpc.getLogMethod) == null) {
      synchronized (RpcCoreV1Grpc.class) {
        if ((getLogMethod = RpcCoreV1Grpc.getLogMethod) == null) {
          RpcCoreV1Grpc.getLogMethod = getLogMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.base.grpc.LogRequest, net.rossonet.ptalk.base.grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Log"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.base.grpc.LogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.base.grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new RpcCoreV1MethodDescriptorSupplier("Log"))
              .build();
        }
      }
    }
    return getLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.base.grpc.HealthRequest,
      net.rossonet.ptalk.base.grpc.Status> getHealthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Health",
      requestType = net.rossonet.ptalk.base.grpc.HealthRequest.class,
      responseType = net.rossonet.ptalk.base.grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.base.grpc.HealthRequest,
      net.rossonet.ptalk.base.grpc.Status> getHealthMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.base.grpc.HealthRequest, net.rossonet.ptalk.base.grpc.Status> getHealthMethod;
    if ((getHealthMethod = RpcCoreV1Grpc.getHealthMethod) == null) {
      synchronized (RpcCoreV1Grpc.class) {
        if ((getHealthMethod = RpcCoreV1Grpc.getHealthMethod) == null) {
          RpcCoreV1Grpc.getHealthMethod = getHealthMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.base.grpc.HealthRequest, net.rossonet.ptalk.base.grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Health"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.base.grpc.HealthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.base.grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new RpcCoreV1MethodDescriptorSupplier("Health"))
              .build();
        }
      }
    }
    return getHealthMethod;
  }

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
    if ((getMessageMethod = RpcCoreV1Grpc.getMessageMethod) == null) {
      synchronized (RpcCoreV1Grpc.class) {
        if ((getMessageMethod = RpcCoreV1Grpc.getMessageMethod) == null) {
          RpcCoreV1Grpc.getMessageMethod = getMessageMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.base.grpc.GenericMessageRequest, net.rossonet.ptalk.base.grpc.GenericMessageReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Message"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.base.grpc.GenericMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.base.grpc.GenericMessageReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcCoreV1MethodDescriptorSupplier("Message"))
              .build();
        }
      }
    }
    return getMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcCoreV1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcCoreV1Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcCoreV1Stub>() {
        @java.lang.Override
        public RpcCoreV1Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcCoreV1Stub(channel, callOptions);
        }
      };
    return RpcCoreV1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcCoreV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcCoreV1BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcCoreV1BlockingStub>() {
        @java.lang.Override
        public RpcCoreV1BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcCoreV1BlockingStub(channel, callOptions);
        }
      };
    return RpcCoreV1BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcCoreV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcCoreV1FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcCoreV1FutureStub>() {
        @java.lang.Override
        public RpcCoreV1FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcCoreV1FutureStub(channel, callOptions);
        }
      };
    return RpcCoreV1FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RpcCoreV1ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * register unit (ability, channel or nlu) to ptalk engine
     * </pre>
     */
    public void register(net.rossonet.ptalk.base.grpc.RegisterRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.RegisterReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     * <pre>
     * log from unit
     * </pre>
     */
    public void log(net.rossonet.ptalk.base.grpc.LogRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogMethod(), responseObserver);
    }

    /**
     * <pre>
     * health from unit
     * </pre>
     */
    public void health(net.rossonet.ptalk.base.grpc.HealthRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHealthMethod(), responseObserver);
    }

    /**
     * <pre>
     * generic message, not covered by the other RPCs
     * </pre>
     */
    public void message(net.rossonet.ptalk.base.grpc.GenericMessageRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.GenericMessageReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.base.grpc.RegisterRequest,
                net.rossonet.ptalk.base.grpc.RegisterReply>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getLogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.base.grpc.LogRequest,
                net.rossonet.ptalk.base.grpc.Status>(
                  this, METHODID_LOG)))
          .addMethod(
            getHealthMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.base.grpc.HealthRequest,
                net.rossonet.ptalk.base.grpc.Status>(
                  this, METHODID_HEALTH)))
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
  public static final class RpcCoreV1Stub extends io.grpc.stub.AbstractAsyncStub<RpcCoreV1Stub> {
    private RpcCoreV1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcCoreV1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcCoreV1Stub(channel, callOptions);
    }

    /**
     * <pre>
     * register unit (ability, channel or nlu) to ptalk engine
     * </pre>
     */
    public void register(net.rossonet.ptalk.base.grpc.RegisterRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.RegisterReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * log from unit
     * </pre>
     */
    public void log(net.rossonet.ptalk.base.grpc.LogRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * health from unit
     * </pre>
     */
    public void health(net.rossonet.ptalk.base.grpc.HealthRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHealthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * generic message, not covered by the other RPCs
     * </pre>
     */
    public void message(net.rossonet.ptalk.base.grpc.GenericMessageRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.GenericMessageReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RpcCoreV1BlockingStub extends io.grpc.stub.AbstractBlockingStub<RpcCoreV1BlockingStub> {
    private RpcCoreV1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcCoreV1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcCoreV1BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * register unit (ability, channel or nlu) to ptalk engine
     * </pre>
     */
    public net.rossonet.ptalk.base.grpc.RegisterReply register(net.rossonet.ptalk.base.grpc.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * log from unit
     * </pre>
     */
    public net.rossonet.ptalk.base.grpc.Status log(net.rossonet.ptalk.base.grpc.LogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * health from unit
     * </pre>
     */
    public net.rossonet.ptalk.base.grpc.Status health(net.rossonet.ptalk.base.grpc.HealthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHealthMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * generic message, not covered by the other RPCs
     * </pre>
     */
    public net.rossonet.ptalk.base.grpc.GenericMessageReply message(net.rossonet.ptalk.base.grpc.GenericMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RpcCoreV1FutureStub extends io.grpc.stub.AbstractFutureStub<RpcCoreV1FutureStub> {
    private RpcCoreV1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcCoreV1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcCoreV1FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * register unit (ability, channel or nlu) to ptalk engine
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.base.grpc.RegisterReply> register(
        net.rossonet.ptalk.base.grpc.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * log from unit
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.base.grpc.Status> log(
        net.rossonet.ptalk.base.grpc.LogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * health from unit
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.base.grpc.Status> health(
        net.rossonet.ptalk.base.grpc.HealthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHealthMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * generic message, not covered by the other RPCs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.base.grpc.GenericMessageReply> message(
        net.rossonet.ptalk.base.grpc.GenericMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_LOG = 1;
  private static final int METHODID_HEALTH = 2;
  private static final int METHODID_MESSAGE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RpcCoreV1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RpcCoreV1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((net.rossonet.ptalk.base.grpc.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.RegisterReply>) responseObserver);
          break;
        case METHODID_LOG:
          serviceImpl.log((net.rossonet.ptalk.base.grpc.LogRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status>) responseObserver);
          break;
        case METHODID_HEALTH:
          serviceImpl.health((net.rossonet.ptalk.base.grpc.HealthRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status>) responseObserver);
          break;
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

  private static abstract class RpcCoreV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcCoreV1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.rossonet.ptalk.base.grpc.PtalkBaseObject.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcCoreV1");
    }
  }

  private static final class RpcCoreV1FileDescriptorSupplier
      extends RpcCoreV1BaseDescriptorSupplier {
    RpcCoreV1FileDescriptorSupplier() {}
  }

  private static final class RpcCoreV1MethodDescriptorSupplier
      extends RpcCoreV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RpcCoreV1MethodDescriptorSupplier(String methodName) {
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
      synchronized (RpcCoreV1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcCoreV1FileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getLogMethod())
              .addMethod(getHealthMethod())
              .addMethod(getMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
