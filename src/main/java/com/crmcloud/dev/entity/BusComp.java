package com.crmcloud.dev.entity;

import org.springframework.data.annotation.Id;

public class BusComp {


    @Id
    private String id;
    private String name;
    private String clazz;
    private String searchSpec;
    private String sortSpec;
    private String tableId;

    public BusComp() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getSearchSpec() {
        return searchSpec;
    }

    public void setSearchSpec(String searchSpec) {
        this.searchSpec = searchSpec;
    }

    public String getSortSpec() {
        return sortSpec;
    }

    public void setSortSpec(String sortSpec) {
        this.sortSpec = sortSpec;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }
}
