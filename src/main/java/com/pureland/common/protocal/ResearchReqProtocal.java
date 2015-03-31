// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ResearchReq.proto

package com.pureland.common.protocal;

public final class ResearchReqProtocal {
  private ResearchReqProtocal() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ResearchReqOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .ResearchReq.ResearchRequestType researchRequestType = 1;
    /**
     * <code>required .ResearchReq.ResearchRequestType researchRequestType = 1;</code>
     *
     * <pre>
     *请求类型
     * </pre>
     */
    boolean hasResearchRequestType();
    /**
     * <code>required .ResearchReq.ResearchRequestType researchRequestType = 1;</code>
     *
     * <pre>
     *请求类型
     * </pre>
     */
    com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.ResearchRequestType getResearchRequestType();

    // required int32 cid = 2;
    /**
     * <code>required int32 cid = 2;</code>
     *
     * <pre>
     *升级什么技能
     * </pre>
     */
    boolean hasCid();
    /**
     * <code>required int32 cid = 2;</code>
     *
     * <pre>
     *升级什么技能
     * </pre>
     */
    int getCid();

    // required int64 currentTime = 3;
    /**
     * <code>required int64 currentTime = 3;</code>
     *
     * <pre>
     *发送请求时的时间
     * </pre>
     */
    boolean hasCurrentTime();
    /**
     * <code>required int64 currentTime = 3;</code>
     *
     * <pre>
     *发送请求时的时间
     * </pre>
     */
    long getCurrentTime();

