package org.zerock.club.security;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class PasswordTests {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void testEncode() {

        String password = "1111";

        String encodedPW = passwordEncoder.encode(password);

        System.out.println("encodedPW: " + encodedPW);

        boolean isMatch = passwordEncoder.matches(password, encodedPW);

        System.out.println("Password Correct?? " + isMatch);

    }

}
