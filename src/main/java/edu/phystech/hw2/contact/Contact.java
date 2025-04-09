package edu.phystech.hw2.contact;


record Contact(String username, String email) {
    public static final String UNKNOWN_EMAIL = "unknown";

    Contact {
        // здесь должна быть валидация
    }

    Contact(String username) {
        this(username, UNKNOWN_EMAIL);
    }


    public int compareTo(Contact o) {
        return this.username.length() < o.username.length() ? 1 : 0;
    }
}