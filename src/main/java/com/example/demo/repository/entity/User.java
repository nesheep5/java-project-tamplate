package com.example.demo.repository.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 
 */
@Entity(listener = UserListener.class)
@Table(name = "USER")
public class User {

    /**  */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Long id;

    /**  */
    @Column(name = "USER_ID")
    String userId;

    /**  */
    @Column(name = "PASSWORD")
    String password;

    /**  */
    @Column(name = "NAME")
    String name;

    /** 
     * Returns the id.
     * 
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /** 
     * Sets the id.
     * 
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** 
     * Returns the userId.
     * 
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /** 
     * Sets the userId.
     * 
     * @param userId the userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** 
     * Returns the password.
     * 
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /** 
     * Sets the password.
     * 
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /** 
     * Returns the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /** 
     * Sets the name.
     * 
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }
}