package com.dsf.spring_boot_learn.mapper;


import com.dsf.spring_boot_learn.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    public User findById(Integer id);
}
