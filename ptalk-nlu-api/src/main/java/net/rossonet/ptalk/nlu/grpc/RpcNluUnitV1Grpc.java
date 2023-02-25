package net.rossonet.ptalk.nlu.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: ptalk-nlu-api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RpcNluUnitV1Grpc {

  private RpcNluUnitV1Grpc() {}

  public static final String SERVICE_NAME = "nlu.RpcNluUnitV1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluMessageRequest,
      net.rossonet.ptalk.nlu.grpc.NluMessageReply> getCallSyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallSync",
      requestType = net.rossonet.ptalk.nlu.grpc.NluMessageRequest.class,
      responseType = net.rossonet.ptalk.nlu.grpc.NluMessageReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluMessageRequest,
      net.rossonet.ptalk.nlu.grpc.NluMessageReply> getCallSyncMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluMessageRequest, net.rossonet.ptalk.nlu.grpc.NluMessageReply> getCallSyncMethod;
    if ((getCallSyncMethod = RpcNluUnitV1Grpc.getCallSyncMethod) == null) {
      synchronized (RpcNluUnitV1Grpc.class) {
        if ((getCallSyncMethod = RpcNluUnitV1Grpc.getCallSyncMethod) == null) {
          RpcNluUnitV1Grpc.getCallSyncMethod = getCallSyncMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.nlu.grpc.NluMessageRequest, net.rossonet.ptalk.nlu.grpc.NluMessageReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallSync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.nlu.grpc.NluMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.nlu.grpc.NluMessageReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcNluUnitV1MethodDescriptorSupplier("CallSync"))
              .build();
        }
      }
    }
    return getCallSyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluMessageRequest,
      net.rossonet.ptalk.base.grpc.Status> getCallAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallAsync",
      requestType = net.rossonet.ptalk.nlu.grpc.NluMessageRequest.class,
      responseType = net.rossonet.ptalk.base.grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluMessageRequest,
      net.rossonet.ptalk.base.grpc.Status> getCallAsyncMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluMessageRequest, net.rossonet.ptalk.base.grpc.Status> getCallAsyncMethod;
    if ((getCallAsyncMethod = RpcNluUnitV1Grpc.getCallAsyncMethod) == null) {
      synchronized (RpcNluUnitV1Grpc.class) {
        if ((getCallAsyncMethod = RpcNluUnitV1Grpc.getCallAsyncMethod) == null) {
          RpcNluUnitV1Grpc.getCallAsyncMethod = getCallAsyncMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.nlu.grpc.NluMessageRequest, net.rossonet.ptalk.base.grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.nlu.grpc.NluMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.base.grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new RpcNluUnitV1MethodDescriptorSupplier("CallAsync"))
              .build();
        }
      }
    }
    return getCallAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest,
      net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply> getTrainModelSyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrainModelSync",
      requestType = net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest.class,
      responseType = net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest,
      net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply> getTrainModelSyncMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest, net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply> getTrainModelSyncMethod;
    if ((getTrainModelSyncMethod = RpcNluUnitV1Grpc.getTrainModelSyncMethod) == null) {
      synchronized (RpcNluUnitV1Grpc.class) {
        if ((getTrainModelSyncMethod = RpcNluUnitV1Grpc.getTrainModelSyncMethod) == null) {
          RpcNluUnitV1Grpc.getTrainModelSyncMethod = getTrainModelSyncMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest, net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrainModelSync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcNluUnitV1MethodDescriptorSupplier("TrainModelSync"))
              .build();
        }
      }
    }
    return getTrainModelSyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest,
      net.rossonet.ptalk.base.grpc.Status> getTrainModelAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrainModelAsync",
      requestType = net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest.class,
      responseType = net.rossonet.ptalk.base.grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest,
      net.rossonet.ptalk.base.grpc.Status> getTrainModelAsyncMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest, net.rossonet.ptalk.base.grpc.Status> getTrainModelAsyncMethod;
    if ((getTrainModelAsyncMethod = RpcNluUnitV1Grpc.getTrainModelAsyncMethod) == null) {
      synchronized (RpcNluUnitV1Grpc.class) {
        if ((getTrainModelAsyncMethod = RpcNluUnitV1Grpc.getTrainModelAsyncMethod) == null) {
          RpcNluUnitV1Grpc.getTrainModelAsyncMethod = getTrainModelAsyncMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest, net.rossonet.ptalk.base.grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrainModelAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.base.grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new RpcNluUnitV1MethodDescriptorSupplier("TrainModelAsync"))
              .build();
        }
      }
    }
    return getTrainModelAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluListModelsRequest,
      net.rossonet.ptalk.nlu.grpc.NluListModelsReply> getListModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModels",
      requestType = net.rossonet.ptalk.nlu.grpc.NluListModelsRequest.class,
      responseType = net.rossonet.ptalk.nlu.grpc.NluListModelsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluListModelsRequest,
      net.rossonet.ptalk.nlu.grpc.NluListModelsReply> getListModelsMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluListModelsRequest, net.rossonet.ptalk.nlu.grpc.NluListModelsReply> getListModelsMethod;
    if ((getListModelsMethod = RpcNluUnitV1Grpc.getListModelsMethod) == null) {
      synchronized (RpcNluUnitV1Grpc.class) {
        if ((getListModelsMethod = RpcNluUnitV1Grpc.getListModelsMethod) == null) {
          RpcNluUnitV1Grpc.getListModelsMethod = getListModelsMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.nlu.grpc.NluListModelsRequest, net.rossonet.ptalk.nlu.grpc.NluListModelsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListModels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.nlu.grpc.NluListModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.nlu.grpc.NluListModelsReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcNluUnitV1MethodDescriptorSupplier("ListModels"))
              .build();
        }
      }
    }
    return getListModelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluDeleteModelRequest,
      net.rossonet.ptalk.nlu.grpc.NluDeleteModelReply> getDeleteModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteModel",
      requestType = net.rossonet.ptalk.nlu.grpc.NluDeleteModelRequest.class,
      responseType = net.rossonet.ptalk.nlu.grpc.NluDeleteModelReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluDeleteModelRequest,
      net.rossonet.ptalk.nlu.grpc.NluDeleteModelReply> getDeleteModelMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.nlu.grpc.NluDeleteModelRequest, net.rossonet.ptalk.nlu.grpc.NluDeleteModelReply> getDeleteModelMethod;
    if ((getDeleteModelMethod = RpcNluUnitV1Grpc.getDeleteModelMethod) == null) {
      synchronized (RpcNluUnitV1Grpc.class) {
        if ((getDeleteModelMethod = RpcNluUnitV1Grpc.getDeleteModelMethod) == null) {
          RpcNluUnitV1Grpc.getDeleteModelMethod = getDeleteModelMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.nlu.grpc.NluDeleteModelRequest, net.rossonet.ptalk.nlu.grpc.NluDeleteModelReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.nlu.grpc.NluDeleteModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.nlu.grpc.NluDeleteModelReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcNluUnitV1MethodDescriptorSupplier("DeleteModel"))
              .build();
        }
      }
    }
    return getDeleteModelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcNluUnitV1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcNluUnitV1Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcNluUnitV1Stub>() {
        @java.lang.Override
        public RpcNluUnitV1Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcNluUnitV1Stub(channel, callOptions);
        }
      };
    return RpcNluUnitV1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcNluUnitV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcNluUnitV1BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcNluUnitV1BlockingStub>() {
        @java.lang.Override
        public RpcNluUnitV1BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcNluUnitV1BlockingStub(channel, callOptions);
        }
      };
    return RpcNluUnitV1BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcNluUnitV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcNluUnitV1FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcNluUnitV1FutureStub>() {
        @java.lang.Override
        public RpcNluUnitV1FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcNluUnitV1FutureStub(channel, callOptions);
        }
      };
    return RpcNluUnitV1FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RpcNluUnitV1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void callSync(net.rossonet.ptalk.nlu.grpc.NluMessageRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.nlu.grpc.NluMessageReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallSyncMethod(), responseObserver);
    }

    /**
     */
    public void callAsync(net.rossonet.ptalk.nlu.grpc.NluMessageRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallAsyncMethod(), responseObserver);
    }

    /**
     */
    public void trainModelSync(net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrainModelSyncMethod(), responseObserver);
    }

    /**
     */
    public void trainModelAsync(net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrainModelAsyncMethod(), responseObserver);
    }

    /**
     */
    public void listModels(net.rossonet.ptalk.nlu.grpc.NluListModelsRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.nlu.grpc.NluListModelsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListModelsMethod(), responseObserver);
    }

    /**
     */
    public void deleteModel(net.rossonet.ptalk.nlu.grpc.NluDeleteModelRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.nlu.grpc.NluDeleteModelReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteModelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCallSyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.nlu.grpc.NluMessageRequest,
                net.rossonet.ptalk.nlu.grpc.NluMessageReply>(
                  this, METHODID_CALL_SYNC)))
          .addMethod(
            getCallAsyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.nlu.grpc.NluMessageRequest,
                net.rossonet.ptalk.base.grpc.Status>(
                  this, METHODID_CALL_ASYNC)))
          .addMethod(
            getTrainModelSyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest,
                net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply>(
                  this, METHODID_TRAIN_MODEL_SYNC)))
          .addMethod(
            getTrainModelAsyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest,
                net.rossonet.ptalk.base.grpc.Status>(
                  this, METHODID_TRAIN_MODEL_ASYNC)))
          .addMethod(
            getListModelsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.nlu.grpc.NluListModelsRequest,
                net.rossonet.ptalk.nlu.grpc.NluListModelsReply>(
                  this, METHODID_LIST_MODELS)))
          .addMethod(
            getDeleteModelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.nlu.grpc.NluDeleteModelRequest,
                net.rossonet.ptalk.nlu.grpc.NluDeleteModelReply>(
                  this, METHODID_DELETE_MODEL)))
          .build();
    }
  }

  /**
   */
  public static final class RpcNluUnitV1Stub extends io.grpc.stub.AbstractAsyncStub<RpcNluUnitV1Stub> {
    private RpcNluUnitV1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcNluUnitV1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcNluUnitV1Stub(channel, callOptions);
    }

    /**
     */
    public void callSync(net.rossonet.ptalk.nlu.grpc.NluMessageRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.nlu.grpc.NluMessageReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallSyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callAsync(net.rossonet.ptalk.nlu.grpc.NluMessageRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void trainModelSync(net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrainModelSyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void trainModelAsync(net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrainModelAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listModels(net.rossonet.ptalk.nlu.grpc.NluListModelsRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.nlu.grpc.NluListModelsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListModelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteModel(net.rossonet.ptalk.nlu.grpc.NluDeleteModelRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.nlu.grpc.NluDeleteModelReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteModelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RpcNluUnitV1BlockingStub extends io.grpc.stub.AbstractBlockingStub<RpcNluUnitV1BlockingStub> {
    private RpcNluUnitV1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcNluUnitV1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcNluUnitV1BlockingStub(channel, callOptions);
    }

    /**
     */
    public net.rossonet.ptalk.nlu.grpc.NluMessageReply callSync(net.rossonet.ptalk.nlu.grpc.NluMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallSyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.base.grpc.Status callAsync(net.rossonet.ptalk.nlu.grpc.NluMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply trainModelSync(net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrainModelSyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.base.grpc.Status trainModelAsync(net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrainModelAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.nlu.grpc.NluListModelsReply listModels(net.rossonet.ptalk.nlu.grpc.NluListModelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListModelsMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.nlu.grpc.NluDeleteModelReply deleteModel(net.rossonet.ptalk.nlu.grpc.NluDeleteModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteModelMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RpcNluUnitV1FutureStub extends io.grpc.stub.AbstractFutureStub<RpcNluUnitV1FutureStub> {
    private RpcNluUnitV1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcNluUnitV1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcNluUnitV1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.nlu.grpc.NluMessageReply> callSync(
        net.rossonet.ptalk.nlu.grpc.NluMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallSyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.base.grpc.Status> callAsync(
        net.rossonet.ptalk.nlu.grpc.NluMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply> trainModelSync(
        net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrainModelSyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.base.grpc.Status> trainModelAsync(
        net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrainModelAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.nlu.grpc.NluListModelsReply> listModels(
        net.rossonet.ptalk.nlu.grpc.NluListModelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListModelsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.nlu.grpc.NluDeleteModelReply> deleteModel(
        net.rossonet.ptalk.nlu.grpc.NluDeleteModelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteModelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALL_SYNC = 0;
  private static final int METHODID_CALL_ASYNC = 1;
  private static final int METHODID_TRAIN_MODEL_SYNC = 2;
  private static final int METHODID_TRAIN_MODEL_ASYNC = 3;
  private static final int METHODID_LIST_MODELS = 4;
  private static final int METHODID_DELETE_MODEL = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RpcNluUnitV1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RpcNluUnitV1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALL_SYNC:
          serviceImpl.callSync((net.rossonet.ptalk.nlu.grpc.NluMessageRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.nlu.grpc.NluMessageReply>) responseObserver);
          break;
        case METHODID_CALL_ASYNC:
          serviceImpl.callAsync((net.rossonet.ptalk.nlu.grpc.NluMessageRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status>) responseObserver);
          break;
        case METHODID_TRAIN_MODEL_SYNC:
          serviceImpl.trainModelSync((net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply>) responseObserver);
          break;
        case METHODID_TRAIN_MODEL_ASYNC:
          serviceImpl.trainModelAsync((net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.base.grpc.Status>) responseObserver);
          break;
        case METHODID_LIST_MODELS:
          serviceImpl.listModels((net.rossonet.ptalk.nlu.grpc.NluListModelsRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.nlu.grpc.NluListModelsReply>) responseObserver);
          break;
        case METHODID_DELETE_MODEL:
          serviceImpl.deleteModel((net.rossonet.ptalk.nlu.grpc.NluDeleteModelRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.nlu.grpc.NluDeleteModelReply>) responseObserver);
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

  private static abstract class RpcNluUnitV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcNluUnitV1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.rossonet.ptalk.nlu.grpc.PtalkNluApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcNluUnitV1");
    }
  }

  private static final class RpcNluUnitV1FileDescriptorSupplier
      extends RpcNluUnitV1BaseDescriptorSupplier {
    RpcNluUnitV1FileDescriptorSupplier() {}
  }

  private static final class RpcNluUnitV1MethodDescriptorSupplier
      extends RpcNluUnitV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RpcNluUnitV1MethodDescriptorSupplier(String methodName) {
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
      synchronized (RpcNluUnitV1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcNluUnitV1FileDescriptorSupplier())
              .addMethod(getCallSyncMethod())
              .addMethod(getCallAsyncMethod())
              .addMethod(getTrainModelSyncMethod())
              .addMethod(getTrainModelAsyncMethod())
              .addMethod(getListModelsMethod())
              .addMethod(getDeleteModelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
