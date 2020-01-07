package com.lbt.mail;

import com.lbt.mail.config.EmailConfig;
import com.lbt.mail.service.EmailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailApplicationTests {
    @Autowired
    private EmailService emailService;
    @Autowired
    private EmailConfig emailConfig;
    @Test
    public void contextLoads() {
    }


    @Test
    public void testSimple(){
        emailService.sendSimpleMessage(emailConfig.getTo(),"篮球","你好！");
    }

}
