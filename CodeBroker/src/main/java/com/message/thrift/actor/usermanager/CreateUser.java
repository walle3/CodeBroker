/**
 * Autogenerated by Thrift Compiler (0.10.0)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.message.thrift.actor.usermanager;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * 创建用户
 *
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-09-07")
public class CreateUser implements org.apache.thrift.TBase<CreateUser, CreateUser._Fields>, java.io.Serializable, Cloneable, Comparable<CreateUser> {
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CreateUser");
    private static final org.apache.thrift.protocol.TField NPC_FIELD_DESC = new org.apache.thrift.protocol.TField("npc", org.apache.thrift.protocol.TType.BOOL, (short) 1);
    private static final org.apache.thrift.protocol.TField RE_BIND_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("reBindKey", org.apache.thrift.protocol.TType.STRING, (short) 2);
    private static final org.apache.thrift.protocol.TField SENDER_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("senderPath", org.apache.thrift.protocol.TType.STRING, (short) 3);
    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CreateUserStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CreateUserTupleSchemeFactory();
    // isset id assignments
    private static final int __NPC_ISSET_ID = 0;

    static {
        java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.NPC, new org.apache.thrift.meta_data.FieldMetaData("npc", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
        tmpMap.put(_Fields.RE_BIND_KEY, new org.apache.thrift.meta_data.FieldMetaData("reBindKey", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.SENDER_PATH, new org.apache.thrift.meta_data.FieldMetaData("senderPath", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CreateUser.class, metaDataMap);
    }

    public boolean npc; // required
    public java.lang.String reBindKey; // required
    public java.lang.String senderPath; // required
    private byte __isset_bitfield = 0;

    public CreateUser() {
    }

    public CreateUser(
            boolean npc,
            java.lang.String reBindKey,
            java.lang.String senderPath) {
        this();
        this.npc = npc;
        setNpcIsSet(true);
        this.reBindKey = reBindKey;
        this.senderPath = senderPath;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public CreateUser(CreateUser other) {
        __isset_bitfield = other.__isset_bitfield;
        this.npc = other.npc;
        if (other.isSetReBindKey()) {
            this.reBindKey = other.reBindKey;
        }
        if (other.isSetSenderPath()) {
            this.senderPath = other.senderPath;
        }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
        return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }

    public CreateUser deepCopy() {
        return new CreateUser(this);
    }

    @Override
    public void clear() {
        setNpcIsSet(false);
        this.npc = false;
        this.reBindKey = null;
        this.senderPath = null;
    }

    public boolean isNpc() {
        return this.npc;
    }

    public CreateUser setNpc(boolean npc) {
        this.npc = npc;
        setNpcIsSet(true);
        return this;
    }

    public void unsetNpc() {
        __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NPC_ISSET_ID);
    }

    /**
     * Returns true if field npc is set (has been assigned a value) and false otherwise
     */
    public boolean isSetNpc() {
        return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NPC_ISSET_ID);
    }

    public void setNpcIsSet(boolean value) {
        __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NPC_ISSET_ID, value);
    }

    public java.lang.String getReBindKey() {
        return this.reBindKey;
    }

    public CreateUser setReBindKey(java.lang.String reBindKey) {
        this.reBindKey = reBindKey;
        return this;
    }

    public void unsetReBindKey() {
        this.reBindKey = null;
    }

    /**
     * Returns true if field reBindKey is set (has been assigned a value) and false otherwise
     */
    public boolean isSetReBindKey() {
        return this.reBindKey != null;
    }

    public void setReBindKeyIsSet(boolean value) {
        if (!value) {
            this.reBindKey = null;
        }
    }

    public java.lang.String getSenderPath() {
        return this.senderPath;
    }

    public CreateUser setSenderPath(java.lang.String senderPath) {
        this.senderPath = senderPath;
        return this;
    }

    public void unsetSenderPath() {
        this.senderPath = null;
    }

    /**
     * Returns true if field senderPath is set (has been assigned a value) and false otherwise
     */
    public boolean isSetSenderPath() {
        return this.senderPath != null;
    }

    public void setSenderPathIsSet(boolean value) {
        if (!value) {
            this.senderPath = null;
        }
    }

    public void setFieldValue(_Fields field, java.lang.Object value) {
        switch (field) {
            case NPC:
                if (value == null) {
                    unsetNpc();
                } else {
                    setNpc((java.lang.Boolean) value);
                }
                break;

            case RE_BIND_KEY:
                if (value == null) {
                    unsetReBindKey();
                } else {
                    setReBindKey((java.lang.String) value);
                }
                break;

            case SENDER_PATH:
                if (value == null) {
                    unsetSenderPath();
                } else {
                    setSenderPath((java.lang.String) value);
                }
                break;

        }
    }

    public java.lang.Object getFieldValue(_Fields field) {
        switch (field) {
            case NPC:
                return isNpc();

            case RE_BIND_KEY:
                return getReBindKey();

            case SENDER_PATH:
                return getSenderPath();

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
            case NPC:
                return isSetNpc();
            case RE_BIND_KEY:
                return isSetReBindKey();
            case SENDER_PATH:
                return isSetSenderPath();
        }
        throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
            return false;
        if (that instanceof CreateUser)
            return this.equals((CreateUser) that);
        return false;
    }

    public boolean equals(CreateUser that) {
        if (that == null)
            return false;
        if (this == that)
            return true;

        boolean this_present_npc = true;
        boolean that_present_npc = true;
        if (this_present_npc || that_present_npc) {
            if (!(this_present_npc && that_present_npc))
                return false;
            if (this.npc != that.npc)
                return false;
        }

        boolean this_present_reBindKey = true && this.isSetReBindKey();
        boolean that_present_reBindKey = true && that.isSetReBindKey();
        if (this_present_reBindKey || that_present_reBindKey) {
            if (!(this_present_reBindKey && that_present_reBindKey))
                return false;
            if (!this.reBindKey.equals(that.reBindKey))
                return false;
        }

        boolean this_present_senderPath = true && this.isSetSenderPath();
        boolean that_present_senderPath = true && that.isSetSenderPath();
        if (this_present_senderPath || that_present_senderPath) {
            if (!(this_present_senderPath && that_present_senderPath))
                return false;
            if (!this.senderPath.equals(that.senderPath))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        hashCode = hashCode * 8191 + ((npc) ? 131071 : 524287);

        hashCode = hashCode * 8191 + ((isSetReBindKey()) ? 131071 : 524287);
        if (isSetReBindKey())
            hashCode = hashCode * 8191 + reBindKey.hashCode();

        hashCode = hashCode * 8191 + ((isSetSenderPath()) ? 131071 : 524287);
        if (isSetSenderPath())
            hashCode = hashCode * 8191 + senderPath.hashCode();

        return hashCode;
    }

    @Override
    public int compareTo(CreateUser other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = java.lang.Boolean.valueOf(isSetNpc()).compareTo(other.isSetNpc());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetNpc()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.npc, other.npc);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
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
        lastComparison = java.lang.Boolean.valueOf(isSetSenderPath()).compareTo(other.isSetSenderPath());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetSenderPath()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.senderPath, other.senderPath);
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateUser(");
        boolean first = true;

        sb.append("npc:");
        sb.append(this.npc);
        first = false;
        if (!first) sb.append(", ");
        sb.append("reBindKey:");
        if (this.reBindKey == null) {
            sb.append("null");
        } else {
            sb.append(this.reBindKey);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("senderPath:");
        if (this.senderPath == null) {
            sb.append("null");
        } else {
            sb.append(this.senderPath);
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
        NPC((short) 1, "npc"),
        RE_BIND_KEY((short) 2, "reBindKey"),
        SENDER_PATH((short) 3, "senderPath");

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
                case 1: // NPC
                    return NPC;
                case 2: // RE_BIND_KEY
                    return RE_BIND_KEY;
                case 3: // SENDER_PATH
                    return SENDER_PATH;
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

    private static class CreateUserStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public CreateUserStandardScheme getScheme() {
            return new CreateUserStandardScheme();
        }
    }

    private static class CreateUserStandardScheme extends org.apache.thrift.scheme.StandardScheme<CreateUser> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, CreateUser struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // NPC
                        if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
                            struct.npc = iprot.readBool();
                            struct.setNpcIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // RE_BIND_KEY
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.reBindKey = iprot.readString();
                            struct.setReBindKeyIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // SENDER_PATH
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.senderPath = iprot.readString();
                            struct.setSenderPathIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, CreateUser struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            oprot.writeFieldBegin(NPC_FIELD_DESC);
            oprot.writeBool(struct.npc);
            oprot.writeFieldEnd();
            if (struct.reBindKey != null) {
                oprot.writeFieldBegin(RE_BIND_KEY_FIELD_DESC);
                oprot.writeString(struct.reBindKey);
                oprot.writeFieldEnd();
            }
            if (struct.senderPath != null) {
                oprot.writeFieldBegin(SENDER_PATH_FIELD_DESC);
                oprot.writeString(struct.senderPath);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class CreateUserTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public CreateUserTupleScheme getScheme() {
            return new CreateUserTupleScheme();
        }
    }

    private static class CreateUserTupleScheme extends org.apache.thrift.scheme.TupleScheme<CreateUser> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, CreateUser struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            java.util.BitSet optionals = new java.util.BitSet();
            if (struct.isSetNpc()) {
                optionals.set(0);
            }
            if (struct.isSetReBindKey()) {
                optionals.set(1);
            }
            if (struct.isSetSenderPath()) {
                optionals.set(2);
            }
            oprot.writeBitSet(optionals, 3);
            if (struct.isSetNpc()) {
                oprot.writeBool(struct.npc);
            }
            if (struct.isSetReBindKey()) {
                oprot.writeString(struct.reBindKey);
            }
            if (struct.isSetSenderPath()) {
                oprot.writeString(struct.senderPath);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, CreateUser struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            java.util.BitSet incoming = iprot.readBitSet(3);
            if (incoming.get(0)) {
                struct.npc = iprot.readBool();
                struct.setNpcIsSet(true);
            }
            if (incoming.get(1)) {
                struct.reBindKey = iprot.readString();
                struct.setReBindKeyIsSet(true);
            }
            if (incoming.get(2)) {
                struct.senderPath = iprot.readString();
                struct.setSenderPathIsSet(true);
            }
        }
    }
}

