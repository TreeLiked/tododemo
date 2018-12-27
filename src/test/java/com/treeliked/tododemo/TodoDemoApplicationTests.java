package com.treeliked.tododemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Duration;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoDemoApplicationTests {


//    @Autowired
//    private MailService mailService;

    @Autowired
    private StringRedisTemplate template;
    @Test
    public void contextLoads() {
    }


    @Test
    public void test0() throws Exception {
//        String hello = DigestUtils.md2Hex("1234");
//        System.out.println(hello);
//
//
//        UUID uuid = UUID.randomUUID();
//        System.out.println(uuid.toString());
//        System.out.println(uuid.toString());
//        mailService.sendRegActiveMail("1281448518@qq.com", "小码","ANSDKSNDS");
        String key = "1172714116@qq.com";
        template.opsForValue().set(key, "123", Duration.ofMillis(10000));
        System.out.println(template.opsForValue().get(key));

        Thread.sleep(11000);
        System.out.println(template.opsForValue().get(key));

        template.opsForValue().set(key, "345");
        System.out.println(template.opsForValue().get(key));

    }

    @Test
    public void test1() {
//        String hello = DigestUtils.md2Hex("1234");
//        System.out.println(hello);
//
//
//        UUID uuid = UUID.randomUUID();
//        System.out.println(uuid.toString());
//        System.out.println(uuid.toString());
//        URL resource = this.getClass().getClassLoader().getResource("img/active_img.jpg");
//        System.out.println(resource.getPath());
//        ClassPathResource resource = new ClassPathResource("img/active_img.jpg");
//        System.out.println(resource.get);

    }
}

