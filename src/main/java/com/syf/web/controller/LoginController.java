package com.syf.web.controller;


import com.syf.web.model.User;
import com.syf.web.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserService userService ;

    /**
     * 根据用户名获取用户对象
     * @param id
     * @return
     */

    @ApiOperation(value="获取用户列表", notes="")
    @GetMapping("/getUserInfo/{id}")
    public User getUserInfo(@PathVariable long id){
        User userInfo = userService.getUserInfo(id);
        return userInfo ;
    }
}
