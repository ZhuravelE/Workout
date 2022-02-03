package com.zhuravel.annotations;

@BaseAction(level = 2, sqlRequest = "SELECT name, phone FROM phonebook")
public class Base {

    public static void main(String[] args) {
        Class<Base> baseClass = Base.class;
        BaseAction action = baseClass.getAnnotation(BaseAction.class);
        System.out.println(action.level()); //Возможно благодаря @Retention(RetentionPolicy.RUNTIME) аннотации BaseAction
        System.out.println(action.sqlRequest());
    }
}
