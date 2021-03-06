package com.raj.social.database.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "USER_ID", unique = true, nullable = false)
    private String userId;

    @Column(name = "NAME", nullable = true, length = 32)
    private String name;

    @Column(name = "PASSWORD", nullable = false, length = 64)
    private String password;

    @Column(name = "EMAIL_ID", nullable = false, length = 128)
    private String emailId;

    @Column(name = "ACTIVE", nullable = false, length = 1)
    private Integer active;

    @Column(name = "PROVIDER", nullable = false, length = 32)
    private String provider;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
            name = "USER_ROLE",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLE_ID")
    )
    private Set<Role> roles = new HashSet<>();

    public User() {
    }

    /**
     * @param userId
     * @param name
     * @param password
     * @param emailId
     * @param active
     * @param provider
     * @param roles
     */
    public User(final String userId, final String name, final String password, final String emailId, final Integer active, final String provider, final Set<Role> roles) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.emailId = emailId;
        this.active = active;
        this.provider = provider;
        this.roles = roles;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(final String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(final Integer active) {
        this.active = active;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(final Set<Role> roles) {
        this.roles = roles;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(final String provider) {
        this.provider = provider;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(final String emailId) {
        this.emailId = emailId;
    }
}
