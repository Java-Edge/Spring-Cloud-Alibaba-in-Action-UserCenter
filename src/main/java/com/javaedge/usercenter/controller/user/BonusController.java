package com.javaedge.usercenter.controller.user;

import com.javaedge.usercenter.domain.dto.messaging.UserAddBonusMsgDTO;
import com.javaedge.usercenter.domain.dto.user.UserAddBonseDTO;
import com.javaedge.usercenter.domain.entity.user.User;
import com.javaedge.usercenter.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JavaEdge
 */
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BonusController {
    private final UserService userService;

    @PutMapping("/add-bonus")
    public User addBonus(@RequestBody UserAddBonseDTO userAddBonseDTO) {
        Integer userId = userAddBonseDTO.getUserId();
        userService.addBonus(
            UserAddBonusMsgDTO.builder()
                .userId(userId)
                .bonus(userAddBonseDTO.getBonus())
                .description("兑换分享...")
                .event("BUY")
                .build()
        );
        return this.userService.findById(userId);
    }
}
