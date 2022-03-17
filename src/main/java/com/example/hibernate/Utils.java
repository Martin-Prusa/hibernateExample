package com.example.hibernate;

import javax.validation.ConstraintViolation;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Utils {

    public static <T> Map<String, String> getErrorMap(Set<ConstraintViolation<T>> violations) {
        HashMap<String, String> map = new HashMap<>();
        violations.forEach(i -> map.put(i.getPropertyPath().toString(), i.getMessage()));
        return map;
    }
}
