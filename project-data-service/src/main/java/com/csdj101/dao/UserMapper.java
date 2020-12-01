package com.csdj101.dao;

import com.csdj101.pojo.TUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    public List<TUser> findTUser(@Param("username") String username);

    public int addTUser(TUser objTUser);

    public int updTUser(TUser objTUser);

    public TUser findTUserId(@Param("id")int id);

    public int delTUser(@Param("id")int id);
}
