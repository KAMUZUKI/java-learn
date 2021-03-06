package com.mu.mapper;

import com.mu.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> queryUserList();

    User queryUser(int id);

    int addUser(User user);

    int deleteUser(int id);

    int updateUser(User user);
}
