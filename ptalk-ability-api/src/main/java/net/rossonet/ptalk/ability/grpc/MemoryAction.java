// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-ability-api.proto

package net.rossonet.ptalk.ability.grpc;

/**
 * Protobuf enum {@code ability.MemoryAction}
 */
public enum MemoryAction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MEMORY_REPLACE = 0;</code>
   */
  MEMORY_REPLACE(0),
  /**
   * <code>MEMORY_ADD = 1;</code>
   */
  MEMORY_ADD(1),
  /**
   * <code>MEMORY_ADD_OR_REPLACE = 2;</code>
   */
  MEMORY_ADD_OR_REPLACE(2),
  /**
   * <code>MEMORY_DELETE = 3;</code>
   */
  MEMORY_DELETE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MEMORY_REPLACE = 0;</code>
   */
  public static final int MEMORY_REPLACE_VALUE = 0;
  /**
   * <code>MEMORY_ADD = 1;</code>
   */
  public static final int MEMORY_ADD_VALUE = 1;
  /**
   * <code>MEMORY_ADD_OR_REPLACE = 2;</code>
   */
  public static final int MEMORY_ADD_OR_REPLACE_VALUE = 2;
  /**
   * <code>MEMORY_DELETE = 3;</code>
   */
  public static final int MEMORY_DELETE_VALUE = 3;


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
  public static MemoryAction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MemoryAction forNumber(int value) {
    switch (value) {
      case 0: return MEMORY_REPLACE;
      case 1: return MEMORY_ADD;
      case 2: return MEMORY_ADD_OR_REPLACE;
      case 3: return MEMORY_DELETE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MemoryAction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MemoryAction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MemoryAction>() {
          public MemoryAction findValueByNumber(int number) {
            return MemoryAction.forNumber(number);
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
    return net.rossonet.ptalk.ability.grpc.PtaskAbilityApi.getDescriptor().getEnumTypes().get(0);
  }

  private static final MemoryAction[] VALUES = values();

  public static MemoryAction valueOf(
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

  private MemoryAction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ability.MemoryAction)
}

