/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaya.blog.dao;

import java.util.List;
import jaya.blog.model.Post;

/**
 *
 * @author zeke
 */
public interface PostDAOInterface extends GenericDAOInterface{
  public Post getPost(long id) throws Exception;
  public List<Post> getPosts() throws Exception;
}
