package com.mapper;

import com.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> getUserInfo();
    @Select("SELECT * FROM user WHERE id=")
    User getUserOne();

    @Insert("INSERT INTO user(id,u_name,u_pass)VALUES(#{id},#{u_name},#{u_pass})")
    void insert(User user);
    @Update("UPDATE user SET u_name=#{u_name},u_pass=#{u_pass} WHERE id=#{id}")
    void update(User user);
    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(int id);

    //方法中构建结构化sql
    @SelectProvider(type = UserDaoProvider.class,method = "findUserById")
    List<User> getUserList(User user);

    class UserDaoProvider{
        public String findUserById(User user){
            String sql = "SELECT * FROM user";
            if (user.getU_name() != null){
                sql += " where u_name = #{u_name}";
            }
            return sql;
        }
    }
}
