// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-nlu-api.proto

package net.rossonet.ptalk.nlu.grpc;

public interface NluMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nlu.NluMessageRequest)
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
   * in case this request is related to a channel message, here we have the channelUniqueMessageId
   * </pre>
   *
   * <code>string messageReference = 2;</code>
   * @return The messageReference.
   */
  java.lang.String getMessageReference();
  /**
   * <pre>
   * in case this request is related to a channel message, here we have the channelUniqueMessageId
   * </pre>
   *
   * <code>string messageReference = 2;</code>
   * @return The bytes for messageReference.
   */
  com.google.protobuf.ByteString
      getMessageReferenceBytes();

  /**
   * <pre>
   * context in original format
   * </pre>
   *
   * <code>string originContext = 3;</code>
   * @return The originContext.
   */
  java.lang.String getOriginContext();
  /**
   * <pre>
   * context in original format
   * </pre>
   *
   * <code>string originContext = 3;</code>
   * @return The bytes for originContext.
   */
  com.google.protobuf.ByteString
      getOriginContextBytes();

  /**
   * <pre>
   * the target model
   * </pre>
   *
   * <code>.nlu.NluModel model = 4;</code>
   * @return Whether the model field is set.
   */
  boolean hasModel();
  /**
   * <pre>
   * the target model
   * </pre>
   *
   * <code>.nlu.NluModel model = 4;</code>
   * @return The model.
   */
  net.rossonet.ptalk.nlu.grpc.NluModel getModel();
  /**
   * <pre>
   * the target model
   * </pre>
   *
   * <code>.nlu.NluModel model = 4;</code>
   */
  net.rossonet.ptalk.nlu.grpc.NluModelOrBuilder getModelOrBuilder();

  /**
   * <pre>
   * the core engine task to reply to
   * </pre>
   *
   * <code>string replyTask = 5;</code>
   * @return The replyTask.
   */
  java.lang.String getReplyTask();
  /**
   * <pre>
   * the core engine task to reply to
   * </pre>
   *
   * <code>string replyTask = 5;</code>
   * @return The bytes for replyTask.
   */
  com.google.protobuf.ByteString
      getReplyTaskBytes();

  /**
   * <pre>
   * the base text message
   * </pre>
   *
   * <code>.base.Data message = 6;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * the base text message
   * </pre>
   *
   * <code>.base.Data message = 6;</code>
   * @return The message.
   */
  net.rossonet.ptalk.base.grpc.Data getMessage();
  /**
   * <pre>
   * the base text message
   * </pre>
   *
   * <code>.base.Data message = 6;</code>
   */
  net.rossonet.ptalk.base.grpc.DataOrBuilder getMessageOrBuilder();

  /**
   * <pre>
   * context in json format
   * </pre>
   *
   * <code>string contextJson = 7;</code>
   * @return The contextJson.
   */
  java.lang.String getContextJson();
  /**
   * <pre>
   * context in json format
   * </pre>
   *
   * <code>string contextJson = 7;</code>
   * @return The bytes for contextJson.
   */
  com.google.protobuf.ByteString
      getContextJsonBytes();

  /**
   * <pre>
   * array of additional datas
   * </pre>
   *
   * <code>repeated .base.Data additionalDatas = 8;</code>
   */
  java.util.List<net.rossonet.ptalk.base.grpc.Data> 
      getAdditionalDatasList();
  /**
   * <pre>
   * array of additional datas
   * </pre>
   *
   * <code>repeated .base.Data additionalDatas = 8;</code>
   */
  net.rossonet.ptalk.base.grpc.Data getAdditionalDatas(int index);
  /**
   * <pre>
   * array of additional datas
   * </pre>
   *
   * <code>repeated .base.Data additionalDatas = 8;</code>
   */
  int getAdditionalDatasCount();
  /**
   * <pre>
   * array of additional datas
   * </pre>
   *
   * <code>repeated .base.Data additionalDatas = 8;</code>
   */
  java.util.List<? extends net.rossonet.ptalk.base.grpc.DataOrBuilder> 
      getAdditionalDatasOrBuilderList();
  /**
   * <pre>
   * array of additional datas
   * </pre>
   *
   * <code>repeated .base.Data additionalDatas = 8;</code>
   */
  net.rossonet.ptalk.base.grpc.DataOrBuilder getAdditionalDatasOrBuilder(
      int index);

  /**
   * <code>repeated .base.Tag tags = 9;</code>
   */
  java.util.List<net.rossonet.ptalk.base.grpc.Tag> 
      getTagsList();
  /**
   * <code>repeated .base.Tag tags = 9;</code>
   */
  net.rossonet.ptalk.base.grpc.Tag getTags(int index);
  /**
   * <code>repeated .base.Tag tags = 9;</code>
   */
  int getTagsCount();
  /**
   * <code>repeated .base.Tag tags = 9;</code>
   */
  java.util.List<? extends net.rossonet.ptalk.base.grpc.TagOrBuilder> 
      getTagsOrBuilderList();
  /**
   * <code>repeated .base.Tag tags = 9;</code>
   */
  net.rossonet.ptalk.base.grpc.TagOrBuilder getTagsOrBuilder(
      int index);

  /**
   * <code>.base.Timestamp timestamp = 10;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>.base.Timestamp timestamp = 10;</code>
   * @return The timestamp.
   */
  net.rossonet.ptalk.base.grpc.Timestamp getTimestamp();
  /**
   * <code>.base.Timestamp timestamp = 10;</code>
   */
  net.rossonet.ptalk.base.grpc.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <pre>
   * enable or disable trace log function
   * </pre>
   *
   * <code>bool traceLog = 11;</code>
   * @return The traceLog.
   */
  boolean getTraceLog();
}
