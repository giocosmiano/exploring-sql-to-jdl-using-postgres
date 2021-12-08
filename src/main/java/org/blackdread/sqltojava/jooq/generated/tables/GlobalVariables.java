/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.generated.tables;


import org.blackdread.sqltojava.jooq.generated.InformationSchema;
import org.blackdread.sqltojava.jooq.generated.tables.records.GlobalVariablesRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class GlobalVariables extends TableImpl<GlobalVariablesRecord> {

    /**
     * The reference instance of <code>information_schema.GLOBAL_VARIABLES</code>
     */
    public static final GlobalVariables GLOBAL_VARIABLES = new GlobalVariables();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>information_schema.GLOBAL_VARIABLES.VARIABLE_NAME</code>.
     */
    public final TableField<GlobalVariablesRecord, String> VARIABLE_NAME = createField(DSL.name("VARIABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.GLOBAL_VARIABLES.VARIABLE_VALUE</code>.
     */
    public final TableField<GlobalVariablesRecord, String> VARIABLE_VALUE = createField(DSL.name("VARIABLE_VALUE"), SQLDataType.VARCHAR(1024), this, "");

    private GlobalVariables(Name alias, Table<GlobalVariablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private GlobalVariables(Name alias, Table<GlobalVariablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.GLOBAL_VARIABLES</code> table reference
     */
    public GlobalVariables(String alias) {
        this(DSL.name(alias), GLOBAL_VARIABLES);
    }

    /**
     * Create an aliased <code>information_schema.GLOBAL_VARIABLES</code> table reference
     */
    public GlobalVariables(Name alias) {
        this(alias, GLOBAL_VARIABLES);
    }

    /**
     * Create a <code>information_schema.GLOBAL_VARIABLES</code> table reference
     */
    public GlobalVariables() {
        this(DSL.name("GLOBAL_VARIABLES"), null);
    }

    public <O extends Record> GlobalVariables(Table<O> child, ForeignKey<O, GlobalVariablesRecord> key) {
        super(child, key, GLOBAL_VARIABLES);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GlobalVariablesRecord> getRecordType() {
        return GlobalVariablesRecord.class;
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public GlobalVariables as(String alias) {
        return new GlobalVariables(DSL.name(alias), this);
    }

    @Override
    public GlobalVariables as(Name alias) {
        return new GlobalVariables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GlobalVariables rename(String name) {
        return new GlobalVariables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GlobalVariables rename(Name name) {
        return new GlobalVariables(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}