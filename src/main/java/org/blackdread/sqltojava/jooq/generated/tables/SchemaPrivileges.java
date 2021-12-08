/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.generated.tables;


import org.blackdread.sqltojava.jooq.generated.InformationSchema;
import org.blackdread.sqltojava.jooq.generated.tables.records.SchemaPrivilegesRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class SchemaPrivileges extends TableImpl<SchemaPrivilegesRecord> {

    /**
     * The reference instance of <code>information_schema.SCHEMA_PRIVILEGES</code>
     */
    public static final SchemaPrivileges SCHEMA_PRIVILEGES = new SchemaPrivileges();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>information_schema.SCHEMA_PRIVILEGES.GRANTEE</code>.
     */
    public final TableField<SchemaPrivilegesRecord, String> GRANTEE = createField(DSL.name("GRANTEE"), SQLDataType.VARCHAR(81).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.SCHEMA_PRIVILEGES.TABLE_CATALOG</code>.
     */
    public final TableField<SchemaPrivilegesRecord, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(512).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.SCHEMA_PRIVILEGES.TABLE_SCHEMA</code>.
     */
    public final TableField<SchemaPrivilegesRecord, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.SCHEMA_PRIVILEGES.PRIVILEGE_TYPE</code>.
     */
    public final TableField<SchemaPrivilegesRecord, String> PRIVILEGE_TYPE = createField(DSL.name("PRIVILEGE_TYPE"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.SCHEMA_PRIVILEGES.IS_GRANTABLE</code>.
     */
    public final TableField<SchemaPrivilegesRecord, String> IS_GRANTABLE = createField(DSL.name("IS_GRANTABLE"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    private SchemaPrivileges(Name alias, Table<SchemaPrivilegesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SchemaPrivileges(Name alias, Table<SchemaPrivilegesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.SCHEMA_PRIVILEGES</code> table reference
     */
    public SchemaPrivileges(String alias) {
        this(DSL.name(alias), SCHEMA_PRIVILEGES);
    }

    /**
     * Create an aliased <code>information_schema.SCHEMA_PRIVILEGES</code> table reference
     */
    public SchemaPrivileges(Name alias) {
        this(alias, SCHEMA_PRIVILEGES);
    }

    /**
     * Create a <code>information_schema.SCHEMA_PRIVILEGES</code> table reference
     */
    public SchemaPrivileges() {
        this(DSL.name("SCHEMA_PRIVILEGES"), null);
    }

    public <O extends Record> SchemaPrivileges(Table<O> child, ForeignKey<O, SchemaPrivilegesRecord> key) {
        super(child, key, SCHEMA_PRIVILEGES);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemaPrivilegesRecord> getRecordType() {
        return SchemaPrivilegesRecord.class;
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public SchemaPrivileges as(String alias) {
        return new SchemaPrivileges(DSL.name(alias), this);
    }

    @Override
    public SchemaPrivileges as(Name alias) {
        return new SchemaPrivileges(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaPrivileges rename(String name) {
        return new SchemaPrivileges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaPrivileges rename(Name name) {
        return new SchemaPrivileges(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
