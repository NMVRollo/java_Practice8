package com.company.command;

public class Developer {

    private final Command insert;
    private final Command update;
    private final Command delete;
    private final Command select;

    public Developer(Command insert, Command update, Command delete, Command select) {
        this.insert = insert;
        this.update = update;
        this.delete = delete;
        this.select = select;
    }

    public void deleteRecord() {
        delete.execute();
    }

    public void selectRecord() {
        select.execute();
    }

    public void insertRecord() {
        insert.execute();
    }

    public void updateRecord() {
        update.execute();
    }

}
