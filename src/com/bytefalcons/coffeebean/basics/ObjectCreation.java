package com.bytefalcons.coffeebean.basics;

import java.lang.reflect.InvocationTargetException;

public class ObjectCreation {
    public static void main(String[] args) {
        try {
            Object clazz = Class.forName(args[0]).getDeclaredConstructor().newInstance();
            System.out.println("Class Name : " + clazz.getClass().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

