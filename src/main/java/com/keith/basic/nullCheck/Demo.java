package com.keith.basic.nullCheck;

import com.keith.basic.nullCheck.dto.User;
import com.keith.basic.nullCheck.enums.Status;

import java.util.Optional;

public class Demo {

    public static void main(String[] args) {
        // 避免if/else 冗杂写法
        int statusCode = Status.valueOf(getParam()).statusCode;

        // 空指针判断
        User user = null;
//        User user = new User();
//        user.setName("sk-keith");
//        if (null == user) {
//            System.out.println("null object");  //传统写法
//        } else {
//            System.out.println("not null object");
//        }

        Optional.ofNullable(user).map(User::getName).orElse("null");
        /**
         * 如果不为空则则只执行前半部分，为空则执行orElse
         * map() 中的返回值，orElse中的值
         * 而且这两个参数的类型是一致的
         */
        Optional.ofNullable(user).map(Demo::printUserName).orElse("null object");

        /**
         * 只会打印一种情况
         */
        Optional.ofNullable(user).map(Demo::printUserName).orElseGet(Demo::printNullUserName);

        /**
         * 会直接报空指针异常
         */
//        Optional.of(user).map(User::getName).ifPresent(System.out::print);
    }

    private static String printNullUserName() {
        System.out.println("null object");
        return "null object";
    }

    public static String printUserName(User user) {
        System.out.println(user.getName());
        return user.getName();
    }

    public static String getParam() {
        return "NEW";
    }
}
