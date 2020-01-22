package org.jian.shadow.mapper;


import org.apache.ibatis.annotations.*;
import org.jian.shadow.entity.SysUser;
import org.springframework.stereotype.Component;
import java.util.List;

@Mapper
@Component(value = "sysUserMapper")
public interface SysUserMapper {

    /**
     * 查询所以系统用户
     * @return
     */
    @Select("SELECT * FROM sys_user")
    @Results({
            @Result(property = "username",  column = "username"),
            @Result(property = "password",  column = "password"),
            @Result(property = "phone",  column = "phone"),
            @Result(property = "sex",  column = "sex"),
            @Result(property = "email",  column = "email"),
            @Result(property = "mark",  column = "mark"),
            @Result(property = "rank",  column = "rank"),
            @Result(property = "lastLogin",  column = "lastLogin"),
            @Result(property = "loginIp",  column = "loginIp"),
            @Result(property = "imageUrl",  column = "imageUrl"),
            @Result(property = "regTime", column = "regTime"),
            @Result(property = "locked", column = "locked")
    })
    List<SysUser> findAll();

    /**
     * 根据ID查询系统用户
     * @param id
     * @return
     */
    @Select("SELECT username,password,phone,sex,email,mark,rank,lastLogin,loginIp,imageUrl,regTime,locked FROM sys_user WHERE id = #{id}")
    @Results({
            @Result(property = "username",  column = "username"),
            @Result(property = "password",  column = "password"),
            @Result(property = "phone",  column = "phone"),
            @Result(property = "sex",  column = "sex"),
            @Result(property = "email",  column = "email"),
            @Result(property = "mark",  column = "mark"),
            @Result(property = "rank",  column = "rank"),
            @Result(property = "lastLogin",  column = "lastLogin"),
            @Result(property = "loginIp",  column = "loginIp"),
            @Result(property = "imageUrl",  column = "imageUrl"),
            @Result(property = "regTime", column = "regTime"),
            @Result(property = "locked", column = "locked")
    })
    SysUser findOne(int id);

    /**
     * 插入系统用户
     * @param sysUser
     */
    @Insert("INSERT INTO sys_user(username,password,phone,sex,email,mark,rank,lastLogin,loginIp,imageUrl,regTime,locked) VALUES(#{username},#{password},#{phone},#{sex},#{email},#{mark},#{rank},#{lastLogin},#{loginIp},#{imageUrl},#{regTime},#{locked})")
    void insert(SysUser sysUser);

    /**
     * 更新系统用户信息
     * @param sysUser
     */
    @Update("UPDATE sys_user SET userName=#{userName},password=#{password},phone=#{phone},sex=#{sex},email=#{email},mark=#{mark},rank=#{rank},lastLogin=#{lastLogin},loginIp=#{loginIp},imageUrl=#{imageUrl},regTime=#{regTime},locked=#{locked} WHERE id =#{id}")
    void update(SysUser sysUser);

    /**
     * 删除指定系统用户
     * @param id
     */
    @Delete("DELETE FROM sys_user WHERE id =#{id}")
    void delete(int id);


}