package eu.mrocznybanan.entity;

import java.util.Date;

public class User implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 2738418483980984204L;

    public static final String WITH_EMAILS_LIKE = "user.withEmailsLike";

    private Long id;

    private String status;

    private String firstName;

    private String lastName;

    private String email;

    private String login;

    private String password;

    private Date created;

    private boolean active;

    public User() {

    }
    
    public User(Long id) {
        this.id = id;
    }

    public User(String firstName, String lastName, String email, String login, String password) {
        super();
        this.status = "A";
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.login = login;
        this.password = password;
        this.created = new Date();
        this.active = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
