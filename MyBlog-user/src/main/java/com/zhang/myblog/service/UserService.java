package com.zhang.myblog.service;

import com.zhang.myblog.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author created by Zhangdazhuang
 * @version v.0.1
 * @date 2018/11/2
 * @备注 用户操作接口
 **/
public interface UserService {
    //新增，编辑，保存
    User saveOrUpdateUser(User user);

    //注册用户
    User registerUser(User user);

    void removeUser(Long id);

    User getUserById(Long id);

    //根据用户名分页模糊查询
    Page<User> listUsersByNameLike(String name, Pageable pageable);
}
