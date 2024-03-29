// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-ability-api.proto

package net.rossonet.ptalk.ability.grpc;

public interface MemoryContextQueryReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ability.MemoryContextQueryReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string flowReference = 1;</code>
   * @return The flowReference.
   */
  java.lang.String getFlowReference();
  /**
   * <code>string flowReference = 1;</code>
   * @return The bytes for flowReference.
   */
  com.google.protobuf.ByteString
      getFlowReferenceBytes();

  /**
   * <code>string context = 2;</code>
   * @return The context.
   */
  java.lang.String getContext();
  /**
   * <code>string context = 2;</code>
   * @return The bytes for context.
   */
  com.google.protobuf.ByteString
      getContextBytes();

  /**
   * <code>repeated .base.Data datas = 3;</code>
   */
  java.util.List<net.rossonet.ptalk.base.grpc.Data> 
      getDatasList();
  /**
   * <code>repeated .base.Data datas = 3;</code>
   */
  net.rossonet.ptalk.base.grpc.Data getDatas(int index);
  /**
   * <code>repeated .base.Data datas = 3;</code>
   */
  int getDatasCount();
  /**
   * <code>repeated .base.Data datas = 3;</code>
   */
  java.util.List<? extends net.rossonet.ptalk.base.grpc.DataOrBuilder> 
      getDatasOrBuilderList();
  /**
   * <code>repeated .base.Data datas = 3;</code>
   */
  net.rossonet.ptalk.base.grpc.DataOrBuilder getDatasOrBuilder(
      int index);

  /**
   * <code>.base.Timestamp timestamp = 4;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>.base.Timestamp timestamp = 4;</code>
   * @return The timestamp.
   */
  net.rossonet.ptalk.base.grpc.Timestamp getTimestamp();
  /**
   * <code>.base.Timestamp timestamp = 4;</code>
   */
  net.rossonet.ptalk.base.grpc.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <code>.base.StatusValue status = 5;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.base.StatusValue status = 5;</code>
   * @return The status.
   */
  net.rossonet.ptalk.base.grpc.StatusValue getStatus();
}
