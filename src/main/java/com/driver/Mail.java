package com.driver;

import java.util.Date;

public class Mail {

    private Date date;
    private String mailId;
    private String message;

    public Mail(){}
    public Mail(Date date, String mailId, String message) {
        this.date = date;
        this.mailId = mailId;
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public String getMailId() {
        return mailId;
    }

    public String getMessage() {
        return message;
    }
}
