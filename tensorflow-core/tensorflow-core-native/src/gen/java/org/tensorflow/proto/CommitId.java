// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: xla/tsl/protobuf/test_log.proto

package org.tensorflow.proto;

/**
 * Protobuf type {@code tensorflow.CommitId}
 */
public final class CommitId extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.CommitId)
    CommitIdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommitId.newBuilder() to construct.
  private CommitId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommitId() {
    snapshot_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CommitId();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.proto.TestLogProtos.internal_static_tensorflow_CommitId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.TestLogProtos.internal_static_tensorflow_CommitId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.CommitId.class, org.tensorflow.proto.CommitId.Builder.class);
  }

  private int kindCase_ = 0;
  private java.lang.Object kind_;
  public enum KindCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CHANGELIST(1),
    HASH(2),
    KIND_NOT_SET(0);
    private final int value;
    private KindCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static KindCase valueOf(int value) {
      return forNumber(value);
    }

    public static KindCase forNumber(int value) {
      switch (value) {
        case 1: return CHANGELIST;
        case 2: return HASH;
        case 0: return KIND_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public KindCase
  getKindCase() {
    return KindCase.forNumber(
        kindCase_);
  }

  public static final int CHANGELIST_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Submitted changelist.
   * </pre>
   *
   * <code>int64 changelist = 1;</code>
   * @return Whether the changelist field is set.
   */
  @java.lang.Override
  public boolean hasChangelist() {
    return kindCase_ == 1;
  }
  /**
   * <pre>
   * Submitted changelist.
   * </pre>
   *
   * <code>int64 changelist = 1;</code>
   * @return The changelist.
   */
  @java.lang.Override
  public long getChangelist() {
    if (kindCase_ == 1) {
      return (java.lang.Long) kind_;
    }
    return 0L;
  }

  public static final int HASH_FIELD_NUMBER = 2;
  /**
   * <code>string hash = 2;</code>
   * @return Whether the hash field is set.
   */
  public boolean hasHash() {
    return kindCase_ == 2;
  }
  /**
   * <code>string hash = 2;</code>
   * @return The hash.
   */
  public java.lang.String getHash() {
    java.lang.Object ref = "";
    if (kindCase_ == 2) {
      ref = kind_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (kindCase_ == 2) {
        kind_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string hash = 2;</code>
   * @return The bytes for hash.
   */
  public com.google.protobuf.ByteString
      getHashBytes() {
    java.lang.Object ref = "";
    if (kindCase_ == 2) {
      ref = kind_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (kindCase_ == 2) {
        kind_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SNAPSHOT_FIELD_NUMBER = 3;
  private volatile java.lang.Object snapshot_;
  /**
   * <pre>
   * Hash of intermediate change between hash/changelist and what was tested.
   * Not used if the build is from a commit without modifications.
   * </pre>
   *
   * <code>string snapshot = 3;</code>
   * @return The snapshot.
   */
  @java.lang.Override
  public java.lang.String getSnapshot() {
    java.lang.Object ref = snapshot_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      snapshot_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Hash of intermediate change between hash/changelist and what was tested.
   * Not used if the build is from a commit without modifications.
   * </pre>
   *
   * <code>string snapshot = 3;</code>
   * @return The bytes for snapshot.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSnapshotBytes() {
    java.lang.Object ref = snapshot_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      snapshot_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PENDING_CHANGELIST_FIELD_NUMBER = 4;
  private long pendingChangelist_;
  /**
   * <pre>
   * Changelist tested if the change list is not already submitted.
   * </pre>
   *
   * <code>int64 pending_changelist = 4;</code>
   * @return The pendingChangelist.
   */
  @java.lang.Override
  public long getPendingChangelist() {
    return pendingChangelist_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (kindCase_ == 1) {
      output.writeInt64(
          1, (long)((java.lang.Long) kind_));
    }
    if (kindCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, kind_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(snapshot_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, snapshot_);
    }
    if (pendingChangelist_ != 0L) {
      output.writeInt64(4, pendingChangelist_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kindCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            1, (long)((java.lang.Long) kind_));
    }
    if (kindCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, kind_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(snapshot_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, snapshot_);
    }
    if (pendingChangelist_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, pendingChangelist_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.proto.CommitId)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.CommitId other = (org.tensorflow.proto.CommitId) obj;

    if (!getSnapshot()
        .equals(other.getSnapshot())) return false;
    if (getPendingChangelist()
        != other.getPendingChangelist()) return false;
    if (!getKindCase().equals(other.getKindCase())) return false;
    switch (kindCase_) {
      case 1:
        if (getChangelist()
            != other.getChangelist()) return false;
        break;
      case 2:
        if (!getHash()
            .equals(other.getHash())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SNAPSHOT_FIELD_NUMBER;
    hash = (53 * hash) + getSnapshot().hashCode();
    hash = (37 * hash) + PENDING_CHANGELIST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPendingChangelist());
    switch (kindCase_) {
      case 1:
        hash = (37 * hash) + CHANGELIST_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getChangelist());
        break;
      case 2:
        hash = (37 * hash) + HASH_FIELD_NUMBER;
        hash = (53 * hash) + getHash().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.CommitId parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.CommitId parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.CommitId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.CommitId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.CommitId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.CommitId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.CommitId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.CommitId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.CommitId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.CommitId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.CommitId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.CommitId parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.proto.CommitId prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tensorflow.CommitId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.CommitId)
      org.tensorflow.proto.CommitIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.TestLogProtos.internal_static_tensorflow_CommitId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.TestLogProtos.internal_static_tensorflow_CommitId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.CommitId.class, org.tensorflow.proto.CommitId.Builder.class);
    }

    // Construct using org.tensorflow.proto.CommitId.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      snapshot_ = "";

      pendingChangelist_ = 0L;

      kindCase_ = 0;
      kind_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.TestLogProtos.internal_static_tensorflow_CommitId_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.CommitId getDefaultInstanceForType() {
      return org.tensorflow.proto.CommitId.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.CommitId build() {
      org.tensorflow.proto.CommitId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.CommitId buildPartial() {
      org.tensorflow.proto.CommitId result = new org.tensorflow.proto.CommitId(this);
      if (kindCase_ == 1) {
        result.kind_ = kind_;
      }
      if (kindCase_ == 2) {
        result.kind_ = kind_;
      }
      result.snapshot_ = snapshot_;
      result.pendingChangelist_ = pendingChangelist_;
      result.kindCase_ = kindCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.proto.CommitId) {
        return mergeFrom((org.tensorflow.proto.CommitId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.CommitId other) {
      if (other == org.tensorflow.proto.CommitId.getDefaultInstance()) return this;
      if (!other.getSnapshot().isEmpty()) {
        snapshot_ = other.snapshot_;
        onChanged();
      }
      if (other.getPendingChangelist() != 0L) {
        setPendingChangelist(other.getPendingChangelist());
      }
      switch (other.getKindCase()) {
        case CHANGELIST: {
          setChangelist(other.getChangelist());
          break;
        }
        case HASH: {
          kindCase_ = 2;
          kind_ = other.kind_;
          onChanged();
          break;
        }
        case KIND_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              kind_ = input.readInt64();
              kindCase_ = 1;
              break;
            } // case 8
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              kindCase_ = 2;
              kind_ = s;
              break;
            } // case 18
            case 26: {
              snapshot_ = input.readStringRequireUtf8();

              break;
            } // case 26
            case 32: {
              pendingChangelist_ = input.readInt64();

              break;
            } // case 32
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int kindCase_ = 0;
    private java.lang.Object kind_;
    public KindCase
        getKindCase() {
      return KindCase.forNumber(
          kindCase_);
    }

    public Builder clearKind() {
      kindCase_ = 0;
      kind_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * Submitted changelist.
     * </pre>
     *
     * <code>int64 changelist = 1;</code>
     * @return Whether the changelist field is set.
     */
    public boolean hasChangelist() {
      return kindCase_ == 1;
    }
    /**
     * <pre>
     * Submitted changelist.
     * </pre>
     *
     * <code>int64 changelist = 1;</code>
     * @return The changelist.
     */
    public long getChangelist() {
      if (kindCase_ == 1) {
        return (java.lang.Long) kind_;
      }
      return 0L;
    }
    /**
     * <pre>
     * Submitted changelist.
     * </pre>
     *
     * <code>int64 changelist = 1;</code>
     * @param value The changelist to set.
     * @return This builder for chaining.
     */
    public Builder setChangelist(long value) {
      kindCase_ = 1;
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Submitted changelist.
     * </pre>
     *
     * <code>int64 changelist = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearChangelist() {
      if (kindCase_ == 1) {
        kindCase_ = 0;
        kind_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>string hash = 2;</code>
     * @return Whether the hash field is set.
     */
    @java.lang.Override
    public boolean hasHash() {
      return kindCase_ == 2;
    }
    /**
     * <code>string hash = 2;</code>
     * @return The hash.
     */
    @java.lang.Override
    public java.lang.String getHash() {
      java.lang.Object ref = "";
      if (kindCase_ == 2) {
        ref = kind_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (kindCase_ == 2) {
          kind_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hash = 2;</code>
     * @return The bytes for hash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getHashBytes() {
      java.lang.Object ref = "";
      if (kindCase_ == 2) {
        ref = kind_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (kindCase_ == 2) {
          kind_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hash = 2;</code>
     * @param value The hash to set.
     * @return This builder for chaining.
     */
    public Builder setHash(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  kindCase_ = 2;
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string hash = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHash() {
      if (kindCase_ == 2) {
        kindCase_ = 0;
        kind_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string hash = 2;</code>
     * @param value The bytes for hash to set.
     * @return This builder for chaining.
     */
    public Builder setHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      kindCase_ = 2;
      kind_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object snapshot_ = "";
    /**
     * <pre>
     * Hash of intermediate change between hash/changelist and what was tested.
     * Not used if the build is from a commit without modifications.
     * </pre>
     *
     * <code>string snapshot = 3;</code>
     * @return The snapshot.
     */
    public java.lang.String getSnapshot() {
      java.lang.Object ref = snapshot_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        snapshot_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Hash of intermediate change between hash/changelist and what was tested.
     * Not used if the build is from a commit without modifications.
     * </pre>
     *
     * <code>string snapshot = 3;</code>
     * @return The bytes for snapshot.
     */
    public com.google.protobuf.ByteString
        getSnapshotBytes() {
      java.lang.Object ref = snapshot_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        snapshot_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Hash of intermediate change between hash/changelist and what was tested.
     * Not used if the build is from a commit without modifications.
     * </pre>
     *
     * <code>string snapshot = 3;</code>
     * @param value The snapshot to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshot(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      snapshot_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Hash of intermediate change between hash/changelist and what was tested.
     * Not used if the build is from a commit without modifications.
     * </pre>
     *
     * <code>string snapshot = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSnapshot() {
      
      snapshot_ = getDefaultInstance().getSnapshot();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Hash of intermediate change between hash/changelist and what was tested.
     * Not used if the build is from a commit without modifications.
     * </pre>
     *
     * <code>string snapshot = 3;</code>
     * @param value The bytes for snapshot to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      snapshot_ = value;
      onChanged();
      return this;
    }

    private long pendingChangelist_ ;
    /**
     * <pre>
     * Changelist tested if the change list is not already submitted.
     * </pre>
     *
     * <code>int64 pending_changelist = 4;</code>
     * @return The pendingChangelist.
     */
    @java.lang.Override
    public long getPendingChangelist() {
      return pendingChangelist_;
    }
    /**
     * <pre>
     * Changelist tested if the change list is not already submitted.
     * </pre>
     *
     * <code>int64 pending_changelist = 4;</code>
     * @param value The pendingChangelist to set.
     * @return This builder for chaining.
     */
    public Builder setPendingChangelist(long value) {
      
      pendingChangelist_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Changelist tested if the change list is not already submitted.
     * </pre>
     *
     * <code>int64 pending_changelist = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPendingChangelist() {
      
      pendingChangelist_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.CommitId)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.CommitId)
  private static final org.tensorflow.proto.CommitId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.CommitId();
  }

  public static org.tensorflow.proto.CommitId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommitId>
      PARSER = new com.google.protobuf.AbstractParser<CommitId>() {
    @java.lang.Override
    public CommitId parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CommitId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommitId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.CommitId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

