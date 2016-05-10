/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaya.blog.dao.impl;

import jaya.blog.dao.GenericDAOInterface;
import jaya.blog.dao.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author zeke
 */
public class GenericDAOImpl implements GenericDAOInterface{

    @Override
    public void save(Object object) throws Exception {
        HibernateUtil.beginTransaction();
        Session session = HibernateUtil.getSession();
        try{
            session.save(object);
        }catch(Exception ex){
            throw ex;
        }  
    }

    @Override
    public void update(Object object) throws Exception {
        HibernateUtil.beginTransaction();
        Session session = HibernateUtil.getSession();
        try{
        
        }catch(Exception ex){
        
        }
    }

    @Override
    public void delete(Object object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
