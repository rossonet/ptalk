// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-nlu-api.proto

package net.rossonet.ptalk.grpc;

/**
 * Protobuf type {@code beacon.LogRequest}
 */
public final class LogRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:beacon.LogRequest)
    LogRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogRequest.newBuilder() to construct.
  private LogRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogRequest() {
    severity_ = 0;
    logLine_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LogRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rossonet.ptalk.grpc.PtaskNluApi.internal_static_beacon_LogRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rossonet.ptalk.grpc.PtaskNluApi.internal_static_beacon_LogRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rossonet.ptalk.grpc.LogRequest.class, net.rossonet.ptalk.grpc.LogRequest.Builder.class);
  }

  public static final int AGENTSENDER_FIELD_NUMBER = 1;
  private net.rossonet.ptalk.grpc.Agent agentSender_;
  /**
   * <code>.beacon.Agent agentSender = 1;</code>
   * @return Whether the agentSender field is set.
   */
  @java.lang.Override
  public boolean hasAgentSender() {
    return agentSender_ != null;
  }
  /**
   * <code>.beacon.Agent agentSender = 1;</code>
   * @return The agentSender.
   */
  @java.lang.Override
  public net.rossonet.ptalk.grpc.Agent getAgentSender() {
    return agentSender_ == null ? net.rossonet.ptalk.grpc.Agent.getDefaultInstance() : agentSender_;
  }
  /**
   * <code>.beacon.Agent agentSender = 1;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.grpc.AgentOrBuilder getAgentSenderOrBuilder() {
    return agentSender_ == null ? net.rossonet.ptalk.grpc.Agent.getDefaultInstance() : agentSender_;
  }

  public static final int SEVERITY_FIELD_NUMBER = 2;
  private int severity_ = 0;
  /**
   * <code>.beacon.LogSeverity severity = 2;</code>
   * @return The enum numeric value on the wire for severity.
   */
  @java.lang.Override public int getSeverityValue() {
    return severity_;
  }
  /**
   * <code>.beacon.LogSeverity severity = 2;</code>
   * @return The severity.
   */
  @java.lang.Override public net.rossonet.ptalk.grpc.LogSeverity getSeverity() {
    net.rossonet.ptalk.grpc.LogSeverity result = net.rossonet.ptalk.grpc.LogSeverity.forNumber(severity_);
    return result == null ? net.rossonet.ptalk.grpc.LogSeverity.UNRECOGNIZED : result;
  }

  public static final int LOGLINE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object logLine_ = "";
  /**
   * <code>string logLine = 3;</code>
   * @return The logLine.
   */
  @java.lang.Override
  public java.lang.String getLogLine() {
    java.lang.Object ref = logLine_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      logLine_ = s;
      return s;
    }
  }
  /**
   * <code>string logLine = 3;</code>
   * @return The bytes for logLine.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLogLineBytes() {
    java.lang.Object ref = logLine_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      logLine_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (severity_ != net.rossonet.ptalk.grpc.LogSeverity.DEFAULT.getNumber()) {
      output.writeEnum(2, severity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(logLine_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, logLine_);
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
    if (severity_ != net.rossonet.ptalk.grpc.LogSeverity.DEFAULT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, severity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(logLine_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, logLine_);
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
    if (!(obj instanceof net.rossonet.ptalk.grpc.LogRequest)) {
      return super.equals(obj);
    }
    net.rossonet.ptalk.grpc.LogRequest other = (net.rossonet.ptalk.grpc.LogRequest) obj;

    if (hasAgentSender() != other.hasAgentSender()) return false;
    if (hasAgentSender()) {
      if (!getAgentSender()
          .equals(other.getAgentSender())) return false;
    }
    if (severity_ != other.severity_) return false;
    if (!getLogLine()
        .equals(other.getLogLine())) return false;
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
    hash = (37 * hash) + SEVERITY_FIELD_NUMBER;
    hash = (53 * hash) + severity_;
    hash = (37 * hash) + LOGLINE_FIELD_NUMBER;
    hash = (53 * hash) + getLogLine().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rossonet.ptalk.grpc.LogRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.grpc.LogRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.grpc.LogRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.grpc.LogRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.grpc.LogRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.grpc.LogRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.grpc.LogRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.grpc.LogRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.grpc.LogRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.grpc.LogRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.grpc.LogRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.grpc.LogRequest parseFrom(
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
  public static Builder newBuilder(net.rossonet.ptalk.grpc.LogRequest prototype) {
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
   * Protobuf type {@code beacon.LogRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:beacon.LogRequest)
      net.rossonet.ptalk.grpc.LogRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rossonet.ptalk.grpc.PtaskNluApi.internal_static_beacon_LogRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rossonet.ptalk.grpc.PtaskNluApi.internal_static_beacon_LogRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rossonet.ptalk.grpc.LogRequest.class, net.rossonet.ptalk.grpc.LogRequest.Builder.class);
    }

    // Construct using net.rossonet.ptalk.grpc.LogRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      agentSender_ = null;
      if (agentSenderBuilder_ != null) {
        agentSenderBuilder_.dispose();
        agentSenderBuilder_ = null;
      }
      severity_ = 0;
      logLine_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rossonet.ptalk.grpc.PtaskNluApi.internal_static_beacon_LogRequest_descriptor;
    }

    @java.lang.Override
    public net.rossonet.ptalk.grpc.LogRequest getDefaultInstanceForType() {
      return net.rossonet.ptalk.grpc.LogRequest.getDefaultInstance();
    }

    @java.lang.Override
    public net.rossonet.ptalk.grpc.LogRequest build() {
      net.rossonet.ptalk.grpc.LogRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rossonet.ptalk.grpc.LogRequest buildPartial() {
      net.rossonet.ptalk.grpc.LogRequest result = new net.rossonet.ptalk.grpc.LogRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(net.rossonet.ptalk.grpc.LogRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.agentSender_ = agentSenderBuilder_ == null
            ? agentSender_
            : agentSenderBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.severity_ = severity_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.logLine_ = logLine_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof net.rossonet.ptalk.grpc.LogRequest) {
        return mergeFrom((net.rossonet.ptalk.grpc.LogRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rossonet.ptalk.grpc.LogRequest other) {
      if (other == net.rossonet.ptalk.grpc.LogRequest.getDefaultInstance()) return this;
      if (other.hasAgentSender()) {
        mergeAgentSender(other.getAgentSender());
      }
      if (other.severity_ != 0) {
        setSeverityValue(other.getSeverityValue());
      }
      if (!other.getLogLine().isEmpty()) {
        logLine_ = other.logLine_;
        bitField0_ |= 0x00000004;
        onChanged();
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
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              severity_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              logLine_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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
    private int bitField0_;

    private net.rossonet.ptalk.grpc.Agent agentSender_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.grpc.Agent, net.rossonet.ptalk.grpc.Agent.Builder, net.rossonet.ptalk.grpc.AgentOrBuilder> agentSenderBuilder_;
    /**
     * <code>.beacon.Agent agentSender = 1;</code>
     * @return Whether the agentSender field is set.
     */
    public boolean hasAgentSender() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.beacon.Agent agentSender = 1;</code>
     * @return The agentSender.
     */
    public net.rossonet.ptalk.grpc.Agent getAgentSender() {
      if (agentSenderBuilder_ == null) {
        return agentSender_ == null ? net.rossonet.ptalk.grpc.Agent.getDefaultInstance() : agentSender_;
      } else {
        return agentSenderBuilder_.getMessage();
      }
    }
    /**
     * <code>.beacon.Agent agentSender = 1;</code>
     */
    public Builder setAgentSender(net.rossonet.ptalk.grpc.Agent value) {
      if (agentSenderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agentSender_ = value;
      } else {
        agentSenderBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.beacon.Agent agentSender = 1;</code>
     */
    public Builder setAgentSender(
        net.rossonet.ptalk.grpc.Agent.Builder builderForValue) {
      if (agentSenderBuilder_ == null) {
        agentSender_ = builderForValue.build();
      } else {
        agentSenderBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.beacon.Agent agentSender = 1;</code>
     */
    public Builder mergeAgentSender(net.rossonet.ptalk.grpc.Agent value) {
      if (agentSenderBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          agentSender_ != null &&
          agentSender_ != net.rossonet.ptalk.grpc.Agent.getDefaultInstance()) {
          getAgentSenderBuilder().mergeFrom(value);
        } else {
          agentSender_ = value;
        }
      } else {
        agentSenderBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.beacon.Agent agentSender = 1;</code>
     */
    public Builder clearAgentSender() {
      bitField0_ = (bitField0_ & ~0x00000001);
      agentSender_ = null;
      if (agentSenderBuilder_ != null) {
        agentSenderBuilder_.dispose();
        agentSenderBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.beacon.Agent agentSender = 1;</code>
     */
    public net.rossonet.ptalk.grpc.Agent.Builder getAgentSenderBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAgentSenderFieldBuilder().getBuilder();
    }
    /**
     * <code>.beacon.Agent agentSender = 1;</code>
     */
    public net.rossonet.ptalk.grpc.AgentOrBuilder getAgentSenderOrBuilder() {
      if (agentSenderBuilder_ != null) {
        return agentSenderBuilder_.getMessageOrBuilder();
      } else {
        return agentSender_ == null ?
            net.rossonet.ptalk.grpc.Agent.getDefaultInstance() : agentSender_;
      }
    }
    /**
     * <code>.beacon.Agent agentSender = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.grpc.Agent, net.rossonet.ptalk.grpc.Agent.Builder, net.rossonet.ptalk.grpc.AgentOrBuilder> 
        getAgentSenderFieldBuilder() {
      if (agentSenderBuilder_ == null) {
        agentSenderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rossonet.ptalk.grpc.Agent, net.rossonet.ptalk.grpc.Agent.Builder, net.rossonet.ptalk.grpc.AgentOrBuilder>(
                getAgentSender(),
                getParentForChildren(),
                isClean());
        agentSender_ = null;
      }
      return agentSenderBuilder_;
    }

    private int severity_ = 0;
    /**
     * <code>.beacon.LogSeverity severity = 2;</code>
     * @return The enum numeric value on the wire for severity.
     */
    @java.lang.Override public int getSeverityValue() {
      return severity_;
    }
    /**
     * <code>.beacon.LogSeverity severity = 2;</code>
     * @param value The enum numeric value on the wire for severity to set.
     * @return This builder for chaining.
     */
    public Builder setSeverityValue(int value) {
      severity_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.beacon.LogSeverity severity = 2;</code>
     * @return The severity.
     */
    @java.lang.Override
    public net.rossonet.ptalk.grpc.LogSeverity getSeverity() {
      net.rossonet.ptalk.grpc.LogSeverity result = net.rossonet.ptalk.grpc.LogSeverity.forNumber(severity_);
      return result == null ? net.rossonet.ptalk.grpc.LogSeverity.UNRECOGNIZED : result;
    }
    /**
     * <code>.beacon.LogSeverity severity = 2;</code>
     * @param value The severity to set.
     * @return This builder for chaining.
     */
    public Builder setSeverity(net.rossonet.ptalk.grpc.LogSeverity value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      severity_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.beacon.LogSeverity severity = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeverity() {
      bitField0_ = (bitField0_ & ~0x00000002);
      severity_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object logLine_ = "";
    /**
     * <code>string logLine = 3;</code>
     * @return The logLine.
     */
    public java.lang.String getLogLine() {
      java.lang.Object ref = logLine_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        logLine_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string logLine = 3;</code>
     * @return The bytes for logLine.
     */
    public com.google.protobuf.ByteString
        getLogLineBytes() {
      java.lang.Object ref = logLine_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        logLine_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string logLine = 3;</code>
     * @param value The logLine to set.
     * @return This builder for chaining.
     */
    public Builder setLogLine(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      logLine_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string logLine = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogLine() {
      logLine_ = getDefaultInstance().getLogLine();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string logLine = 3;</code>
     * @param value The bytes for logLine to set.
     * @return This builder for chaining.
     */
    public Builder setLogLineBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      logLine_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:beacon.LogRequest)
  }

  // @@protoc_insertion_point(class_scope:beacon.LogRequest)
  private static final net.rossonet.ptalk.grpc.LogRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rossonet.ptalk.grpc.LogRequest();
  }

  public static net.rossonet.ptalk.grpc.LogRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogRequest>
      PARSER = new com.google.protobuf.AbstractParser<LogRequest>() {
    @java.lang.Override
    public LogRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<LogRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rossonet.ptalk.grpc.LogRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

