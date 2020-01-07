package com.lbt.mail.service;

/**
 * @author lbt create on 2020/1/7
 */
public interface EmailService {

    /**
     * 发送简单文本内容
     * @param to 发件人
     * @param subject 主题
     * @param text 内容
     */
    void sendSimpleMessage(String to,
                           String subject,
                           String text);
}
