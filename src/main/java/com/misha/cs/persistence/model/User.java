package com.misha.cs.persistence.model;

import com.misha.cs.web.dto.UserDto;

import javax.persistence.*;

@Entity(name = "CLIENT")
public class User {

    protected User() {
    }

    public User(UserDto dto) {
        this.name = dto.getName();
        this.password = dto.getPassword();
        this.locked = dto.getLocked();
        this.role = dto.getRole();
    }

    public User(String name, String password, Boolean locked, String roles) {
        this.name = name;
        this.password = password;
        this.locked = locked;
        this.role = roles;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "CLIENT_ID")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "LOCKED", nullable = false)
    private Boolean locked;

    @Column(name = "ROLES", nullable = false)
    private String role;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", locked=" + locked +
                ", roles=" + role +
                '}';
    }
}

