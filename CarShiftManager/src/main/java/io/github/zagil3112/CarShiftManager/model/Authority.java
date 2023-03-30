package io.github.zagil3112.CarShiftManager.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
public class Authority implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authority;

    @ManyToOne(optional = false)
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    public  Authority() { }

    public Authority(String authority) {
        this.authority = authority;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    @Override
    public String getAuthority() {
        return null;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
