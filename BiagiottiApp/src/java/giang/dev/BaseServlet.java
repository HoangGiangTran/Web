/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giang.dev;

import giang.dev.data.dao.Database;
import giang.dev.data.dao.DatabaseDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;

/**
 *
 * @author Admin
 */
public class BaseServlet extends HttpServlet{

    @Override
    public void init() throws ServletException {
        DatabaseDao.init(new Database());
    }
    
}
