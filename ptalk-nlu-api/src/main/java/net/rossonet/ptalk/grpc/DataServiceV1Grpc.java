package net.rossonet.ptalk.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: ptalk-nlu-api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataServiceV1Grpc {

  private DataServiceV1Grpc() {}

  public static final String SERVICE_NAME = "beacon.DataServiceV1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.grpc.PollingRequest,
      net.rossonet.ptalk.grpc.FlowMessageData> getPollingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Polling",
      requestType = net.rossonet.ptalk.grpc.PollingRequest.class,
      responseType = net.rossonet.ptalk.grpc.FlowMessageData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.grpc.PollingRequest,
      net.rossonet.ptalk.grpc.FlowMessageData> getPollingMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.grpc.PollingRequest, net.rossonet.ptalk.grpc.FlowMessageData> getPollingMethod;
    if ((getPollingMethod = DataServiceV1Grpc.getPollingMethod) == null) {
      synchronized (DataServiceV1Grpc.class) {
        if ((getPollingMethod = DataServiceV1Grpc.getPollingMethod) == null) {
          DataServiceV1Grpc.getPollingMethod = getPollingMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.grpc.PollingRequest, net.rossonet.ptalk.grpc.FlowMessageData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Polling"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.grpc.PollingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.grpc.FlowMessageData.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceV1MethodDescriptorSupplier("Polling"))
              .build();
        }
      }
    }
    return getPollingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.grpc.SubscribeRequest,
      net.rossonet.ptalk.grpc.FlowMessageData> getSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscription",
      requestType = net.rossonet.ptalk.grpc.SubscribeRequest.class,
      responseType = net.rossonet.ptalk.grpc.FlowMessageData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.grpc.SubscribeRequest,
      net.rossonet.ptalk.grpc.FlowMessageData> getSubscriptionMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.grpc.SubscribeRequest, net.rossonet.ptalk.grpc.FlowMessageData> getSubscriptionMethod;
    if ((getSubscriptionMethod = DataServiceV1Grpc.getSubscriptionMethod) == null) {
      synchronized (DataServiceV1Grpc.class) {
        if ((getSubscriptionMethod = DataServiceV1Grpc.getSubscriptionMethod) == null) {
          DataServiceV1Grpc.getSubscriptionMethod = getSubscriptionMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.grpc.SubscribeRequest, net.rossonet.ptalk.grpc.FlowMessageData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.grpc.SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.grpc.FlowMessageData.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceV1MethodDescriptorSupplier("Subscription"))
              .build();
        }
      }
    }
    return getSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.grpc.RequestWrite,
      net.rossonet.ptalk.grpc.FlowMessageData> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = net.rossonet.ptalk.grpc.RequestWrite.class,
      responseType = net.rossonet.ptalk.grpc.FlowMessageData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.grpc.RequestWrite,
      net.rossonet.ptalk.grpc.FlowMessageData> getWriteMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.grpc.RequestWrite, net.rossonet.ptalk.grpc.FlowMessageData> getWriteMethod;
    if ((getWriteMethod = DataServiceV1Grpc.getWriteMethod) == null) {
      synchronized (DataServiceV1Grpc.class) {
        if ((getWriteMethod = DataServiceV1Grpc.getWriteMethod) == null) {
          DataServiceV1Grpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.grpc.RequestWrite, net.rossonet.ptalk.grpc.FlowMessageData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.grpc.RequestWrite.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.grpc.FlowMessageData.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceV1MethodDescriptorSupplier("Write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.grpc.RequestWrite,
      net.rossonet.ptalk.grpc.FlowMessageData> getWriteSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteSubscription",
      requestType = net.rossonet.ptalk.grpc.RequestWrite.class,
      responseType = net.rossonet.ptalk.grpc.FlowMessageData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.grpc.RequestWrite,
      net.rossonet.ptalk.grpc.FlowMessageData> getWriteSubscriptionMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.grpc.RequestWrite, net.rossonet.ptalk.grpc.FlowMessageData> getWriteSubscriptionMethod;
    if ((getWriteSubscriptionMethod = DataServiceV1Grpc.getWriteSubscriptionMethod) == null) {
      synchronized (DataServiceV1Grpc.class) {
        if ((getWriteSubscriptionMethod = DataServiceV1Grpc.getWriteSubscriptionMethod) == null) {
          DataServiceV1Grpc.getWriteSubscriptionMethod = getWriteSubscriptionMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.grpc.RequestWrite, net.rossonet.ptalk.grpc.FlowMessageData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.grpc.RequestWrite.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.grpc.FlowMessageData.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceV1MethodDescriptorSupplier("WriteSubscription"))
              .build();
        }
      }
    }
    return getWriteSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.grpc.AddressSpace,
      net.rossonet.ptalk.grpc.AddressSpace> getSendAddressSpaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendAddressSpace",
      requestType = net.rossonet.ptalk.grpc.AddressSpace.class,
      responseType = net.rossonet.ptalk.grpc.AddressSpace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.grpc.AddressSpace,
      net.rossonet.ptalk.grpc.AddressSpace> getSendAddressSpaceMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.grpc.AddressSpace, net.rossonet.ptalk.grpc.AddressSpace> getSendAddressSpaceMethod;
    if ((getSendAddressSpaceMethod = DataServiceV1Grpc.getSendAddressSpaceMethod) == null) {
      synchronized (DataServiceV1Grpc.class) {
        if ((getSendAddressSpaceMethod = DataServiceV1Grpc.getSendAddressSpaceMethod) == null) {
          DataServiceV1Grpc.getSendAddressSpaceMethod = getSendAddressSpaceMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.grpc.AddressSpace, net.rossonet.ptalk.grpc.AddressSpace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendAddressSpace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.grpc.AddressSpace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.grpc.AddressSpace.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceV1MethodDescriptorSupplier("SendAddressSpace"))
              .build();
        }
      }
    }
    return getSendAddressSpaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.grpc.Agent,
      net.rossonet.ptalk.grpc.AddressSpace> getGetRemoteAddressSpaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRemoteAddressSpace",
      requestType = net.rossonet.ptalk.grpc.Agent.class,
      responseType = net.rossonet.ptalk.grpc.AddressSpace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.grpc.Agent,
      net.rossonet.ptalk.grpc.AddressSpace> getGetRemoteAddressSpaceMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.grpc.Agent, net.rossonet.ptalk.grpc.AddressSpace> getGetRemoteAddressSpaceMethod;
    if ((getGetRemoteAddressSpaceMethod = DataServiceV1Grpc.getGetRemoteAddressSpaceMethod) == null) {
      synchronized (DataServiceV1Grpc.class) {
        if ((getGetRemoteAddressSpaceMethod = DataServiceV1Grpc.getGetRemoteAddressSpaceMethod) == null) {
          DataServiceV1Grpc.getGetRemoteAddressSpaceMethod = getGetRemoteAddressSpaceMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.grpc.Agent, net.rossonet.ptalk.grpc.AddressSpace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRemoteAddressSpace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.grpc.Agent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.grpc.AddressSpace.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceV1MethodDescriptorSupplier("GetRemoteAddressSpace"))
              .build();
        }
      }
    }
    return getGetRemoteAddressSpaceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataServiceV1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataServiceV1Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataServiceV1Stub>() {
        @java.lang.Override
        public DataServiceV1Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataServiceV1Stub(channel, callOptions);
        }
      };
    return DataServiceV1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataServiceV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataServiceV1BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataServiceV1BlockingStub>() {
        @java.lang.Override
        public DataServiceV1BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataServiceV1BlockingStub(channel, callOptions);
        }
      };
    return DataServiceV1BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataServiceV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataServiceV1FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataServiceV1FutureStub>() {
        @java.lang.Override
        public DataServiceV1FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataServiceV1FutureStub(channel, callOptions);
        }
      };
    return DataServiceV1FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DataServiceV1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void polling(net.rossonet.ptalk.grpc.PollingRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.FlowMessageData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPollingMethod(), responseObserver);
    }

    /**
     */
    public void subscription(net.rossonet.ptalk.grpc.SubscribeRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.FlowMessageData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscriptionMethod(), responseObserver);
    }

    /**
     */
    public void write(net.rossonet.ptalk.grpc.RequestWrite request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.FlowMessageData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.RequestWrite> writeSubscription(
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.FlowMessageData> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getWriteSubscriptionMethod(), responseObserver);
    }

    /**
     */
    public void sendAddressSpace(net.rossonet.ptalk.grpc.AddressSpace request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.AddressSpace> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendAddressSpaceMethod(), responseObserver);
    }

    /**
     */
    public void getRemoteAddressSpace(net.rossonet.ptalk.grpc.Agent request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.AddressSpace> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRemoteAddressSpaceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPollingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.grpc.PollingRequest,
                net.rossonet.ptalk.grpc.FlowMessageData>(
                  this, METHODID_POLLING)))
          .addMethod(
            getSubscriptionMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                net.rossonet.ptalk.grpc.SubscribeRequest,
                net.rossonet.ptalk.grpc.FlowMessageData>(
                  this, METHODID_SUBSCRIPTION)))
          .addMethod(
            getWriteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.grpc.RequestWrite,
                net.rossonet.ptalk.grpc.FlowMessageData>(
                  this, METHODID_WRITE)))
          .addMethod(
            getWriteSubscriptionMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                net.rossonet.ptalk.grpc.RequestWrite,
                net.rossonet.ptalk.grpc.FlowMessageData>(
                  this, METHODID_WRITE_SUBSCRIPTION)))
          .addMethod(
            getSendAddressSpaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.grpc.AddressSpace,
                net.rossonet.ptalk.grpc.AddressSpace>(
                  this, METHODID_SEND_ADDRESS_SPACE)))
          .addMethod(
            getGetRemoteAddressSpaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.grpc.Agent,
                net.rossonet.ptalk.grpc.AddressSpace>(
                  this, METHODID_GET_REMOTE_ADDRESS_SPACE)))
          .build();
    }
  }

  /**
   */
  public static final class DataServiceV1Stub extends io.grpc.stub.AbstractAsyncStub<DataServiceV1Stub> {
    private DataServiceV1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServiceV1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataServiceV1Stub(channel, callOptions);
    }

    /**
     */
    public void polling(net.rossonet.ptalk.grpc.PollingRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.FlowMessageData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPollingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscription(net.rossonet.ptalk.grpc.SubscribeRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.FlowMessageData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void write(net.rossonet.ptalk.grpc.RequestWrite request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.FlowMessageData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.RequestWrite> writeSubscription(
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.FlowMessageData> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getWriteSubscriptionMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void sendAddressSpace(net.rossonet.ptalk.grpc.AddressSpace request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.AddressSpace> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendAddressSpaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRemoteAddressSpace(net.rossonet.ptalk.grpc.Agent request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.AddressSpace> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRemoteAddressSpaceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DataServiceV1BlockingStub extends io.grpc.stub.AbstractBlockingStub<DataServiceV1BlockingStub> {
    private DataServiceV1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServiceV1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataServiceV1BlockingStub(channel, callOptions);
    }

    /**
     */
    public net.rossonet.ptalk.grpc.FlowMessageData polling(net.rossonet.ptalk.grpc.PollingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPollingMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<net.rossonet.ptalk.grpc.FlowMessageData> subscription(
        net.rossonet.ptalk.grpc.SubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.grpc.FlowMessageData write(net.rossonet.ptalk.grpc.RequestWrite request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.grpc.AddressSpace sendAddressSpace(net.rossonet.ptalk.grpc.AddressSpace request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendAddressSpaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.grpc.AddressSpace getRemoteAddressSpace(net.rossonet.ptalk.grpc.Agent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRemoteAddressSpaceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DataServiceV1FutureStub extends io.grpc.stub.AbstractFutureStub<DataServiceV1FutureStub> {
    private DataServiceV1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServiceV1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataServiceV1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.grpc.FlowMessageData> polling(
        net.rossonet.ptalk.grpc.PollingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPollingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.grpc.FlowMessageData> write(
        net.rossonet.ptalk.grpc.RequestWrite request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.grpc.AddressSpace> sendAddressSpace(
        net.rossonet.ptalk.grpc.AddressSpace request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendAddressSpaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.grpc.AddressSpace> getRemoteAddressSpace(
        net.rossonet.ptalk.grpc.Agent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRemoteAddressSpaceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POLLING = 0;
  private static final int METHODID_SUBSCRIPTION = 1;
  private static final int METHODID_WRITE = 2;
  private static final int METHODID_SEND_ADDRESS_SPACE = 3;
  private static final int METHODID_GET_REMOTE_ADDRESS_SPACE = 4;
  private static final int METHODID_WRITE_SUBSCRIPTION = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataServiceV1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataServiceV1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POLLING:
          serviceImpl.polling((net.rossonet.ptalk.grpc.PollingRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.FlowMessageData>) responseObserver);
          break;
        case METHODID_SUBSCRIPTION:
          serviceImpl.subscription((net.rossonet.ptalk.grpc.SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.FlowMessageData>) responseObserver);
          break;
        case METHODID_WRITE:
          serviceImpl.write((net.rossonet.ptalk.grpc.RequestWrite) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.FlowMessageData>) responseObserver);
          break;
        case METHODID_SEND_ADDRESS_SPACE:
          serviceImpl.sendAddressSpace((net.rossonet.ptalk.grpc.AddressSpace) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.AddressSpace>) responseObserver);
          break;
        case METHODID_GET_REMOTE_ADDRESS_SPACE:
          serviceImpl.getRemoteAddressSpace((net.rossonet.ptalk.grpc.Agent) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.AddressSpace>) responseObserver);
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
        case METHODID_WRITE_SUBSCRIPTION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.writeSubscription(
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.grpc.FlowMessageData>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DataServiceV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataServiceV1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.rossonet.ptalk.grpc.PtaskNluApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataServiceV1");
    }
  }

  private static final class DataServiceV1FileDescriptorSupplier
      extends DataServiceV1BaseDescriptorSupplier {
    DataServiceV1FileDescriptorSupplier() {}
  }

  private static final class DataServiceV1MethodDescriptorSupplier
      extends DataServiceV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataServiceV1MethodDescriptorSupplier(String methodName) {
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
      synchronized (DataServiceV1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataServiceV1FileDescriptorSupplier())
              .addMethod(getPollingMethod())
              .addMethod(getSubscriptionMethod())
              .addMethod(getWriteMethod())
              .addMethod(getWriteSubscriptionMethod())
              .addMethod(getSendAddressSpaceMethod())
              .addMethod(getGetRemoteAddressSpaceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
