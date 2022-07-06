package bean;

import utils.Message;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean(name = "LoginBean")
@RequestScoped
public class LoginBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String loginName;
    private String loginPwd;

    public String login() {
        if (loginName.equals("sa")) {
            if (loginPwd.equals("123")) {
                Message.showInfo("Đăng nhập thành công");
                return "index.xhtml";
            }
            else {
                Message.showError("Mật khẩu không đúng");
            }
        }
        else {
            Message.showError("Không tìm thấy tên đăng nhập");
        }
        return "";
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }
}
