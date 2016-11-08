package org.cats.hierarchy.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.cats.core.BaseModel;
import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class FDPContact extends BaseModel {
    private String fullName;
    private String mobile;

    @Email
    private String email;

    @ManyToOne
    @JsonIgnore
    private FDP fdp;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public FDP getFdp() {
        return fdp;
    }

    public void setFdp(FDP fdp) {
        this.fdp = fdp;
    }
}
