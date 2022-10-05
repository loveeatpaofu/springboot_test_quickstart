package com.example.springboot_test_quickstart;

import com.example.springboot_test_quickstart.dao.BookDao;
import com.example.springboot_test_quickstart.domain.Book;
import com.example.springboot_test_quickstart.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootTestQuickstartApplicationTests {
    @Autowired
    private BookService bookService;

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        bookService.save();
    }

    @Test
    void testGetALL(){

        List<Book> books = bookDao.selectList(null);
        System.out.println(books);
    }

    @Test
    void SaveBook(){
        Book book = new Book();
        book.setId(4);
        book.setName("神话");
        book.setType("神幻");
        book.setDescription("男主穿越至秦朝时期开始了一段爱恨情仇");
        int insert = bookDao.insert(book);
        System.out.println(insert);
    }

    @Test
    void DeleteBook(){
        bookDao.deleteById(4);
    }

}
