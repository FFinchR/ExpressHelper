package Privilege.model.po;

import java.time.LocalDateTime;

public class AdminPo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.real_name
     *
     * @mbg.generated
     */
    private String realName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.gender
     *
     * @mbg.generated
     */
    private Byte gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.role
     *
     * @mbg.generated
     */
    private Byte role;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.email_verify
     *
     * @mbg.generated
     */
    private Byte emailVerify;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.mobile_verify
     *
     * @mbg.generated
     */
    private Byte mobileVerify;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.signature
     *
     * @mbg.generated
     */
    private String signature;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.gmt_create
     *
     * @mbg.generated
     */
    private LocalDateTime gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.gmt_modified
     *
     * @mbg.generated
     */
    private LocalDateTime gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.id
     *
     * @return the value of admin.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.id
     *
     * @param id the value for admin.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.user_name
     *
     * @return the value of admin.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.user_name
     *
     * @param userName the value for admin.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.password
     *
     * @return the value of admin.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.password
     *
     * @param password the value for admin.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.real_name
     *
     * @return the value of admin.real_name
     *
     * @mbg.generated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.real_name
     *
     * @param realName the value for admin.real_name
     *
     * @mbg.generated
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.gender
     *
     * @return the value of admin.gender
     *
     * @mbg.generated
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.gender
     *
     * @param gender the value for admin.gender
     *
     * @mbg.generated
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.role
     *
     * @return the value of admin.role
     *
     * @mbg.generated
     */
    public Byte getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.role
     *
     * @param role the value for admin.role
     *
     * @mbg.generated
     */
    public void setRole(Byte role) {
        this.role = role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.email
     *
     * @return the value of admin.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.email
     *
     * @param email the value for admin.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.email_verify
     *
     * @return the value of admin.email_verify
     *
     * @mbg.generated
     */
    public Byte getEmailVerify() {
        return emailVerify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.email_verify
     *
     * @param emailVerify the value for admin.email_verify
     *
     * @mbg.generated
     */
    public void setEmailVerify(Byte emailVerify) {
        this.emailVerify = emailVerify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.mobile
     *
     * @return the value of admin.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.mobile
     *
     * @param mobile the value for admin.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.mobile_verify
     *
     * @return the value of admin.mobile_verify
     *
     * @mbg.generated
     */
    public Byte getMobileVerify() {
        return mobileVerify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.mobile_verify
     *
     * @param mobileVerify the value for admin.mobile_verify
     *
     * @mbg.generated
     */
    public void setMobileVerify(Byte mobileVerify) {
        this.mobileVerify = mobileVerify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.signature
     *
     * @return the value of admin.signature
     *
     * @mbg.generated
     */
    public String getSignature() {
        return signature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.signature
     *
     * @param signature the value for admin.signature
     *
     * @mbg.generated
     */
    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.gmt_create
     *
     * @return the value of admin.gmt_create
     *
     * @mbg.generated
     */
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.gmt_create
     *
     * @param gmtCreate the value for admin.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.gmt_modified
     *
     * @return the value of admin.gmt_modified
     *
     * @mbg.generated
     */
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.gmt_modified
     *
     * @param gmtModified the value for admin.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
}