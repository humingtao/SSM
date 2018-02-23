package org.malajava.vo;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class LoginVO {
    @NotEmpty(message = "用户名不能为空")
    @Length(min = 11, max = 11, message = "用户名长度不合适")
    private String username;
    @NotEmpty(message = "密码不能为空")
    private String password;
    @NotEmpty(message = "验证码不能为空")
    private String vlCodeInp;

    public String getVlCodeInp() {
        return vlCodeInp;
    }

    public void setVlCodeInp(String vlCodeInp) {
        this.vlCodeInp = vlCodeInp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
