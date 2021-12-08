/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.generated.tables.records;


import org.blackdread.sqltojava.jooq.generated.tables.Files;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;

import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class FilesRecord extends TableRecordImpl<FilesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Create a detached FilesRecord
     */
    public FilesRecord() {
        super(Files.FILES);
    }

    /**
     * Create a detached, initialised FilesRecord
     */
    public FilesRecord(Long fileId, String fileName, String fileType, String tablespaceName, String tableCatalog, String tableSchema, String tableName, String logfileGroupName, Long logfileGroupNumber, String engine, String fulltextKeys, Long deletedRows, Long updateCount, Long freeExtents, Long totalExtents, Long extentSize, ULong initialSize, ULong maximumSize, ULong autoextendSize, LocalDateTime creationTime, LocalDateTime lastUpdateTime, LocalDateTime lastAccessTime, Long recoverTime, Long transactionCounter, ULong version, String rowFormat, ULong tableRows, ULong avgRowLength, ULong dataLength, ULong maxDataLength, ULong indexLength, ULong dataFree, LocalDateTime createTime, LocalDateTime updateTime, LocalDateTime checkTime, ULong checksum, String status, String extra) {
        super(Files.FILES);

        setFileId(fileId);
        setFileName(fileName);
        setFileType(fileType);
        setTablespaceName(tablespaceName);
        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setLogfileGroupName(logfileGroupName);
        setLogfileGroupNumber(logfileGroupNumber);
        setEngine(engine);
        setFulltextKeys(fulltextKeys);
        setDeletedRows(deletedRows);
        setUpdateCount(updateCount);
        setFreeExtents(freeExtents);
        setTotalExtents(totalExtents);
        setExtentSize(extentSize);
        setInitialSize(initialSize);
        setMaximumSize(maximumSize);
        setAutoextendSize(autoextendSize);
        setCreationTime(creationTime);
        setLastUpdateTime(lastUpdateTime);
        setLastAccessTime(lastAccessTime);
        setRecoverTime(recoverTime);
        setTransactionCounter(transactionCounter);
        setVersion(version);
        setRowFormat(rowFormat);
        setTableRows(tableRows);
        setAvgRowLength(avgRowLength);
        setDataLength(dataLength);
        setMaxDataLength(maxDataLength);
        setIndexLength(indexLength);
        setDataFree(dataFree);
        setCreateTime(createTime);
        setUpdateTime(updateTime);
        setCheckTime(checkTime);
        setChecksum(checksum);
        setStatus(status);
        setExtra(extra);
    }

    /**
     * Getter for <code>information_schema.FILES.FILE_ID</code>.
     */
    public Long getFileId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>information_schema.FILES.FILE_ID</code>.
     */
    public void setFileId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.FILES.FILE_NAME</code>.
     */
    public String getFileName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.FILES.FILE_NAME</code>.
     */
    public void setFileName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.FILES.FILE_TYPE</code>.
     */
    public String getFileType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.FILES.FILE_TYPE</code>.
     */
    public void setFileType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.FILES.TABLESPACE_NAME</code>.
     */
    public String getTablespaceName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.FILES.TABLESPACE_NAME</code>.
     */
    public void setTablespaceName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.FILES.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.FILES.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.FILES.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.FILES.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.FILES.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.FILES.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.FILES.LOGFILE_GROUP_NAME</code>.
     */
    public String getLogfileGroupName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.FILES.LOGFILE_GROUP_NAME</code>.
     */
    public void setLogfileGroupName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.FILES.LOGFILE_GROUP_NUMBER</code>.
     */
    public Long getLogfileGroupNumber() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>information_schema.FILES.LOGFILE_GROUP_NUMBER</code>.
     */
    public void setLogfileGroupNumber(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.FILES.ENGINE</code>.
     */
    public String getEngine() {
        return (String) get(9);
    }

    /**
     * Setter for <code>information_schema.FILES.ENGINE</code>.
     */
    public void setEngine(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.FILES.FULLTEXT_KEYS</code>.
     */
    public String getFulltextKeys() {
        return (String) get(10);
    }

    /**
     * Setter for <code>information_schema.FILES.FULLTEXT_KEYS</code>.
     */
    public void setFulltextKeys(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.FILES.DELETED_ROWS</code>.
     */
    public Long getDeletedRows() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>information_schema.FILES.DELETED_ROWS</code>.
     */
    public void setDeletedRows(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.FILES.UPDATE_COUNT</code>.
     */
    public Long getUpdateCount() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>information_schema.FILES.UPDATE_COUNT</code>.
     */
    public void setUpdateCount(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.FILES.FREE_EXTENTS</code>.
     */
    public Long getFreeExtents() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>information_schema.FILES.FREE_EXTENTS</code>.
     */
    public void setFreeExtents(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.FILES.TOTAL_EXTENTS</code>.
     */
    public Long getTotalExtents() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>information_schema.FILES.TOTAL_EXTENTS</code>.
     */
    public void setTotalExtents(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.FILES.EXTENT_SIZE</code>.
     */
    public Long getExtentSize() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>information_schema.FILES.EXTENT_SIZE</code>.
     */
    public void setExtentSize(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.FILES.INITIAL_SIZE</code>.
     */
    public ULong getInitialSize() {
        return (ULong) get(16);
    }

    /**
     * Setter for <code>information_schema.FILES.INITIAL_SIZE</code>.
     */
    public void setInitialSize(ULong value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.FILES.MAXIMUM_SIZE</code>.
     */
    public ULong getMaximumSize() {
        return (ULong) get(17);
    }

    /**
     * Setter for <code>information_schema.FILES.MAXIMUM_SIZE</code>.
     */
    public void setMaximumSize(ULong value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.FILES.AUTOEXTEND_SIZE</code>.
     */
    public ULong getAutoextendSize() {
        return (ULong) get(18);
    }

    /**
     * Setter for <code>information_schema.FILES.AUTOEXTEND_SIZE</code>.
     */
    public void setAutoextendSize(ULong value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.FILES.CREATION_TIME</code>.
     */
    public LocalDateTime getCreationTime() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>information_schema.FILES.CREATION_TIME</code>.
     */
    public void setCreationTime(LocalDateTime value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.FILES.LAST_UPDATE_TIME</code>.
     */
    public LocalDateTime getLastUpdateTime() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>information_schema.FILES.LAST_UPDATE_TIME</code>.
     */
    public void setLastUpdateTime(LocalDateTime value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.FILES.LAST_ACCESS_TIME</code>.
     */
    public LocalDateTime getLastAccessTime() {
        return (LocalDateTime) get(21);
    }

    /**
     * Setter for <code>information_schema.FILES.LAST_ACCESS_TIME</code>.
     */
    public void setLastAccessTime(LocalDateTime value) {
        set(21, value);
    }

    /**
     * Getter for <code>information_schema.FILES.RECOVER_TIME</code>.
     */
    public Long getRecoverTime() {
        return (Long) get(22);
    }

    /**
     * Setter for <code>information_schema.FILES.RECOVER_TIME</code>.
     */
    public void setRecoverTime(Long value) {
        set(22, value);
    }

    /**
     * Getter for <code>information_schema.FILES.TRANSACTION_COUNTER</code>.
     */
    public Long getTransactionCounter() {
        return (Long) get(23);
    }

    /**
     * Setter for <code>information_schema.FILES.TRANSACTION_COUNTER</code>.
     */
    public void setTransactionCounter(Long value) {
        set(23, value);
    }

    /**
     * Getter for <code>information_schema.FILES.VERSION</code>.
     */
    public ULong getVersion() {
        return (ULong) get(24);
    }

    /**
     * Setter for <code>information_schema.FILES.VERSION</code>.
     */
    public void setVersion(ULong value) {
        set(24, value);
    }

    /**
     * Getter for <code>information_schema.FILES.ROW_FORMAT</code>.
     */
    public String getRowFormat() {
        return (String) get(25);
    }

    /**
     * Setter for <code>information_schema.FILES.ROW_FORMAT</code>.
     */
    public void setRowFormat(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>information_schema.FILES.TABLE_ROWS</code>.
     */
    public ULong getTableRows() {
        return (ULong) get(26);
    }

    /**
     * Setter for <code>information_schema.FILES.TABLE_ROWS</code>.
     */
    public void setTableRows(ULong value) {
        set(26, value);
    }

    /**
     * Getter for <code>information_schema.FILES.AVG_ROW_LENGTH</code>.
     */
    public ULong getAvgRowLength() {
        return (ULong) get(27);
    }

    /**
     * Setter for <code>information_schema.FILES.AVG_ROW_LENGTH</code>.
     */
    public void setAvgRowLength(ULong value) {
        set(27, value);
    }

    /**
     * Getter for <code>information_schema.FILES.DATA_LENGTH</code>.
     */
    public ULong getDataLength() {
        return (ULong) get(28);
    }

    /**
     * Setter for <code>information_schema.FILES.DATA_LENGTH</code>.
     */
    public void setDataLength(ULong value) {
        set(28, value);
    }

    /**
     * Getter for <code>information_schema.FILES.MAX_DATA_LENGTH</code>.
     */
    public ULong getMaxDataLength() {
        return (ULong) get(29);
    }

    /**
     * Setter for <code>information_schema.FILES.MAX_DATA_LENGTH</code>.
     */
    public void setMaxDataLength(ULong value) {
        set(29, value);
    }

    /**
     * Getter for <code>information_schema.FILES.INDEX_LENGTH</code>.
     */
    public ULong getIndexLength() {
        return (ULong) get(30);
    }

    /**
     * Setter for <code>information_schema.FILES.INDEX_LENGTH</code>.
     */
    public void setIndexLength(ULong value) {
        set(30, value);
    }

    /**
     * Getter for <code>information_schema.FILES.DATA_FREE</code>.
     */
    public ULong getDataFree() {
        return (ULong) get(31);
    }

    /**
     * Setter for <code>information_schema.FILES.DATA_FREE</code>.
     */
    public void setDataFree(ULong value) {
        set(31, value);
    }

    /**
     * Getter for <code>information_schema.FILES.CREATE_TIME</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(32);
    }

    /**
     * Setter for <code>information_schema.FILES.CREATE_TIME</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(32, value);
    }

    /**
     * Getter for <code>information_schema.FILES.UPDATE_TIME</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(33);
    }

    /**
     * Setter for <code>information_schema.FILES.UPDATE_TIME</code>.
     */
    public void setUpdateTime(LocalDateTime value) {
        set(33, value);
    }

    /**
     * Getter for <code>information_schema.FILES.CHECK_TIME</code>.
     */
    public LocalDateTime getCheckTime() {
        return (LocalDateTime) get(34);
    }

    /**
     * Setter for <code>information_schema.FILES.CHECK_TIME</code>.
     */
    public void setCheckTime(LocalDateTime value) {
        set(34, value);
    }

    /**
     * Getter for <code>information_schema.FILES.CHECKSUM</code>.
     */
    public ULong getChecksum() {
        return (ULong) get(35);
    }

    /**
     * Setter for <code>information_schema.FILES.CHECKSUM</code>.
     */
    public void setChecksum(ULong value) {
        set(35, value);
    }

    /**
     * Getter for <code>information_schema.FILES.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(36);
    }

    /**
     * Setter for <code>information_schema.FILES.STATUS</code>.
     */
    public void setStatus(String value) {
        set(36, value);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>information_schema.FILES.EXTRA</code>.
     */
    public String getExtra() {
        return (String) get(37);
    }

    /**
     * Setter for <code>information_schema.FILES.EXTRA</code>.
     */
    public void setExtra(String value) {
        set(37, value);
    }
}
