// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-ability-api.proto

package net.rossonet.ptalk.ability.grpc;

/**
 * Protobuf type {@code ability.ListRulesRequest}
 */
public final class ListRulesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ability.ListRulesRequest)
    ListRulesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListRulesRequest.newBuilder() to construct.
  private ListRulesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListRulesRequest() {
    flowReference_ = "";
    filter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListRulesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rossonet.ptalk.ability.grpc.PtaskAbilityApi.internal_static_ability_ListRulesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rossonet.ptalk.ability.grpc.PtaskAbilityApi.internal_static_ability_ListRulesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rossonet.ptalk.ability.grpc.ListRulesRequest.class, net.rossonet.ptalk.ability.grpc.ListRulesRequest.Builder.class);
  }

  public static final int FLOWREFERENCE_FIELD_NUMBER = 1;
  private volatile java.lang.Object flowReference_;
  /**
   * <code>string flowReference = 1;</code>
   * @return The flowReference.
   */
  @java.lang.Override
  public java.lang.String getFlowReference() {
    java.lang.Object ref = flowReference_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      flowReference_ = s;
      return s;
    }
  }
  /**
   * <code>string flowReference = 1;</code>
   * @return The bytes for flowReference.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFlowReferenceBytes() {
    java.lang.Object ref = flowReference_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      flowReference_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTER_FIELD_NUMBER = 2;
  private volatile java.lang.Object filter_;
  /**
   * <code>string filter = 2;</code>
   * @return The filter.
   */
  @java.lang.Override
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   * <code>string filter = 2;</code>
   * @return The bytes for filter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 3;
  private net.rossonet.ptalk.base.grpc.Timestamp timestamp_;
  /**
   * <code>.base.Timestamp timestamp = 3;</code>
   * @return Whether the timestamp field is set.
   */
  @java.lang.Override
  public boolean hasTimestamp() {
    return timestamp_ != null;
  }
  /**
   * <code>.base.Timestamp timestamp = 3;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public net.rossonet.ptalk.base.grpc.Timestamp getTimestamp() {
    return timestamp_ == null ? net.rossonet.ptalk.base.grpc.Timestamp.getDefaultInstance() : timestamp_;
  }
  /**
   * <code>.base.Timestamp timestamp = 3;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.base.grpc.TimestampOrBuilder getTimestampOrBuilder() {
    return getTimestamp();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(flowReference_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, flowReference_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, filter_);
    }
    if (timestamp_ != null) {
      output.writeMessage(3, getTimestamp());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(flowReference_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, flowReference_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, filter_);
    }
    if (timestamp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTimestamp());
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
    if (!(obj instanceof net.rossonet.ptalk.ability.grpc.ListRulesRequest)) {
      return super.equals(obj);
    }
    net.rossonet.ptalk.ability.grpc.ListRulesRequest other = (net.rossonet.ptalk.ability.grpc.ListRulesRequest) obj;

    if (!getFlowReference()
        .equals(other.getFlowReference())) return false;
    if (!getFilter()
        .equals(other.getFilter())) return false;
    if (hasTimestamp() != other.hasTimestamp()) return false;
    if (hasTimestamp()) {
      if (!getTimestamp()
          .equals(other.getTimestamp())) return false;
    }
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
    hash = (37 * hash) + FLOWREFERENCE_FIELD_NUMBER;
    hash = (53 * hash) + getFlowReference().hashCode();
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    if (hasTimestamp()) {
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rossonet.ptalk.ability.grpc.ListRulesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesRequest parseFrom(
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
  public static Builder newBuilder(net.rossonet.ptalk.ability.grpc.ListRulesRequest prototype) {
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
   * Protobuf type {@code ability.ListRulesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ability.ListRulesRequest)
      net.rossonet.ptalk.ability.grpc.ListRulesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rossonet.ptalk.ability.grpc.PtaskAbilityApi.internal_static_ability_ListRulesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rossonet.ptalk.ability.grpc.PtaskAbilityApi.internal_static_ability_ListRulesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rossonet.ptalk.ability.grpc.ListRulesRequest.class, net.rossonet.ptalk.ability.grpc.ListRulesRequest.Builder.class);
    }

    // Construct using net.rossonet.ptalk.ability.grpc.ListRulesRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      flowReference_ = "";

      filter_ = "";

      if (timestampBuilder_ == null) {
        timestamp_ = null;
      } else {
        timestamp_ = null;
        timestampBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rossonet.ptalk.ability.grpc.PtaskAbilityApi.internal_static_ability_ListRulesRequest_descriptor;
    }

    @java.lang.Override
    public net.rossonet.ptalk.ability.grpc.ListRulesRequest getDefaultInstanceForType() {
      return net.rossonet.ptalk.ability.grpc.ListRulesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public net.rossonet.ptalk.ability.grpc.ListRulesRequest build() {
      net.rossonet.ptalk.ability.grpc.ListRulesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rossonet.ptalk.ability.grpc.ListRulesRequest buildPartial() {
      net.rossonet.ptalk.ability.grpc.ListRulesRequest result = new net.rossonet.ptalk.ability.grpc.ListRulesRequest(this);
      result.flowReference_ = flowReference_;
      result.filter_ = filter_;
      if (timestampBuilder_ == null) {
        result.timestamp_ = timestamp_;
      } else {
        result.timestamp_ = timestampBuilder_.build();
      }
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
      if (other instanceof net.rossonet.ptalk.ability.grpc.ListRulesRequest) {
        return mergeFrom((net.rossonet.ptalk.ability.grpc.ListRulesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rossonet.ptalk.ability.grpc.ListRulesRequest other) {
      if (other == net.rossonet.ptalk.ability.grpc.ListRulesRequest.getDefaultInstance()) return this;
      if (!other.getFlowReference().isEmpty()) {
        flowReference_ = other.flowReference_;
        onChanged();
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        onChanged();
      }
      if (other.hasTimestamp()) {
        mergeTimestamp(other.getTimestamp());
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
              flowReference_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              filter_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getTimestampFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private java.lang.Object flowReference_ = "";
    /**
     * <code>string flowReference = 1;</code>
     * @return The flowReference.
     */
    public java.lang.String getFlowReference() {
      java.lang.Object ref = flowReference_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        flowReference_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string flowReference = 1;</code>
     * @return The bytes for flowReference.
     */
    public com.google.protobuf.ByteString
        getFlowReferenceBytes() {
      java.lang.Object ref = flowReference_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        flowReference_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string flowReference = 1;</code>
     * @param value The flowReference to set.
     * @return This builder for chaining.
     */
    public Builder setFlowReference(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      flowReference_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string flowReference = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFlowReference() {
      
      flowReference_ = getDefaultInstance().getFlowReference();
      onChanged();
      return this;
    }
    /**
     * <code>string flowReference = 1;</code>
     * @param value The bytes for flowReference to set.
     * @return This builder for chaining.
     */
    public Builder setFlowReferenceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      flowReference_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     * <code>string filter = 2;</code>
     * @return The filter.
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string filter = 2;</code>
     * @return The bytes for filter.
     */
    public com.google.protobuf.ByteString
        getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string filter = 2;</code>
     * @param value The filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilter(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filter_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string filter = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFilter() {
      
      filter_ = getDefaultInstance().getFilter();
      onChanged();
      return this;
    }
    /**
     * <code>string filter = 2;</code>
     * @param value The bytes for filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filter_ = value;
      onChanged();
      return this;
    }

    private net.rossonet.ptalk.base.grpc.Timestamp timestamp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.base.grpc.Timestamp, net.rossonet.ptalk.base.grpc.Timestamp.Builder, net.rossonet.ptalk.base.grpc.TimestampOrBuilder> timestampBuilder_;
    /**
     * <code>.base.Timestamp timestamp = 3;</code>
     * @return Whether the timestamp field is set.
     */
    public boolean hasTimestamp() {
      return timestampBuilder_ != null || timestamp_ != null;
    }
    /**
     * <code>.base.Timestamp timestamp = 3;</code>
     * @return The timestamp.
     */
    public net.rossonet.ptalk.base.grpc.Timestamp getTimestamp() {
      if (timestampBuilder_ == null) {
        return timestamp_ == null ? net.rossonet.ptalk.base.grpc.Timestamp.getDefaultInstance() : timestamp_;
      } else {
        return timestampBuilder_.getMessage();
      }
    }
    /**
     * <code>.base.Timestamp timestamp = 3;</code>
     */
    public Builder setTimestamp(net.rossonet.ptalk.base.grpc.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timestamp_ = value;
        onChanged();
      } else {
        timestampBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.base.Timestamp timestamp = 3;</code>
     */
    public Builder setTimestamp(
        net.rossonet.ptalk.base.grpc.Timestamp.Builder builderForValue) {
      if (timestampBuilder_ == null) {
        timestamp_ = builderForValue.build();
        onChanged();
      } else {
        timestampBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.base.Timestamp timestamp = 3;</code>
     */
    public Builder mergeTimestamp(net.rossonet.ptalk.base.grpc.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (timestamp_ != null) {
          timestamp_ =
            net.rossonet.ptalk.base.grpc.Timestamp.newBuilder(timestamp_).mergeFrom(value).buildPartial();
        } else {
          timestamp_ = value;
        }
        onChanged();
      } else {
        timestampBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.base.Timestamp timestamp = 3;</code>
     */
    public Builder clearTimestamp() {
      if (timestampBuilder_ == null) {
        timestamp_ = null;
        onChanged();
      } else {
        timestamp_ = null;
        timestampBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.base.Timestamp timestamp = 3;</code>
     */
    public net.rossonet.ptalk.base.grpc.Timestamp.Builder getTimestampBuilder() {
      
      onChanged();
      return getTimestampFieldBuilder().getBuilder();
    }
    /**
     * <code>.base.Timestamp timestamp = 3;</code>
     */
    public net.rossonet.ptalk.base.grpc.TimestampOrBuilder getTimestampOrBuilder() {
      if (timestampBuilder_ != null) {
        return timestampBuilder_.getMessageOrBuilder();
      } else {
        return timestamp_ == null ?
            net.rossonet.ptalk.base.grpc.Timestamp.getDefaultInstance() : timestamp_;
      }
    }
    /**
     * <code>.base.Timestamp timestamp = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.base.grpc.Timestamp, net.rossonet.ptalk.base.grpc.Timestamp.Builder, net.rossonet.ptalk.base.grpc.TimestampOrBuilder> 
        getTimestampFieldBuilder() {
      if (timestampBuilder_ == null) {
        timestampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rossonet.ptalk.base.grpc.Timestamp, net.rossonet.ptalk.base.grpc.Timestamp.Builder, net.rossonet.ptalk.base.grpc.TimestampOrBuilder>(
                getTimestamp(),
                getParentForChildren(),
                isClean());
        timestamp_ = null;
      }
      return timestampBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ability.ListRulesRequest)
  }

  // @@protoc_insertion_point(class_scope:ability.ListRulesRequest)
  private static final net.rossonet.ptalk.ability.grpc.ListRulesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rossonet.ptalk.ability.grpc.ListRulesRequest();
  }

  public static net.rossonet.ptalk.ability.grpc.ListRulesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListRulesRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListRulesRequest>() {
    @java.lang.Override
    public ListRulesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListRulesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListRulesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rossonet.ptalk.ability.grpc.ListRulesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

