package com.crmcloud.dev.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
*describe:
*Table 关系型数据库表实体，用来存储系统中构建的实体表元数据
*@author 隔壁老王
*@date 2018-7-3
*/

@Document(collection = "tables")
public class Table {



    @Id
    private String id;

    /**
     * 表名
     */
    private String name;

    /**
     * 表类型，实体表，虚拟表，视图等等
     */
    private String type;

    /**
     * 基表
     */
    private String baseTable;

    /**
     * 用户在开发平台里使用的名称
     */
    private String userName;

    /**
     * 描述
     */
    private String comments;

    /**
     * 表的状态和版本
     */
    private String status;


    public Table() {}

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBaseTable() {
        return baseTable;
    }

    public void setBaseTable(String baseTable) {
        this.baseTable = baseTable;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
