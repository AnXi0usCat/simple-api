package com.misha.cs.web.dto;

import com.misha.cs.persistence.model.User;
import org.apache.commons.lang3.builder.ToStringBuilder;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class UserDto implements Serializable {

    public UserDto() {
        super();
    }

    public UserDto(final User user){
        this.id = user.getId();
        this.name = user.getName();
        this.locked = user.getLocked();
        this.password = user.getPassword();
        this.role = user.getRole();
    }

    private Long id;

    @NotNull
    @Size(min = 1, max = 30)
    private String name;

    @NotNull
    @Size(min = 5, max = 60)
    private String password;

    @NotNull
    private Boolean locked;

    @NotNull
    private String role;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getLocked() {
        return locked;
    }

    public String getRole() {
        return role;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final UserDto other = (UserDto) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).toString();
    }
}
