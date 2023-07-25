//package org.launchcode.techjobs.oo;
//
////import static sun.security.pkcs11.wrapper.Functions.getId;
//
//import java.util.Objects;
//
//public abstract class JobField {
//
//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public JobField(String value) {
//        this();
//        this.value = value;
//    }
//    public JobField() {
//        id = nextId;
//        nextId++;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public static int getNextId() {
//        return nextId;
//    }
//
//    public static void setNextId(int nextId) {
//        JobField.nextId = nextId;
//    }
//
//
//    // Custom toString, equals, and hashCode methods:
//
//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof JobField)) return false;
//        JobField that = (JobField) o;
//        return id == that.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//}
//
package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField(String value) {
        this();
        this.value = value;
    }

    public JobField() {
        id = nextId;
        nextId++;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField that = (JobField) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
