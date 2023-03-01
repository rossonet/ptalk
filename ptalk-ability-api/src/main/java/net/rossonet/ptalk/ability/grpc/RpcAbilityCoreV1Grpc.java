package net.rossonet.ptalk.ability.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: ptalk-ability-api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RpcAbilityCoreV1Grpc {

  private RpcAbilityCoreV1Grpc() {}

  public static final String SERVICE_NAME = "ability.RpcAbilityCoreV1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.RegisterRuleRequest,
      net.rossonet.ptalk.ability.grpc.RegisterRuleReply> getRegisterRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterRule",
      requestType = net.rossonet.ptalk.ability.grpc.RegisterRuleRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.RegisterRuleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.RegisterRuleRequest,
      net.rossonet.ptalk.ability.grpc.RegisterRuleReply> getRegisterRuleMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.RegisterRuleRequest, net.rossonet.ptalk.ability.grpc.RegisterRuleReply> getRegisterRuleMethod;
    if ((getRegisterRuleMethod = RpcAbilityCoreV1Grpc.getRegisterRuleMethod) == null) {
      synchronized (RpcAbilityCoreV1Grpc.class) {
        if ((getRegisterRuleMethod = RpcAbilityCoreV1Grpc.getRegisterRuleMethod) == null) {
          RpcAbilityCoreV1Grpc.getRegisterRuleMethod = getRegisterRuleMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.RegisterRuleRequest, net.rossonet.ptalk.ability.grpc.RegisterRuleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.RegisterRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.RegisterRuleReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcAbilityCoreV1MethodDescriptorSupplier("RegisterRule"))
              .build();
        }
      }
    }
    return getRegisterRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.CancelRuleRequest,
      net.rossonet.ptalk.ability.grpc.CancelRuleReply> getCancelRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelRule",
      requestType = net.rossonet.ptalk.ability.grpc.CancelRuleRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.CancelRuleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.CancelRuleRequest,
      net.rossonet.ptalk.ability.grpc.CancelRuleReply> getCancelRuleMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.CancelRuleRequest, net.rossonet.ptalk.ability.grpc.CancelRuleReply> getCancelRuleMethod;
    if ((getCancelRuleMethod = RpcAbilityCoreV1Grpc.getCancelRuleMethod) == null) {
      synchronized (RpcAbilityCoreV1Grpc.class) {
        if ((getCancelRuleMethod = RpcAbilityCoreV1Grpc.getCancelRuleMethod) == null) {
          RpcAbilityCoreV1Grpc.getCancelRuleMethod = getCancelRuleMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.CancelRuleRequest, net.rossonet.ptalk.ability.grpc.CancelRuleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.CancelRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.CancelRuleReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcAbilityCoreV1MethodDescriptorSupplier("CancelRule"))
              .build();
        }
      }
    }
    return getCancelRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.ListRulesRequest,
      net.rossonet.ptalk.ability.grpc.ListRulesReply> getListRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRules",
      requestType = net.rossonet.ptalk.ability.grpc.ListRulesRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.ListRulesReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.ListRulesRequest,
      net.rossonet.ptalk.ability.grpc.ListRulesReply> getListRulesMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.ListRulesRequest, net.rossonet.ptalk.ability.grpc.ListRulesReply> getListRulesMethod;
    if ((getListRulesMethod = RpcAbilityCoreV1Grpc.getListRulesMethod) == null) {
      synchronized (RpcAbilityCoreV1Grpc.class) {
        if ((getListRulesMethod = RpcAbilityCoreV1Grpc.getListRulesMethod) == null) {
          RpcAbilityCoreV1Grpc.getListRulesMethod = getListRulesMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.ListRulesRequest, net.rossonet.ptalk.ability.grpc.ListRulesReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.ListRulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.ListRulesReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcAbilityCoreV1MethodDescriptorSupplier("ListRules"))
              .build();
        }
      }
    }
    return getListRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.GetRuleRequest,
      net.rossonet.ptalk.ability.grpc.GetRuleReply> getGetRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRule",
      requestType = net.rossonet.ptalk.ability.grpc.GetRuleRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.GetRuleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.GetRuleRequest,
      net.rossonet.ptalk.ability.grpc.GetRuleReply> getGetRuleMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.GetRuleRequest, net.rossonet.ptalk.ability.grpc.GetRuleReply> getGetRuleMethod;
    if ((getGetRuleMethod = RpcAbilityCoreV1Grpc.getGetRuleMethod) == null) {
      synchronized (RpcAbilityCoreV1Grpc.class) {
        if ((getGetRuleMethod = RpcAbilityCoreV1Grpc.getGetRuleMethod) == null) {
          RpcAbilityCoreV1Grpc.getGetRuleMethod = getGetRuleMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.GetRuleRequest, net.rossonet.ptalk.ability.grpc.GetRuleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.GetRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.GetRuleReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcAbilityCoreV1MethodDescriptorSupplier("GetRule"))
              .build();
        }
      }
    }
    return getGetRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.MemoryContextQueryRequest,
      net.rossonet.ptalk.ability.grpc.MemoryContextQueryReply> getMemoryQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MemoryQuery",
      requestType = net.rossonet.ptalk.ability.grpc.MemoryContextQueryRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.MemoryContextQueryReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.MemoryContextQueryRequest,
      net.rossonet.ptalk.ability.grpc.MemoryContextQueryReply> getMemoryQueryMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.MemoryContextQueryRequest, net.rossonet.ptalk.ability.grpc.MemoryContextQueryReply> getMemoryQueryMethod;
    if ((getMemoryQueryMethod = RpcAbilityCoreV1Grpc.getMemoryQueryMethod) == null) {
      synchronized (RpcAbilityCoreV1Grpc.class) {
        if ((getMemoryQueryMethod = RpcAbilityCoreV1Grpc.getMemoryQueryMethod) == null) {
          RpcAbilityCoreV1Grpc.getMemoryQueryMethod = getMemoryQueryMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.MemoryContextQueryRequest, net.rossonet.ptalk.ability.grpc.MemoryContextQueryReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MemoryQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.MemoryContextQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.MemoryContextQueryReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcAbilityCoreV1MethodDescriptorSupplier("MemoryQuery"))
              .build();
        }
      }
    }
    return getMemoryQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryRequest,
      net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryReply> getGeneralConfigurationQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GeneralConfigurationQuery",
      requestType = net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryRequest,
      net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryReply> getGeneralConfigurationQueryMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryRequest, net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryReply> getGeneralConfigurationQueryMethod;
    if ((getGeneralConfigurationQueryMethod = RpcAbilityCoreV1Grpc.getGeneralConfigurationQueryMethod) == null) {
      synchronized (RpcAbilityCoreV1Grpc.class) {
        if ((getGeneralConfigurationQueryMethod = RpcAbilityCoreV1Grpc.getGeneralConfigurationQueryMethod) == null) {
          RpcAbilityCoreV1Grpc.getGeneralConfigurationQueryMethod = getGeneralConfigurationQueryMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryRequest, net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GeneralConfigurationQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcAbilityCoreV1MethodDescriptorSupplier("GeneralConfigurationQuery"))
              .build();
        }
      }
    }
    return getGeneralConfigurationQueryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcAbilityCoreV1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcAbilityCoreV1Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcAbilityCoreV1Stub>() {
        @java.lang.Override
        public RpcAbilityCoreV1Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcAbilityCoreV1Stub(channel, callOptions);
        }
      };
    return RpcAbilityCoreV1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcAbilityCoreV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcAbilityCoreV1BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcAbilityCoreV1BlockingStub>() {
        @java.lang.Override
        public RpcAbilityCoreV1BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcAbilityCoreV1BlockingStub(channel, callOptions);
        }
      };
    return RpcAbilityCoreV1BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcAbilityCoreV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcAbilityCoreV1FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcAbilityCoreV1FutureStub>() {
        @java.lang.Override
        public RpcAbilityCoreV1FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcAbilityCoreV1FutureStub(channel, callOptions);
        }
      };
    return RpcAbilityCoreV1FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RpcAbilityCoreV1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerRule(net.rossonet.ptalk.ability.grpc.RegisterRuleRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.RegisterRuleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterRuleMethod(), responseObserver);
    }

    /**
     */
    public void cancelRule(net.rossonet.ptalk.ability.grpc.CancelRuleRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.CancelRuleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelRuleMethod(), responseObserver);
    }

    /**
     */
    public void listRules(net.rossonet.ptalk.ability.grpc.ListRulesRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.ListRulesReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRulesMethod(), responseObserver);
    }

    /**
     */
    public void getRule(net.rossonet.ptalk.ability.grpc.GetRuleRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.GetRuleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRuleMethod(), responseObserver);
    }

    /**
     */
    public void memoryQuery(net.rossonet.ptalk.ability.grpc.MemoryContextQueryRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.MemoryContextQueryReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMemoryQueryMethod(), responseObserver);
    }

    /**
     */
    public void generalConfigurationQuery(net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGeneralConfigurationQueryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.RegisterRuleRequest,
                net.rossonet.ptalk.ability.grpc.RegisterRuleReply>(
                  this, METHODID_REGISTER_RULE)))
          .addMethod(
            getCancelRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.CancelRuleRequest,
                net.rossonet.ptalk.ability.grpc.CancelRuleReply>(
                  this, METHODID_CANCEL_RULE)))
          .addMethod(
            getListRulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.ListRulesRequest,
                net.rossonet.ptalk.ability.grpc.ListRulesReply>(
                  this, METHODID_LIST_RULES)))
          .addMethod(
            getGetRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.GetRuleRequest,
                net.rossonet.ptalk.ability.grpc.GetRuleReply>(
                  this, METHODID_GET_RULE)))
          .addMethod(
            getMemoryQueryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.MemoryContextQueryRequest,
                net.rossonet.ptalk.ability.grpc.MemoryContextQueryReply>(
                  this, METHODID_MEMORY_QUERY)))
          .addMethod(
            getGeneralConfigurationQueryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryRequest,
                net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryReply>(
                  this, METHODID_GENERAL_CONFIGURATION_QUERY)))
          .build();
    }
  }

  /**
   */
  public static final class RpcAbilityCoreV1Stub extends io.grpc.stub.AbstractAsyncStub<RpcAbilityCoreV1Stub> {
    private RpcAbilityCoreV1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcAbilityCoreV1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcAbilityCoreV1Stub(channel, callOptions);
    }

    /**
     */
    public void registerRule(net.rossonet.ptalk.ability.grpc.RegisterRuleRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.RegisterRuleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelRule(net.rossonet.ptalk.ability.grpc.CancelRuleRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.CancelRuleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRules(net.rossonet.ptalk.ability.grpc.ListRulesRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.ListRulesReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRule(net.rossonet.ptalk.ability.grpc.GetRuleRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.GetRuleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void memoryQuery(net.rossonet.ptalk.ability.grpc.MemoryContextQueryRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.MemoryContextQueryReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMemoryQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generalConfigurationQuery(net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGeneralConfigurationQueryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RpcAbilityCoreV1BlockingStub extends io.grpc.stub.AbstractBlockingStub<RpcAbilityCoreV1BlockingStub> {
    private RpcAbilityCoreV1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcAbilityCoreV1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcAbilityCoreV1BlockingStub(channel, callOptions);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.RegisterRuleReply registerRule(net.rossonet.ptalk.ability.grpc.RegisterRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.CancelRuleReply cancelRule(net.rossonet.ptalk.ability.grpc.CancelRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.ListRulesReply listRules(net.rossonet.ptalk.ability.grpc.ListRulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.GetRuleReply getRule(net.rossonet.ptalk.ability.grpc.GetRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.MemoryContextQueryReply memoryQuery(net.rossonet.ptalk.ability.grpc.MemoryContextQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMemoryQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryReply generalConfigurationQuery(net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGeneralConfigurationQueryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RpcAbilityCoreV1FutureStub extends io.grpc.stub.AbstractFutureStub<RpcAbilityCoreV1FutureStub> {
    private RpcAbilityCoreV1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcAbilityCoreV1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcAbilityCoreV1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.RegisterRuleReply> registerRule(
        net.rossonet.ptalk.ability.grpc.RegisterRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.CancelRuleReply> cancelRule(
        net.rossonet.ptalk.ability.grpc.CancelRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.ListRulesReply> listRules(
        net.rossonet.ptalk.ability.grpc.ListRulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.GetRuleReply> getRule(
        net.rossonet.ptalk.ability.grpc.GetRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.MemoryContextQueryReply> memoryQuery(
        net.rossonet.ptalk.ability.grpc.MemoryContextQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMemoryQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryReply> generalConfigurationQuery(
        net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGeneralConfigurationQueryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_RULE = 0;
  private static final int METHODID_CANCEL_RULE = 1;
  private static final int METHODID_LIST_RULES = 2;
  private static final int METHODID_GET_RULE = 3;
  private static final int METHODID_MEMORY_QUERY = 4;
  private static final int METHODID_GENERAL_CONFIGURATION_QUERY = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RpcAbilityCoreV1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RpcAbilityCoreV1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_RULE:
          serviceImpl.registerRule((net.rossonet.ptalk.ability.grpc.RegisterRuleRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.RegisterRuleReply>) responseObserver);
          break;
        case METHODID_CANCEL_RULE:
          serviceImpl.cancelRule((net.rossonet.ptalk.ability.grpc.CancelRuleRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.CancelRuleReply>) responseObserver);
          break;
        case METHODID_LIST_RULES:
          serviceImpl.listRules((net.rossonet.ptalk.ability.grpc.ListRulesRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.ListRulesReply>) responseObserver);
          break;
        case METHODID_GET_RULE:
          serviceImpl.getRule((net.rossonet.ptalk.ability.grpc.GetRuleRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.GetRuleReply>) responseObserver);
          break;
        case METHODID_MEMORY_QUERY:
          serviceImpl.memoryQuery((net.rossonet.ptalk.ability.grpc.MemoryContextQueryRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.MemoryContextQueryReply>) responseObserver);
          break;
        case METHODID_GENERAL_CONFIGURATION_QUERY:
          serviceImpl.generalConfigurationQuery((net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryReply>) responseObserver);
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

  private static abstract class RpcAbilityCoreV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcAbilityCoreV1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.rossonet.ptalk.ability.grpc.PtaskAbilityApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcAbilityCoreV1");
    }
  }

  private static final class RpcAbilityCoreV1FileDescriptorSupplier
      extends RpcAbilityCoreV1BaseDescriptorSupplier {
    RpcAbilityCoreV1FileDescriptorSupplier() {}
  }

  private static final class RpcAbilityCoreV1MethodDescriptorSupplier
      extends RpcAbilityCoreV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RpcAbilityCoreV1MethodDescriptorSupplier(String methodName) {
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
      synchronized (RpcAbilityCoreV1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcAbilityCoreV1FileDescriptorSupplier())
              .addMethod(getRegisterRuleMethod())
              .addMethod(getCancelRuleMethod())
              .addMethod(getListRulesMethod())
              .addMethod(getGetRuleMethod())
              .addMethod(getMemoryQueryMethod())
              .addMethod(getGeneralConfigurationQueryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
