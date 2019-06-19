package com.pack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pack.JdbcConnection;
import com.pack.model.AddProduct;


public class AddProductDaoImpl implements AddProductDao {

	public AddProductDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int insertProduct(AddProduct ap) {
		// TODO Auto-generated method stub
		Connection con=null;
		int i=0;
		try {
			
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, ap.getProductid());
			ps.setString(2,ap.getCategory());
			ps.setString(3, ap.getName());
			ps.setString(4, ap.getDescription());
			ps.setFloat(5,ap.getPrize());
			ps.setString(6,"apple");
			ps.setInt(7, 4);
			ps.setString(8, "10%");
			 i=ps.executeUpdate();
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			try {
				if(con!=null)
					con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		return i;
		
	}

	@Override
	public List<AddProduct> listProduct() {
		// TODO Auto-generated method stub
		Connection con=null;
		List<AddProduct> l=new ArrayList<>();
		    try
		   {
			con=JdbcConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select name,brand,category,rating,productid from product");
			
			while(rs.next()){
				AddProduct ap=new AddProduct();
				ap.setName(rs.getString("name"));
				ap.setBrand(rs.getString("brand"));
				ap.setCategory(rs.getString("category"));
				ap.setRating(rs.getInt("rating"));
				ap.setProductid(rs.getInt("productid"));
				l.add(ap);
			}
		   }
		   catch(Exception e)
		  {
			System.out.println(e);
		   }
			finally
			{
				try
				{
					if(con!=null)
					{
						con.close();
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			return l;
		
	}

	@Override
	public AddProduct viewProduct(int id) {
		// TODO Auto-generated method stub
		Connection con=null;
		AddProduct ap=new AddProduct();
		try
		{
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select name,brand,rating,discount,description,prize from product where productid=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				ap.setName(rs.getString(1));
				ap.setBrand(rs.getString(2));
				ap.setRating(rs.getInt(3));
				ap.setDiscount(rs.getString(4));
				ap.setDescription(rs.getString(5));
				ap.setPrize(rs.getFloat(6));
			}
		}
		catch(Exception e)
		  {
			System.out.println(e);
		   }
			finally
			{
				try
				{
					if(con!=null)
					{
						con.close();
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		return ap;
	}
	public int deleteProduct(int id) {
		// TODO Auto-generated method stub
		Connection con=null;
		int i=0;
		try
		{
			 con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from product where productid=?");
			ps.setInt(1, id);
			 i=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				if(con!=null)
				{
					con.close();
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		return i;
	}
	
}
