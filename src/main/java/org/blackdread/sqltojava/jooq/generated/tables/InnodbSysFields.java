/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.generated.tables;


import org.blackdread.sqltojava.jooq.generated.InformationSchema;
import org.blackdread.sqltojava.jooq.generated.tables.records.InnodbSysFieldsRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class InnodbSysFields extends TableImpl<InnodbSysFieldsRecord> {

    /**
     * The reference instance of <code>information_schema.INNODB_SYS_FIELDS</code>
     */
    public static final InnodbSysFields INNODB_SYS_FIELDS = new InnodbSysFields();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>information_schema.INNODB_SYS_FIELDS.INDEX_ID</code>.
     */
    public final TableField<InnodbSysFieldsRecord, ULong> INDEX_ID = createField(DSL.name("INDEX_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_FIELDS.NAME</code>.
     */
    public final TableField<InnodbSysFieldsRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(193).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_FIELDS.POS</code>.
     */
    public final TableField<InnodbSysFieldsRecord, UInteger> POS = createField(DSL.name("POS"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "");

    private InnodbSysFields(Name alias, Table<InnodbSysFieldsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbSysFields(Name alias, Table<InnodbSysFieldsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_FIELDS</code> table reference
     */
    public InnodbSysFields(String alias) {
        this(DSL.name(alias), INNODB_SYS_FIELDS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_FIELDS</code> table reference
     */
    public InnodbSysFields(Name alias) {
        this(alias, INNODB_SYS_FIELDS);
    }

    /**
     * Create a <code>information_schema.INNODB_SYS_FIELDS</code> table reference
     */
    public InnodbSysFields() {
        this(DSL.name("INNODB_SYS_FIELDS"), null);
    }

    public <O extends Record> InnodbSysFields(Table<O> child, ForeignKey<O, InnodbSysFieldsRecord> key) {
        super(child, key, INNODB_SYS_FIELDS);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbSysFieldsRecord> getRecordType() {
        return InnodbSysFieldsRecord.class;
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbSysFields as(String alias) {
        return new InnodbSysFields(DSL.name(alias), this);
    }

    @Override
    public InnodbSysFields as(Name alias) {
        return new InnodbSysFields(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysFields rename(String name) {
        return new InnodbSysFields(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysFields rename(Name name) {
        return new InnodbSysFields(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<ULong, String, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
