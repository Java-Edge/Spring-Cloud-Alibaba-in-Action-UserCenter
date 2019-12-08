package com.javaedge.usercenter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LombokTest {
//    public static final Logger LOGGER = LoggerFactory.getLogger(LombokTest.class);
    public static void main(String[] args) {
        UserRegisterDTO userRegisterDTO = new UserRegisterDTO();
        userRegisterDTO.setAgreement(true);
        userRegisterDTO.setEmail("xx");
        // ...
        // 建造者模式
        UserRegisterDTO build = UserRegisterDTO.builder()
            .email("xx")
            .password("x")
            .confirmPassword("x")
            .agreement(true)
            .build();

        log.info("构造出来的UserRegisterDTO = {}", build);
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Builder
class UserRegisterDTO {
    private String email;
    private String password;
    private String confirmPassword;
    private String mobile;
    private boolean agreement;
}