    // optional int32 diamondCount = 4;
    /**
     * <code>optional int32 diamondCount = 4;</code>
     *
     * <pre>
     *立即完成使用的钻石数量
     * </pre>
     */
    boolean hasDiamondCount();
    /**
     * <code>optional int32 diamondCount = 4;</code>
     *
     * <pre>
     *立即完成使用的钻石数量
     * </pre>
     */
    int getDiamondCount();
  }
  /**
   * Protobuf type {@code ResearchReq}
   *
   * <pre>
   *升级技能等级
   * </pre>
   */
  public static final class ResearchReq extends
      com.google.protobuf.GeneratedMessage
      implements ResearchReqOrBuilder {
    // Use ResearchReq.newBuilder() to construct.
    private ResearchReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ResearchReq(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ResearchReq defaultInstance;
    public static ResearchReq getDefaultInstance() {
      return defaultInstance;
    }

    public ResearchReq getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ResearchReq(
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
              int rawValue = input.readEnum();
              com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.ResearchRequestType value = com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.ResearchRequestType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                researchRequestType_ = value;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              cid_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              currentTime_ = input.readInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              diamondCount_ = input.readInt32();
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
      return com.pureland.common.protocal.ResearchReqProtocal.internal_static_ResearchReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pureland.common.protocal.ResearchReqProtocal.internal_static_ResearchReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.class, com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.Builder.class);
    }

    public static com.google.protobuf.Parser<ResearchReq> PARSER =
        new com.google.protobuf.AbstractParser<ResearchReq>() {
      public ResearchReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResearchReq(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ResearchReq> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code ResearchReq.ResearchRequestType}
     */
    public enum ResearchRequestType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>Research = 1;</code>
       *
       * <pre>
       *开始研究
       * </pre>
       */
      Research(0, 1),
      /**
       * <code>Complete = 2;</code>
       *
       * <pre>
       *正常完成
       * </pre>
       */
      Complete(1, 2),
      /**
       * <code>CompleteImmediately = 3;</code>
       *
       * <pre>
       *立即完成
       * </pre>
       */
      CompleteImmediately(2, 3),
      ;

      /**
       * <code>Research = 1;</code>
       *
       * <pre>
       *开始研究
       * </pre>
       */
      public static final int Research_VALUE = 1;
      /**
       * <code>Complete = 2;</code>
       *
       * <pre>
       *正常完成
       * </pre>
       */
      public static final int Complete_VALUE = 2;
      /**
       * <code>CompleteImmediately = 3;</code>
       *
       * <pre>
       *立即完成
       * </pre>
       */
      public static final int CompleteImmediately_VALUE = 3;


      public final int getNumber() { return value; }

      public static ResearchRequestType valueOf(int value) {
        switch (value) {
          case 1: return Research;
          case 2: return Complete;
          case 3: return CompleteImmediately;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ResearchRequestType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<ResearchRequestType>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ResearchRequestType>() {
              public ResearchRequestType findValueByNumber(int number) {
                return ResearchRequestType.valueOf(number);
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
        return com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final ResearchRequestType[] VALUES = values();

      public static ResearchRequestType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private ResearchRequestType(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ResearchReq.ResearchRequestType)
    }

    private int bitField0_;
    // required .ResearchReq.ResearchRequestType researchRequestType = 1;
    public static final int RESEARCHREQUESTTYPE_FIELD_NUMBER = 1;
    private com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.ResearchRequestType researchRequestType_;
    /**
     * <code>required .ResearchReq.ResearchRequestType researchRequestType = 1;</code>
     *
     * <pre>
     *请求类型
     * </pre>
     */
    public boolean hasResearchRequestType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .ResearchReq.ResearchRequestType researchRequestType = 1;</code>
     *
     * <pre>
     *请求类型
     * </pre>
     */
    public com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.ResearchRequestType getResearchRequestType() {
      return researchRequestType_;
    }

    // required int32 cid = 2;
    public static final int CID_FIELD_NUMBER = 2;
    private int cid_;
    /**
     * <code>required int32 cid = 2;</code>
     *
     * <pre>
     *升级什么技能
     * </pre>
     */
    public boolean hasCid() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 cid = 2;</code>
     *
     * <pre>
     *升级什么技能
     * </pre>
     */
    public int getCid() {
      return cid_;
    }

    // required int64 currentTime = 3;
    public static final int CURRENTTIME_FIELD_NUMBER = 3;
    private long currentTime_;
    /**
     * <code>required int64 currentTime = 3;</code>
     *
     * <pre>
     *发送请求时的时间
     * </pre>
     */
    public boolean hasCurrentTime() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int64 currentTime = 3;</code>
     *
     * <pre>
     *发送请求时的时间
     * </pre>
     */
    public long getCurrentTime() {
      return currentTime_;
    }

    // optional int32 diamondCount = 4;
    public static final int DIAMONDCOUNT_FIELD_NUMBER = 4;
    private int diamondCount_;
    /**
     * <code>optional int32 diamondCount = 4;</code>
     *
     * <pre>
     *立即完成使用的钻石数量
     * </pre>
     */
    public boolean hasDiamondCount() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 diamondCount = 4;</code>
     *
     * <pre>
     *立即完成使用的钻石数量
     * </pre>
     */
    public int getDiamondCount() {
      return diamondCount_;
    }

    private void initFields() {
      researchRequestType_ = com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.ResearchRequestType.Research;
      cid_ = 0;
      currentTime_ = 0L;
      diamondCount_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasResearchRequestType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCurrentTime()) {
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
        output.writeEnum(1, researchRequestType_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, cid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, currentTime_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, diamondCount_);
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
          .computeEnumSize(1, researchRequestType_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, cid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, currentTime_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, diamondCount_);
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

    public static com.pureland.common.protocal.ResearchReqProtocal.ResearchReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pureland.common.protocal.ResearchReqProtocal.ResearchReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pureland.common.protocal.ResearchReqProtocal.ResearchReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pureland.common.protocal.ResearchReqProtocal.ResearchReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pureland.common.protocal.ResearchReqProtocal.ResearchReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.pureland.common.protocal.ResearchReqProtocal.ResearchReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.pureland.common.protocal.ResearchReqProtocal.ResearchReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.pureland.common.protocal.ResearchReqProtocal.ResearchReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.pureland.common.protocal.ResearchReqProtocal.ResearchReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.pureland.common.protocal.ResearchReqProtocal.ResearchReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.pureland.common.protocal.ResearchReqProtocal.ResearchReq prototype) {
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
     * Protobuf type {@code ResearchReq}
     *
     * <pre>
     *升级技能等级
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.pureland.common.protocal.ResearchReqProtocal.ResearchReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.pureland.common.protocal.ResearchReqProtocal.internal_static_ResearchReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.pureland.common.protocal.ResearchReqProtocal.internal_static_ResearchReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.class, com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.Builder.class);
      }

      // Construct using com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.newBuilder()
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
        researchRequestType_ = com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.ResearchRequestType.Research;
        bitField0_ = (bitField0_ & ~0x00000001);
        cid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        currentTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        diamondCount_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.pureland.common.protocal.ResearchReqProtocal.internal_static_ResearchReq_descriptor;
      }

      public com.pureland.common.protocal.ResearchReqProtocal.ResearchReq getDefaultInstanceForType() {
        return com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.getDefaultInstance();
      }

      public com.pureland.common.protocal.ResearchReqProtocal.ResearchReq build() {
        com.pureland.common.protocal.ResearchReqProtocal.ResearchReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.pureland.common.protocal.ResearchReqProtocal.ResearchReq buildPartial() {
        com.pureland.common.protocal.ResearchReqProtocal.ResearchReq result = new com.pureland.common.protocal.ResearchReqProtocal.ResearchReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.researchRequestType_ = researchRequestType_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.cid_ = cid_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.currentTime_ = currentTime_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.diamondCount_ = diamondCount_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.pureland.common.protocal.ResearchReqProtocal.ResearchReq) {
          return mergeFrom((com.pureland.common.protocal.ResearchReqProtocal.ResearchReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.pureland.common.protocal.ResearchReqProtocal.ResearchReq other) {
        if (other == com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.getDefaultInstance()) return this;
        if (other.hasResearchRequestType()) {
          setResearchRequestType(other.getResearchRequestType());
        }
        if (other.hasCid()) {
          setCid(other.getCid());
        }
        if (other.hasCurrentTime()) {
          setCurrentTime(other.getCurrentTime());
        }
        if (other.hasDiamondCount()) {
          setDiamondCount(other.getDiamondCount());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasResearchRequestType()) {
          
          return false;
        }
        if (!hasCid()) {
          
          return false;
        }
        if (!hasCurrentTime()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.pureland.common.protocal.ResearchReqProtocal.ResearchReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.pureland.common.protocal.ResearchReqProtocal.ResearchReq) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .ResearchReq.ResearchRequestType researchRequestType = 1;
      private com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.ResearchRequestType researchRequestType_ = com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.ResearchRequestType.Research;
      /**
       * <code>required .ResearchReq.ResearchRequestType researchRequestType = 1;</code>
       *
       * <pre>
       *请求类型
       * </pre>
       */
      public boolean hasResearchRequestType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .ResearchReq.ResearchRequestType researchRequestType = 1;</code>
       *
       * <pre>
       *请求类型
       * </pre>
       */
      public com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.ResearchRequestType getResearchRequestType() {
        return researchRequestType_;
      }
      /**
       * <code>required .ResearchReq.ResearchRequestType researchRequestType = 1;</code>
       *
       * <pre>
       *请求类型
       * </pre>
       */
      public Builder setResearchRequestType(com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.ResearchRequestType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        researchRequestType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .ResearchReq.ResearchRequestType researchRequestType = 1;</code>
       *
       * <pre>
       *请求类型
       * </pre>
       */
      public Builder clearResearchRequestType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        researchRequestType_ = com.pureland.common.protocal.ResearchReqProtocal.ResearchReq.ResearchRequestType.Research;
        onChanged();
        return this;
      }

      // required int32 cid = 2;
      private int cid_ ;
      /**
       * <code>required int32 cid = 2;</code>
       *
       * <pre>
       *升级什么技能
       * </pre>
       */
      public boolean hasCid() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 cid = 2;</code>
       *
       * <pre>
       *升级什么技能
       * </pre>
       */
      public int getCid() {
        return cid_;
      }
      /**
       * <code>required int32 cid = 2;</code>
       *
       * <pre>
       *升级什么技能
       * </pre>
       */
      public Builder setCid(int value) {
        bitField0_ |= 0x00000002;
        cid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 cid = 2;</code>
       *
       * <pre>
       *升级什么技能
       * </pre>
       */
      public Builder clearCid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        cid_ = 0;
        onChanged();
        return this;
      }

      // required int64 currentTime = 3;
      private long currentTime_ ;
      /**
       * <code>required int64 currentTime = 3;</code>
       *
       * <pre>
       *发送请求时的时间
       * </pre>
       */
      public boolean hasCurrentTime() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int64 currentTime = 3;</code>
       *
       * <pre>
       *发送请求时的时间
       * </pre>
       */
      public long getCurrentTime() {
        return currentTime_;
      }
      /**
       * <code>required int64 currentTime = 3;</code>
       *
       * <pre>
       *发送请求时的时间
       * </pre>
       */
      public Builder setCurrentTime(long value) {
        bitField0_ |= 0x00000004;
        currentTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 currentTime = 3;</code>
       *
       * <pre>
       *发送请求时的时间
       * </pre>
       */
      public Builder clearCurrentTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        currentTime_ = 0L;
        onChanged();
        return this;
      }

      // optional int32 diamondCount = 4;
      private int diamondCount_ ;
      /**
       * <code>optional int32 diamondCount = 4;</code>
       *
       * <pre>
       *立即完成使用的钻石数量
       * </pre>
       */
      public boolean hasDiamondCount() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 diamondCount = 4;</code>
       *
       * <pre>
       *立即完成使用的钻石数量
       * </pre>
       */
      public int getDiamondCount() {
        return diamondCount_;
      }
      /**
       * <code>optional int32 diamondCount = 4;</code>
       *
       * <pre>
       *立即完成使用的钻石数量
       * </pre>
       */
      public Builder setDiamondCount(int value) {
        bitField0_ |= 0x00000008;
        diamondCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 diamondCount = 4;</code>
       *
       * <pre>
       *立即完成使用的钻石数量
       * </pre>
       */
      public Builder clearDiamondCount() {
        bitField0_ = (bitField0_ & ~0x00000008);
        diamondCount_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ResearchReq)
    }

    static {
      defaultInstance = new ResearchReq(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ResearchReq)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ResearchReq_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ResearchReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ResearchReq.proto\"\320\001\n\013ResearchReq\022=\n\023r" +
      "esearchRequestType\030\001 \002(\0162 .ResearchReq.R" +
      "esearchRequestType\022\013\n\003cid\030\002 \002(\005\022\023\n\013curre" +
      "ntTime\030\003 \002(\003\022\024\n\014diamondCount\030\004 \001(\005\"J\n\023Re" +
      "searchRequestType\022\014\n\010Research\020\001\022\014\n\010Compl" +
      "ete\020\002\022\027\n\023CompleteImmediately\020\003B3\n\034com.pu" +
      "reland.common.protocalB\023ResearchReqProto" +
      "cal"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_ResearchReq_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_ResearchReq_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ResearchReq_descriptor,
              new java.lang.String[] { "ResearchRequestType", "Cid", "CurrentTime", "DiamondCount", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}