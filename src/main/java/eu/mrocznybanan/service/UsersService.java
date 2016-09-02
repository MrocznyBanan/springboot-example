package eu.mrocznybanan.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import eu.mrocznybanan.entity.User;

@Mapper
public interface UsersService {

    @Select("select * from users u where u.id = #{userId}")
    User findById(@Param("userId") Long userId);
    
    @Select("select * from users u where u.status = 'A' order by u.created")
    List<User> findAll();

    @Update("update users set firstName=#{firstName}, lastName=#{lastName}, status=#{status} where id=#{id}")
    int update(User user);

}
