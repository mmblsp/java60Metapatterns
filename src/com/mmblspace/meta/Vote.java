package com.mmblspace.meta;

public class Vote {
    private final boolean value;
    private final boolean present;
    private final String fio;

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

    @Override
    public String toString() {
        return "Vote {" +
                "\n\tvalue=" + value +
                ",\n\tpresent=" + present +
                ",\n\tfio=" + fio + "\n}";
    }
}
