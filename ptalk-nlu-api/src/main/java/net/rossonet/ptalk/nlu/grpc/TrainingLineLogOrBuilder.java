// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-nlu-api.proto

package net.rossonet.ptalk.nlu.grpc;

public interface TrainingLineLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nlu.TrainingLineLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.base.Timestamp timestamp = 1;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>.base.Timestamp timestamp = 1;</code>
   * @return The timestamp.
   */
  net.rossonet.ptalk.base.grpc.Timestamp getTimestamp();
  /**
   * <code>.base.Timestamp timestamp = 1;</code>
   */
  net.rossonet.ptalk.base.grpc.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <code>string logLevel = 2;</code>
   * @return The logLevel.
   */
  java.lang.String getLogLevel();
  /**
   * <code>string logLevel = 2;</code>
   * @return The bytes for logLevel.
   */
  com.google.protobuf.ByteString
      getLogLevelBytes();

  /**
   * <code>string message = 3;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 3;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}