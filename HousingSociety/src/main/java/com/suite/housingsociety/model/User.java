package com.suite.housingsociety.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@Getter
@Setter
@Data
public class User implements Serializable {
	
private static final long serialVersionUID = 65981149772133526L;
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "USER_ID")	
private Long id;

private String providerUserId;
	
private String email;
	
private boolean enabled;
	
private String displayName;

@Column(name = "createdDate", nullable = false, updatable = false)
@Temporal(TemporalType.TIMESTAMP)
protected Date createdDate;
	
protected Date modifiedDate;

private String password;

private String provider;

/*
 * @Column(name = "is_now_login") private boolean isNowLogin;
 * 
 * @Column(name = "wrong_login_attempt") private Integer wrongLoginAttempt;
 */
	 
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getProviderUserId() {
	return providerUserId;
}

public void setProviderUserId(String providerUserId) {
	this.providerUserId = providerUserId;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public boolean isEnabled() {
	return enabled;
}

public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}

public String getDisplayName() {
	return displayName;
}

public void setDisplayName(String displayName) {
	this.displayName = displayName;
}

public Date getCreatedDate() {
	return createdDate;
}

public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}

public Date getModifiedDate() {
	return modifiedDate;
}

public void setModifiedDate(Date modifiedDate) {
	this.modifiedDate = modifiedDate;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getProvider() {
	return provider;
}

public void setProvider(String provider) {
	this.provider = provider;
}



public Set<Role> getRoles() {
	return roles;
}

public void setRoles(Set<Role> roles) {
	this.roles = roles;
}


    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = { @JoinColumn(name = "ROLE_ID") })
    private Set<Role> roles;

}
