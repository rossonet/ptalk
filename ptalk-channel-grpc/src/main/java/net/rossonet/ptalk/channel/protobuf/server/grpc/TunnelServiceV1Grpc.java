package net.rossonet.ptalk.channel.protobuf.server.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: ptalk-channel-grpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TunnelServiceV1Grpc {

  private TunnelServiceV1Grpc() {}

  public static final String SERVICE_NAME = "channelGrpc.TunnelServiceV1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage,
      net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage> getOpenNetworkChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "openNetworkChannel",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage,
      net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage> getOpenNetworkChannelMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage, net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage> getOpenNetworkChannelMethod;
    if ((getOpenNetworkChannelMethod = TunnelServiceV1Grpc.getOpenNetworkChannelMethod) == null) {
      synchronized (TunnelServiceV1Grpc.class) {
        if ((getOpenNetworkChannelMethod = TunnelServiceV1Grpc.getOpenNetworkChannelMethod) == null) {
          TunnelServiceV1Grpc.getOpenNetworkChannelMethod = getOpenNetworkChannelMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage, net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "openNetworkChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage.getDefaultInstance()))
              .setSchemaDescriptor(new TunnelServiceV1MethodDescriptorSupplier("openNetworkChannel"))
              .build();
        }
      }
    }
    return getOpenNetworkChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.RequestTunnelMessage,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ResponseNetworkChannel> getRequestTunnelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestTunnel",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.RequestTunnelMessage.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.ResponseNetworkChannel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.RequestTunnelMessage,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ResponseNetworkChannel> getRequestTunnelMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.RequestTunnelMessage, net.rossonet.ptalk.channel.protobuf.server.grpc.ResponseNetworkChannel> getRequestTunnelMethod;
    if ((getRequestTunnelMethod = TunnelServiceV1Grpc.getRequestTunnelMethod) == null) {
      synchronized (TunnelServiceV1Grpc.class) {
        if ((getRequestTunnelMethod = TunnelServiceV1Grpc.getRequestTunnelMethod) == null) {
          TunnelServiceV1Grpc.getRequestTunnelMethod = getRequestTunnelMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.RequestTunnelMessage, net.rossonet.ptalk.channel.protobuf.server.grpc.ResponseNetworkChannel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestTunnel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.RequestTunnelMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.ResponseNetworkChannel.getDefaultInstance()))
              .setSchemaDescriptor(new TunnelServiceV1MethodDescriptorSupplier("RequestTunnel"))
              .build();
        }
      }
    }
    return getRequestTunnelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyReply> getProxyHttpRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProxyHttpRequest",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyRequest.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyReply> getProxyHttpRequestMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyReply> getProxyHttpRequestMethod;
    if ((getProxyHttpRequestMethod = TunnelServiceV1Grpc.getProxyHttpRequestMethod) == null) {
      synchronized (TunnelServiceV1Grpc.class) {
        if ((getProxyHttpRequestMethod = TunnelServiceV1Grpc.getProxyHttpRequestMethod) == null) {
          TunnelServiceV1Grpc.getProxyHttpRequestMethod = getProxyHttpRequestMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProxyHttpRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyReply.getDefaultInstance()))
              .setSchemaDescriptor(new TunnelServiceV1MethodDescriptorSupplier("ProxyHttpRequest"))
              .build();
        }
      }
    }
    return getProxyHttpRequestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TunnelServiceV1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TunnelServiceV1Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TunnelServiceV1Stub>() {
        @java.lang.Override
        public TunnelServiceV1Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TunnelServiceV1Stub(channel, callOptions);
        }
      };
    return TunnelServiceV1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TunnelServiceV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TunnelServiceV1BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TunnelServiceV1BlockingStub>() {
        @java.lang.Override
        public TunnelServiceV1BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TunnelServiceV1BlockingStub(channel, callOptions);
        }
      };
    return TunnelServiceV1BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TunnelServiceV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TunnelServiceV1FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TunnelServiceV1FutureStub>() {
        @java.lang.Override
        public TunnelServiceV1FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TunnelServiceV1FutureStub(channel, callOptions);
        }
      };
    return TunnelServiceV1FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TunnelServiceV1ImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage> openNetworkChannel(
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getOpenNetworkChannelMethod(), responseObserver);
    }

    /**
     */
    public void requestTunnel(net.rossonet.ptalk.channel.protobuf.server.grpc.RequestTunnelMessage request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ResponseNetworkChannel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestTunnelMethod(), responseObserver);
    }

    /**
     */
    public void proxyHttpRequest(net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProxyHttpRequestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenNetworkChannelMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage,
                net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage>(
                  this, METHODID_OPEN_NETWORK_CHANNEL)))
          .addMethod(
            getRequestTunnelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.RequestTunnelMessage,
                net.rossonet.ptalk.channel.protobuf.server.grpc.ResponseNetworkChannel>(
                  this, METHODID_REQUEST_TUNNEL)))
          .addMethod(
            getProxyHttpRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyRequest,
                net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyReply>(
                  this, METHODID_PROXY_HTTP_REQUEST)))
          .build();
    }
  }

  /**
   */
  public static final class TunnelServiceV1Stub extends io.grpc.stub.AbstractAsyncStub<TunnelServiceV1Stub> {
    private TunnelServiceV1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TunnelServiceV1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TunnelServiceV1Stub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage> openNetworkChannel(
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getOpenNetworkChannelMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void requestTunnel(net.rossonet.ptalk.channel.protobuf.server.grpc.RequestTunnelMessage request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ResponseNetworkChannel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestTunnelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void proxyHttpRequest(net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProxyHttpRequestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TunnelServiceV1BlockingStub extends io.grpc.stub.AbstractBlockingStub<TunnelServiceV1BlockingStub> {
    private TunnelServiceV1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TunnelServiceV1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TunnelServiceV1BlockingStub(channel, callOptions);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ResponseNetworkChannel requestTunnel(net.rossonet.ptalk.channel.protobuf.server.grpc.RequestTunnelMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestTunnelMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyReply proxyHttpRequest(net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProxyHttpRequestMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TunnelServiceV1FutureStub extends io.grpc.stub.AbstractFutureStub<TunnelServiceV1FutureStub> {
    private TunnelServiceV1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TunnelServiceV1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TunnelServiceV1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.ResponseNetworkChannel> requestTunnel(
        net.rossonet.ptalk.channel.protobuf.server.grpc.RequestTunnelMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestTunnelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyReply> proxyHttpRequest(
        net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProxyHttpRequestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REQUEST_TUNNEL = 0;
  private static final int METHODID_PROXY_HTTP_REQUEST = 1;
  private static final int METHODID_OPEN_NETWORK_CHANNEL = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TunnelServiceV1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TunnelServiceV1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REQUEST_TUNNEL:
          serviceImpl.requestTunnel((net.rossonet.ptalk.channel.protobuf.server.grpc.RequestTunnelMessage) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ResponseNetworkChannel>) responseObserver);
          break;
        case METHODID_PROXY_HTTP_REQUEST:
          serviceImpl.proxyHttpRequest((net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.AgentProxyReply>) responseObserver);
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
        case METHODID_OPEN_NETWORK_CHANNEL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.openNetworkChannel(
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.TunnelMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TunnelServiceV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TunnelServiceV1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TunnelServiceV1");
    }
  }

  private static final class TunnelServiceV1FileDescriptorSupplier
      extends TunnelServiceV1BaseDescriptorSupplier {
    TunnelServiceV1FileDescriptorSupplier() {}
  }

  private static final class TunnelServiceV1MethodDescriptorSupplier
      extends TunnelServiceV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TunnelServiceV1MethodDescriptorSupplier(String methodName) {
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
      synchronized (TunnelServiceV1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TunnelServiceV1FileDescriptorSupplier())
              .addMethod(getOpenNetworkChannelMethod())
              .addMethod(getRequestTunnelMethod())
              .addMethod(getProxyHttpRequestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
