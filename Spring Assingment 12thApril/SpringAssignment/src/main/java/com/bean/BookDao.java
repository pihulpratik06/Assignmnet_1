//Data Access Object
//CRUD operation
package com.bean;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import java.util.HashMap;
import java.util.Map;

public class BookDao {

     JdbcTemplate jt;

    public JdbcTemplate getJt() {
        return jt;
    }

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    public  int insert(Book book){
        String sql="insert into JTBookDetails1(bid,bookName,authorName,price) values(:bid,:bookName,:authorName,:price)";
        Map<String,Object> namedParameters=new HashMap<>();
        namedParameters.put("bid",book.getBid());
        namedParameters.put("bookName",book.getBookName());
        namedParameters.put("authorName",book.getAuthorName());
        namedParameters.put("price",book.getPrice());
        NamedParameterJdbcTemplate namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(jt.getDataSource());
        int status=namedParameterJdbcTemplate.update(sql,namedParameters);
        return status;
    }

    public int update(String bname, float p) {
        String sql="update jtbookdetails1 set price=:price where bookName=:bname";
        Map<String,Object> namedParameters=new HashMap<>();
        namedParameters.put("price",p);
        namedParameters.put("bname",bname);
        NamedParameterJdbcTemplate namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(jt.getDataSource());
        int status=namedParameterJdbcTemplate.update(sql,namedParameters);
        return status;
    }
}
