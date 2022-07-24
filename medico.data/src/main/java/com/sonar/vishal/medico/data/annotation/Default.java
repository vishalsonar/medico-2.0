package com.sonar.vishal.medico.data.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface Default {
    String value();
    boolean isServerParameter() default false;
}
