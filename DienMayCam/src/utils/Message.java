package utils;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "Massage")
@RequestScoped
public class Message {

    public static void addMessage(FacesMessage.Severity severity, String summary, String detail) {
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(severity, summary, detail));
    }

    public static void showInfo(String message) {
        addMessage(FacesMessage.SEVERITY_INFO, "Thông báo", message);
    }

    public static void showWarn(String message) {
        addMessage(FacesMessage.SEVERITY_WARN, "Cảnh báo", message);
    }

    public static void showError(String message) {
        addMessage(FacesMessage.SEVERITY_ERROR, "Lỗi", message);
    }

    public static void showSticky() {
        FacesContext.getCurrentInstance().addMessage("sticky-key", new FacesMessage(FacesMessage.SEVERITY_INFO, "Sticky Message", "Message Content"));
    }

    public static void showMultiple() {
        addMessage(FacesMessage.SEVERITY_INFO, "Message 1", "Message Content");
        addMessage(FacesMessage.SEVERITY_WARN, "Message 2", "Message Content");
        addMessage(FacesMessage.SEVERITY_ERROR, "Message 3", "Message Content");
    }
}