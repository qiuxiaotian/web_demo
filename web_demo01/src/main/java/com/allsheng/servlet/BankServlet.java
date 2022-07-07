package com.allsheng.servlet;

import javax.servlet.Servlet;

/**
 * @author chenht
 * @date 2022/7/7
 */
public class BankServlet implements Servlet {
    @Override
    public void service () {
        System.out.println("BankServlet running...");
    }
}
