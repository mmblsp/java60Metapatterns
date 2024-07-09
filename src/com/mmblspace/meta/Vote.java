package com.mmblspace.meta;

public class Vote {
    private boolean value;
    private boolean present;
    private String fio;

    public Vote(boolean value, boolean present, String fio) {
        this.value = value;
        this.present = present;
        this.fio = fio;
    }
    public boolean isValue() {
        return value;
    }

    public boolean isPresent(){
        return present;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public String getFio() {
        return fio;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    @Override
    public String toString() {
        return "Vote {" +
                "\n\tvalue=" + value +
                ",\n\tpresent=" + present +
                ",\n\tfio=" + fio + "\n}";
    }
}
