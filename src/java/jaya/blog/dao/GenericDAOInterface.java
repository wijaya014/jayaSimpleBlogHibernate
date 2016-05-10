/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaya.blog.dao;

/**
 *
 * @author zeke
 */
public interface GenericDAOInterface {
    public void save(Object object) throws Exception;
    public void update(Object object)throws Exception;
    public void delete(Object object) throws  Exception;
}
