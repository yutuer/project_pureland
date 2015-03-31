// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChargeDiamondReq.proto

package com.pureland.common.protocal;

public final class ChargeDiamondProtocal {
  private ChargeDiamondProtocal() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ChargeDiamondReqOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 diamondCount = 1;
    /**
     * <code>required int32 diamondCount = 1;</code>
     */
    boolean hasDiamondCount();
    /**
     * <code>required int32 diamondCount = 1;</code>
     */
    int getDiamondCount();
  }
  /**
   * Protobuf type {@code ChargeDiamondReq}
   */
  public static final class ChargeDiamondReq extends
      com.google.protobuf.GeneratedMessage
      implements ChargeDiamondReqOrBuilder {
    // Use ChargeDiamondReq.newBuilder() to construct.
    private ChargeDiamondReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ChargeDiamondReq(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ChargeDiamondReq defaultInstance;
    public static ChargeDiamondReq getDefaultInstance() {
      return defaultInstance;
    }

    public ChargeDiamondReq getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ChargeDiamondReq(
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
      return com.pureland.common.protocal.ChargeDiamondProtocal.internal_static_ChargeDiamondReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pureland.common.protocal.ChargeDiamondProtocal.internal_static_ChargeDiamondReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq.class, com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq.Builder.class);
    }

    public static com.google.protobuf.Parser<ChargeDiamondReq> PARSER =
        new com.google.protobuf.AbstractParser<ChargeDiamondReq>() {
      public ChargeDiamondReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChargeDiamondReq(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ChargeDiamondReq> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 diamondCount = 1;
    public static final int DIAMONDCOUNT_FIELD_NUMBER = 1;
    private int diamondCount_;
    /**
     * <code>required int32 diamondCount = 1;</code>
     */
    public boolean hasDiamondCount() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 diamondCount = 1;</code>
     */
    public int getDiamondCount() {
      return diamondCount_;
    }

    private void initFields() {
      diamondCount_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasDiamondCount()) {
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
        output.writeInt32(1, diamondCount_);
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
          .computeInt32Size(1, diamondCount_);
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

    public static com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq prototype) {
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
     * Protobuf type {@code ChargeDiamondReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.pureland.common.protocal.ChargeDiamondProtocal.internal_static_ChargeDiamondReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.pureland.common.protocal.ChargeDiamondProtocal.internal_static_ChargeDiamondReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq.class, com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq.Builder.class);
      }

      // Construct using com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq.newBuilder()
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
        diamondCount_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.pureland.common.protocal.ChargeDiamondProtocal.internal_static_ChargeDiamondReq_descriptor;
      }

      public com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq getDefaultInstanceForType() {
        return com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq.getDefaultInstance();
      }

      public com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq build() {
        com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq buildPartial() {
        com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq result = new com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.diamondCount_ = diamondCount_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq) {
          return mergeFrom((com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq other) {
        if (other == com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq.getDefaultInstance()) return this;
        if (other.hasDiamondCount()) {
          setDiamondCount(other.getDiamondCount());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasDiamondCount()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.pureland.common.protocal.ChargeDiamondProtocal.ChargeDiamondReq) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 diamondCount = 1;
      private int diamondCount_ ;
      /**
       * <code>required int32 diamondCount = 1;</code>
       */
      public boolean hasDiamondCount() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 diamondCount = 1;</code>
       */
      public int getDiamondCount() {
        return diamondCount_;
      }
      /**
       * <code>required int32 diamondCount = 1;</code>
       */
      public Builder setDiamondCount(int value) {
        bitField0_ |= 0x00000001;
        diamondCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 diamondCount = 1;</code>
       */
      public Builder clearDiamondCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        diamondCount_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ChargeDiamondReq)
    }

    static {
      defaultInstance = new ChargeDiamondReq(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ChargeDiamondReq)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ChargeDiamondReq_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ChargeDiamondReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ChargeDiamondReq.proto\"(\n\020ChargeDiamon" +
      "dReq\022\024\n\014diamondCount\030\001 \002(\005B5\n\034com.purela" +
      "nd.common.protocalB\025ChargeDiamondProtoca" +
      "l"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_ChargeDiamondReq_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_ChargeDiamondReq_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ChargeDiamondReq_descriptor,
              new java.lang.String[] { "DiamondCount", });
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