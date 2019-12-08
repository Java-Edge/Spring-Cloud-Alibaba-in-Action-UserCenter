package com.javaedge.usercenter;

import com.javaedge.usercenter.dao.user.UserMapper;
import com.javaedge.usercenter.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author JavaEdge
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestController {

    @Resource
    private final UserMapper userMapper;

    @GetMapping("/test")
    public User testInsert() {
        User user = new User();
        user.setAvatarUrl("xxx");
        user.setBonus(100);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        this.userMapper.insertSelective(user);

        return user;
    }

    // q?id=1&wxId=aaa&...
    @GetMapping("/q")
    public User query(User user) {
        return user;
    }
}
