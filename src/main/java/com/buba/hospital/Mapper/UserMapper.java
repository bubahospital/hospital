package com.buba.hospital.Mapper;


import com.buba.hospital.Bean.SecUser;

public interface UserMapper {

    SecUser login(String phone);
}
