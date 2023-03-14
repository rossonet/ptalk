package net.rossonet.ptalk.ability.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *only for super ability ( homunculus )
 * </pre>
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

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.DumpConfigurationRequest,
      net.rossonet.ptalk.ability.grpc.DumpConfigurationReply> getDumpConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DumpConfiguration",
      requestType = net.rossonet.ptalk.ability.grpc.DumpConfigurationRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.DumpConfigurationReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.DumpConfigurationRequest,
      net.rossonet.ptalk.ability.grpc.DumpConfigurationReply> getDumpConfigurationMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.DumpConfigurationRequest, net.rossonet.ptalk.ability.grpc.DumpConfigurationReply> getDumpConfigurationMethod;
    if ((getDumpConfigurationMethod = RpcSuperAbilityCoreV1Grpc.getDumpConfigurationMethod) == null) {
      synchronized (RpcSuperAbilityCoreV1Grpc.class) {
        if ((getDumpConfigurationMethod = RpcSuperAbilityCoreV1Grpc.getDumpConfigurationMethod) == null) {
          RpcSuperAbilityCoreV1Grpc.getDumpConfigurationMethod = getDumpConfigurationMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.DumpConfigurationRequest, net.rossonet.ptalk.ability.grpc.DumpConfigurationReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DumpConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.DumpConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.DumpConfigurationReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcSuperAbilityCoreV1MethodDescriptorSupplier("DumpConfiguration"))
              .build();
        }
      }
    }
    return getDumpConfigurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.RegisterRuleRequest,
      net.rossonet.ptalk.ability.grpc.RegisterRuleReply> getRegisterPreRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterPreRule",
      requestType = net.rossonet.ptalk.ability.grpc.RegisterRuleRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.RegisterRuleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.RegisterRuleRequest,
      net.rossonet.ptalk.ability.grpc.RegisterRuleReply> getRegisterPreRuleMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.RegisterRuleRequest, net.rossonet.ptalk.ability.grpc.RegisterRuleReply> getRegisterPreRuleMethod;
    if ((getRegisterPreRuleMethod = RpcSuperAbilityCoreV1Grpc.getRegisterPreRuleMethod) == null) {
      synchronized (RpcSuperAbilityCoreV1Grpc.class) {
        if ((getRegisterPreRuleMethod = RpcSuperAbilityCoreV1Grpc.getRegisterPreRuleMethod) == null) {
          RpcSuperAbilityCoreV1Grpc.getRegisterPreRuleMethod = getRegisterPreRuleMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.RegisterRuleRequest, net.rossonet.ptalk.ability.grpc.RegisterRuleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterPreRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.RegisterRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.RegisterRuleReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcSuperAbilityCoreV1MethodDescriptorSupplier("RegisterPreRule"))
              .build();
        }
      }
    }
    return getRegisterPreRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.CancelRuleRequest,
      net.rossonet.ptalk.ability.grpc.CancelRuleReply> getCancelPreRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelPreRule",
      requestType = net.rossonet.ptalk.ability.grpc.CancelRuleRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.CancelRuleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.CancelRuleRequest,
      net.rossonet.ptalk.ability.grpc.CancelRuleReply> getCancelPreRuleMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.CancelRuleRequest, net.rossonet.ptalk.ability.grpc.CancelRuleReply> getCancelPreRuleMethod;
    if ((getCancelPreRuleMethod = RpcSuperAbilityCoreV1Grpc.getCancelPreRuleMethod) == null) {
      synchronized (RpcSuperAbilityCoreV1Grpc.class) {
        if ((getCancelPreRuleMethod = RpcSuperAbilityCoreV1Grpc.getCancelPreRuleMethod) == null) {
          RpcSuperAbilityCoreV1Grpc.getCancelPreRuleMethod = getCancelPreRuleMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.CancelRuleRequest, net.rossonet.ptalk.ability.grpc.CancelRuleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelPreRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.CancelRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.CancelRuleReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcSuperAbilityCoreV1MethodDescriptorSupplier("CancelPreRule"))
              .build();
        }
      }
    }
    return getCancelPreRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.ListRulesRequest,
      net.rossonet.ptalk.ability.grpc.ListRulesReply> getListPreRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPreRules",
      requestType = net.rossonet.ptalk.ability.grpc.ListRulesRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.ListRulesReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.ListRulesRequest,
      net.rossonet.ptalk.ability.grpc.ListRulesReply> getListPreRulesMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.ListRulesRequest, net.rossonet.ptalk.ability.grpc.ListRulesReply> getListPreRulesMethod;
    if ((getListPreRulesMethod = RpcSuperAbilityCoreV1Grpc.getListPreRulesMethod) == null) {
      synchronized (RpcSuperAbilityCoreV1Grpc.class) {
        if ((getListPreRulesMethod = RpcSuperAbilityCoreV1Grpc.getListPreRulesMethod) == null) {
          RpcSuperAbilityCoreV1Grpc.getListPreRulesMethod = getListPreRulesMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.ListRulesRequest, net.rossonet.ptalk.ability.grpc.ListRulesReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPreRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.ListRulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.ListRulesReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcSuperAbilityCoreV1MethodDescriptorSupplier("ListPreRules"))
              .build();
        }
      }
    }
    return getListPreRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.GetRuleRequest,
      net.rossonet.ptalk.ability.grpc.GetRuleReply> getGetPreRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPreRule",
      requestType = net.rossonet.ptalk.ability.grpc.GetRuleRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.GetRuleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.GetRuleRequest,
      net.rossonet.ptalk.ability.grpc.GetRuleReply> getGetPreRuleMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.GetRuleRequest, net.rossonet.ptalk.ability.grpc.GetRuleReply> getGetPreRuleMethod;
    if ((getGetPreRuleMethod = RpcSuperAbilityCoreV1Grpc.getGetPreRuleMethod) == null) {
      synchronized (RpcSuperAbilityCoreV1Grpc.class) {
        if ((getGetPreRuleMethod = RpcSuperAbilityCoreV1Grpc.getGetPreRuleMethod) == null) {
          RpcSuperAbilityCoreV1Grpc.getGetPreRuleMethod = getGetPreRuleMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.GetRuleRequest, net.rossonet.ptalk.ability.grpc.GetRuleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPreRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.GetRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.GetRuleReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcSuperAbilityCoreV1MethodDescriptorSupplier("GetPreRule"))
              .build();
        }
      }
    }
    return getGetPreRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.RegisterRuleRequest,
      net.rossonet.ptalk.ability.grpc.RegisterRuleReply> getRegisterPostRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterPostRule",
      requestType = net.rossonet.ptalk.ability.grpc.RegisterRuleRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.RegisterRuleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.RegisterRuleRequest,
      net.rossonet.ptalk.ability.grpc.RegisterRuleReply> getRegisterPostRuleMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.RegisterRuleRequest, net.rossonet.ptalk.ability.grpc.RegisterRuleReply> getRegisterPostRuleMethod;
    if ((getRegisterPostRuleMethod = RpcSuperAbilityCoreV1Grpc.getRegisterPostRuleMethod) == null) {
      synchronized (RpcSuperAbilityCoreV1Grpc.class) {
        if ((getRegisterPostRuleMethod = RpcSuperAbilityCoreV1Grpc.getRegisterPostRuleMethod) == null) {
          RpcSuperAbilityCoreV1Grpc.getRegisterPostRuleMethod = getRegisterPostRuleMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.RegisterRuleRequest, net.rossonet.ptalk.ability.grpc.RegisterRuleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterPostRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.RegisterRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.RegisterRuleReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcSuperAbilityCoreV1MethodDescriptorSupplier("RegisterPostRule"))
              .build();
        }
      }
    }
    return getRegisterPostRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.CancelRuleRequest,
      net.rossonet.ptalk.ability.grpc.CancelRuleReply> getCancelPostRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelPostRule",
      requestType = net.rossonet.ptalk.ability.grpc.CancelRuleRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.CancelRuleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.CancelRuleRequest,
      net.rossonet.ptalk.ability.grpc.CancelRuleReply> getCancelPostRuleMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.CancelRuleRequest, net.rossonet.ptalk.ability.grpc.CancelRuleReply> getCancelPostRuleMethod;
    if ((getCancelPostRuleMethod = RpcSuperAbilityCoreV1Grpc.getCancelPostRuleMethod) == null) {
      synchronized (RpcSuperAbilityCoreV1Grpc.class) {
        if ((getCancelPostRuleMethod = RpcSuperAbilityCoreV1Grpc.getCancelPostRuleMethod) == null) {
          RpcSuperAbilityCoreV1Grpc.getCancelPostRuleMethod = getCancelPostRuleMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.CancelRuleRequest, net.rossonet.ptalk.ability.grpc.CancelRuleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelPostRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.CancelRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.CancelRuleReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcSuperAbilityCoreV1MethodDescriptorSupplier("CancelPostRule"))
              .build();
        }
      }
    }
    return getCancelPostRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.ListRulesRequest,
      net.rossonet.ptalk.ability.grpc.ListRulesReply> getListPostRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPostRules",
      requestType = net.rossonet.ptalk.ability.grpc.ListRulesRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.ListRulesReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.ListRulesRequest,
      net.rossonet.ptalk.ability.grpc.ListRulesReply> getListPostRulesMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.ListRulesRequest, net.rossonet.ptalk.ability.grpc.ListRulesReply> getListPostRulesMethod;
    if ((getListPostRulesMethod = RpcSuperAbilityCoreV1Grpc.getListPostRulesMethod) == null) {
      synchronized (RpcSuperAbilityCoreV1Grpc.class) {
        if ((getListPostRulesMethod = RpcSuperAbilityCoreV1Grpc.getListPostRulesMethod) == null) {
          RpcSuperAbilityCoreV1Grpc.getListPostRulesMethod = getListPostRulesMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.ListRulesRequest, net.rossonet.ptalk.ability.grpc.ListRulesReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPostRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.ListRulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.ListRulesReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcSuperAbilityCoreV1MethodDescriptorSupplier("ListPostRules"))
              .build();
        }
      }
    }
    return getListPostRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.GetRuleRequest,
      net.rossonet.ptalk.ability.grpc.GetRuleReply> getGetPostRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPostRule",
      requestType = net.rossonet.ptalk.ability.grpc.GetRuleRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.GetRuleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.GetRuleRequest,
      net.rossonet.ptalk.ability.grpc.GetRuleReply> getGetPostRuleMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.GetRuleRequest, net.rossonet.ptalk.ability.grpc.GetRuleReply> getGetPostRuleMethod;
    if ((getGetPostRuleMethod = RpcSuperAbilityCoreV1Grpc.getGetPostRuleMethod) == null) {
      synchronized (RpcSuperAbilityCoreV1Grpc.class) {
        if ((getGetPostRuleMethod = RpcSuperAbilityCoreV1Grpc.getGetPostRuleMethod) == null) {
          RpcSuperAbilityCoreV1Grpc.getGetPostRuleMethod = getGetPostRuleMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.GetRuleRequest, net.rossonet.ptalk.ability.grpc.GetRuleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPostRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.GetRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.GetRuleReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcSuperAbilityCoreV1MethodDescriptorSupplier("GetPostRule"))
              .build();
        }
      }
    }
    return getGetPostRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.MemoryContextManagementRequest,
      net.rossonet.ptalk.ability.grpc.MemoryContextManagementReply> getMemoryManagementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MemoryManagement",
      requestType = net.rossonet.ptalk.ability.grpc.MemoryContextManagementRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.MemoryContextManagementReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.MemoryContextManagementRequest,
      net.rossonet.ptalk.ability.grpc.MemoryContextManagementReply> getMemoryManagementMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.MemoryContextManagementRequest, net.rossonet.ptalk.ability.grpc.MemoryContextManagementReply> getMemoryManagementMethod;
    if ((getMemoryManagementMethod = RpcSuperAbilityCoreV1Grpc.getMemoryManagementMethod) == null) {
      synchronized (RpcSuperAbilityCoreV1Grpc.class) {
        if ((getMemoryManagementMethod = RpcSuperAbilityCoreV1Grpc.getMemoryManagementMethod) == null) {
          RpcSuperAbilityCoreV1Grpc.getMemoryManagementMethod = getMemoryManagementMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.MemoryContextManagementRequest, net.rossonet.ptalk.ability.grpc.MemoryContextManagementReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MemoryManagement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.MemoryContextManagementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.MemoryContextManagementReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcSuperAbilityCoreV1MethodDescriptorSupplier("MemoryManagement"))
              .build();
        }
      }
    }
    return getMemoryManagementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementRequest,
      net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementReply> getGeneralConfigurationManagementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GeneralConfigurationManagement",
      requestType = net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementRequest.class,
      responseType = net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementRequest,
      net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementReply> getGeneralConfigurationManagementMethod() {
    io.grpc.MethodDescriptor<net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementRequest, net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementReply> getGeneralConfigurationManagementMethod;
    if ((getGeneralConfigurationManagementMethod = RpcSuperAbilityCoreV1Grpc.getGeneralConfigurationManagementMethod) == null) {
      synchronized (RpcSuperAbilityCoreV1Grpc.class) {
        if ((getGeneralConfigurationManagementMethod = RpcSuperAbilityCoreV1Grpc.getGeneralConfigurationManagementMethod) == null) {
          RpcSuperAbilityCoreV1Grpc.getGeneralConfigurationManagementMethod = getGeneralConfigurationManagementMethod =
              io.grpc.MethodDescriptor.<net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementRequest, net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GeneralConfigurationManagement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementReply.getDefaultInstance()))
              .setSchemaDescriptor(new RpcSuperAbilityCoreV1MethodDescriptorSupplier("GeneralConfigurationManagement"))
              .build();
        }
      }
    }
    return getGeneralConfigurationManagementMethod;
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
   * <pre>
   *only for super ability ( homunculus )
   * </pre>
   */
  public static abstract class RpcSuperAbilityCoreV1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void pushConfiguration(net.rossonet.ptalk.ability.grpc.PushConfigurationRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.PushConfigurationReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPushConfigurationMethod(), responseObserver);
    }

    /**
     */
    public void dumpConfiguration(net.rossonet.ptalk.ability.grpc.DumpConfigurationRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.DumpConfigurationReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDumpConfigurationMethod(), responseObserver);
    }

    /**
     */
    public void registerPreRule(net.rossonet.ptalk.ability.grpc.RegisterRuleRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.RegisterRuleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterPreRuleMethod(), responseObserver);
    }

    /**
     */
    public void cancelPreRule(net.rossonet.ptalk.ability.grpc.CancelRuleRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.CancelRuleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelPreRuleMethod(), responseObserver);
    }

    /**
     */
    public void listPreRules(net.rossonet.ptalk.ability.grpc.ListRulesRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.ListRulesReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPreRulesMethod(), responseObserver);
    }

    /**
     */
    public void getPreRule(net.rossonet.ptalk.ability.grpc.GetRuleRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.GetRuleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPreRuleMethod(), responseObserver);
    }

    /**
     */
    public void registerPostRule(net.rossonet.ptalk.ability.grpc.RegisterRuleRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.RegisterRuleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterPostRuleMethod(), responseObserver);
    }

    /**
     */
    public void cancelPostRule(net.rossonet.ptalk.ability.grpc.CancelRuleRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.CancelRuleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelPostRuleMethod(), responseObserver);
    }

    /**
     */
    public void listPostRules(net.rossonet.ptalk.ability.grpc.ListRulesRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.ListRulesReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPostRulesMethod(), responseObserver);
    }

    /**
     */
    public void getPostRule(net.rossonet.ptalk.ability.grpc.GetRuleRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.GetRuleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPostRuleMethod(), responseObserver);
    }

    /**
     */
    public void memoryManagement(net.rossonet.ptalk.ability.grpc.MemoryContextManagementRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.MemoryContextManagementReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMemoryManagementMethod(), responseObserver);
    }

    /**
     */
    public void generalConfigurationManagement(net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGeneralConfigurationManagementMethod(), responseObserver);
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
          .addMethod(
            getDumpConfigurationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.DumpConfigurationRequest,
                net.rossonet.ptalk.ability.grpc.DumpConfigurationReply>(
                  this, METHODID_DUMP_CONFIGURATION)))
          .addMethod(
            getRegisterPreRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.RegisterRuleRequest,
                net.rossonet.ptalk.ability.grpc.RegisterRuleReply>(
                  this, METHODID_REGISTER_PRE_RULE)))
          .addMethod(
            getCancelPreRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.CancelRuleRequest,
                net.rossonet.ptalk.ability.grpc.CancelRuleReply>(
                  this, METHODID_CANCEL_PRE_RULE)))
          .addMethod(
            getListPreRulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.ListRulesRequest,
                net.rossonet.ptalk.ability.grpc.ListRulesReply>(
                  this, METHODID_LIST_PRE_RULES)))
          .addMethod(
            getGetPreRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.GetRuleRequest,
                net.rossonet.ptalk.ability.grpc.GetRuleReply>(
                  this, METHODID_GET_PRE_RULE)))
          .addMethod(
            getRegisterPostRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.RegisterRuleRequest,
                net.rossonet.ptalk.ability.grpc.RegisterRuleReply>(
                  this, METHODID_REGISTER_POST_RULE)))
          .addMethod(
            getCancelPostRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.CancelRuleRequest,
                net.rossonet.ptalk.ability.grpc.CancelRuleReply>(
                  this, METHODID_CANCEL_POST_RULE)))
          .addMethod(
            getListPostRulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.ListRulesRequest,
                net.rossonet.ptalk.ability.grpc.ListRulesReply>(
                  this, METHODID_LIST_POST_RULES)))
          .addMethod(
            getGetPostRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.GetRuleRequest,
                net.rossonet.ptalk.ability.grpc.GetRuleReply>(
                  this, METHODID_GET_POST_RULE)))
          .addMethod(
            getMemoryManagementMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.MemoryContextManagementRequest,
                net.rossonet.ptalk.ability.grpc.MemoryContextManagementReply>(
                  this, METHODID_MEMORY_MANAGEMENT)))
          .addMethod(
            getGeneralConfigurationManagementMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementRequest,
                net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementReply>(
                  this, METHODID_GENERAL_CONFIGURATION_MANAGEMENT)))
          .build();
    }
  }

  /**
   * <pre>
   *only for super ability ( homunculus )
   * </pre>
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

    /**
     */
    public void dumpConfiguration(net.rossonet.ptalk.ability.grpc.DumpConfigurationRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.DumpConfigurationReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDumpConfigurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerPreRule(net.rossonet.ptalk.ability.grpc.RegisterRuleRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.RegisterRuleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterPreRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelPreRule(net.rossonet.ptalk.ability.grpc.CancelRuleRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.CancelRuleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelPreRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPreRules(net.rossonet.ptalk.ability.grpc.ListRulesRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.ListRulesReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPreRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPreRule(net.rossonet.ptalk.ability.grpc.GetRuleRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.GetRuleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPreRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerPostRule(net.rossonet.ptalk.ability.grpc.RegisterRuleRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.RegisterRuleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterPostRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelPostRule(net.rossonet.ptalk.ability.grpc.CancelRuleRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.CancelRuleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelPostRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPostRules(net.rossonet.ptalk.ability.grpc.ListRulesRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.ListRulesReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPostRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPostRule(net.rossonet.ptalk.ability.grpc.GetRuleRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.GetRuleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPostRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void memoryManagement(net.rossonet.ptalk.ability.grpc.MemoryContextManagementRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.MemoryContextManagementReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMemoryManagementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generalConfigurationManagement(net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementRequest request,
        io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGeneralConfigurationManagementMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *only for super ability ( homunculus )
   * </pre>
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

    /**
     */
    public net.rossonet.ptalk.ability.grpc.DumpConfigurationReply dumpConfiguration(net.rossonet.ptalk.ability.grpc.DumpConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDumpConfigurationMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.RegisterRuleReply registerPreRule(net.rossonet.ptalk.ability.grpc.RegisterRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterPreRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.CancelRuleReply cancelPreRule(net.rossonet.ptalk.ability.grpc.CancelRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelPreRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.ListRulesReply listPreRules(net.rossonet.ptalk.ability.grpc.ListRulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPreRulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.GetRuleReply getPreRule(net.rossonet.ptalk.ability.grpc.GetRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPreRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.RegisterRuleReply registerPostRule(net.rossonet.ptalk.ability.grpc.RegisterRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterPostRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.CancelRuleReply cancelPostRule(net.rossonet.ptalk.ability.grpc.CancelRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelPostRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.ListRulesReply listPostRules(net.rossonet.ptalk.ability.grpc.ListRulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPostRulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.GetRuleReply getPostRule(net.rossonet.ptalk.ability.grpc.GetRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPostRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.MemoryContextManagementReply memoryManagement(net.rossonet.ptalk.ability.grpc.MemoryContextManagementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMemoryManagementMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementReply generalConfigurationManagement(net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGeneralConfigurationManagementMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *only for super ability ( homunculus )
   * </pre>
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.DumpConfigurationReply> dumpConfiguration(
        net.rossonet.ptalk.ability.grpc.DumpConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDumpConfigurationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.RegisterRuleReply> registerPreRule(
        net.rossonet.ptalk.ability.grpc.RegisterRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterPreRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.CancelRuleReply> cancelPreRule(
        net.rossonet.ptalk.ability.grpc.CancelRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelPreRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.ListRulesReply> listPreRules(
        net.rossonet.ptalk.ability.grpc.ListRulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPreRulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.GetRuleReply> getPreRule(
        net.rossonet.ptalk.ability.grpc.GetRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPreRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.RegisterRuleReply> registerPostRule(
        net.rossonet.ptalk.ability.grpc.RegisterRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterPostRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.CancelRuleReply> cancelPostRule(
        net.rossonet.ptalk.ability.grpc.CancelRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelPostRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.ListRulesReply> listPostRules(
        net.rossonet.ptalk.ability.grpc.ListRulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPostRulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.GetRuleReply> getPostRule(
        net.rossonet.ptalk.ability.grpc.GetRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPostRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.MemoryContextManagementReply> memoryManagement(
        net.rossonet.ptalk.ability.grpc.MemoryContextManagementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMemoryManagementMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementReply> generalConfigurationManagement(
        net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGeneralConfigurationManagementMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUSH_CONFIGURATION = 0;
  private static final int METHODID_DUMP_CONFIGURATION = 1;
  private static final int METHODID_REGISTER_PRE_RULE = 2;
  private static final int METHODID_CANCEL_PRE_RULE = 3;
  private static final int METHODID_LIST_PRE_RULES = 4;
  private static final int METHODID_GET_PRE_RULE = 5;
  private static final int METHODID_REGISTER_POST_RULE = 6;
  private static final int METHODID_CANCEL_POST_RULE = 7;
  private static final int METHODID_LIST_POST_RULES = 8;
  private static final int METHODID_GET_POST_RULE = 9;
  private static final int METHODID_MEMORY_MANAGEMENT = 10;
  private static final int METHODID_GENERAL_CONFIGURATION_MANAGEMENT = 11;

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
        case METHODID_DUMP_CONFIGURATION:
          serviceImpl.dumpConfiguration((net.rossonet.ptalk.ability.grpc.DumpConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.DumpConfigurationReply>) responseObserver);
          break;
        case METHODID_REGISTER_PRE_RULE:
          serviceImpl.registerPreRule((net.rossonet.ptalk.ability.grpc.RegisterRuleRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.RegisterRuleReply>) responseObserver);
          break;
        case METHODID_CANCEL_PRE_RULE:
          serviceImpl.cancelPreRule((net.rossonet.ptalk.ability.grpc.CancelRuleRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.CancelRuleReply>) responseObserver);
          break;
        case METHODID_LIST_PRE_RULES:
          serviceImpl.listPreRules((net.rossonet.ptalk.ability.grpc.ListRulesRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.ListRulesReply>) responseObserver);
          break;
        case METHODID_GET_PRE_RULE:
          serviceImpl.getPreRule((net.rossonet.ptalk.ability.grpc.GetRuleRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.GetRuleReply>) responseObserver);
          break;
        case METHODID_REGISTER_POST_RULE:
          serviceImpl.registerPostRule((net.rossonet.ptalk.ability.grpc.RegisterRuleRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.RegisterRuleReply>) responseObserver);
          break;
        case METHODID_CANCEL_POST_RULE:
          serviceImpl.cancelPostRule((net.rossonet.ptalk.ability.grpc.CancelRuleRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.CancelRuleReply>) responseObserver);
          break;
        case METHODID_LIST_POST_RULES:
          serviceImpl.listPostRules((net.rossonet.ptalk.ability.grpc.ListRulesRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.ListRulesReply>) responseObserver);
          break;
        case METHODID_GET_POST_RULE:
          serviceImpl.getPostRule((net.rossonet.ptalk.ability.grpc.GetRuleRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.GetRuleReply>) responseObserver);
          break;
        case METHODID_MEMORY_MANAGEMENT:
          serviceImpl.memoryManagement((net.rossonet.ptalk.ability.grpc.MemoryContextManagementRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.MemoryContextManagementReply>) responseObserver);
          break;
        case METHODID_GENERAL_CONFIGURATION_MANAGEMENT:
          serviceImpl.generalConfigurationManagement((net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementRequest) request,
              (io.grpc.stub.StreamObserver<net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementReply>) responseObserver);
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
              .addMethod(getDumpConfigurationMethod())
              .addMethod(getRegisterPreRuleMethod())
              .addMethod(getCancelPreRuleMethod())
              .addMethod(getListPreRulesMethod())
              .addMethod(getGetPreRuleMethod())
              .addMethod(getRegisterPostRuleMethod())
              .addMethod(getCancelPostRuleMethod())
              .addMethod(getListPostRulesMethod())
              .addMethod(getGetPostRuleMethod())
              .addMethod(getMemoryManagementMethod())
              .addMethod(getGeneralConfigurationManagementMethod())
              .build();
        }
      }
    }
    return result;
  }
}
