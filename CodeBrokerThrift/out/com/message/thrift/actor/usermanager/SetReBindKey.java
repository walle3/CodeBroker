/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.message.thrift.actor.usermanager;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-09-20")
public class SetReBindKey implements org.apache.thrift.TBase<SetReBindKey, SetReBindKey._Fields>, java.io.Serializable, Cloneable, Comparable<SetReBindKey> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SetReBindKey");

  private static final org.apache.thrift.protocol.TField RE_BIND_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("reBindKey", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SetReBindKeyStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SetReBindKeyTupleSchemeFactory();

  public java.lang.String reBindKey; // required
  public java.lang.String userId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RE_BIND_KEY((short)1, "reBindKey"),
    USER_ID((short)2, "userId");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RE_BIND_KEY
          return RE_BIND_KEY;
        case 2: // USER_ID
          return USER_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RE_BIND_KEY, new org.apache.thrift.meta_data.FieldMetaData("reBindKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SetReBindKey.class, metaDataMap);
  }

  public SetReBindKey() {
  }

  public SetReBindKey(
    java.lang.String reBindKey,
    java.lang.String userId)
  {
    this();
    this.reBindKey = reBindKey;
    this.userId = userId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SetReBindKey(SetReBindKey other) {
    if (other.isSetReBindKey()) {
      this.reBindKey = other.reBindKey;
    }
    if (other.isSetUserId()) {
      this.userId = other.userId;
    }
  }

  public SetReBindKey deepCopy() {
    return new SetReBindKey(this);
  }

  @Override
  public void clear() {
    this.reBindKey = null;
    this.userId = null;
  }

  public java.lang.String getReBindKey() {
    return this.reBindKey;
  }

  public SetReBindKey setReBindKey(java.lang.String reBindKey) {
    this.reBindKey = reBindKey;
    return this;
  }

  public void unsetReBindKey() {
    this.reBindKey = null;
  }

  /** Returns true if field reBindKey is set (has been assigned a value) and false otherwise */
  public boolean isSetReBindKey() {
    return this.reBindKey != null;
  }

  public void setReBindKeyIsSet(boolean value) {
    if (!value) {
      this.reBindKey = null;
    }
  }

  public java.lang.String getUserId() {
    return this.userId;
  }

  public SetReBindKey setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  public void unsetUserId() {
    this.userId = null;
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return this.userId != null;
  }

  public void setUserIdIsSet(boolean value) {
    if (!value) {
      this.userId = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case RE_BIND_KEY:
      if (value == null) {
        unsetReBindKey();
      } else {
        setReBindKey((java.lang.String)value);
      }
      break;

    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RE_BIND_KEY:
      return getReBindKey();

    case USER_ID:
      return getUserId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case RE_BIND_KEY:
      return isSetReBindKey();
    case USER_ID:
      return isSetUserId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SetReBindKey)
      return this.equals((SetReBindKey)that);
    return false;
  }

  public boolean equals(SetReBindKey that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_reBindKey = true && this.isSetReBindKey();
    boolean that_present_reBindKey = true && that.isSetReBindKey();
    if (this_present_reBindKey || that_present_reBindKey) {
      if (!(this_present_reBindKey && that_present_reBindKey))
        return false;
      if (!this.reBindKey.equals(that.reBindKey))
        return false;
    }

    boolean this_present_userId = true && this.isSetUserId();
    boolean that_present_userId = true && that.isSetUserId();
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (!this.userId.equals(that.userId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetReBindKey()) ? 131071 : 524287);
    if (isSetReBindKey())
      hashCode = hashCode * 8191 + reBindKey.hashCode();

    hashCode = hashCode * 8191 + ((isSetUserId()) ? 131071 : 524287);
    if (isSetUserId())
      hashCode = hashCode * 8191 + userId.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SetReBindKey other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetReBindKey()).compareTo(other.isSetReBindKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReBindKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reBindKey, other.reBindKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SetReBindKey(");
    boolean first = true;

    sb.append("reBindKey:");
    if (this.reBindKey == null) {
      sb.append("null");
    } else {
      sb.append(this.reBindKey);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userId:");
    if (this.userId == null) {
      sb.append("null");
    } else {
      sb.append(this.userId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SetReBindKeyStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SetReBindKeyStandardScheme getScheme() {
      return new SetReBindKeyStandardScheme();
    }
  }

  private static class SetReBindKeyStandardScheme extends org.apache.thrift.scheme.StandardScheme<SetReBindKey> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SetReBindKey struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RE_BIND_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.reBindKey = iprot.readString();
              struct.setReBindKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userId = iprot.readString();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SetReBindKey struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.reBindKey != null) {
        oprot.writeFieldBegin(RE_BIND_KEY_FIELD_DESC);
        oprot.writeString(struct.reBindKey);
        oprot.writeFieldEnd();
      }
      if (struct.userId != null) {
        oprot.writeFieldBegin(USER_ID_FIELD_DESC);
        oprot.writeString(struct.userId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SetReBindKeyTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SetReBindKeyTupleScheme getScheme() {
      return new SetReBindKeyTupleScheme();
    }
  }

  private static class SetReBindKeyTupleScheme extends org.apache.thrift.scheme.TupleScheme<SetReBindKey> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SetReBindKey struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetReBindKey()) {
        optionals.set(0);
      }
      if (struct.isSetUserId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetReBindKey()) {
        oprot.writeString(struct.reBindKey);
      }
      if (struct.isSetUserId()) {
        oprot.writeString(struct.userId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SetReBindKey struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.reBindKey = iprot.readString();
        struct.setReBindKeyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.userId = iprot.readString();
        struct.setUserIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

