package com.birdlabs.basicproject.database;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by bijoy on 1/13/16.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface DBColumn {

    public enum Type {
        INTEGER("INTEGER"),
        TEXT("TEXT"),
        REAL("REAL");

        private final String name;

        private Type(String s) {
            name = s;
        }

        public String toString() {
            return this.name;
        }
    }

    String fieldName() default "";

    Type fieldType() default Type.TEXT;

    boolean primaryKey() default false;

    boolean autoIncrement() default false;

    boolean unique() default false;
}
