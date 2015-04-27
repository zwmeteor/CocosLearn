// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageBase.proto

package com.meteor.minaserver;

public final class message {
  private message() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MessageBaseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:minaserver.MessageBase)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 majorVersion = 1;</code>
     *
     * <pre>
     *主版本号
     * </pre>
     */
    boolean hasMajorVersion();
    /**
     * <code>required int32 majorVersion = 1;</code>
     *
     * <pre>
     *主版本号
     * </pre>
     */
    int getMajorVersion();

    /**
     * <code>required int32 minurVersion = 2;</code>
     *
     * <pre>
     *次版本号
     * </pre>
     */
    boolean hasMinurVersion();
    /**
     * <code>required int32 minurVersion = 2;</code>
     *
     * <pre>
     *次版本号
     * </pre>
     */
    int getMinurVersion();

    /**
     * <code>required int32 buildVersion = 3;</code>
     *
     * <pre>
     *编译版本号
     * </pre>
     */
    boolean hasBuildVersion();
    /**
     * <code>required int32 buildVersion = 3;</code>
     *
     * <pre>
     *编译版本号
     * </pre>
     */
    int getBuildVersion();

    /**
     * <code>required .minaserver.MessageBase.Opcode code = 4 [default = UNKNOWN];</code>
     *
     * <pre>
     *操作码
     * </pre>
     */
    boolean hasCode();
    /**
     * <code>required .minaserver.MessageBase.Opcode code = 4 [default = UNKNOWN];</code>
     *
     * <pre>
     *操作码
     * </pre>
     */
    com.meteor.minaserver.message.MessageBase.Opcode getCode();
  }
  /**
   * Protobuf type {@code minaserver.MessageBase}
   */
  public static final class MessageBase extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:minaserver.MessageBase)
      MessageBaseOrBuilder {
    // Use MessageBase.newBuilder() to construct.
    private MessageBase(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MessageBase(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MessageBase defaultInstance;
    public static MessageBase getDefaultInstance() {
      return defaultInstance;
    }

    public MessageBase getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MessageBase(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              majorVersion_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              minurVersion_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              buildVersion_ = input.readInt32();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              com.meteor.minaserver.message.MessageBase.Opcode value = com.meteor.minaserver.message.MessageBase.Opcode.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000008;
                code_ = value;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.meteor.minaserver.message.internal_static_minaserver_MessageBase_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.meteor.minaserver.message.internal_static_minaserver_MessageBase_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.meteor.minaserver.message.MessageBase.class, com.meteor.minaserver.message.MessageBase.Builder.class);
    }

    public static com.google.protobuf.Parser<MessageBase> PARSER =
        new com.google.protobuf.AbstractParser<MessageBase>() {
      public MessageBase parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MessageBase(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<MessageBase> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code minaserver.MessageBase.Opcode}
     */
    public enum Opcode
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0, 0),
      /**
       * <code>REGISTER = 1;</code>
       */
      REGISTER(1, 1),
      /**
       * <code>LOGIN = 2;</code>
       */
      LOGIN(2, 2),
      /**
       * <code>LOGOUT = 3;</code>
       */
      LOGOUT(3, 3),
      ;

      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>REGISTER = 1;</code>
       */
      public static final int REGISTER_VALUE = 1;
      /**
       * <code>LOGIN = 2;</code>
       */
      public static final int LOGIN_VALUE = 2;
      /**
       * <code>LOGOUT = 3;</code>
       */
      public static final int LOGOUT_VALUE = 3;


      public final int getNumber() { return value; }

      public static Opcode valueOf(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return REGISTER;
          case 2: return LOGIN;
          case 3: return LOGOUT;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Opcode>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Opcode>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Opcode>() {
              public Opcode findValueByNumber(int number) {
                return Opcode.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.meteor.minaserver.message.MessageBase.getDescriptor().getEnumTypes().get(0);
      }

      private static final Opcode[] VALUES = values();

      public static Opcode valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private Opcode(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:minaserver.MessageBase.Opcode)
    }

    private int bitField0_;
    public static final int MAJORVERSION_FIELD_NUMBER = 1;
    private int majorVersion_;
    /**
     * <code>required int32 majorVersion = 1;</code>
     *
     * <pre>
     *主版本号
     * </pre>
     */
    public boolean hasMajorVersion() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 majorVersion = 1;</code>
     *
     * <pre>
     *主版本号
     * </pre>
     */
    public int getMajorVersion() {
      return majorVersion_;
    }

    public static final int MINURVERSION_FIELD_NUMBER = 2;
    private int minurVersion_;
    /**
     * <code>required int32 minurVersion = 2;</code>
     *
     * <pre>
     *次版本号
     * </pre>
     */
    public boolean hasMinurVersion() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 minurVersion = 2;</code>
     *
     * <pre>
     *次版本号
     * </pre>
     */
    public int getMinurVersion() {
      return minurVersion_;
    }

    public static final int BUILDVERSION_FIELD_NUMBER = 3;
    private int buildVersion_;
    /**
     * <code>required int32 buildVersion = 3;</code>
     *
     * <pre>
     *编译版本号
     * </pre>
     */
    public boolean hasBuildVersion() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 buildVersion = 3;</code>
     *
     * <pre>
     *编译版本号
     * </pre>
     */
    public int getBuildVersion() {
      return buildVersion_;
    }

    public static final int CODE_FIELD_NUMBER = 4;
    private com.meteor.minaserver.message.MessageBase.Opcode code_;
    /**
     * <code>required .minaserver.MessageBase.Opcode code = 4 [default = UNKNOWN];</code>
     *
     * <pre>
     *操作码
     * </pre>
     */
    public boolean hasCode() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required .minaserver.MessageBase.Opcode code = 4 [default = UNKNOWN];</code>
     *
     * <pre>
     *操作码
     * </pre>
     */
    public com.meteor.minaserver.message.MessageBase.Opcode getCode() {
      return code_;
    }

    private void initFields() {
      majorVersion_ = 0;
      minurVersion_ = 0;
      buildVersion_ = 0;
      code_ = com.meteor.minaserver.message.MessageBase.Opcode.UNKNOWN;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasMajorVersion()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMinurVersion()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBuildVersion()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, majorVersion_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, minurVersion_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, buildVersion_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeEnum(4, code_.getNumber());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, majorVersion_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, minurVersion_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, buildVersion_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, code_.getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.meteor.minaserver.message.MessageBase parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.meteor.minaserver.message.MessageBase parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.meteor.minaserver.message.MessageBase parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.meteor.minaserver.message.MessageBase parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.meteor.minaserver.message.MessageBase parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.meteor.minaserver.message.MessageBase parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.meteor.minaserver.message.MessageBase parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.meteor.minaserver.message.MessageBase parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.meteor.minaserver.message.MessageBase parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.meteor.minaserver.message.MessageBase parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.meteor.minaserver.message.MessageBase prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code minaserver.MessageBase}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:minaserver.MessageBase)
        com.meteor.minaserver.message.MessageBaseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.meteor.minaserver.message.internal_static_minaserver_MessageBase_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.meteor.minaserver.message.internal_static_minaserver_MessageBase_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.meteor.minaserver.message.MessageBase.class, com.meteor.minaserver.message.MessageBase.Builder.class);
      }

      // Construct using com.meteor.minaserver.message.MessageBase.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        majorVersion_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        minurVersion_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        buildVersion_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        code_ = com.meteor.minaserver.message.MessageBase.Opcode.UNKNOWN;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.meteor.minaserver.message.internal_static_minaserver_MessageBase_descriptor;
      }

      public com.meteor.minaserver.message.MessageBase getDefaultInstanceForType() {
        return com.meteor.minaserver.message.MessageBase.getDefaultInstance();
      }

      public com.meteor.minaserver.message.MessageBase build() {
        com.meteor.minaserver.message.MessageBase result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.meteor.minaserver.message.MessageBase buildPartial() {
        com.meteor.minaserver.message.MessageBase result = new com.meteor.minaserver.message.MessageBase(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.majorVersion_ = majorVersion_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.minurVersion_ = minurVersion_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.buildVersion_ = buildVersion_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.code_ = code_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.meteor.minaserver.message.MessageBase) {
          return mergeFrom((com.meteor.minaserver.message.MessageBase)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.meteor.minaserver.message.MessageBase other) {
        if (other == com.meteor.minaserver.message.MessageBase.getDefaultInstance()) return this;
        if (other.hasMajorVersion()) {
          setMajorVersion(other.getMajorVersion());
        }
        if (other.hasMinurVersion()) {
          setMinurVersion(other.getMinurVersion());
        }
        if (other.hasBuildVersion()) {
          setBuildVersion(other.getBuildVersion());
        }
        if (other.hasCode()) {
          setCode(other.getCode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasMajorVersion()) {
          
          return false;
        }
        if (!hasMinurVersion()) {
          
          return false;
        }
        if (!hasBuildVersion()) {
          
          return false;
        }
        if (!hasCode()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.meteor.minaserver.message.MessageBase parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.meteor.minaserver.message.MessageBase) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int majorVersion_ ;
      /**
       * <code>required int32 majorVersion = 1;</code>
       *
       * <pre>
       *主版本号
       * </pre>
       */
      public boolean hasMajorVersion() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 majorVersion = 1;</code>
       *
       * <pre>
       *主版本号
       * </pre>
       */
      public int getMajorVersion() {
        return majorVersion_;
      }
      /**
       * <code>required int32 majorVersion = 1;</code>
       *
       * <pre>
       *主版本号
       * </pre>
       */
      public Builder setMajorVersion(int value) {
        bitField0_ |= 0x00000001;
        majorVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 majorVersion = 1;</code>
       *
       * <pre>
       *主版本号
       * </pre>
       */
      public Builder clearMajorVersion() {
        bitField0_ = (bitField0_ & ~0x00000001);
        majorVersion_ = 0;
        onChanged();
        return this;
      }

      private int minurVersion_ ;
      /**
       * <code>required int32 minurVersion = 2;</code>
       *
       * <pre>
       *次版本号
       * </pre>
       */
      public boolean hasMinurVersion() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 minurVersion = 2;</code>
       *
       * <pre>
       *次版本号
       * </pre>
       */
      public int getMinurVersion() {
        return minurVersion_;
      }
      /**
       * <code>required int32 minurVersion = 2;</code>
       *
       * <pre>
       *次版本号
       * </pre>
       */
      public Builder setMinurVersion(int value) {
        bitField0_ |= 0x00000002;
        minurVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 minurVersion = 2;</code>
       *
       * <pre>
       *次版本号
       * </pre>
       */
      public Builder clearMinurVersion() {
        bitField0_ = (bitField0_ & ~0x00000002);
        minurVersion_ = 0;
        onChanged();
        return this;
      }

      private int buildVersion_ ;
      /**
       * <code>required int32 buildVersion = 3;</code>
       *
       * <pre>
       *编译版本号
       * </pre>
       */
      public boolean hasBuildVersion() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 buildVersion = 3;</code>
       *
       * <pre>
       *编译版本号
       * </pre>
       */
      public int getBuildVersion() {
        return buildVersion_;
      }
      /**
       * <code>required int32 buildVersion = 3;</code>
       *
       * <pre>
       *编译版本号
       * </pre>
       */
      public Builder setBuildVersion(int value) {
        bitField0_ |= 0x00000004;
        buildVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 buildVersion = 3;</code>
       *
       * <pre>
       *编译版本号
       * </pre>
       */
      public Builder clearBuildVersion() {
        bitField0_ = (bitField0_ & ~0x00000004);
        buildVersion_ = 0;
        onChanged();
        return this;
      }

      private com.meteor.minaserver.message.MessageBase.Opcode code_ = com.meteor.minaserver.message.MessageBase.Opcode.UNKNOWN;
      /**
       * <code>required .minaserver.MessageBase.Opcode code = 4 [default = UNKNOWN];</code>
       *
       * <pre>
       *操作码
       * </pre>
       */
      public boolean hasCode() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required .minaserver.MessageBase.Opcode code = 4 [default = UNKNOWN];</code>
       *
       * <pre>
       *操作码
       * </pre>
       */
      public com.meteor.minaserver.message.MessageBase.Opcode getCode() {
        return code_;
      }
      /**
       * <code>required .minaserver.MessageBase.Opcode code = 4 [default = UNKNOWN];</code>
       *
       * <pre>
       *操作码
       * </pre>
       */
      public Builder setCode(com.meteor.minaserver.message.MessageBase.Opcode value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .minaserver.MessageBase.Opcode code = 4 [default = UNKNOWN];</code>
       *
       * <pre>
       *操作码
       * </pre>
       */
      public Builder clearCode() {
        bitField0_ = (bitField0_ & ~0x00000008);
        code_ = com.meteor.minaserver.message.MessageBase.Opcode.UNKNOWN;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:minaserver.MessageBase)
    }

    static {
      defaultInstance = new MessageBase(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:minaserver.MessageBase)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_minaserver_MessageBase_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_minaserver_MessageBase_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MessageBase.proto\022\nminaserver\"\302\001\n\013Mess" +
      "ageBase\022\024\n\014majorVersion\030\001 \002(\005\022\024\n\014minurVe" +
      "rsion\030\002 \002(\005\022\024\n\014buildVersion\030\003 \002(\005\0225\n\004cod" +
      "e\030\004 \002(\0162\036.minaserver.MessageBase.Opcode:" +
      "\007UNKNOWN\":\n\006Opcode\022\013\n\007UNKNOWN\020\000\022\014\n\010REGIS" +
      "TER\020\001\022\t\n\005LOGIN\020\002\022\n\n\006LOGOUT\020\003B \n\025com.mete" +
      "or.minaserverB\007message"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_minaserver_MessageBase_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_minaserver_MessageBase_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_minaserver_MessageBase_descriptor,
        new java.lang.String[] { "MajorVersion", "MinurVersion", "BuildVersion", "Code", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
