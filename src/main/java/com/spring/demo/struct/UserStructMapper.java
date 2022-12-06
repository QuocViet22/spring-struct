package com.spring.demo.struct;

import com.spring.demo.dto.UserDTO;
import com.spring.demo.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserStructMapper {
    UserDTO userToUserDto(User user);
}
