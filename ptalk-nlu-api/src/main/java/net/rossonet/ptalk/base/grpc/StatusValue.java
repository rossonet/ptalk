// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-base-api.proto

package net.rossonet.ptalk.base.grpc;

/**
 * Protobuf enum {@code base.StatusValue}
 */
public enum StatusValue
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>STATUS_GOOD = 0;</code>
   */
  STATUS_GOOD(0),
  /**
   * <code>STATUS_BAD = 1;</code>
   */
  STATUS_BAD(1),
  /**
   * <code>STATUS_FAULT = 2;</code>
   */
  STATUS_FAULT(2),
  /**
   * <code>STATUS_WAIT_HUMAN = 3;</code>
   */
  STATUS_WAIT_HUMAN(3),
  /**
   * <code>STATUS_NOT_APPROVED = 4;</code>
   */
  STATUS_NOT_APPROVED(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>STATUS_GOOD = 0;</code>
   */
  public static final int STATUS_GOOD_VALUE = 0;
  /**
   * <code>STATUS_BAD = 1;</code>
   */
  public static final int STATUS_BAD_VALUE = 1;
  /**
   * <code>STATUS_FAULT = 2;</code>
   */
  public static final int STATUS_FAULT_VALUE = 2;
  /**
   * <code>STATUS_WAIT_HUMAN = 3;</code>
   */
  public static final int STATUS_WAIT_HUMAN_VALUE = 3;
  /**
   * <code>STATUS_NOT_APPROVED = 4;</code>
   */
  public static final int STATUS_NOT_APPROVED_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static StatusValue valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static StatusValue forNumber(int value) {
    switch (value) {
      case 0: return STATUS_GOOD;
      case 1: return STATUS_BAD;
      case 2: return STATUS_FAULT;
      case 3: return STATUS_WAIT_HUMAN;
      case 4: return STATUS_NOT_APPROVED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StatusValue>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      StatusValue> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<StatusValue>() {
          public StatusValue findValueByNumber(int number) {
            return StatusValue.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return net.rossonet.ptalk.base.grpc.PtalkBaseObject.getDescriptor().getEnumTypes().get(0);
  }

  private static final StatusValue[] VALUES = values();

  public static StatusValue valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private StatusValue(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:base.StatusValue)
}

