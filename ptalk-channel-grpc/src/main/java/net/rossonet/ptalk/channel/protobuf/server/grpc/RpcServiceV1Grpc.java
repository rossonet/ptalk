package net.rossonet.ptalk.channel.protobuf.server.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: ptalk-channel-grpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RpcServiceV1Grpc {

  private RpcServiceV1Grpc() {}

  public static final String SERVICE_NAME = "channelGrpc.RpcServiceV1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterReply> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterRequest.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterReply> getRegisterMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterReply> getRegisterMethod;
    if ((getRegisterMethod = RpcServiceV1Grpc.getRegisterMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getRegisterMethod = RpcServiceV1Grpc.getRegisterMethod) == null) {
          RpcServiceV1Grpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("Register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent,
      net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage> getPollingCmdQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PollingCmdQueue",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent,
      net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage> getPollingCmdQueueMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage> getPollingCmdQueueMethod;
    if ((getPollingCmdQueueMethod = RpcServiceV1Grpc.getPollingCmdQueueMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getPollingCmdQueueMethod = RpcServiceV1Grpc.getPollingCmdQueueMethod) == null) {
          RpcServiceV1Grpc.getPollingCmdQueueMethod = getPollingCmdQueueMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PollingCmdQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("PollingCmdQueue"))
              .build();
        }
      }
    }
    return getPollingCmdQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent,
      net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage> getSubscriptionCmdQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscriptionCmdQueue",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent,
      net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage> getSubscriptionCmdQueueMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage> getSubscriptionCmdQueueMethod;
    if ((getSubscriptionCmdQueueMethod = RpcServiceV1Grpc.getSubscriptionCmdQueueMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getSubscriptionCmdQueueMethod = RpcServiceV1Grpc.getSubscriptionCmdQueueMethod) == null) {
          RpcServiceV1Grpc.getSubscriptionCmdQueueMethod = getSubscriptionCmdQueueMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscriptionCmdQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("SubscriptionCmdQueue"))
              .build();
        }
      }
    }
    return getSubscriptionCmdQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage,
      net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getSendChatMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendChatMessage",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage,
      net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getSendChatMessageMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage, net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getSendChatMessageMethod;
    if ((getSendChatMessageMethod = RpcServiceV1Grpc.getSendChatMessageMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getSendChatMessageMethod = RpcServiceV1Grpc.getSendChatMessageMethod) == null) {
          RpcServiceV1Grpc.getSendChatMessageMethod = getSendChatMessageMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage, net.rossonet.ptalk.channel.protobuf.server.grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendChatMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("SendChatMessage"))
              .build();
        }
      }
    }
    return getSendChatMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.CommandReplyRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getSendCommandReplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendCommandReply",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.CommandReplyRequest.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.CommandReplyRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getSendCommandReplyMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.CommandReplyRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getSendCommandReplyMethod;
    if ((getSendCommandReplyMethod = RpcServiceV1Grpc.getSendCommandReplyMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getSendCommandReplyMethod = RpcServiceV1Grpc.getSendCommandReplyMethod) == null) {
          RpcServiceV1Grpc.getSendCommandReplyMethod = getSendCommandReplyMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.CommandReplyRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendCommandReply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.CommandReplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("SendCommandReply"))
              .build();
        }
      }
    }
    return getSendCommandReplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getSendHealthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendHealth",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getSendHealthMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getSendHealthMethod;
    if ((getSendHealthMethod = RpcServiceV1Grpc.getSendHealthMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getSendHealthMethod = RpcServiceV1Grpc.getSendHealthMethod) == null) {
          RpcServiceV1Grpc.getSendHealthMethod = getSendHealthMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendHealth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("SendHealth"))
              .build();
        }
      }
    }
    return getSendHealthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.LogRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getSendLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendLog",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.LogRequest.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.LogRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getSendLogMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.LogRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getSendLogMethod;
    if ((getSendLogMethod = RpcServiceV1Grpc.getSendLogMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getSendLogMethod = RpcServiceV1Grpc.getSendLogMethod) == null) {
          RpcServiceV1Grpc.getSendLogMethod = getSendLogMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.LogRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.LogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("SendLog"))
              .build();
        }
      }
    }
    return getSendLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getSendExceptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendException",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getSendExceptionMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getSendExceptionMethod;
    if ((getSendExceptionMethod = RpcServiceV1Grpc.getSendExceptionMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getSendExceptionMethod = RpcServiceV1Grpc.getSendExceptionMethod) == null) {
          RpcServiceV1Grpc.getSendExceptionMethod = getSendExceptionMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendException"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("SendException"))
              .build();
        }
      }
    }
    return getSendExceptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReport,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply> getSendConfigRuntimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendConfigRuntime",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReport.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReport,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply> getSendConfigRuntimeMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReport, net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply> getSendConfigRuntimeMethod;
    if ((getSendConfigRuntimeMethod = RpcServiceV1Grpc.getSendConfigRuntimeMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getSendConfigRuntimeMethod = RpcServiceV1Grpc.getSendConfigRuntimeMethod) == null) {
          RpcServiceV1Grpc.getSendConfigRuntimeMethod = getSendConfigRuntimeMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReport, net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendConfigRuntime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReport.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("SendConfigRuntime"))
              .build();
        }
      }
    }
    return getSendConfigRuntimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply> getGetConfigRuntimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConfigRuntime",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply> getGetConfigRuntimeMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply> getGetConfigRuntimeMethod;
    if ((getGetConfigRuntimeMethod = RpcServiceV1Grpc.getGetConfigRuntimeMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getGetConfigRuntimeMethod = RpcServiceV1Grpc.getGetConfigRuntimeMethod) == null) {
          RpcServiceV1Grpc.getGetConfigRuntimeMethod = getGetConfigRuntimeMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConfigRuntime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("GetConfigRuntime"))
              .build();
        }
      }
    }
    return getGetConfigRuntimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply> getGetRuntimeProvidesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRuntimeProvides",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply> getGetRuntimeProvidesMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply> getGetRuntimeProvidesMethod;
    if ((getGetRuntimeProvidesMethod = RpcServiceV1Grpc.getGetRuntimeProvidesMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getGetRuntimeProvidesMethod = RpcServiceV1Grpc.getGetRuntimeProvidesMethod) == null) {
          RpcServiceV1Grpc.getGetRuntimeProvidesMethod = getGetRuntimeProvidesMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRuntimeProvides"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("GetRuntimeProvides"))
              .build();
        }
      }
    }
    return getGetRuntimeProvidesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply> getGetRuntimeRequiredMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRuntimeRequired",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply> getGetRuntimeRequiredMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply> getGetRuntimeRequiredMethod;
    if ((getGetRuntimeRequiredMethod = RpcServiceV1Grpc.getGetRuntimeRequiredMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getGetRuntimeRequiredMethod = RpcServiceV1Grpc.getGetRuntimeRequiredMethod) == null) {
          RpcServiceV1Grpc.getGetRuntimeRequiredMethod = getGetRuntimeRequiredMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRuntimeRequired"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("GetRuntimeRequired"))
              .build();
        }
      }
    }
    return getGetRuntimeRequiredMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Empty,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsReply> getListAgentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgents",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.Empty.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Empty,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsReply> getListAgentsMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Empty, net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsReply> getListAgentsMethod;
    if ((getListAgentsMethod = RpcServiceV1Grpc.getListAgentsMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getListAgentsMethod = RpcServiceV1Grpc.getListAgentsMethod) == null) {
          RpcServiceV1Grpc.getListAgentsMethod = getListAgentsMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.Empty, net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("ListAgents"))
              .build();
        }
      }
    }
    return getListAgentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Empty,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply> getListAgentsRequestCompleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentsRequestComplete",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.Empty.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Empty,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply> getListAgentsRequestCompleteMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Empty, net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply> getListAgentsRequestCompleteMethod;
    if ((getListAgentsRequestCompleteMethod = RpcServiceV1Grpc.getListAgentsRequestCompleteMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getListAgentsRequestCompleteMethod = RpcServiceV1Grpc.getListAgentsRequestCompleteMethod) == null) {
          RpcServiceV1Grpc.getListAgentsRequestCompleteMethod = getListAgentsRequestCompleteMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.Empty, net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgentsRequestComplete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("ListAgentsRequestComplete"))
              .build();
        }
      }
    }
    return getListAgentsRequestCompleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Empty,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply> getListAgentsRequestToDoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentsRequestToDo",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.Empty.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Empty,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply> getListAgentsRequestToDoMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Empty, net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply> getListAgentsRequestToDoMethod;
    if ((getListAgentsRequestToDoMethod = RpcServiceV1Grpc.getListAgentsRequestToDoMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getListAgentsRequestToDoMethod = RpcServiceV1Grpc.getListAgentsRequestToDoMethod) == null) {
          RpcServiceV1Grpc.getListAgentsRequestToDoMethod = getListAgentsRequestToDoMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.Empty, net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgentsRequestToDo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("ListAgentsRequestToDo"))
              .build();
        }
      }
    }
    return getListAgentsRequestToDoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.ApproveAgentRequestRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getApproveAgentRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveAgentRequest",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.ApproveAgentRequestRequest.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.ApproveAgentRequestRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getApproveAgentRequestMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.ApproveAgentRequestRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getApproveAgentRequestMethod;
    if ((getApproveAgentRequestMethod = RpcServiceV1Grpc.getApproveAgentRequestMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getApproveAgentRequestMethod = RpcServiceV1Grpc.getApproveAgentRequestMethod) == null) {
          RpcServiceV1Grpc.getApproveAgentRequestMethod = getApproveAgentRequestMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.ApproveAgentRequestRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveAgentRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.ApproveAgentRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("ApproveAgentRequest"))
              .build();
        }
      }
    }
    return getApproveAgentRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent,
      net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getKickAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KickAgent",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent,
      net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getKickAgentMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.Status> getKickAgentMethod;
    if ((getKickAgentMethod = RpcServiceV1Grpc.getKickAgentMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getKickAgentMethod = RpcServiceV1Grpc.getKickAgentMethod) == null) {
          RpcServiceV1Grpc.getKickAgentMethod = getKickAgentMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KickAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("KickAgent"))
              .build();
        }
      }
    }
    return getKickAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageReply> getElaborateMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ElaborateMessage",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageRequest.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageReply> getElaborateMessageMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageReply> getElaborateMessageMethod;
    if ((getElaborateMessageMethod = RpcServiceV1Grpc.getElaborateMessageMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getElaborateMessageMethod = RpcServiceV1Grpc.getElaborateMessageMethod) == null) {
          RpcServiceV1Grpc.getElaborateMessageMethod = getElaborateMessageMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ElaborateMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("ElaborateMessage"))
              .build();
        }
      }
    }
    return getElaborateMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply> getListCommandsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCommands",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsRequest.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply> getListCommandsMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply> getListCommandsMethod;
    if ((getListCommandsMethod = RpcServiceV1Grpc.getListCommandsMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getListCommandsMethod = RpcServiceV1Grpc.getListCommandsMethod) == null) {
          RpcServiceV1Grpc.getListCommandsMethod = getListCommandsMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCommands"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("ListCommands"))
              .build();
        }
      }
    }
    return getListCommandsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandReply> getCompleteCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompleteCommand",
      requestType = net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest.class,
      responseType = net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest,
      net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandReply> getCompleteCommandMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandReply> getCompleteCommandMethod;
    if ((getCompleteCommandMethod = RpcServiceV1Grpc.getCompleteCommandMethod) == null) {
      synchronized (RpcServiceV1Grpc.class) {
        if ((getCompleteCommandMethod = RpcServiceV1Grpc.getCompleteCommandMethod) == null) {
          RpcServiceV1Grpc.getCompleteCommandMethod = getCompleteCommandMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CompleteCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceV1MethodDescriptorSupplier("CompleteCommand"))
              .build();
        }
      }
    }
    return getCompleteCommandMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcServiceV1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcServiceV1Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcServiceV1Stub>() {
        @java.lang.Override
        public RpcServiceV1Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcServiceV1Stub(channel, callOptions);
        }
      };
    return RpcServiceV1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcServiceV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcServiceV1BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcServiceV1BlockingStub>() {
        @java.lang.Override
        public RpcServiceV1BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcServiceV1BlockingStub(channel, callOptions);
        }
      };
    return RpcServiceV1BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcServiceV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcServiceV1FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcServiceV1FutureStub>() {
        @java.lang.Override
        public RpcServiceV1FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcServiceV1FutureStub(channel, callOptions);
        }
      };
    return RpcServiceV1FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RpcServiceV1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void pollingCmdQueue(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPollingCmdQueueMethod(), responseObserver);
    }

    /**
     */
    public void subscriptionCmdQueue(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscriptionCmdQueueMethod(), responseObserver);
    }

    /**
     */
    public void sendChatMessage(net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendChatMessageMethod(), responseObserver);
    }

    /**
     */
    public void sendCommandReply(net.rossonet.ptalk.channel.protobuf.server.grpc.CommandReplyRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendCommandReplyMethod(), responseObserver);
    }

    /**
     */
    public void sendHealth(net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendHealthMethod(), responseObserver);
    }

    /**
     */
    public void sendLog(net.rossonet.ptalk.channel.protobuf.server.grpc.LogRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendLogMethod(), responseObserver);
    }

    /**
     */
    public void sendException(net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendExceptionMethod(), responseObserver);
    }

    /**
     */
    public void sendConfigRuntime(net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReport request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendConfigRuntimeMethod(), responseObserver);
    }

    /**
     */
    public void getConfigRuntime(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConfigRuntimeMethod(), responseObserver);
    }

    /**
     */
    public void getRuntimeProvides(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRuntimeProvidesMethod(), responseObserver);
    }

    /**
     */
    public void getRuntimeRequired(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRuntimeRequiredMethod(), responseObserver);
    }

    /**
     */
    public void listAgents(net.rossonet.ptalk.channel.protobuf.server.grpc.Empty request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgentsMethod(), responseObserver);
    }

    /**
     */
    public void listAgentsRequestComplete(net.rossonet.ptalk.channel.protobuf.server.grpc.Empty request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgentsRequestCompleteMethod(), responseObserver);
    }

    /**
     */
    public void listAgentsRequestToDo(net.rossonet.ptalk.channel.protobuf.server.grpc.Empty request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgentsRequestToDoMethod(), responseObserver);
    }

    /**
     */
    public void approveAgentRequest(net.rossonet.ptalk.channel.protobuf.server.grpc.ApproveAgentRequestRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveAgentRequestMethod(), responseObserver);
    }

    /**
     */
    public void kickAgent(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKickAgentMethod(), responseObserver);
    }

    /**
     */
    public void elaborateMessage(net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getElaborateMessageMethod(), responseObserver);
    }

    /**
     */
    public void listCommands(net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCommandsMethod(), responseObserver);
    }

    /**
     */
    public void completeCommand(net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompleteCommandMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterRequest,
                net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterReply>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getPollingCmdQueueMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.Agent,
                net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage>(
                  this, METHODID_POLLING_CMD_QUEUE)))
          .addMethod(
            getSubscriptionCmdQueueMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.Agent,
                net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage>(
                  this, METHODID_SUBSCRIPTION_CMD_QUEUE)))
          .addMethod(
            getSendChatMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage,
                net.rossonet.ptalk.channel.protobuf.server.grpc.Status>(
                  this, METHODID_SEND_CHAT_MESSAGE)))
          .addMethod(
            getSendCommandReplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.CommandReplyRequest,
                net.rossonet.ptalk.channel.protobuf.server.grpc.Status>(
                  this, METHODID_SEND_COMMAND_REPLY)))
          .addMethod(
            getSendHealthMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest,
                net.rossonet.ptalk.channel.protobuf.server.grpc.Status>(
                  this, METHODID_SEND_HEALTH)))
          .addMethod(
            getSendLogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.LogRequest,
                net.rossonet.ptalk.channel.protobuf.server.grpc.Status>(
                  this, METHODID_SEND_LOG)))
          .addMethod(
            getSendExceptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest,
                net.rossonet.ptalk.channel.protobuf.server.grpc.Status>(
                  this, METHODID_SEND_EXCEPTION)))
          .addMethod(
            getSendConfigRuntimeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReport,
                net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply>(
                  this, METHODID_SEND_CONFIG_RUNTIME)))
          .addMethod(
            getGetConfigRuntimeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.Agent,
                net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply>(
                  this, METHODID_GET_CONFIG_RUNTIME)))
          .addMethod(
            getGetRuntimeProvidesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.Agent,
                net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply>(
                  this, METHODID_GET_RUNTIME_PROVIDES)))
          .addMethod(
            getGetRuntimeRequiredMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.Agent,
                net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply>(
                  this, METHODID_GET_RUNTIME_REQUIRED)))
          .addMethod(
            getListAgentsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.Empty,
                net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsReply>(
                  this, METHODID_LIST_AGENTS)))
          .addMethod(
            getListAgentsRequestCompleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.Empty,
                net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply>(
                  this, METHODID_LIST_AGENTS_REQUEST_COMPLETE)))
          .addMethod(
            getListAgentsRequestToDoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.Empty,
                net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply>(
                  this, METHODID_LIST_AGENTS_REQUEST_TO_DO)))
          .addMethod(
            getApproveAgentRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.ApproveAgentRequestRequest,
                net.rossonet.ptalk.channel.protobuf.server.grpc.Status>(
                  this, METHODID_APPROVE_AGENT_REQUEST)))
          .addMethod(
            getKickAgentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.Agent,
                net.rossonet.ptalk.channel.protobuf.server.grpc.Status>(
                  this, METHODID_KICK_AGENT)))
          .addMethod(
            getElaborateMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageRequest,
                net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageReply>(
                  this, METHODID_ELABORATE_MESSAGE)))
          .addMethod(
            getListCommandsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsRequest,
                net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply>(
                  this, METHODID_LIST_COMMANDS)))
          .addMethod(
            getCompleteCommandMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest,
                net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandReply>(
                  this, METHODID_COMPLETE_COMMAND)))
          .build();
    }
  }

  /**
   */
  public static final class RpcServiceV1Stub extends io.grpc.stub.AbstractAsyncStub<RpcServiceV1Stub> {
    private RpcServiceV1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcServiceV1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcServiceV1Stub(channel, callOptions);
    }

    /**
     */
    public void register(net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pollingCmdQueue(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPollingCmdQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscriptionCmdQueue(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscriptionCmdQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendChatMessage(net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendChatMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendCommandReply(net.rossonet.ptalk.channel.protobuf.server.grpc.CommandReplyRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendCommandReplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendHealth(net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendHealthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendLog(net.rossonet.ptalk.channel.protobuf.server.grpc.LogRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendException(net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendExceptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendConfigRuntime(net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReport request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendConfigRuntimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getConfigRuntime(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConfigRuntimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRuntimeProvides(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRuntimeProvidesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRuntimeRequired(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRuntimeRequiredMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAgents(net.rossonet.ptalk.channel.protobuf.server.grpc.Empty request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAgentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAgentsRequestComplete(net.rossonet.ptalk.channel.protobuf.server.grpc.Empty request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAgentsRequestCompleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAgentsRequestToDo(net.rossonet.ptalk.channel.protobuf.server.grpc.Empty request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAgentsRequestToDoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void approveAgentRequest(net.rossonet.ptalk.channel.protobuf.server.grpc.ApproveAgentRequestRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveAgentRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kickAgent(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKickAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void elaborateMessage(net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getElaborateMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCommands(net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCommandsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void completeCommand(net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompleteCommandMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RpcServiceV1BlockingStub extends io.grpc.stub.AbstractBlockingStub<RpcServiceV1BlockingStub> {
    private RpcServiceV1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcServiceV1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcServiceV1BlockingStub(channel, callOptions);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterReply register(net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage pollingCmdQueue(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPollingCmdQueueMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage> subscriptionCmdQueue(
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscriptionCmdQueueMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Status sendChatMessage(net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendChatMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Status sendCommandReply(net.rossonet.ptalk.channel.protobuf.server.grpc.CommandReplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendCommandReplyMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Status sendHealth(net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendHealthMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Status sendLog(net.rossonet.ptalk.channel.protobuf.server.grpc.LogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendLogMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Status sendException(net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendExceptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply sendConfigRuntime(net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReport request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendConfigRuntimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply getConfigRuntime(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConfigRuntimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply getRuntimeProvides(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRuntimeProvidesMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply getRuntimeRequired(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRuntimeRequiredMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsReply listAgents(net.rossonet.ptalk.channel.protobuf.server.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAgentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply listAgentsRequestComplete(net.rossonet.ptalk.channel.protobuf.server.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAgentsRequestCompleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply listAgentsRequestToDo(net.rossonet.ptalk.channel.protobuf.server.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAgentsRequestToDoMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Status approveAgentRequest(net.rossonet.ptalk.channel.protobuf.server.grpc.ApproveAgentRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveAgentRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Status kickAgent(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKickAgentMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageReply elaborateMessage(net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getElaborateMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply listCommands(net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCommandsMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandReply completeCommand(net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompleteCommandMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RpcServiceV1FutureStub extends io.grpc.stub.AbstractFutureStub<RpcServiceV1FutureStub> {
    private RpcServiceV1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcServiceV1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcServiceV1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterReply> register(
        net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage> pollingCmdQueue(
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPollingCmdQueueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> sendChatMessage(
        net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendChatMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> sendCommandReply(
        net.rossonet.ptalk.channel.protobuf.server.grpc.CommandReplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendCommandReplyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> sendHealth(
        net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendHealthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> sendLog(
        net.rossonet.ptalk.channel.protobuf.server.grpc.LogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendLogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> sendException(
        net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendExceptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply> sendConfigRuntime(
        net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReport request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendConfigRuntimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply> getConfigRuntime(
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConfigRuntimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply> getRuntimeProvides(
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRuntimeProvidesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply> getRuntimeRequired(
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRuntimeRequiredMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsReply> listAgents(
        net.rossonet.ptalk.channel.protobuf.server.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAgentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply> listAgentsRequestComplete(
        net.rossonet.ptalk.channel.protobuf.server.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAgentsRequestCompleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply> listAgentsRequestToDo(
        net.rossonet.ptalk.channel.protobuf.server.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAgentsRequestToDoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> approveAgentRequest(
        net.rossonet.ptalk.channel.protobuf.server.grpc.ApproveAgentRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveAgentRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.Status> kickAgent(
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKickAgentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageReply> elaborateMessage(
        net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getElaborateMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply> listCommands(
        net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCommandsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandReply> completeCommand(
        net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompleteCommandMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_POLLING_CMD_QUEUE = 1;
  private static final int METHODID_SUBSCRIPTION_CMD_QUEUE = 2;
  private static final int METHODID_SEND_CHAT_MESSAGE = 3;
  private static final int METHODID_SEND_COMMAND_REPLY = 4;
  private static final int METHODID_SEND_HEALTH = 5;
  private static final int METHODID_SEND_LOG = 6;
  private static final int METHODID_SEND_EXCEPTION = 7;
  private static final int METHODID_SEND_CONFIG_RUNTIME = 8;
  private static final int METHODID_GET_CONFIG_RUNTIME = 9;
  private static final int METHODID_GET_RUNTIME_PROVIDES = 10;
  private static final int METHODID_GET_RUNTIME_REQUIRED = 11;
  private static final int METHODID_LIST_AGENTS = 12;
  private static final int METHODID_LIST_AGENTS_REQUEST_COMPLETE = 13;
  private static final int METHODID_LIST_AGENTS_REQUEST_TO_DO = 14;
  private static final int METHODID_APPROVE_AGENT_REQUEST = 15;
  private static final int METHODID_KICK_AGENT = 16;
  private static final int METHODID_ELABORATE_MESSAGE = 17;
  private static final int METHODID_LIST_COMMANDS = 18;
  private static final int METHODID_COMPLETE_COMMAND = 19;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RpcServiceV1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RpcServiceV1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterReply>) responseObserver);
          break;
        case METHODID_POLLING_CMD_QUEUE:
          serviceImpl.pollingCmdQueue((net.rossonet.ptalk.channel.protobuf.server.grpc.Agent) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage>) responseObserver);
          break;
        case METHODID_SUBSCRIPTION_CMD_QUEUE:
          serviceImpl.subscriptionCmdQueue((net.rossonet.ptalk.channel.protobuf.server.grpc.Agent) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage>) responseObserver);
          break;
        case METHODID_SEND_CHAT_MESSAGE:
          serviceImpl.sendChatMessage((net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status>) responseObserver);
          break;
        case METHODID_SEND_COMMAND_REPLY:
          serviceImpl.sendCommandReply((net.rossonet.ptalk.channel.protobuf.server.grpc.CommandReplyRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status>) responseObserver);
          break;
        case METHODID_SEND_HEALTH:
          serviceImpl.sendHealth((net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status>) responseObserver);
          break;
        case METHODID_SEND_LOG:
          serviceImpl.sendLog((net.rossonet.ptalk.channel.protobuf.server.grpc.LogRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status>) responseObserver);
          break;
        case METHODID_SEND_EXCEPTION:
          serviceImpl.sendException((net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status>) responseObserver);
          break;
        case METHODID_SEND_CONFIG_RUNTIME:
          serviceImpl.sendConfigRuntime((net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReport) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply>) responseObserver);
          break;
        case METHODID_GET_CONFIG_RUNTIME:
          serviceImpl.getConfigRuntime((net.rossonet.ptalk.channel.protobuf.server.grpc.Agent) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ConfigReply>) responseObserver);
          break;
        case METHODID_GET_RUNTIME_PROVIDES:
          serviceImpl.getRuntimeProvides((net.rossonet.ptalk.channel.protobuf.server.grpc.Agent) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply>) responseObserver);
          break;
        case METHODID_GET_RUNTIME_REQUIRED:
          serviceImpl.getRuntimeRequired((net.rossonet.ptalk.channel.protobuf.server.grpc.Agent) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ListStringReply>) responseObserver);
          break;
        case METHODID_LIST_AGENTS:
          serviceImpl.listAgents((net.rossonet.ptalk.channel.protobuf.server.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsReply>) responseObserver);
          break;
        case METHODID_LIST_AGENTS_REQUEST_COMPLETE:
          serviceImpl.listAgentsRequestComplete((net.rossonet.ptalk.channel.protobuf.server.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply>) responseObserver);
          break;
        case METHODID_LIST_AGENTS_REQUEST_TO_DO:
          serviceImpl.listAgentsRequestToDo((net.rossonet.ptalk.channel.protobuf.server.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply>) responseObserver);
          break;
        case METHODID_APPROVE_AGENT_REQUEST:
          serviceImpl.approveAgentRequest((net.rossonet.ptalk.channel.protobuf.server.grpc.ApproveAgentRequestRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status>) responseObserver);
          break;
        case METHODID_KICK_AGENT:
          serviceImpl.kickAgent((net.rossonet.ptalk.channel.protobuf.server.grpc.Agent) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.Status>) responseObserver);
          break;
        case METHODID_ELABORATE_MESSAGE:
          serviceImpl.elaborateMessage((net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ElaborateMessageReply>) responseObserver);
          break;
        case METHODID_LIST_COMMANDS:
          serviceImpl.listCommands((net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply>) responseObserver);
          break;
        case METHODID_COMPLETE_COMMAND:
          serviceImpl.completeCommand((net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandReply>) responseObserver);
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

  private static abstract class RpcServiceV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcServiceV1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcServiceV1");
    }
  }

  private static final class RpcServiceV1FileDescriptorSupplier
      extends RpcServiceV1BaseDescriptorSupplier {
    RpcServiceV1FileDescriptorSupplier() {}
  }

  private static final class RpcServiceV1MethodDescriptorSupplier
      extends RpcServiceV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RpcServiceV1MethodDescriptorSupplier(String methodName) {
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
      synchronized (RpcServiceV1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcServiceV1FileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getPollingCmdQueueMethod())
              .addMethod(getSubscriptionCmdQueueMethod())
              .addMethod(getSendChatMessageMethod())
              .addMethod(getSendCommandReplyMethod())
              .addMethod(getSendHealthMethod())
              .addMethod(getSendLogMethod())
              .addMethod(getSendExceptionMethod())
              .addMethod(getSendConfigRuntimeMethod())
              .addMethod(getGetConfigRuntimeMethod())
              .addMethod(getGetRuntimeProvidesMethod())
              .addMethod(getGetRuntimeRequiredMethod())
              .addMethod(getListAgentsMethod())
              .addMethod(getListAgentsRequestCompleteMethod())
              .addMethod(getListAgentsRequestToDoMethod())
              .addMethod(getApproveAgentRequestMethod())
              .addMethod(getKickAgentMethod())
              .addMethod(getElaborateMessageMethod())
              .addMethod(getListCommandsMethod())
              .addMethod(getCompleteCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
