// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-ability-api.proto

package net.rossonet.ptalk.ability.grpc;

public interface RegisterRulesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ability.RegisterRulesRequest)
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
   * <code>.ability.Rule rule = 2;</code>
   * @return Whether the rule field is set.
   */
  boolean hasRule();
  /**
   * <code>.ability.Rule rule = 2;</code>
   * @return The rule.
   */
  net.rossonet.ptalk.ability.grpc.Rule getRule();
  /**
   * <code>.ability.Rule rule = 2;</code>
   */
  net.rossonet.ptalk.ability.grpc.RuleOrBuilder getRuleOrBuilder();

  /**
   * <code>string jsonRule = 3;</code>
   * @return The jsonRule.
   */
  java.lang.String getJsonRule();
  /**
   * <code>string jsonRule = 3;</code>
   * @return The bytes for jsonRule.
   */
  com.google.protobuf.ByteString
      getJsonRuleBytes();

  /**
   * <code>repeated .base.Data additionalDatas = 4;</code>
   */
  java.util.List<net.rossonet.ptalk.base.grpc.Data> 
      getAdditionalDatasList();
  /**
   * <code>repeated .base.Data additionalDatas = 4;</code>
   */
  net.rossonet.ptalk.base.grpc.Data getAdditionalDatas(int index);
  /**
   * <code>repeated .base.Data additionalDatas = 4;</code>
   */
  int getAdditionalDatasCount();
  /**
   * <code>repeated .base.Data additionalDatas = 4;</code>
   */
  java.util.List<? extends net.rossonet.ptalk.base.grpc.DataOrBuilder> 
      getAdditionalDatasOrBuilderList();
  /**
   * <code>repeated .base.Data additionalDatas = 4;</code>
   */
  net.rossonet.ptalk.base.grpc.DataOrBuilder getAdditionalDatasOrBuilder(
      int index);

  /**
   * <code>repeated .base.Tag tags = 5;</code>
   */
  java.util.List<net.rossonet.ptalk.base.grpc.Tag> 
      getTagsList();
  /**
   * <code>repeated .base.Tag tags = 5;</code>
   */
  net.rossonet.ptalk.base.grpc.Tag getTags(int index);
  /**
   * <code>repeated .base.Tag tags = 5;</code>
   */
  int getTagsCount();
  /**
   * <code>repeated .base.Tag tags = 5;</code>
   */
  java.util.List<? extends net.rossonet.ptalk.base.grpc.TagOrBuilder> 
      getTagsOrBuilderList();
  /**
   * <code>repeated .base.Tag tags = 5;</code>
   */
  net.rossonet.ptalk.base.grpc.TagOrBuilder getTagsOrBuilder(
      int index);

  /**
   * <code>.base.Timestamp timestamp = 6;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>.base.Timestamp timestamp = 6;</code>
   * @return The timestamp.
   */
  net.rossonet.ptalk.base.grpc.Timestamp getTimestamp();
  /**
   * <code>.base.Timestamp timestamp = 6;</code>
   */
  net.rossonet.ptalk.base.grpc.TimestampOrBuilder getTimestampOrBuilder();
}