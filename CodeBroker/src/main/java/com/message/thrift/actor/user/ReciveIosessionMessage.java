/**
 * Autogenerated by Thrift Compiler (0.10.0)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.message.thrift.actor.user;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * 接收的网络数据
 *
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-08-28")
public class ReciveIosessionMessage implements org.apache.thrift.TBase<ReciveIosessionMessage, ReciveIosessionMessage._Fields>, java.io.Serializable, Cloneable, Comparable<ReciveIosessionMessage> {
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReciveIosessionMessage");
    private static final org.apache.thrift.protocol.TField OPCODE_FIELD_DESC = new org.apache.thrift.protocol.TField("opcode", org.apache.thrift.protocol.TType.I32, (short) 1);
    private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short) 2);
    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ReciveIosessionMessageStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ReciveIosessionMessageTupleSchemeFactory();
    // isset id assignments
    private static final int __OPCODE_ISSET_ID = 0;

    static {
        java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.OPCODE, new org.apache.thrift.meta_data.FieldMetaData("opcode", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
        tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING, true)));
        metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReciveIosessionMessage.class, metaDataMap);
    }

    public int opcode; // required
    public java.nio.ByteBuffer message; // required
    private byte __isset_bitfield = 0;

    public ReciveIosessionMessage() {
    }

    public ReciveIosessionMessage(
            int opcode,
            java.nio.ByteBuffer message) {
        this();
        this.opcode = opcode;
        setOpcodeIsSet(true);
        this.message = org.apache.thrift.TBaseHelper.copyBinary(message);
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public ReciveIosessionMessage(ReciveIosessionMessage other) {
        __isset_bitfield = other.__isset_bitfield;
        this.opcode = other.opcode;
        if (other.isSetMessage()) {
            this.message = org.apache.thrift.TBaseHelper.copyBinary(other.message);
        }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
        return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }

    public ReciveIosessionMessage deepCopy() {
        return new ReciveIosessionMessage(this);
    }

    @Override
    public void clear() {
        setOpcodeIsSet(false);
        this.opcode = 0;
        this.message = null;
    }

    public int getOpcode() {
        return this.opcode;
    }

    public ReciveIosessionMessage setOpcode(int opcode) {
        this.opcode = opcode;
        setOpcodeIsSet(true);
        return this;
    }

    public void unsetOpcode() {
        __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OPCODE_ISSET_ID);
    }

    /**
     * Returns true if field opcode is set (has been assigned a value) and false otherwise
     */
    public boolean isSetOpcode() {
        return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OPCODE_ISSET_ID);
    }

    public void setOpcodeIsSet(boolean value) {
        __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OPCODE_ISSET_ID, value);
    }

    public byte[] getMessage() {
        setMessage(org.apache.thrift.TBaseHelper.rightSize(message));
        return message == null ? null : message.array();
    }

    public ReciveIosessionMessage setMessage(java.nio.ByteBuffer message) {
        this.message = org.apache.thrift.TBaseHelper.copyBinary(message);
        return this;
    }

    public ReciveIosessionMessage setMessage(byte[] message) {
        this.message = message == null ? (java.nio.ByteBuffer) null : java.nio.ByteBuffer.wrap(message.clone());
        return this;
    }

    public java.nio.ByteBuffer bufferForMessage() {
        return org.apache.thrift.TBaseHelper.copyBinary(message);
    }

    public void unsetMessage() {
        this.message = null;
    }

    /**
     * Returns true if field message is set (has been assigned a value) and false otherwise
     */
    public boolean isSetMessage() {
        return this.message != null;
    }

    public void setMessageIsSet(boolean value) {
        if (!value) {
            this.message = null;
        }
    }

    public void setFieldValue(_Fields field, java.lang.Object value) {
        switch (field) {
            case OPCODE:
                if (value == null) {
                    unsetOpcode();
                } else {
                    setOpcode((java.lang.Integer) value);
                }
                break;

            case MESSAGE:
                if (value == null) {
                    unsetMessage();
                } else {
                    if (value instanceof byte[]) {
                        setMessage((byte[]) value);
                    } else {
                        setMessage((java.nio.ByteBuffer) value);
                    }
                }
                break;

        }
    }

    public java.lang.Object getFieldValue(_Fields field) {
        switch (field) {
            case OPCODE:
                return getOpcode();

            case MESSAGE:
                return getMessage();

        }
        throw new java.lang.IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new java.lang.IllegalArgumentException();
        }

        switch (field) {
            case OPCODE:
                return isSetOpcode();
            case MESSAGE:
                return isSetMessage();
        }
        throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
            return false;
        if (that instanceof ReciveIosessionMessage)
            return this.equals((ReciveIosessionMessage) that);
        return false;
    }

    public boolean equals(ReciveIosessionMessage that) {
        if (that == null)
            return false;
        if (this == that)
            return true;

        boolean this_present_opcode = true;
        boolean that_present_opcode = true;
        if (this_present_opcode || that_present_opcode) {
            if (!(this_present_opcode && that_present_opcode))
                return false;
            if (this.opcode != that.opcode)
                return false;
        }

        boolean this_present_message = true && this.isSetMessage();
        boolean that_present_message = true && that.isSetMessage();
        if (this_present_message || that_present_message) {
            if (!(this_present_message && that_present_message))
                return false;
            if (!this.message.equals(that.message))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        hashCode = hashCode * 8191 + opcode;

        hashCode = hashCode * 8191 + ((isSetMessage()) ? 131071 : 524287);
        if (isSetMessage())
            hashCode = hashCode * 8191 + message.hashCode();

        return hashCode;
    }

    @Override
    public int compareTo(ReciveIosessionMessage other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = java.lang.Boolean.valueOf(isSetOpcode()).compareTo(other.isSetOpcode());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetOpcode()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.opcode, other.opcode);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = java.lang.Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetMessage()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReciveIosessionMessage(");
        boolean first = true;

        sb.append("opcode:");
        sb.append(this.opcode);
        first = false;
        if (!first) sb.append(", ");
        sb.append("message:");
        if (this.message == null) {
            sb.append("null");
        } else {
            org.apache.thrift.TBaseHelper.toString(this.message, sb);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        // alas, we cannot check 'opcode' because it's a primitive and you chose the non-beans generator.
        if (message == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'message' was not present! Struct: " + toString());
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
            // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
            __isset_bitfield = 0;
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    /**
     * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        OPCODE((short) 1, "opcode"),
        MESSAGE((short) 2, "message");

        private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

        static {
            for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        private final short _thriftId;
        private final java.lang.String _fieldName;

        _Fields(short thriftId, java.lang.String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
                case 1: // OPCODE
                    return OPCODE;
                case 2: // MESSAGE
                    return MESSAGE;
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

        public short getThriftFieldId() {
            return _thriftId;
        }

        public java.lang.String getFieldName() {
            return _fieldName;
        }
    }

    private static class ReciveIosessionMessageStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public ReciveIosessionMessageStandardScheme getScheme() {
            return new ReciveIosessionMessageStandardScheme();
        }
    }

    private static class ReciveIosessionMessageStandardScheme extends org.apache.thrift.scheme.StandardScheme<ReciveIosessionMessage> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, ReciveIosessionMessage struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // OPCODE
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.opcode = iprot.readI32();
                            struct.setOpcodeIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // MESSAGE
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.message = iprot.readBinary();
                            struct.setMessageIsSet(true);
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
            if (!struct.isSetOpcode()) {
                throw new org.apache.thrift.protocol.TProtocolException("Required field 'opcode' was not found in serialized data! Struct: " + toString());
            }
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, ReciveIosessionMessage struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            oprot.writeFieldBegin(OPCODE_FIELD_DESC);
            oprot.writeI32(struct.opcode);
            oprot.writeFieldEnd();
            if (struct.message != null) {
                oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
                oprot.writeBinary(struct.message);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class ReciveIosessionMessageTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public ReciveIosessionMessageTupleScheme getScheme() {
            return new ReciveIosessionMessageTupleScheme();
        }
    }

    private static class ReciveIosessionMessageTupleScheme extends org.apache.thrift.scheme.TupleScheme<ReciveIosessionMessage> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, ReciveIosessionMessage struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            oprot.writeI32(struct.opcode);
            oprot.writeBinary(struct.message);
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, ReciveIosessionMessage struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            struct.opcode = iprot.readI32();
            struct.setOpcodeIsSet(true);
            struct.message = iprot.readBinary();
            struct.setMessageIsSet(true);
        }
    }
}

