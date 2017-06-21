package com.example.demo.repository.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.DomaConfig;
import com.example.demo.repository.entity.User;

/**
 */
@ConfigAutowireable
@Dao(config = DomaConfig.class)
public interface UserDao {

    /**
     * @param id
     * @return the User entity
     */
    @Select
    User selectById(Long id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(User entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(User entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(User entity);
}