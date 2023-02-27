// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-ability-api.proto

package net.rossonet.ptalk.ability.grpc;

public interface PushConfigurationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ability.PushConfigurationRequest)
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
   * <code>repeated .base.Data additionalDatas = 2;</code>
   */
  java.util.List<net.rossonet.ptalk.base.grpc.Data> 
      getAdditionalDatasList();
  /**
   * <code>repeated .base.Data additionalDatas = 2;</code>
   */
  net.rossonet.ptalk.base.grpc.Data getAdditionalDatas(int index);
  /**
   * <code>repeated .base.Data additionalDatas = 2;</code>
   */
  int getAdditionalDatasCount();
  /**
   * <code>repeated .base.Data additionalDatas = 2;</code>
   */
  java.util.List<? extends net.rossonet.ptalk.base.grpc.DataOrBuilder> 
      getAdditionalDatasOrBuilderList();
  /**
   * <code>repeated .base.Data additionalDatas = 2;</code>
   */
  net.rossonet.ptalk.base.grpc.DataOrBuilder getAdditionalDatasOrBuilder(
      int index);

  /**
   * <code>.base.Timestamp timestamp = 3;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>.base.Timestamp timestamp = 3;</code>
   * @return The timestamp.
   */
  net.rossonet.ptalk.base.grpc.Timestamp getTimestamp();
  /**
   * <code>.base.Timestamp timestamp = 3;</code>
   */
  net.rossonet.ptalk.base.grpc.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <code>string configurationJson = 4;</code>
   * @return The configurationJson.
   */
  java.lang.String getConfigurationJson();
  /**
   * <code>string configurationJson = 4;</code>
   * @return The bytes for configurationJson.
   */
  com.google.protobuf.ByteString
      getConfigurationJsonBytes();
}