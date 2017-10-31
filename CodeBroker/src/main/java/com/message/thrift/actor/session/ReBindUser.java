/**
 * Autogenerated by Thrift Compiler (0.10.0)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.message.thrift.actor.session;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-09-29")
public class ReBindUser implements org.apache.thrift.TBase<ReBindUser, ReBindUser._Fields>, java.io.Serializable, Cloneable, Comparable<ReBindUser> {
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReBindUser");
    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.BOOL, (short) 1);
    private static final org.apache.thrift.protocol.TField BINDINGKEY_FIELD_DESC = new org.apache.thrift.protocol.TField("bindingkey", org.apache.thrift.protocol.TType.STRING, (short) 2);
    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ReBindUserStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ReBindUserTupleSchemeFactory();
    // isset id assignments
    private static final int __SUCCESS_ISSET_ID = 0;

    static {
        java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
        tmpMap.put(_Fields.BINDINGKEY, new org.apache.thrift.meta_data.FieldMetaData("bindingkey", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReBindUser.class, metaDataMap);
    }

    public boolean success; // required
    public java.lang.String bindingkey; // required
    private byte __isset_bitfield = 0;

    public ReBindUser() {
    }

    public ReBindUser(
            boolean success,
            java.lang.String bindingkey) {
        this();
        this.success = success;
        setSuccessIsSet(true);
        this.bindingkey = bindingkey;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public ReBindUser(ReBindUser other) {
        __isset_bitfield = other.__isset_bitfield;
        this.success = other.success;
        if (other.isSetBindingkey()) {
            this.bindingkey = other.bindingkey;
        }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
        return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }

    public ReBindUser deepCopy() {
        return new ReBindUser(this);
    }

    @Override
    public void clear() {
        setSuccessIsSet(false);
        this.success = false;
        this.bindingkey = null;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public ReBindUser setSuccess(boolean success) {
        this.success = success;
        setSuccessIsSet(true);
        return this;
    }

    public void unsetSuccess() {
        __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SUCCESS_ISSET_ID);
    }

    /**
     * Returns true if field success is set (has been assigned a value) and false otherwise
     */
    public boolean isSetSuccess() {
        return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SUCCESS_ISSET_ID);
    }

    public void setSuccessIsSet(boolean value) {
        __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SUCCESS_ISSET_ID, value);
    }

    public java.lang.String getBindingkey() {
        return this.bindingkey;
    }

    public ReBindUser setBindingkey(java.lang.String bindingkey) {
        this.bindingkey = bindingkey;
        return this;
    }

    public void unsetBindingkey() {
        this.bindingkey = null;
    }

    /**
     * Returns true if field bindingkey is set (has been assigned a value) and false otherwise
     */
    public boolean isSetBindingkey() {
        return this.bindingkey != null;
    }

    public void setBindingkeyIsSet(boolean value) {
        if (!value) {
            this.bindingkey = null;
        }
    }

    public void setFieldValue(_Fields field, java.lang.Object value) {
        switch (field) {
            case SUCCESS:
                if (value == null) {
                    unsetSuccess();
                } else {
                    setSuccess((java.lang.Boolean) value);
                }
                break;

            case BINDINGKEY:
                if (value == null) {
                    unsetBindingkey();
                } else {
                    setBindingkey((java.lang.String) value);
                }
                break;

        }
    }

    public java.lang.Object getFieldValue(_Fields field) {
        switch (field) {
            case SUCCESS:
                return isSuccess();

            case BINDINGKEY:
                return getBindingkey();

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
            case SUCCESS:
                return isSetSuccess();
            case BINDINGKEY:
                return isSetBindingkey();
        }
        throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
            return false;
        if (that instanceof ReBindUser)
            return this.equals((ReBindUser) that);
        return false;
    }

    public boolean equals(ReBindUser that) {
        if (that == null)
            return false;
        if (this == that)
            return true;

        boolean this_present_success = true;
        boolean that_present_success = true;
        if (this_present_success || that_present_success) {
            if (!(this_present_success && that_present_success))
                return false;
            if (this.success != that.success)
                return false;
        }

        boolean this_present_bindingkey = true && this.isSetBindingkey();
        boolean that_present_bindingkey = true && that.isSetBindingkey();
        if (this_present_bindingkey || that_present_bindingkey) {
            if (!(this_present_bindingkey && that_present_bindingkey))
                return false;
            if (!this.bindingkey.equals(that.bindingkey))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        hashCode = hashCode * 8191 + ((success) ? 131071 : 524287);

        hashCode = hashCode * 8191 + ((isSetBindingkey()) ? 131071 : 524287);
        if (isSetBindingkey())
            hashCode = hashCode * 8191 + bindingkey.hashCode();

        return hashCode;
    }

    @Override
    public int compareTo(ReBindUser other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = java.lang.Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetSuccess()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = java.lang.Boolean.valueOf(isSetBindingkey()).compareTo(other.isSetBindingkey());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetBindingkey()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bindingkey, other.bindingkey);
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReBindUser(");
        boolean first = true;

        sb.append("success:");
        sb.append(this.success);
        first = false;
        if (!first) sb.append(", ");
        sb.append("bindingkey:");
        if (this.bindingkey == null) {
            sb.append("null");
        } else {
            sb.append(this.bindingkey);
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
        SUCCESS((short) 1, "success"),
        BINDINGKEY((short) 2, "bindingkey");

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
                case 1: // SUCCESS
                    return SUCCESS;
                case 2: // BINDINGKEY
                    return BINDINGKEY;
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

    private static class ReBindUserStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public ReBindUserStandardScheme getScheme() {
            return new ReBindUserStandardScheme();
        }
    }

    private static class ReBindUserStandardScheme extends org.apache.thrift.scheme.StandardScheme<ReBindUser> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, ReBindUser struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // SUCCESS
                        if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
                            struct.success = iprot.readBool();
                            struct.setSuccessIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // BINDINGKEY
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.bindingkey = iprot.readString();
                            struct.setBindingkeyIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, ReBindUser struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
            oprot.writeBool(struct.success);
            oprot.writeFieldEnd();
            if (struct.bindingkey != null) {
                oprot.writeFieldBegin(BINDINGKEY_FIELD_DESC);
                oprot.writeString(struct.bindingkey);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class ReBindUserTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public ReBindUserTupleScheme getScheme() {
            return new ReBindUserTupleScheme();
        }
    }

    private static class ReBindUserTupleScheme extends org.apache.thrift.scheme.TupleScheme<ReBindUser> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, ReBindUser struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            java.util.BitSet optionals = new java.util.BitSet();
            if (struct.isSetSuccess()) {
                optionals.set(0);
            }
            if (struct.isSetBindingkey()) {
                optionals.set(1);
            }
            oprot.writeBitSet(optionals, 2);
            if (struct.isSetSuccess()) {
                oprot.writeBool(struct.success);
            }
            if (struct.isSetBindingkey()) {
                oprot.writeString(struct.bindingkey);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, ReBindUser struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            java.util.BitSet incoming = iprot.readBitSet(2);
            if (incoming.get(0)) {
                struct.success = iprot.readBool();
                struct.setSuccessIsSet(true);
            }
            if (incoming.get(1)) {
                struct.bindingkey = iprot.readString();
                struct.setBindingkeyIsSet(true);
            }
        }
    }
}

