// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-base-api.proto

package net.rossonet.ptalk.base.grpc;

public interface TimestampOrBuilder extends
    // @@protoc_insertion_point(interface_extends:base.Timestamp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 seconds = 1;</code>
   * @return The seconds.
   */
  long getSeconds();

  /**
   * <code>int32 nanos = 2;</code>
   * @return The nanos.
   */
  int getNanos();
}