/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaya.blog.dao;

import java.util.List;
import jaya.blog.model.Author;

/**
 *
 * @author zeke
 */
public interface AuthorDAOInterface extends GenericDAOInterface{
    public Author getAuthor(long id) throws Exception;
    public Author getAuthor(String userName) throws Exception;
    public List<Author> getAuthors() throws Exception;
    
}
