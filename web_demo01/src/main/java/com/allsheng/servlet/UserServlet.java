package com.allsheng.servlet;

import javax.servlet.Servlet;

/**
 * @author chenht
 * @date 2022/7/7
 */
public class UserServlet implements Servlet {
    @Override
    public void service () {
        System.out.println("UserServlet running...");
    }
}
