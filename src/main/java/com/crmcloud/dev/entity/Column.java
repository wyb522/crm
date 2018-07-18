package com.crmcloud.dev.entity;

import org.springframework.data.annotation.Id;

public class Column {

    @Id
    private String id;
    private String parentTableName;
    private String name;
    private String defaultValue;
    private String physicalType;
    private String precision;
    private String scale;
    private String primaryKey;
    private String foreignKeyTable;
    private String nullable;
    private String userKeySequence;

    public Column(){

    }

    public Column(String id, String parentTableName, String name, String defaultValue, String physicalType, String precision, String scale, String primaryKey, String foreignKeyTable, String nullable, String userKeySequence) {
        this.id = id;
        this.parentTableName = parentTableName;
        this.name = name;
        this.defaultValue = defaultValue;
        this.physicalType = physicalType;
        this.precision = precision;
        this.scale = scale;
        this.primaryKey = primaryKey;
        this.foreignKeyTable = foreignKeyTable;
        this.nullable = nullable;
        this.userKeySequence = userKeySequence;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentTableName() {
        return parentTableName;
    }

    public void setParentTableName(String parentTableName) {
        this.parentTableName = parentTableName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getPhysicalType() {
        return physicalType;
    }

    public void setPhysicalType(String physicalType) {
        this.physicalType = physicalType;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getForeignKeyTable() {
        return foreignKeyTable;
    }

    public void setForeignKeyTable(String foreignKeyTable) {
        this.foreignKeyTable = foreignKeyTable;
    }

    public String getNullable() {
        return nullable;
    }

    public void setNullable(String nullable) {
        this.nullable = nullable;
    }

    public String getUserKeySequence() {
        return userKeySequence;
    }

    public void setUserKeySequence(String userKeySequence) {
        this.userKeySequence = userKeySequence;
    }
}
