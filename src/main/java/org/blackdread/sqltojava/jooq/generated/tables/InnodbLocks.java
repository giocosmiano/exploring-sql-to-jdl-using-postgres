/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.generated.tables;


import org.blackdread.sqltojava.jooq.generated.InformationSchema;
import org.blackdread.sqltojava.jooq.generated.tables.records.InnodbLocksRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class InnodbLocks extends TableImpl<InnodbLocksRecord> {

    /**
     * The reference instance of <code>information_schema.INNODB_LOCKS</code>
     */
    public static final InnodbLocks INNODB_LOCKS = new InnodbLocks();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>information_schema.INNODB_LOCKS.lock_id</code>.
     */
    public final TableField<InnodbLocksRecord, String> LOCK_ID = createField(DSL.name("lock_id"), SQLDataType.VARCHAR(81).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.INNODB_LOCKS.lock_trx_id</code>.
     */
    public final TableField<InnodbLocksRecord, String> LOCK_TRX_ID = createField(DSL.name("lock_trx_id"), SQLDataType.VARCHAR(18).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.INNODB_LOCKS.lock_mode</code>.
     */
    public final TableField<InnodbLocksRecord, String> LOCK_MODE = createField(DSL.name("lock_mode"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.INNODB_LOCKS.lock_type</code>.
     */
    public final TableField<InnodbLocksRecord, String> LOCK_TYPE = createField(DSL.name("lock_type"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.INNODB_LOCKS.lock_table</code>.
     */
    public final TableField<InnodbLocksRecord, String> LOCK_TABLE = createField(DSL.name("lock_table"), SQLDataType.VARCHAR(1024).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.INNODB_LOCKS.lock_index</code>.
     */
    public final TableField<InnodbLocksRecord, String> LOCK_INDEX = createField(DSL.name("lock_index"), SQLDataType.VARCHAR(1024), this, "");
    /**
     * The column <code>information_schema.INNODB_LOCKS.lock_space</code>.
     */
    public final TableField<InnodbLocksRecord, ULong> LOCK_SPACE = createField(DSL.name("lock_space"), SQLDataType.BIGINTUNSIGNED, this, "");
    /**
     * The column <code>information_schema.INNODB_LOCKS.lock_page</code>.
     */
    public final TableField<InnodbLocksRecord, ULong> LOCK_PAGE = createField(DSL.name("lock_page"), SQLDataType.BIGINTUNSIGNED, this, "");
    /**
     * The column <code>information_schema.INNODB_LOCKS.lock_rec</code>.
     */
    public final TableField<InnodbLocksRecord, ULong> LOCK_REC = createField(DSL.name("lock_rec"), SQLDataType.BIGINTUNSIGNED, this, "");
    /**
     * The column <code>information_schema.INNODB_LOCKS.lock_data</code>.
     */
    public final TableField<InnodbLocksRecord, String> LOCK_DATA = createField(DSL.name("lock_data"), SQLDataType.VARCHAR(8192), this, "");

    private InnodbLocks(Name alias, Table<InnodbLocksRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbLocks(Name alias, Table<InnodbLocksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_LOCKS</code> table reference
     */
    public InnodbLocks(String alias) {
        this(DSL.name(alias), INNODB_LOCKS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_LOCKS</code> table reference
     */
    public InnodbLocks(Name alias) {
        this(alias, INNODB_LOCKS);
    }

    /**
     * Create a <code>information_schema.INNODB_LOCKS</code> table reference
     */
    public InnodbLocks() {
        this(DSL.name("INNODB_LOCKS"), null);
    }

    public <O extends Record> InnodbLocks(Table<O> child, ForeignKey<O, InnodbLocksRecord> key) {
        super(child, key, INNODB_LOCKS);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbLocksRecord> getRecordType() {
        return InnodbLocksRecord.class;
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbLocks as(String alias) {
        return new InnodbLocks(DSL.name(alias), this);
    }

    @Override
    public InnodbLocks as(Name alias) {
        return new InnodbLocks(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbLocks rename(String name) {
        return new InnodbLocks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbLocks rename(Name name) {
        return new InnodbLocks(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, String, String, String, String, ULong, ULong, ULong, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
