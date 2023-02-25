package net.rossonet.ptalk.nlu.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: ptalk-nlu-api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RpcNluCoreV1Grpc {

  private RpcNluCoreV1Grpc() {}

  public static final String SERVICE_NAME = "nlu.RpcNluCoreV1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluMessageReply,
      net.rossonet.ptalk.base.grpc.Status> getReplyCallAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReplyCallAsync",
      requestType = net.rossonet.ptalk.nlu.grpc.NluMessageReply.class,
      responseType = net.rossonet.ptalk.base.grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluMessageReply,
      net.rossonet.ptalk.base.grpc.Status> getReplyCallAsyncMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluMessageReply, net.rossonet.ptalk.base.grpc.Status> getReplyCallAsyncMethod;
    if ((getReplyCallAsyncMethod = RpcNluCoreV1Grpc.getReplyCallAsyncMethod) == null) {
      synchronized (RpcNluCoreV1Grpc.class) {
        if ((getReplyCallAsyncMethod = RpcNluCoreV1Grpc.getReplyCallAsyncMethod) == null) {
          RpcNluCoreV1Grpc.getReplyCallAsyncMethod = getReplyCallAsyncMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.nlu.grpc.NluMessageReply, net.rossonet.ptalk.base.grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReplyCallAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.nlu.grpc.NluMessageReply.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.base.grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new RpcNluCoreV1MethodDescriptorSupplier("ReplyCallAsync"))
              .build();
        }
      }
    }
    return getReplyCallAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply,
      net.rossonet.ptalk.base.grpc.Status> getReplyTrainingModelAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReplyTrainingModelAsync",
      requestType = net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply.class,
      responseType = net.rossonet.ptalk.base.grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply,
      net.rossonet.ptalk.base.grpc.Status> getReplyTrainingModelAsyncMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply, net.rossonet.ptalk.base.grpc.Status> getReplyTrainingModelAsyncMethod;
    if ((getReplyTrainingModelAsyncMethod = RpcNluCoreV1Grpc.getReplyTrainingModelAsyncMethod) == null) {
      synchronized (RpcNluCoreV1Grpc.class) {
        if ((getReplyTrainingModelAsyncMethod = RpcNluCoreV1Grpc.getReplyTrainingModelAsyncMethod) == null) {
          RpcNluCoreV1Grpc.getReplyTrainingModelAsyncMethod = getReplyTrainingModelAsyncMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply, net.rossonet.ptalk.base.grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReplyTrainingModelAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.base.grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new RpcNluCoreV1MethodDescriptorSupplier("ReplyTrainingModelAsync"))
              .build();
        }
      }
    }
    return getReplyTrainingModelAsyncMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcNluCoreV1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcNluCoreV1Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcNluCoreV1Stub>() {
        @java.lang.Override
        public RpcNluCoreV1Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcNluCoreV1Stub(channel, callOptions);
        }
      };
    return RpcNluCoreV1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcNluCoreV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcNluCoreV1BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcNluCoreV1BlockingStub>() {
        @java.lang.Override
        public RpcNluCoreV1BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcNluCoreV1BlockingStub(channel, callOptions);
        }
      };
    return RpcNluCoreV1BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcNluCoreV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcNluCoreV1FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcNluCoreV1FutureStub>() {
        @java.lang.Override
        public RpcNluCoreV1FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcNluCoreV1FutureStub(channel, callOptions);
        }
      };
    return RpcNluCoreV1FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RpcNluCoreV1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void replyCallAsync(net.rossonet.ptalk.nlu.grpc.NluMessageReply request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReplyCallAsyncMethod(), responseObserver);
    }

    /**
     */
    public void replyTrainingModelAsync(net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReplyTrainingModelAsyncMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReplyCallAsyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.nlu.grpc.NluMessageReply,
                net.rossonet.ptalk.base.grpc.Status>(
                  this, METHODID_REPLY_CALL_ASYNC)))
          .addMethod(
            getReplyTrainingModelAsyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply,
                net.rossonet.ptalk.base.grpc.Status>(
                  this, METHODID_REPLY_TRAINING_MODEL_ASYNC)))
          .build();
    }
  }

  /**
   */
  public static final class RpcNluCoreV1Stub extends io.grpc.stub.AbstractAsyncStub<RpcNluCoreV1Stub> {
    private RpcNluCoreV1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcNluCoreV1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcNluCoreV1Stub(channel, callOptions);
    }

    /**
     */
    public void replyCallAsync(net.rossonet.ptalk.nlu.grpc.NluMessageReply request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReplyCallAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void replyTrainingModelAsync(net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReplyTrainingModelAsyncMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RpcNluCoreV1BlockingStub extends io.grpc.stub.AbstractBlockingStub<RpcNluCoreV1BlockingStub> {
    private RpcNluCoreV1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcNluCoreV1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcNluCoreV1BlockingStub(channel, callOptions);
    }

    /**
     */
    public net.rossonet.ptalk.base.grpc.Status replyCallAsync(net.rossonet.ptalk.nlu.grpc.NluMessageReply request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReplyCallAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.base.grpc.Status replyTrainingModelAsync(net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReplyTrainingModelAsyncMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RpcNluCoreV1FutureStub extends io.grpc.stub.AbstractFutureStub<RpcNluCoreV1FutureStub> {
    private RpcNluCoreV1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcNluCoreV1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcNluCoreV1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.base.grpc.Status> replyCallAsync(
        net.rossonet.ptalk.nlu.grpc.NluMessageReply request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReplyCallAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.base.grpc.Status> replyTrainingModelAsync(
        net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReplyTrainingModelAsyncMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REPLY_CALL_ASYNC = 0;
  private static final int METHODID_REPLY_TRAINING_MODEL_ASYNC = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RpcNluCoreV1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RpcNluCoreV1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REPLY_CALL_ASYNC:
          serviceImpl.replyCallAsync((net.rossonet.ptalk.nlu.grpc.NluMessageReply) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status>) responseObserver);
          break;
        case METHODID_REPLY_TRAINING_MODEL_ASYNC:
          serviceImpl.replyTrainingModelAsync((net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status>) responseObserver);
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

  private static abstract class RpcNluCoreV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcNluCoreV1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.rossonet.ptalk.nlu.grpc.PtalkNluApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcNluCoreV1");
    }
  }

  private static final class RpcNluCoreV1FileDescriptorSupplier
      extends RpcNluCoreV1BaseDescriptorSupplier {
    RpcNluCoreV1FileDescriptorSupplier() {}
  }

  private static final class RpcNluCoreV1MethodDescriptorSupplier
      extends RpcNluCoreV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RpcNluCoreV1MethodDescriptorSupplier(String methodName) {
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
      synchronized (RpcNluCoreV1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcNluCoreV1FileDescriptorSupplier())
              .addMethod(getReplyCallAsyncMethod())
              .addMethod(getReplyTrainingModelAsyncMethod())
              .build();
        }
      }
    }
    return result;
  }
}
