package com.cubetiqs.lang;

import java.lang.annotation.*;


/**
 * @author sombochea
 * @since 1.0
 */
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NonNull {
}
