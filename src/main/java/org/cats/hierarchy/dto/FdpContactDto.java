package org.cats.hierarchy.dto;

public class FdpContactDto {
    private Long id;
    private String fullName;
    private String mobile;
    private String email;

    FdpContactDto(){}

    public FdpContactDto(Long id, String fullName, String mobile, String email){
        this.id = id;
        this.fullName = fullName;
        this.mobile = mobile;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}
