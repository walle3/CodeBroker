/**
 * Autogenerated by Thrift Compiler (0.10.0)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.message.thrift.actor.areamanager;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-08-29")
public class GetAreaById implements org.apache.thrift.TBase<GetAreaById, GetAreaById._Fields>, java.io.Serializable, Cloneable, Comparable<GetAreaById> {
    // isset id assignments
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetAreaById");
    private static final org.apache.thrift.protocol.TField AREA_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("areaId", org.apache.thrift.protocol.TType.STRING, (short) 1);
    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetAreaByIdStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetAreaByIdTupleSchemeFactory();

    static {
        java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.AREA_ID, new org.apache.thrift.meta_data.FieldMetaData("areaId", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetAreaById.class, metaDataMap);
    }

    public java.lang.String areaId; // required

    public GetAreaById() {
    }

    public GetAreaById(
            java.lang.String areaId) {
        this();
        this.areaId = areaId;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public GetAreaById(GetAreaById other) {
        if (other.isSetAreaId()) {
            this.areaId = other.areaId;
        }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
        return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }

    public GetAreaById deepCopy() {
        return new GetAreaById(this);
    }

    @Override
    public void clear() {
        this.areaId = null;
    }

    public java.lang.String getAreaId() {
        return this.areaId;
    }

    public GetAreaById setAreaId(java.lang.String areaId) {
        this.areaId = areaId;
        return this;
    }

    public void unsetAreaId() {
        this.areaId = null;
    }

    /**
     * Returns true if field areaId is set (has been assigned a value) and false otherwise
     */
    public boolean isSetAreaId() {
        return this.areaId != null;
    }

    public void setAreaIdIsSet(boolean value) {
        if (!value) {
            this.areaId = null;
        }
    }

    public void setFieldValue(_Fields field, java.lang.Object value) {
        switch (field) {
            case AREA_ID:
                if (value == null) {
                    unsetAreaId();
                } else {
                    setAreaId((java.lang.String) value);
                }
                break;

        }
    }

    public java.lang.Object getFieldValue(_Fields field) {
        switch (field) {
            case AREA_ID:
                return getAreaId();

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
            case AREA_ID:
                return isSetAreaId();
        }
        throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
            return false;
        if (that instanceof GetAreaById)
            return this.equals((GetAreaById) that);
        return false;
    }

    public boolean equals(GetAreaById that) {
        if (that == null)
            return false;
        if (this == that)
            return true;

        boolean this_present_areaId = true && this.isSetAreaId();
        boolean that_present_areaId = true && that.isSetAreaId();
        if (this_present_areaId || that_present_areaId) {
            if (!(this_present_areaId && that_present_areaId))
                return false;
            if (!this.areaId.equals(that.areaId))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        hashCode = hashCode * 8191 + ((isSetAreaId()) ? 131071 : 524287);
        if (isSetAreaId())
            hashCode = hashCode * 8191 + areaId.hashCode();

        return hashCode;
    }

    @Override
    public int compareTo(GetAreaById other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = java.lang.Boolean.valueOf(isSetAreaId()).compareTo(other.isSetAreaId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetAreaId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.areaId, other.areaId);
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetAreaById(");
        boolean first = true;

        sb.append("areaId:");
        if (this.areaId == null) {
            sb.append("null");
        } else {
            sb.append(this.areaId);
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

    /**
     * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        AREA_ID((short) 1, "areaId");

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
                case 1: // AREA_ID
                    return AREA_ID;
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

    private static class GetAreaByIdStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public GetAreaByIdStandardScheme getScheme() {
            return new GetAreaByIdStandardScheme();
        }
    }

    private static class GetAreaByIdStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetAreaById> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, GetAreaById struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // AREA_ID
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.areaId = iprot.readString();
                            struct.setAreaIdIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, GetAreaById struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.areaId != null) {
                oprot.writeFieldBegin(AREA_ID_FIELD_DESC);
                oprot.writeString(struct.areaId);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class GetAreaByIdTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public GetAreaByIdTupleScheme getScheme() {
            return new GetAreaByIdTupleScheme();
        }
    }

    private static class GetAreaByIdTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetAreaById> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, GetAreaById struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            java.util.BitSet optionals = new java.util.BitSet();
            if (struct.isSetAreaId()) {
                optionals.set(0);
            }
            oprot.writeBitSet(optionals, 1);
            if (struct.isSetAreaId()) {
                oprot.writeString(struct.areaId);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, GetAreaById struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            java.util.BitSet incoming = iprot.readBitSet(1);
            if (incoming.get(0)) {
                struct.areaId = iprot.readString();
                struct.setAreaIdIsSet(true);
            }
        }
    }
}

