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
  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.AbilityMessageReply,
      net.rossonet.ptalk.base.grpc.Status> getReplyAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReplyAsync",
      requestType = net.rossonet.ptalk.ability.grpc.AbilityMessageReply.class,
      responseType = net.rossonet.ptalk.base.grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.AbilityMessageReply,
      net.rossonet.ptalk.base.grpc.Status> getReplyAsyncMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.AbilityMessageReply, net.rossonet.ptalk.base.grpc.Status> getReplyAsyncMethod;
    if ((getReplyAsyncMethod = RpcAbilityCoreV1Grpc.getReplyAsyncMethod) == null) {
      synchronized (RpcAbilityCoreV1Grpc.class) {
        if ((getReplyAsyncMethod = RpcAbilityCoreV1Grpc.getReplyAsyncMethod) == null) {
          RpcAbilityCoreV1Grpc.getReplyAsyncMethod = getReplyAsyncMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.AbilityMessageReply, net.rossonet.ptalk.base.grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReplyAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.AbilityMessageReply.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.base.grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new RpcAbilityCoreV1MethodDescriptorSupplier("ReplyAsync"))
              .build();
        }
      }
    }
    return getReplyAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.RegisterRulesRequest,
      net.rossonet.ptalk.ability.grpc.RegisterRulesReply> getRegisterRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterRules",
      requestType = net.rossonet.ptalk.ability.grpc.RegisterRulesRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.RegisterRulesReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.RegisterRulesRequest,
      net.rossonet.ptalk.ability.grpc.RegisterRulesReply> getRegisterRulesMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.RegisterRulesRequest, net.rossonet.ptalk.ability.grpc.RegisterRulesReply> getRegisterRulesMethod;
    if ((getRegisterRulesMethod = RpcAbilityCoreV1Grpc.getRegisterRulesMethod) == null) {
      synchronized (RpcAbilityCoreV1Grpc.class) {
        if ((getRegisterRulesMethod = RpcAbilityCoreV1Grpc.getRegisterRulesMethod) == null) {
          RpcAbilityCoreV1Grpc.getRegisterRulesMethod = getRegisterRulesMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.RegisterRulesRequest, net.rossonet.ptalk.ability.grpc.RegisterRulesReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.RegisterRulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.RegisterRulesReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcAbilityCoreV1MethodDescriptorSupplier("RegisterRules"))
              .build();
        }
      }
    }
    return getRegisterRulesMethod;
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

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.MemoryContextRequest,
      net.rossonet.ptalk.ability.grpc.MemoryContextReply> getMemoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Memory",
      requestType = net.rossonet.ptalk.ability.grpc.MemoryContextRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.MemoryContextReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.MemoryContextRequest,
      net.rossonet.ptalk.ability.grpc.MemoryContextReply> getMemoryMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.MemoryContextRequest, net.rossonet.ptalk.ability.grpc.MemoryContextReply> getMemoryMethod;
    if ((getMemoryMethod = RpcAbilityCoreV1Grpc.getMemoryMethod) == null) {
      synchronized (RpcAbilityCoreV1Grpc.class) {
        if ((getMemoryMethod = RpcAbilityCoreV1Grpc.getMemoryMethod) == null) {
          RpcAbilityCoreV1Grpc.getMemoryMethod = getMemoryMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.MemoryContextRequest, net.rossonet.ptalk.ability.grpc.MemoryContextReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Memory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.MemoryContextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.MemoryContextReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcAbilityCoreV1MethodDescriptorSupplier("Memory"))
              .build();
        }
      }
    }
    return getMemoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.GeneralConfigurationRequest,
      net.rossonet.ptalk.ability.grpc.GeneralConfigurationReply> getGeneralConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GeneralConfiguration",
      requestType = net.rossonet.ptalk.ability.grpc.GeneralConfigurationRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.GeneralConfigurationReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.GeneralConfigurationRequest,
      net.rossonet.ptalk.ability.grpc.GeneralConfigurationReply> getGeneralConfigurationMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.GeneralConfigurationRequest, net.rossonet.ptalk.ability.grpc.GeneralConfigurationReply> getGeneralConfigurationMethod;
    if ((getGeneralConfigurationMethod = RpcAbilityCoreV1Grpc.getGeneralConfigurationMethod) == null) {
      synchronized (RpcAbilityCoreV1Grpc.class) {
        if ((getGeneralConfigurationMethod = RpcAbilityCoreV1Grpc.getGeneralConfigurationMethod) == null) {
          RpcAbilityCoreV1Grpc.getGeneralConfigurationMethod = getGeneralConfigurationMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.GeneralConfigurationRequest, net.rossonet.ptalk.ability.grpc.GeneralConfigurationReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GeneralConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.GeneralConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.GeneralConfigurationReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcAbilityCoreV1MethodDescriptorSupplier("GeneralConfiguration"))
              .build();
        }
      }
    }
    return getGeneralConfigurationMethod;
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
    public void replyAsync(net.rossonet.ptalk.ability.grpc.AbilityMessageReply request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReplyAsyncMethod(), responseObserver);
    }

    /**
     */
    public void registerRules(net.rossonet.ptalk.ability.grpc.RegisterRulesRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.RegisterRulesReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterRulesMethod(), responseObserver);
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
    public void memory(net.rossonet.ptalk.ability.grpc.MemoryContextRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.MemoryContextReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMemoryMethod(), responseObserver);
    }

    /**
     */
    public void generalConfiguration(net.rossonet.ptalk.ability.grpc.GeneralConfigurationRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.GeneralConfigurationReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGeneralConfigurationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReplyAsyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.AbilityMessageReply,
                net.rossonet.ptalk.base.grpc.Status>(
                  this, METHODID_REPLY_ASYNC)))
          .addMethod(
            getRegisterRulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.RegisterRulesRequest,
                net.rossonet.ptalk.ability.grpc.RegisterRulesReply>(
                  this, METHODID_REGISTER_RULES)))
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
            getMemoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.MemoryContextRequest,
                net.rossonet.ptalk.ability.grpc.MemoryContextReply>(
                  this, METHODID_MEMORY)))
          .addMethod(
            getGeneralConfigurationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.GeneralConfigurationRequest,
                net.rossonet.ptalk.ability.grpc.GeneralConfigurationReply>(
                  this, METHODID_GENERAL_CONFIGURATION)))
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
    public void replyAsync(net.rossonet.ptalk.ability.grpc.AbilityMessageReply request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReplyAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerRules(net.rossonet.ptalk.ability.grpc.RegisterRulesRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.RegisterRulesReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterRulesMethod(), getCallOptions()), request, responseObserver);
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
    public void memory(net.rossonet.ptalk.ability.grpc.MemoryContextRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.MemoryContextReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMemoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generalConfiguration(net.rossonet.ptalk.ability.grpc.GeneralConfigurationRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.GeneralConfigurationReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGeneralConfigurationMethod(), getCallOptions()), request, responseObserver);
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
    public net.rossonet.ptalk.base.grpc.Status replyAsync(net.rossonet.ptalk.ability.grpc.AbilityMessageReply request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReplyAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.RegisterRulesReply registerRules(net.rossonet.ptalk.ability.grpc.RegisterRulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterRulesMethod(), getCallOptions(), request);
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
    public net.rossonet.ptalk.ability.grpc.MemoryContextReply memory(net.rossonet.ptalk.ability.grpc.MemoryContextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMemoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.GeneralConfigurationReply generalConfiguration(net.rossonet.ptalk.ability.grpc.GeneralConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGeneralConfigurationMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.base.grpc.Status> replyAsync(
        net.rossonet.ptalk.ability.grpc.AbilityMessageReply request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReplyAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.RegisterRulesReply> registerRules(
        net.rossonet.ptalk.ability.grpc.RegisterRulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterRulesMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.MemoryContextReply> memory(
        net.rossonet.ptalk.ability.grpc.MemoryContextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMemoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.GeneralConfigurationReply> generalConfiguration(
        net.rossonet.ptalk.ability.grpc.GeneralConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGeneralConfigurationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REPLY_ASYNC = 0;
  private static final int METHODID_REGISTER_RULES = 1;
  private static final int METHODID_CANCEL_RULE = 2;
  private static final int METHODID_LIST_RULES = 3;
  private static final int METHODID_MEMORY = 4;
  private static final int METHODID_GENERAL_CONFIGURATION = 5;

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
        case METHODID_REPLY_ASYNC:
          serviceImpl.replyAsync((net.rossonet.ptalk.ability.grpc.AbilityMessageReply) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status>) responseObserver);
          break;
        case METHODID_REGISTER_RULES:
          serviceImpl.registerRules((net.rossonet.ptalk.ability.grpc.RegisterRulesRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.RegisterRulesReply>) responseObserver);
          break;
        case METHODID_CANCEL_RULE:
          serviceImpl.cancelRule((net.rossonet.ptalk.ability.grpc.CancelRuleRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.CancelRuleReply>) responseObserver);
          break;
        case METHODID_LIST_RULES:
          serviceImpl.listRules((net.rossonet.ptalk.ability.grpc.ListRulesRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.ListRulesReply>) responseObserver);
          break;
        case METHODID_MEMORY:
          serviceImpl.memory((net.rossonet.ptalk.ability.grpc.MemoryContextRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.MemoryContextReply>) responseObserver);
          break;
        case METHODID_GENERAL_CONFIGURATION:
          serviceImpl.generalConfiguration((net.rossonet.ptalk.ability.grpc.GeneralConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.GeneralConfigurationReply>) responseObserver);
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
              .addMethod(getReplyAsyncMethod())
              .addMethod(getRegisterRulesMethod())
              .addMethod(getCancelRuleMethod())
              .addMethod(getListRulesMethod())
              .addMethod(getMemoryMethod())
              .addMethod(getGeneralConfigurationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
