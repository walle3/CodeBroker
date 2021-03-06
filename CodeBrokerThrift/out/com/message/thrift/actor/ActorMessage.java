/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.message.thrift.actor;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * 消息结构体
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-09-20")
public class ActorMessage implements org.apache.thrift.TBase<ActorMessage, ActorMessage._Fields>, java.io.Serializable, Cloneable, Comparable<ActorMessage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ActorMessage");

  private static final org.apache.thrift.protocol.TField OP_FIELD_DESC = new org.apache.thrift.protocol.TField("op", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField MESSAGE_RAW_FIELD_DESC = new org.apache.thrift.protocol.TField("messageRaw", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ActorMessageStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ActorMessageTupleSchemeFactory();

  /**
   * 操作的枚举值
   * 
   * @see Operation
   */
  public Operation op; // required
  /**
   * 消息二进制结构体，需要二次转换
   */
  public java.nio.ByteBuffer messageRaw; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 操作的枚举值
     * 
     * @see Operation
     */
    OP((short)1, "op"),
    /**
     * 消息二进制结构体，需要二次转换
     */
    MESSAGE_RAW((short)2, "messageRaw");

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
        case 1: // OP
          return OP;
        case 2: // MESSAGE_RAW
          return MESSAGE_RAW;
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
  private static final _Fields optionals[] = {_Fields.MESSAGE_RAW};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OP, new org.apache.thrift.meta_data.FieldMetaData("op", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Operation.class)));
    tmpMap.put(_Fields.MESSAGE_RAW, new org.apache.thrift.meta_data.FieldMetaData("messageRaw", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ActorMessage.class, metaDataMap);
  }

  public ActorMessage() {
    this.op = com.message.thrift.actor.Operation.AREA_GET_ID;

  }

  public ActorMessage(
    Operation op)
  {
    this();
    this.op = op;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ActorMessage(ActorMessage other) {
    if (other.isSetOp()) {
      this.op = other.op;
    }
    if (other.isSetMessageRaw()) {
      this.messageRaw = org.apache.thrift.TBaseHelper.copyBinary(other.messageRaw);
    }
  }

  public ActorMessage deepCopy() {
    return new ActorMessage(this);
  }

  @Override
  public void clear() {
    this.op = com.message.thrift.actor.Operation.AREA_GET_ID;

    this.messageRaw = null;
  }

  /**
   * 操作的枚举值
   * 
   * @see Operation
   */
  public Operation getOp() {
    return this.op;
  }

  /**
   * 操作的枚举值
   * 
   * @see Operation
   */
  public ActorMessage setOp(Operation op) {
    this.op = op;
    return this;
  }

  public void unsetOp() {
    this.op = null;
  }

  /** Returns true if field op is set (has been assigned a value) and false otherwise */
  public boolean isSetOp() {
    return this.op != null;
  }

  public void setOpIsSet(boolean value) {
    if (!value) {
      this.op = null;
    }
  }

  /**
   * 消息二进制结构体，需要二次转换
   */
  public byte[] getMessageRaw() {
    setMessageRaw(org.apache.thrift.TBaseHelper.rightSize(messageRaw));
    return messageRaw == null ? null : messageRaw.array();
  }

  public java.nio.ByteBuffer bufferForMessageRaw() {
    return org.apache.thrift.TBaseHelper.copyBinary(messageRaw);
  }

  /**
   * 消息二进制结构体，需要二次转换
   */
  public ActorMessage setMessageRaw(byte[] messageRaw) {
    this.messageRaw = messageRaw == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(messageRaw.clone());
    return this;
  }

  public ActorMessage setMessageRaw(java.nio.ByteBuffer messageRaw) {
    this.messageRaw = org.apache.thrift.TBaseHelper.copyBinary(messageRaw);
    return this;
  }

  public void unsetMessageRaw() {
    this.messageRaw = null;
  }

  /** Returns true if field messageRaw is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageRaw() {
    return this.messageRaw != null;
  }

  public void setMessageRawIsSet(boolean value) {
    if (!value) {
      this.messageRaw = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case OP:
      if (value == null) {
        unsetOp();
      } else {
        setOp((Operation)value);
      }
      break;

    case MESSAGE_RAW:
      if (value == null) {
        unsetMessageRaw();
      } else {
        if (value instanceof byte[]) {
          setMessageRaw((byte[])value);
        } else {
          setMessageRaw((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case OP:
      return getOp();

    case MESSAGE_RAW:
      return getMessageRaw();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case OP:
      return isSetOp();
    case MESSAGE_RAW:
      return isSetMessageRaw();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ActorMessage)
      return this.equals((ActorMessage)that);
    return false;
  }

  public boolean equals(ActorMessage that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_op = true && this.isSetOp();
    boolean that_present_op = true && that.isSetOp();
    if (this_present_op || that_present_op) {
      if (!(this_present_op && that_present_op))
        return false;
      if (!this.op.equals(that.op))
        return false;
    }

    boolean this_present_messageRaw = true && this.isSetMessageRaw();
    boolean that_present_messageRaw = true && that.isSetMessageRaw();
    if (this_present_messageRaw || that_present_messageRaw) {
      if (!(this_present_messageRaw && that_present_messageRaw))
        return false;
      if (!this.messageRaw.equals(that.messageRaw))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetOp()) ? 131071 : 524287);
    if (isSetOp())
      hashCode = hashCode * 8191 + op.getValue();

    hashCode = hashCode * 8191 + ((isSetMessageRaw()) ? 131071 : 524287);
    if (isSetMessageRaw())
      hashCode = hashCode * 8191 + messageRaw.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ActorMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetOp()).compareTo(other.isSetOp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.op, other.op);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMessageRaw()).compareTo(other.isSetMessageRaw());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageRaw()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messageRaw, other.messageRaw);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ActorMessage(");
    boolean first = true;

    sb.append("op:");
    if (this.op == null) {
      sb.append("null");
    } else {
      sb.append(this.op);
    }
    first = false;
    if (isSetMessageRaw()) {
      if (!first) sb.append(", ");
      sb.append("messageRaw:");
      if (this.messageRaw == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.messageRaw, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (op == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'op' was not present! Struct: " + toString());
    }
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

  private static class ActorMessageStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ActorMessageStandardScheme getScheme() {
      return new ActorMessageStandardScheme();
    }
  }

  private static class ActorMessageStandardScheme extends org.apache.thrift.scheme.StandardScheme<ActorMessage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ActorMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.op = com.message.thrift.actor.Operation.findByValue(iprot.readI32());
              struct.setOpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGE_RAW
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.messageRaw = iprot.readBinary();
              struct.setMessageRawIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ActorMessage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.op != null) {
        oprot.writeFieldBegin(OP_FIELD_DESC);
        oprot.writeI32(struct.op.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.messageRaw != null) {
        if (struct.isSetMessageRaw()) {
          oprot.writeFieldBegin(MESSAGE_RAW_FIELD_DESC);
          oprot.writeBinary(struct.messageRaw);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ActorMessageTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ActorMessageTupleScheme getScheme() {
      return new ActorMessageTupleScheme();
    }
  }

  private static class ActorMessageTupleScheme extends org.apache.thrift.scheme.TupleScheme<ActorMessage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ActorMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.op.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMessageRaw()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetMessageRaw()) {
        oprot.writeBinary(struct.messageRaw);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ActorMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.op = com.message.thrift.actor.Operation.findByValue(iprot.readI32());
      struct.setOpIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.messageRaw = iprot.readBinary();
        struct.setMessageRawIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

