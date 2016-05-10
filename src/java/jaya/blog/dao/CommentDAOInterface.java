/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaya.blog.dao;

import java.util.List;
import jaya.blog.model.Comment;
import jaya.blog.model.Post;

/**
 *
 * @author zeke
 */
public interface CommentDAOInterface extends GenericDAOInterface{
    public Comment getComment(long id) throws Exception;
    public List<Comment> getComments() throws Exception;
    public List<Comment> gegtComments(Post post) throws Exception;
}
