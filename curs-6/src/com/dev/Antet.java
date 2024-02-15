package com.dev;

import java.lang.annotation.Documented;

@SuppressWarnings("all")
@Documented
public @interface Antet {
    String autor();
    String data();
    String ultimaModificare() default "o valoare";
    String[] review();

}
