package net.rossonet.ptalk.channel.protobuf.server.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: ptalk-channel-grpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RpcChannelGrpcClientV1Grpc {

  private RpcChannelGrpcClientV1Grpc() {}

  public static final String SERVICE_NAME = "channelGrpc.RpcChannelGrpcClientV1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply> getCallSyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallSync",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply> getCallSyncMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply> getCallSyncMethod;
    if ((getCallSyncMethod = RpcChannelGrpcClientV1Grpc.getCallSyncMethod) == null) {
      synchronized (RpcChannelGrpcClientV1Grpc.class) {
        if ((getCallSyncMethod = RpcChannelGrpcClientV1Grpc.getCallSyncMethod) == null) {
          RpcChannelGrpcClientV1Grpc.getCallSyncMethod = getCallSyncMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallSync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcChannelGrpcClientV1MethodDescriptorSupplier("CallSync"))
              .build();
        }
      }
    }
    return getCallSyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getCallAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallAsync",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getCallAsyncMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getCallAsyncMethod;
    if ((getCallAsyncMethod = RpcChannelGrpcClientV1Grpc.getCallAsyncMethod) == null) {
      synchronized (RpcChannelGrpcClientV1Grpc.class) {
        if ((getCallAsyncMethod = RpcChannelGrpcClientV1Grpc.getCallAsyncMethod) == null) {
          RpcChannelGrpcClientV1Grpc.getCallAsyncMethod = getCallAsyncMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new RpcChannelGrpcClientV1MethodDescriptorSupplier("CallAsync"))
              .build();
        }
      }
    }
    return getCallAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply,
      net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getReplyCallAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReplyCallAsync",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply,
      net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getReplyCallAsyncMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply, net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getReplyCallAsyncMethod;
    if ((getReplyCallAsyncMethod = RpcChannelGrpcClientV1Grpc.getReplyCallAsyncMethod) == null) {
      synchronized (RpcChannelGrpcClientV1Grpc.class) {
        if ((getReplyCallAsyncMethod = RpcChannelGrpcClientV1Grpc.getReplyCallAsyncMethod) == null) {
          RpcChannelGrpcClientV1Grpc.getReplyCallAsyncMethod = getReplyCallAsyncMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply, net.rossonet.ptalk.channel.protobuf.server.grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReplyCallAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new RpcChannelGrpcClientV1MethodDescriptorSupplier("ReplyCallAsync"))
              .build();
        }
      }
    }
    return getReplyCallAsyncMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcChannelGrpcClientV1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcChannelGrpcClientV1Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcChannelGrpcClientV1Stub>() {
        @java.lang.Override
        public RpcChannelGrpcClientV1Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcChannelGrpcClientV1Stub(channel, callOptions);
        }
      };
    return RpcChannelGrpcClientV1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcChannelGrpcClientV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcChannelGrpcClientV1BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcChannelGrpcClientV1BlockingStub>() {
        @java.lang.Override
        public RpcChannelGrpcClientV1BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcChannelGrpcClientV1BlockingStub(channel, callOptions);
        }
      };
    return RpcChannelGrpcClientV1BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcChannelGrpcClientV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcChannelGrpcClientV1FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcChannelGrpcClientV1FutureStub>() {
        @java.lang.Override
        public RpcChannelGrpcClientV1FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcChannelGrpcClientV1FutureStub(channel, callOptions);
        }
      };
    return RpcChannelGrpcClientV1FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RpcChannelGrpcClientV1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void callSync(net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallSyncMethod(), responseObserver);
    }

    /**
     */
    public void callAsync(net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallAsyncMethod(), responseObserver);
    }

    /**
     */
    public void replyCallAsync(net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReplyCallAsyncMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCallSyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest,
                net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply>(
                  this, METHODID_CALL_SYNC)))
          .addMethod(
            getCallAsyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest,
                net.rossonet.ptalk.channel.protobuf.server.grpc.Status>(
                  this, METHODID_CALL_ASYNC)))
          .addMethod(
            getReplyCallAsyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply,
                net.rossonet.ptalk.channel.protobuf.server.grpc.Status>(
                  this, METHODID_REPLY_CALL_ASYNC)))
          .build();
    }
  }

  /**
   */
  public static final class RpcChannelGrpcClientV1Stub extends io.grpc.stub.AbstractAsyncStub<RpcChannelGrpcClientV1Stub> {
    private RpcChannelGrpcClientV1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcChannelGrpcClientV1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcChannelGrpcClientV1Stub(channel, callOptions);
    }

    /**
     */
    public void callSync(net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallSyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callAsync(net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void replyCallAsync(net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReplyCallAsyncMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RpcChannelGrpcClientV1BlockingStub extends io.grpc.stub.AbstractBlockingStub<RpcChannelGrpcClientV1BlockingStub> {
    private RpcChannelGrpcClientV1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcChannelGrpcClientV1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcChannelGrpcClientV1BlockingStub(channel, callOptions);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply callSync(net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallSyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Status callAsync(net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Status replyCallAsync(net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReplyCallAsyncMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RpcChannelGrpcClientV1FutureStub extends io.grpc.stub.AbstractFutureStub<RpcChannelGrpcClientV1FutureStub> {
    private RpcChannelGrpcClientV1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcChannelGrpcClientV1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcChannelGrpcClientV1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply> callSync(
        net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallSyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> callAsync(
        net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> replyCallAsync(
        net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReplyCallAsyncMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALL_SYNC = 0;
  private static final int METHODID_CALL_ASYNC = 1;
  private static final int METHODID_REPLY_CALL_ASYNC = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RpcChannelGrpcClientV1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RpcChannelGrpcClientV1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALL_SYNC:
          serviceImpl.callSync((net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply>) responseObserver);
          break;
        case METHODID_CALL_ASYNC:
          serviceImpl.callAsync((net.rossonet.ptalk.channel.protobuf.server.grpc.MessageRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status>) responseObserver);
          break;
        case METHODID_REPLY_CALL_ASYNC:
          serviceImpl.replyCallAsync((net.rossonet.ptalk.channel.protobuf.server.grpc.MessageReply) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status>) responseObserver);
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

  private static abstract class RpcChannelGrpcClientV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcChannelGrpcClientV1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcChannelGrpcClientV1");
    }
  }

  private static final class RpcChannelGrpcClientV1FileDescriptorSupplier
      extends RpcChannelGrpcClientV1BaseDescriptorSupplier {
    RpcChannelGrpcClientV1FileDescriptorSupplier() {}
  }

  private static final class RpcChannelGrpcClientV1MethodDescriptorSupplier
      extends RpcChannelGrpcClientV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RpcChannelGrpcClientV1MethodDescriptorSupplier(String methodName) {
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
      synchronized (RpcChannelGrpcClientV1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcChannelGrpcClientV1FileDescriptorSupplier())
              .addMethod(getCallSyncMethod())
              .addMethod(getCallAsyncMethod())
              .addMethod(getReplyCallAsyncMethod())
              .build();
        }
      }
    }
    return result;
  }
}
