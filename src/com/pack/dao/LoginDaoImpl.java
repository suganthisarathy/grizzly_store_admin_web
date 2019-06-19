package com.pack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.pack.JdbcConnection;
import com.pack.model.Admin;

public class LoginDaoImpl implements LoginDao {

	public LoginDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	
	public  boolean checkLogin(Admin a) {
		// TODO Auto-generated method stub
		Connection con=null;
		boolean val=false;
		try
		{
			System.out.println("ado impl");
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select userid,password from admin where userid=? and password=?");
			ps.setInt(1, a.getUserid());
			ps.setString(2, a.getPassword());
			ResultSet rs=ps.executeQuery();
			System.out.println(rs);
			if(rs.next())
			{
				System.out.println("hello");
				val=true;
			}
			
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
		return val;
	}


	@Override
	public int getCount(Admin a) {
		// TODO Auto-generated method stub
		int count=0;
		Connection con=null;
		try
		{
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select count from admin where userid=?");
			ps.setInt(1,a.getUserid());
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				count=rs.getInt(1);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return count;
	}


	@Override
	public int incrementCount(Admin a, int count) {
		// TODO Auto-generated method stub
		Connection con=null;
		int c=0;
		try
		{
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("update  admin set count=? where userid=?");
			ps.setInt(1,count+1);
			ps.setInt(2, a.getUserid());
			 c=ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return c;
	}


	@Override
	public int setZeroCount(Admin a) {
		// TODO Auto-generated method stub
		Connection con=null;
		int c=0;
		try
		{
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("update  admin set count=0 where userid=?");
			ps.setInt(1, a.getUserid());
			 c=ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return c;
		
	}
	public String getUsername(Admin a) {
        // TODO Auto-generated method stub
        Connection con=null;
        String username=null;
        try
        {
               con=JdbcConnection.getConnection();
               PreparedStatement ps=con.prepareStatement("select username from admin where userid=? and password=?");
               ps.setInt(1, a.getUserid());
               ps.setString(2, a.getPassword());
               ResultSet rs=ps.executeQuery();
               if(rs.next())
               {
                     username=rs.getString(1);
               }
        }
        catch(Exception e)
        {
               System.out.println(e);
        }
        return username;
 }


	@Override
	public String getDesignation(Admin a) {
		// TODO Auto-generated method stub
		 Connection con=null;
	        String designation=null;
	        try
	        {
	               con=JdbcConnection.getConnection();
	               PreparedStatement ps=con.prepareStatement("select designation from porfile where userid=? ");
	               ps.setInt(1, a.getUserid());
	               ResultSet rs=ps.executeQuery();
	               if(rs.next())
	               {
	                     designation=rs.getString(1);
	               }
	        }
	        catch(Exception e)
	        {
	               System.out.println(e);
	        }
	        System.out.println(designation);
			
	        return designation;
	        
	}


	@Override
	public String getOffice(Admin a) {
		// TODO Auto-generated method stub
		Connection con=null;
        String office=null;
        try
        {
               con=JdbcConnection.getConnection();
               PreparedStatement ps=con.prepareStatement("select office from porfile where userid=? ");
               ps.setInt(1, a.getUserid());
               ResultSet rs=ps.executeQuery();
               if(rs.next())
               {
                     office=rs.getString(1);
               }
        }
        catch(Exception e)
        {
               System.out.println(e);
        }
       
		
        return office;
	}
		


}
