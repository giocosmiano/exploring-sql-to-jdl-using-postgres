package org.blackdread.sqltojava.repository;

import org.blackdread.sqltojava.jooq.generated.InformationSchema;
import org.blackdread.sqltojava.pojo.ColumnInformation;
import org.blackdread.sqltojava.pojo.TableInformation;
import org.blackdread.sqltojava.pojo.TableRelationInformation;
import org.jooq.DSLContext;
import org.jooq.Record4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.blackdread.sqltojava.jooq.generated.tables.KeyColumnUsage.KEY_COLUMN_USAGE;

/**
 * <p>Created on 2018/2/8.</p>
 *
 * @author Yoann CAPLAIN
 */
@Repository
public class InformationSchemaRepository {

    private static final Logger log = LoggerFactory.getLogger(InformationSchemaRepository.class);

    private final DSLContext create;

    @Autowired
    public InformationSchemaRepository(final DSLContext create) {
        this.create = create;
    }

    /**
     * <p>
     * @see <a href="https://www.postgresql.org/docs/current/information-schema.html">PostgreSQL Information Schema</a>
     * @see <a href="https://www.postgresql.org/docs/current/infoschema-tables.html">PostgreSQL Information Schema Tables</a>
     * @see <a href="https://www.postgresql.org/docs/current/infoschema-columns.html">PostgreSQL Information Schema Columns</a>
     * @see <a href="https://stackoverflow.com/questions/5347050/postgresql-sql-script-to-get-a-list-of-all-tables-that-have-a-particular-column">PostgreSQL SQL script to get a list of all tables that have a particular column as foreign key</a>
     * </p>
     * @param dbName
     * @return
     */
    public List<TableRelationInformation> getAllTableRelationInformation(final String dbName) {
        return create.resultQuery(
            String.format(
                "SELECT r.table_name, r.column_name, u.table_name, u.column_name \n" +
                    "FROM information_schema.constraint_column_usage u \n" +
                    "INNER JOIN information_schema.referential_constraints fk \n" +
                    "           ON u.constraint_catalog = fk.unique_constraint_catalog \n" +
                    "               AND u.constraint_schema = fk.unique_constraint_schema \n" +
                    "               AND u.constraint_name = fk.unique_constraint_name \n" +
                    "INNER JOIN information_schema.key_column_usage r \n" +
                    "           ON r.constraint_catalog = fk.constraint_catalog \n" +
                    "               AND r.constraint_schema = fk.constraint_schema \n" +
                    "               AND r.constraint_name = fk.constraint_name \n" +
                    " where lower(u.table_catalog) = lower('%s') \n " +
                    "   and lower(r.table_catalog) = lower('%s')  \n" +
                    "   and lower(u.table_schema) = 'public' \n" +
                    "   and lower(r.table_schema) = 'public' \n" +
                    " order by r.table_name, r.column_name \n"
                , dbName, dbName))
            .fetch()
            .map(r -> new TableRelationInformation(
                    (String) r.getValue(0),
                    (String) r.getValue(1),
                    (String) r.getValue(2),
                    (String) r.getValue(3))
            );
        /*
        SELECT CONCAT(table_name) AS table_name, CONCAT(column_name) AS column_name, CONCAT(referenced_table_name)
        AS referenced_table_name, CONCAT(referenced_column_name) AS referenced_column_name
        FROM INFORMATION_SCHEMA.key_column_usage WHERE referenced_table_schema = '" . DB_NAME . "'
        AND referenced_table_name IS NOT NULL ORDER BY table_name, column_name
        */
/* MySQL
        return create.select(
                KEY_COLUMN_USAGE.TABLE_NAME,
                KEY_COLUMN_USAGE.COLUMN_NAME,
                KEY_COLUMN_USAGE.REFERENCED_TABLE_NAME,
                KEY_COLUMN_USAGE.REFERENCED_COLUMN_NAME)
            .from(InformationSchema.INFORMATION_SCHEMA.KEY_COLUMN_USAGE)
            .where(KEY_COLUMN_USAGE.REFERENCED_TABLE_SCHEMA.eq(dbName)
                .and(KEY_COLUMN_USAGE.REFERENCED_TABLE_NAME.isNotNull()))
            .orderBy(KEY_COLUMN_USAGE.TABLE_NAME, KEY_COLUMN_USAGE.COLUMN_NAME)
            .fetch()
            .map(this::map);
*/
    }

