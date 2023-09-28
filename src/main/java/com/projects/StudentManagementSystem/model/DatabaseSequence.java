package com.projects.StudentManagementSystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "database_sequences")
public class DatabaseSequence {

    @Id
    private String id;
    private long seq;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }

    public long getSeq() {
        return seq;
    }

}
