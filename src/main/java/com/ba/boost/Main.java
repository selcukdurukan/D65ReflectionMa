package com.ba.boost;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        try {
            Class clazz = Class.forName("com.ba.boost.reflection.Example");

            for (Method m : clazz.getDeclaredMethods()) {
                System.out.println("Method ismi : " + m.getName());
                System.out.println("Method parametre sayisi: " + m.getParameterCount());
                System.out.println("Method dönüş tipi: " + m.getReturnType());
                System.out.println();
            }

            /*S
            *
            * */
            Object obj = clazz.newInstance();
            Class[] paramString = new Class[1];
            paramString[0] = String.class;
            Method m = clazz.getMethod("showString", paramString);
            Object o = m.invoke(obj, new String("google.com"));
            String output = o.toString();
            System.out.println("En son method dönüş değeri: " + output);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}