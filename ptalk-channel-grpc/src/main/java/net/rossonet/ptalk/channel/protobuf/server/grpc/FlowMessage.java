// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-channel-grpc.proto

package net.rossonet.ptalk.channel.protobuf.server.grpc;

/**
 * Protobuf type {@code channelGrpc.FlowMessage}
 */
public final class FlowMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:channelGrpc.FlowMessage)
    FlowMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FlowMessage.newBuilder() to construct.
  private FlowMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FlowMessage() {
    toDoList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FlowMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_FlowMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_FlowMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage.class, net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage.Builder.class);
  }

  public static final int TODOLIST_FIELD_NUMBER = 1;
  private java.util.List<net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent> toDoList_;
  /**
   * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
   */
  @java.lang.Override
  public java.util.List<net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent> getToDoListList() {
    return toDoList_;
  }
  /**
   * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgentOrBuilder> 
      getToDoListOrBuilderList() {
    return toDoList_;
  }
  /**
   * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
   */
  @java.lang.Override
  public int getToDoListCount() {
    return toDoList_.size();
  }
  /**
   * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent getToDoList(int index) {
    return toDoList_.get(index);
  }
  /**
   * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgentOrBuilder getToDoListOrBuilder(
      int index) {
    return toDoList_.get(index);
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
    for (int i = 0; i < toDoList_.size(); i++) {
      output.writeMessage(1, toDoList_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < toDoList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, toDoList_.get(i));
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
    if (!(obj instanceof net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage)) {
      return super.equals(obj);
    }
    net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage other = (net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage) obj;

    if (!getToDoListList()
        .equals(other.getToDoListList())) return false;
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
    if (getToDoListCount() > 0) {
      hash = (37 * hash) + TODOLIST_FIELD_NUMBER;
      hash = (53 * hash) + getToDoListList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage parseFrom(
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
  public static Builder newBuilder(net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage prototype) {
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
   * Protobuf type {@code channelGrpc.FlowMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:channelGrpc.FlowMessage)
      net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_FlowMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_FlowMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage.class, net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage.Builder.class);
    }

    // Construct using net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (toDoListBuilder_ == null) {
        toDoList_ = java.util.Collections.emptyList();
      } else {
        toDoList_ = null;
        toDoListBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_FlowMessage_descriptor;
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage getDefaultInstanceForType() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage.getDefaultInstance();
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage build() {
      net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage buildPartial() {
      net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage result = new net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage(this);
      int from_bitField0_ = bitField0_;
      if (toDoListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          toDoList_ = java.util.Collections.unmodifiableList(toDoList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.toDoList_ = toDoList_;
      } else {
        result.toDoList_ = toDoListBuilder_.build();
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
      if (other instanceof net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage) {
        return mergeFrom((net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage other) {
      if (other == net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage.getDefaultInstance()) return this;
      if (toDoListBuilder_ == null) {
        if (!other.toDoList_.isEmpty()) {
          if (toDoList_.isEmpty()) {
            toDoList_ = other.toDoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureToDoListIsMutable();
            toDoList_.addAll(other.toDoList_);
          }
          onChanged();
        }
      } else {
        if (!other.toDoList_.isEmpty()) {
          if (toDoListBuilder_.isEmpty()) {
            toDoListBuilder_.dispose();
            toDoListBuilder_ = null;
            toDoList_ = other.toDoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            toDoListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getToDoListFieldBuilder() : null;
          } else {
            toDoListBuilder_.addAllMessages(other.toDoList_);
          }
        }
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
              net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent m =
                  input.readMessage(
                      net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent.parser(),
                      extensionRegistry);
              if (toDoListBuilder_ == null) {
                ensureToDoListIsMutable();
                toDoList_.add(m);
              } else {
                toDoListBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent> toDoList_ =
      java.util.Collections.emptyList();
    private void ensureToDoListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        toDoList_ = new java.util.ArrayList<net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent>(toDoList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent, net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgentOrBuilder> toDoListBuilder_;

    /**
     * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
     */
    public java.util.List<net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent> getToDoListList() {
      if (toDoListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(toDoList_);
      } else {
        return toDoListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
     */
    public int getToDoListCount() {
      if (toDoListBuilder_ == null) {
        return toDoList_.size();
      } else {
        return toDoListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent getToDoList(int index) {
      if (toDoListBuilder_ == null) {
        return toDoList_.get(index);
      } else {
        return toDoListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
     */
    public Builder setToDoList(
        int index, net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent value) {
      if (toDoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureToDoListIsMutable();
        toDoList_.set(index, value);
        onChanged();
      } else {
        toDoListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
     */
    public Builder setToDoList(
        int index, net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent.Builder builderForValue) {
      if (toDoListBuilder_ == null) {
        ensureToDoListIsMutable();
        toDoList_.set(index, builderForValue.build());
        onChanged();
      } else {
        toDoListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
     */
    public Builder addToDoList(net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent value) {
      if (toDoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureToDoListIsMutable();
        toDoList_.add(value);
        onChanged();
      } else {
        toDoListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
     */
    public Builder addToDoList(
        int index, net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent value) {
      if (toDoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureToDoListIsMutable();
        toDoList_.add(index, value);
        onChanged();
      } else {
        toDoListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
     */
    public Builder addToDoList(
        net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent.Builder builderForValue) {
      if (toDoListBuilder_ == null) {
        ensureToDoListIsMutable();
        toDoList_.add(builderForValue.build());
        onChanged();
      } else {
        toDoListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
     */
    public Builder addToDoList(
        int index, net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent.Builder builderForValue) {
      if (toDoListBuilder_ == null) {
        ensureToDoListIsMutable();
        toDoList_.add(index, builderForValue.build());
        onChanged();
      } else {
        toDoListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
     */
    public Builder addAllToDoList(
        java.lang.Iterable<? extends net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent> values) {
      if (toDoListBuilder_ == null) {
        ensureToDoListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, toDoList_);
        onChanged();
      } else {
        toDoListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
     */
    public Builder clearToDoList() {
      if (toDoListBuilder_ == null) {
        toDoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        toDoListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
     */
    public Builder removeToDoList(int index) {
      if (toDoListBuilder_ == null) {
        ensureToDoListIsMutable();
        toDoList_.remove(index);
        onChanged();
      } else {
        toDoListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent.Builder getToDoListBuilder(
        int index) {
      return getToDoListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgentOrBuilder getToDoListOrBuilder(
        int index) {
      if (toDoListBuilder_ == null) {
        return toDoList_.get(index);  } else {
        return toDoListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
     */
    public java.util.List<? extends net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgentOrBuilder> 
         getToDoListOrBuilderList() {
      if (toDoListBuilder_ != null) {
        return toDoListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(toDoList_);
      }
    }
    /**
     * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent.Builder addToDoListBuilder() {
      return getToDoListFieldBuilder().addBuilder(
          net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent.getDefaultInstance());
    }
    /**
     * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent.Builder addToDoListBuilder(
        int index) {
      return getToDoListFieldBuilder().addBuilder(
          index, net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent.getDefaultInstance());
    }
    /**
     * <code>repeated .channelGrpc.RequestToAgent toDoList = 1;</code>
     */
    public java.util.List<net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent.Builder> 
         getToDoListBuilderList() {
      return getToDoListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent, net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgentOrBuilder> 
        getToDoListFieldBuilder() {
      if (toDoListBuilder_ == null) {
        toDoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent, net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgent.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.RequestToAgentOrBuilder>(
                toDoList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        toDoList_ = null;
      }
      return toDoListBuilder_;
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


    // @@protoc_insertion_point(builder_scope:channelGrpc.FlowMessage)
  }

  // @@protoc_insertion_point(class_scope:channelGrpc.FlowMessage)
  private static final net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage();
  }

  public static net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FlowMessage>
      PARSER = new com.google.protobuf.AbstractParser<FlowMessage>() {
    @java.lang.Override
    public FlowMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<FlowMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FlowMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.FlowMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
