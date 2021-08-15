package com.pawan.choure.mapper


import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import com.pawan.choure.model.City
import org.springframework.stereotype.Component
@Component("cityMapper")
@Mapper
interface CityMapper {

    @Select("SELECT * FROM CITY WHERE state = #{state}")
    fun findByState(@Param("state") state: String): List<City>

}
