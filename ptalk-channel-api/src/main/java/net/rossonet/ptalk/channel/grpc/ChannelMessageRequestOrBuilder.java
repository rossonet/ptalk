// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-channel-api.proto

package net.rossonet.ptalk.channel.grpc;

public interface ChannelMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:channel.ChannelMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the flow related to this message
   * </pre>
   *
   * <code>string flowReference = 1;</code>
   * @return The flowReference.
   */
  java.lang.String getFlowReference();
  /**
   * <pre>
   * the flow related to this message
   * </pre>
   *
   * <code>string flowReference = 1;</code>
   * @return The bytes for flowReference.
   */
  com.google.protobuf.ByteString
      getFlowReferenceBytes();

  /**
   * <pre>
   * in case of a reply related to a specific message, here we have the channelUniqueMessageId related
   * </pre>
   *
   * <code>string messageReference = 2;</code>
   * @return The messageReference.
   */
  java.lang.String getMessageReference();
  /**
   * <pre>
   * in case of a reply related to a specific message, here we have the channelUniqueMessageId related
   * </pre>
   *
   * <code>string messageReference = 2;</code>
   * @return The bytes for messageReference.
   */
  com.google.protobuf.ByteString
      getMessageReferenceBytes();

  /**
   * <pre>
   * should be the NLU related context in original format
   * </pre>
   *
   * <code>string originContext = 3;</code>
   * @return The originContext.
   */
  java.lang.String getOriginContext();
  /**
   * <pre>
   * should be the NLU related context in original format
   * </pre>
   *
   * <code>string originContext = 3;</code>
   * @return The bytes for originContext.
   */
  com.google.protobuf.ByteString
      getOriginContextBytes();

  /**
   * <pre>
   * unique name of the target for this message. It is the unique name of the remote interlocutor
   * </pre>
   *
   * <code>string channelUniqueName = 4;</code>
   * @return The channelUniqueName.
   */
  java.lang.String getChannelUniqueName();
  /**
   * <pre>
   * unique name of the target for this message. It is the unique name of the remote interlocutor
   * </pre>
   *
   * <code>string channelUniqueName = 4;</code>
   * @return The bytes for channelUniqueName.
   */
  com.google.protobuf.ByteString
      getChannelUniqueNameBytes();

  /**
   * <pre>
   * the unique id of this message
   * </pre>
   *
   * <code>string channelUniqueMessageId = 5;</code>
   * @return The channelUniqueMessageId.
   */
  java.lang.String getChannelUniqueMessageId();
  /**
   * <pre>
   * the unique id of this message
   * </pre>
   *
   * <code>string channelUniqueMessageId = 5;</code>
   * @return The bytes for channelUniqueMessageId.
   */
  com.google.protobuf.ByteString
      getChannelUniqueMessageIdBytes();

  /**
   * <pre>
   * the core engine task to elaborate the message. It is optional
   * </pre>
   *
   * <code>string replyTask = 6;</code>
   * @return The replyTask.
   */
  java.lang.String getReplyTask();
  /**
   * <pre>
   * the core engine task to elaborate the message. It is optional
   * </pre>
   *
   * <code>string replyTask = 6;</code>
   * @return The bytes for replyTask.
   */
  com.google.protobuf.ByteString
      getReplyTaskBytes();

  /**
   * <pre>
   * the textual message
   * </pre>
   *
   * <code>.base.Data message = 7;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * the textual message
   * </pre>
   *
   * <code>.base.Data message = 7;</code>
   * @return The message.
   */
  net.rossonet.ptalk.base.grpc.Data getMessage();
  /**
   * <pre>
   * the textual message
   * </pre>
   *
   * <code>.base.Data message = 7;</code>
   */
  net.rossonet.ptalk.base.grpc.DataOrBuilder getMessageOrBuilder();

  /**
   * <pre>
   * should be related to the NLU context in json format
   * </pre>
   *
   * <code>string contextJson = 8;</code>
   * @return The contextJson.
   */
  java.lang.String getContextJson();
  /**
   * <pre>
   * should be related to the NLU context in json format
   * </pre>
   *
   * <code>string contextJson = 8;</code>
   * @return The bytes for contextJson.
   */
  com.google.protobuf.ByteString
      getContextJsonBytes();

  /**
   * <pre>
   * should be the media attachments in base64 format
   * </pre>
   *
   * <code>repeated .base.Data additionalDatas = 9;</code>
   */
  java.util.List<net.rossonet.ptalk.base.grpc.Data> 
      getAdditionalDatasList();
  /**
   * <pre>
   * should be the media attachments in base64 format
   * </pre>
   *
   * <code>repeated .base.Data additionalDatas = 9;</code>
   */
  net.rossonet.ptalk.base.grpc.Data getAdditionalDatas(int index);
  /**
   * <pre>
   * should be the media attachments in base64 format
   * </pre>
   *
   * <code>repeated .base.Data additionalDatas = 9;</code>
   */
  int getAdditionalDatasCount();
  /**
   * <pre>
   * should be the media attachments in base64 format
   * </pre>
   *
   * <code>repeated .base.Data additionalDatas = 9;</code>
   */
  java.util.List<? extends net.rossonet.ptalk.base.grpc.DataOrBuilder> 
      getAdditionalDatasOrBuilderList();
  /**
   * <pre>
   * should be the media attachments in base64 format
   * </pre>
   *
   * <code>repeated .base.Data additionalDatas = 9;</code>
   */
  net.rossonet.ptalk.base.grpc.DataOrBuilder getAdditionalDatasOrBuilder(
      int index);

  /**
   * <code>repeated .base.Tag tags = 10;</code>
   */
  java.util.List<net.rossonet.ptalk.base.grpc.Tag> 
      getTagsList();
  /**
   * <code>repeated .base.Tag tags = 10;</code>
   */
  net.rossonet.ptalk.base.grpc.Tag getTags(int index);
  /**
   * <code>repeated .base.Tag tags = 10;</code>
   */
  int getTagsCount();
  /**
   * <code>repeated .base.Tag tags = 10;</code>
   */
  java.util.List<? extends net.rossonet.ptalk.base.grpc.TagOrBuilder> 
      getTagsOrBuilderList();
  /**
   * <code>repeated .base.Tag tags = 10;</code>
   */
  net.rossonet.ptalk.base.grpc.TagOrBuilder getTagsOrBuilder(
      int index);

  /**
   * <pre>
   * for QoS context [OPTIONAL]
   * </pre>
   *
   * <code>int32 priority = 11;</code>
   * @return The priority.
   */
  int getPriority();

  /**
   * <pre>
   * enable or disable trace log function
   * </pre>
   *
   * <code>bool traceLog = 12;</code>
   * @return The traceLog.
   */
  boolean getTraceLog();

  /**
   * <code>.base.Timestamp timestamp = 13;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>.base.Timestamp timestamp = 13;</code>
   * @return The timestamp.
   */
  net.rossonet.ptalk.base.grpc.Timestamp getTimestamp();
  /**
   * <code>.base.Timestamp timestamp = 13;</code>
   */
  net.rossonet.ptalk.base.grpc.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <pre>
   * array of trace data generated if the trace log function is enabled [OPTIONAL]
   * </pre>
   *
   * <code>repeated .base.Data traceData = 14;</code>
   */
  java.util.List<net.rossonet.ptalk.base.grpc.Data> 
      getTraceDataList();
  /**
   * <pre>
   * array of trace data generated if the trace log function is enabled [OPTIONAL]
   * </pre>
   *
   * <code>repeated .base.Data traceData = 14;</code>
   */
  net.rossonet.ptalk.base.grpc.Data getTraceData(int index);
  /**
   * <pre>
   * array of trace data generated if the trace log function is enabled [OPTIONAL]
   * </pre>
   *
   * <code>repeated .base.Data traceData = 14;</code>
   */
  int getTraceDataCount();
  /**
   * <pre>
   * array of trace data generated if the trace log function is enabled [OPTIONAL]
   * </pre>
   *
   * <code>repeated .base.Data traceData = 14;</code>
   */
  java.util.List<? extends net.rossonet.ptalk.base.grpc.DataOrBuilder> 
      getTraceDataOrBuilderList();
  /**
   * <pre>
   * array of trace data generated if the trace log function is enabled [OPTIONAL]
   * </pre>
   *
   * <code>repeated .base.Data traceData = 14;</code>
   */
  net.rossonet.ptalk.base.grpc.DataOrBuilder getTraceDataOrBuilder(
      int index);
}
