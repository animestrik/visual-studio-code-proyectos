package com.example.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.PooledConnection;

import com.example.entidades.Product;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductDAOMariaDB implements ProductDAO {
    private final PooledConnection pcon;

    @Override
    public List<Product> findByCategory(int idCat) {
        List<Product> prods = new ArrayList<>();

        try(Connection conn = pcon.getConnection()) {
            PreparedStatement st = conn.prepareStatement("SELECT * FROM product WHERE category = ?");
            st.setInt(1, idCat);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                prods.add(new Product(rs.getInt("id"), rs.getString("reference"), rs.getString("name"),
                    rs.getDouble("price"), rs.getInt("category")));
            }
        } catch(SQLException e) {
            System.err.println(e.getMessage());
        }

        return prods;
    }

    @Override
    public Product insert(Product p) {
        try(Connection conn = pcon.getConnection()) {
            PreparedStatement st = conn.prepareStatement("INSERT INTO product(reference,name,price,category) VALUES(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1,product.getreference());
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            rs.first();
            p = new Product(rs.getInt(1), rs.getString("reference"), rs.getString("name"), rs.getDouble("price"), rs.getInt("category"));
        } catch(SQLException e) {
            System.err.println(e.getMessage());
        }
        return p;
    }
    
}