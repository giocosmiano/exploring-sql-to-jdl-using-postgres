/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.generated.tables;


import org.blackdread.sqltojava.jooq.generated.InformationSchema;
import org.blackdread.sqltojava.jooq.generated.tables.records.InnodbSysTablespacesRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class InnodbSysTablespaces extends TableImpl<InnodbSysTablespacesRecord> {

    /**
     * The reference instance of <code>information_schema.INNODB_SYS_TABLESPACES</code>
     */
    public static final InnodbSysTablespaces INNODB_SYS_TABLESPACES = new InnodbSysTablespaces();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>information_schema.INNODB_SYS_TABLESPACES.SPACE</code>.
     */
    public final TableField<InnodbSysTablespacesRecord, UInteger> SPACE = createField(DSL.name("SPACE"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_TABLESPACES.NAME</code>.
     */
    public final TableField<InnodbSysTablespacesRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(655).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_TABLESPACES.FLAG</code>.
     */
    public final TableField<InnodbSysTablespacesRecord, UInteger> FLAG = createField(DSL.name("FLAG"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_TABLESPACES.FILE_FORMAT</code>.
     */
    public final TableField<InnodbSysTablespacesRecord, String> FILE_FORMAT = createField(DSL.name("FILE_FORMAT"), SQLDataType.VARCHAR(10), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_TABLESPACES.ROW_FORMAT</code>.
     */
    public final TableField<InnodbSysTablespacesRecord, String> ROW_FORMAT = createField(DSL.name("ROW_FORMAT"), SQLDataType.VARCHAR(22), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_TABLESPACES.PAGE_SIZE</code>.
     */
    public final TableField<InnodbSysTablespacesRecord, UInteger> PAGE_SIZE = createField(DSL.name("PAGE_SIZE"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_TABLESPACES.ZIP_PAGE_SIZE</code>.
     */
    public final TableField<InnodbSysTablespacesRecord, UInteger> ZIP_PAGE_SIZE = createField(DSL.name("ZIP_PAGE_SIZE"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_TABLESPACES.SPACE_TYPE</code>.
     */
    public final TableField<InnodbSysTablespacesRecord, String> SPACE_TYPE = createField(DSL.name("SPACE_TYPE"), SQLDataType.VARCHAR(10), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_TABLESPACES.FS_BLOCK_SIZE</code>.
     */
    public final TableField<InnodbSysTablespacesRecord, UInteger> FS_BLOCK_SIZE = createField(DSL.name("FS_BLOCK_SIZE"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_TABLESPACES.FILE_SIZE</code>.
     */
    public final TableField<InnodbSysTablespacesRecord, ULong> FILE_SIZE = createField(DSL.name("FILE_SIZE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_TABLESPACES.ALLOCATED_SIZE</code>.
     */
    public final TableField<InnodbSysTablespacesRecord, ULong> ALLOCATED_SIZE = createField(DSL.name("ALLOCATED_SIZE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    private InnodbSysTablespaces(Name alias, Table<InnodbSysTablespacesRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbSysTablespaces(Name alias, Table<InnodbSysTablespacesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_TABLESPACES</code> table reference
     */
    public InnodbSysTablespaces(String alias) {
        this(DSL.name(alias), INNODB_SYS_TABLESPACES);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_TABLESPACES</code> table reference
     */
    public InnodbSysTablespaces(Name alias) {
        this(alias, INNODB_SYS_TABLESPACES);
    }

    /**
     * Create a <code>information_schema.INNODB_SYS_TABLESPACES</code> table reference
     */
    public InnodbSysTablespaces() {
        this(DSL.name("INNODB_SYS_TABLESPACES"), null);
    }

    public <O extends Record> InnodbSysTablespaces(Table<O> child, ForeignKey<O, InnodbSysTablespacesRecord> key) {
        super(child, key, INNODB_SYS_TABLESPACES);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbSysTablespacesRecord> getRecordType() {
        return InnodbSysTablespacesRecord.class;
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbSysTablespaces as(String alias) {
        return new InnodbSysTablespaces(DSL.name(alias), this);
    }

    @Override
    public InnodbSysTablespaces as(Name alias) {
        return new InnodbSysTablespaces(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysTablespaces rename(String name) {
        return new InnodbSysTablespaces(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysTablespaces rename(Name name) {
        return new InnodbSysTablespaces(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<UInteger, String, UInteger, String, String, UInteger, UInteger, String, UInteger, ULong, ULong> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
