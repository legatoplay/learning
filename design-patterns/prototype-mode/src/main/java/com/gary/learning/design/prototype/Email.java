package com.gary.learning.design.prototype;

import java.io.Serializable;

/**
 * Created by Gary on 2018-11-29.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public class Email implements Cloneable, Serializable {

    private static final long serialVersionUID = 302784172657431720L;
    /**
     * 收件人
     */
    private String receiver;
    /**
     * 主题
     */
    private String title;
    /**
     * 内容
     */
    private String contxt;

    public Email() {
    }

    public Email(String title, String contxt) {
        this.title = title;
        this.contxt = contxt;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContxt() {
        return contxt;
    }

    public void setContxt(String contxt) {
        this.contxt = contxt;
    }

    @Override
    public String toString() {
        return "Email{" +
                "receiver='" + receiver + '\'' +
                ", title='" + title + '\'' +
                ", contxt='" + contxt + '\'' +
                '}';
    }

    @Override
    public Email clone() throws CloneNotSupportedException {
        return (Email) super.clone();
    }
}
