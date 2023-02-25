// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-channel-grpc.proto

package net.rossonet.ptalk.channel.protobuf.server.grpc;

/**
 * Protobuf type {@code channelGrpc.HealthRequest}
 */
public final class HealthRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:channelGrpc.HealthRequest)
    HealthRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HealthRequest.newBuilder() to construct.
  private HealthRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HealthRequest() {
    jsonHardwareInfo_ = "";
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HealthRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_HealthRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_HealthRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest.class, net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest.Builder.class);
  }

  public static final int AGENTSENDER_FIELD_NUMBER = 1;
  private net.rossonet.ptalk.channel.protobuf.server.grpc.Agent agentSender_;
  /**
   * <code>.channelGrpc.Agent agentSender = 1;</code>
   * @return Whether the agentSender field is set.
   */
  @java.lang.Override
  public boolean hasAgentSender() {
    return agentSender_ != null;
  }
  /**
   * <code>.channelGrpc.Agent agentSender = 1;</code>
   * @return The agentSender.
   */
  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.Agent getAgentSender() {
    return agentSender_ == null ? net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance() : agentSender_;
  }
  /**
   * <code>.channelGrpc.Agent agentSender = 1;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder getAgentSenderOrBuilder() {
    return getAgentSender();
  }

  public static final int JSONHARDWAREINFO_FIELD_NUMBER = 2;
  private volatile java.lang.Object jsonHardwareInfo_;
  /**
   * <code>string jsonHardwareInfo = 2;</code>
   * @return The jsonHardwareInfo.
   */
  @java.lang.Override
  public java.lang.String getJsonHardwareInfo() {
    java.lang.Object ref = jsonHardwareInfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jsonHardwareInfo_ = s;
      return s;
    }
  }
  /**
   * <code>string jsonHardwareInfo = 2;</code>
   * @return The bytes for jsonHardwareInfo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJsonHardwareInfoBytes() {
    java.lang.Object ref = jsonHardwareInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jsonHardwareInfo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <code>.channelGrpc.HomunculusStates status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.channelGrpc.HomunculusStates status = 3;</code>
   * @return The status.
   */
  @java.lang.Override public net.rossonet.ptalk.channel.protobuf.server.grpc.HomunculusStates getStatus() {
    @SuppressWarnings("deprecation")
    net.rossonet.ptalk.channel.protobuf.server.grpc.HomunculusStates result = net.rossonet.ptalk.channel.protobuf.server.grpc.HomunculusStates.valueOf(status_);
    return result == null ? net.rossonet.ptalk.channel.protobuf.server.grpc.HomunculusStates.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (agentSender_ != null) {
      output.writeMessage(1, getAgentSender());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jsonHardwareInfo_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, jsonHardwareInfo_);
    }
    if (status_ != net.rossonet.ptalk.channel.protobuf.server.grpc.HomunculusStates.INIT.getNumber()) {
      output.writeEnum(3, status_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (agentSender_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAgentSender());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jsonHardwareInfo_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, jsonHardwareInfo_);
    }
    if (status_ != net.rossonet.ptalk.channel.protobuf.server.grpc.HomunculusStates.INIT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest)) {
      return super.equals(obj);
    }
    net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest other = (net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest) obj;

    if (hasAgentSender() != other.hasAgentSender()) return false;
    if (hasAgentSender()) {
      if (!getAgentSender()
          .equals(other.getAgentSender())) return false;
    }
    if (!getJsonHardwareInfo()
        .equals(other.getJsonHardwareInfo())) return false;
    if (status_ != other.status_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAgentSender()) {
      hash = (37 * hash) + AGENTSENDER_FIELD_NUMBER;
      hash = (53 * hash) + getAgentSender().hashCode();
    }
    hash = (37 * hash) + JSONHARDWAREINFO_FIELD_NUMBER;
    hash = (53 * hash) + getJsonHardwareInfo().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code channelGrpc.HealthRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:channelGrpc.HealthRequest)
      net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_HealthRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_HealthRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest.class, net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest.Builder.class);
    }

    // Construct using net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (agentSenderBuilder_ == null) {
        agentSender_ = null;
      } else {
        agentSender_ = null;
        agentSenderBuilder_ = null;
      }
      jsonHardwareInfo_ = "";

      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_HealthRequest_descriptor;
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest getDefaultInstanceForType() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest.getDefaultInstance();
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest build() {
      net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest buildPartial() {
      net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest result = new net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest(this);
      if (agentSenderBuilder_ == null) {
        result.agentSender_ = agentSender_;
      } else {
        result.agentSender_ = agentSenderBuilder_.build();
      }
      result.jsonHardwareInfo_ = jsonHardwareInfo_;
      result.status_ = status_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest) {
        return mergeFrom((net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest other) {
      if (other == net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest.getDefaultInstance()) return this;
      if (other.hasAgentSender()) {
        mergeAgentSender(other.getAgentSender());
      }
      if (!other.getJsonHardwareInfo().isEmpty()) {
        jsonHardwareInfo_ = other.jsonHardwareInfo_;
        onChanged();
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getAgentSenderFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              jsonHardwareInfo_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 24: {
              status_ = input.readEnum();

              break;
            } // case 24
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private net.rossonet.ptalk.channel.protobuf.server.grpc.Agent agentSender_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder> agentSenderBuilder_;
    /**
     * <code>.channelGrpc.Agent agentSender = 1;</code>
     * @return Whether the agentSender field is set.
     */
    public boolean hasAgentSender() {
      return agentSenderBuilder_ != null || agentSender_ != null;
    }
    /**
     * <code>.channelGrpc.Agent agentSender = 1;</code>
     * @return The agentSender.
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Agent getAgentSender() {
      if (agentSenderBuilder_ == null) {
        return agentSender_ == null ? net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance() : agentSender_;
      } else {
        return agentSenderBuilder_.getMessage();
      }
    }
    /**
     * <code>.channelGrpc.Agent agentSender = 1;</code>
     */
    public Builder setAgentSender(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent value) {
      if (agentSenderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agentSender_ = value;
        onChanged();
      } else {
        agentSenderBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Agent agentSender = 1;</code>
     */
    public Builder setAgentSender(
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder builderForValue) {
      if (agentSenderBuilder_ == null) {
        agentSender_ = builderForValue.build();
        onChanged();
      } else {
        agentSenderBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Agent agentSender = 1;</code>
     */
    public Builder mergeAgentSender(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent value) {
      if (agentSenderBuilder_ == null) {
        if (agentSender_ != null) {
          agentSender_ =
            net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.newBuilder(agentSender_).mergeFrom(value).buildPartial();
        } else {
          agentSender_ = value;
        }
        onChanged();
      } else {
        agentSenderBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Agent agentSender = 1;</code>
     */
    public Builder clearAgentSender() {
      if (agentSenderBuilder_ == null) {
        agentSender_ = null;
        onChanged();
      } else {
        agentSender_ = null;
        agentSenderBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Agent agentSender = 1;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder getAgentSenderBuilder() {
      
      onChanged();
      return getAgentSenderFieldBuilder().getBuilder();
    }
    /**
     * <code>.channelGrpc.Agent agentSender = 1;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder getAgentSenderOrBuilder() {
      if (agentSenderBuilder_ != null) {
        return agentSenderBuilder_.getMessageOrBuilder();
      } else {
        return agentSender_ == null ?
            net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance() : agentSender_;
      }
    }
    /**
     * <code>.channelGrpc.Agent agentSender = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder> 
        getAgentSenderFieldBuilder() {
      if (agentSenderBuilder_ == null) {
        agentSenderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder>(
                getAgentSender(),
                getParentForChildren(),
                isClean());
        agentSender_ = null;
      }
      return agentSenderBuilder_;
    }

    private java.lang.Object jsonHardwareInfo_ = "";
    /**
     * <code>string jsonHardwareInfo = 2;</code>
     * @return The jsonHardwareInfo.
     */
    public java.lang.String getJsonHardwareInfo() {
      java.lang.Object ref = jsonHardwareInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jsonHardwareInfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string jsonHardwareInfo = 2;</code>
     * @return The bytes for jsonHardwareInfo.
     */
    public com.google.protobuf.ByteString
        getJsonHardwareInfoBytes() {
      java.lang.Object ref = jsonHardwareInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jsonHardwareInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string jsonHardwareInfo = 2;</code>
     * @param value The jsonHardwareInfo to set.
     * @return This builder for chaining.
     */
    public Builder setJsonHardwareInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jsonHardwareInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string jsonHardwareInfo = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJsonHardwareInfo() {
      
      jsonHardwareInfo_ = getDefaultInstance().getJsonHardwareInfo();
      onChanged();
      return this;
    }
    /**
     * <code>string jsonHardwareInfo = 2;</code>
     * @param value The bytes for jsonHardwareInfo to set.
     * @return This builder for chaining.
     */
    public Builder setJsonHardwareInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jsonHardwareInfo_ = value;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.channelGrpc.HomunculusStates status = 3;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.channelGrpc.HomunculusStates status = 3;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.channelGrpc.HomunculusStates status = 3;</code>
     * @return The status.
     */
    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.HomunculusStates getStatus() {
      @SuppressWarnings("deprecation")
      net.rossonet.ptalk.channel.protobuf.server.grpc.HomunculusStates result = net.rossonet.ptalk.channel.protobuf.server.grpc.HomunculusStates.valueOf(status_);
      return result == null ? net.rossonet.ptalk.channel.protobuf.server.grpc.HomunculusStates.UNRECOGNIZED : result;
    }
    /**
     * <code>.channelGrpc.HomunculusStates status = 3;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(net.rossonet.ptalk.channel.protobuf.server.grpc.HomunculusStates value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.channelGrpc.HomunculusStates status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:channelGrpc.HealthRequest)
  }

  // @@protoc_insertion_point(class_scope:channelGrpc.HealthRequest)
  private static final net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest();
  }

  public static net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HealthRequest>
      PARSER = new com.google.protobuf.AbstractParser<HealthRequest>() {
    @java.lang.Override
    public HealthRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<HealthRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HealthRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.HealthRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
