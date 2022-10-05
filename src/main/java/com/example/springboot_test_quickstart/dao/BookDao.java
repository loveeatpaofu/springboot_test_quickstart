package com.example.springboot_test_quickstart.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot_test_quickstart.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface BookDao extends BaseMapper <Book>{
}