    /**
     * <p>
     * @see <a href="https://www.postgresql.org/docs/current/information-schema.html">PostgreSQL Information Schema</a>
     * @see <a href="https://www.postgresql.org/docs/current/infoschema-tables.html">PostgreSQL Information Schema Tables</a>
     * @see <a href="https://www.postgresql.org/docs/current/infoschema-columns.html">PostgreSQL Information Schema Columns</a>
     * </p>
     * @param dbName
     * @param tableName
     * @return
     */
    public List<ColumnInformation> getFullColumnInformationOfTable(final String dbName, final String tableName) {
        return create.resultQuery(
                String.format(
                    "select * FROM information_schema.columns \n" +
                        " where lower(table_catalog) = lower('%s') \n" +
                        " and lower(table_schema) = 'public' \n" +
                        " and lower(table_name) = lower('%s') \n"
                    , dbName, tableName)
            )
            .fetch()
            .map(r -> new ColumnInformation(
                (String) r.getValue(3), // columnName
                (String) r.getValue(7), // dataType
                (String) r.getValue(21), // collationName
                (String) r.getValue(6), // nullable
                (String) r.getValue(34), // key or isIdentity
                (String) r.getValue(5), // default
                (String) r.getValue(35), // identityGeneration
                "") // (String) r.get("Comment"));
            );
/* MySQL
        return create.resultQuery("SHOW FULL COLUMNS FROM " + dbName + "." + tableName)
//            .bind(1, tableName)
            .fetch()
            .map(r -> new ColumnInformation(
                (String) r.get("Field"),
                (String) r.get("Type"),
                (String) r.get("Collation"),
                (String) r.get("Null"),
                (String) r.get("Key"),
                (String) r.get("Default"),
                (String) r.get("Extra"),
                (String) r.get("Comment")));
*/
    }

    /**
     * <p>
     * @see <a href="https://www.postgresql.org/docs/current/information-schema.html">PostgreSQL Information Schema</a>
     * @see <a href="https://www.postgresql.org/docs/current/infoschema-tables.html">PostgreSQL Information Schema Tables</a>
     * @see <a href="https://www.postgresql.org/docs/current/infoschema-columns.html">PostgreSQL Information Schema Columns</a>
     * </p>
     * @param dbName
     * @return
     */
    public List<TableInformation> getAllTableInformation(final String dbName) {
        return create.resultQuery(
            String.format(
                "select table_name FROM information_schema.tables \n" +
                    " where lower(table_catalog) = lower('%s') \n" +
                    " and lower(table_schema) = 'public' \n" +
                    " and lower(table_type) = 'base table' \n"
                , dbName)
            )
            .fetch()
            .map(r -> new TableInformation((String) r.getValue(0), ""));
/* MySQL
        return create.select(
            InformationSchema.INFORMATION_SCHEMA.TABLES.TABLE_NAME,
            InformationSchema.INFORMATION_SCHEMA.TABLES.TABLE_COMMENT)
            .from(InformationSchema.INFORMATION_SCHEMA.TABLES)
            .where(InformationSchema.INFORMATION_SCHEMA.TABLES.TABLE_SCHEMA.eq(dbName))
            .fetch()
            .map(r -> new TableInformation(r.value1(), r.value2()));
*/
    }

    /**
     * <p>
     * @see <a href="https://www.postgresql.org/docs/current/information-schema.html">PostgreSQL Information Schema</a>
     * @see <a href="https://www.postgresql.org/docs/current/infoschema-tables.html">PostgreSQL Information Schema Tables</a>
     * @see <a href="https://www.postgresql.org/docs/current/infoschema-columns.html">PostgreSQL Information Schema Columns</a>
     * </p>
     * @param dbName
     * @return
     */
    @SuppressWarnings("unchecked")
    public List<String> getAllTableName(final String dbName) {
        return (List<String>)create.resultQuery(
            String.format(
                "select table_name FROM information_schema.tables \n" +
                    "where lower(table_catalog) = lower('%s') \n" +
                    " and lower(table_schema) = 'public' \n" +
                    " and lower(table_type) = 'base table' \n"
                , dbName)
            )
            .fetch()
            .getValues(0);
/* MySQL
        return create.select(
                InformationSchema.INFORMATION_SCHEMA.TABLES.TABLE_NAME)
            .from(InformationSchema.INFORMATION_SCHEMA.TABLES)
            .where(InformationSchema.INFORMATION_SCHEMA.TABLES.TABLE_SCHEMA.eq(dbName))
            .fetch()
            .getValues(InformationSchema.INFORMATION_SCHEMA.TABLES.TABLE_NAME);
*/
    }

    private TableRelationInformation map(final Record4<String, String, String, String> r) {
        return new TableRelationInformation(r.value1(), r.value2(), r.value3(), r.value4());
    }
}
