package com.rango.tam.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rango.tam.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author rango
 * @description
 * @date 2020/12/16 16:55
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
