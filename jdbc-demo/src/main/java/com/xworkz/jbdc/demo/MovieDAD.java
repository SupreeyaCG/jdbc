package com.xworkz.jbdc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.google.protobuf.TextFormat.ParseException;

public class MovieDAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieDAD movieDAD = new MovieDAD();
		movieDAD.getNameByMovieId();
	}
		public void getNameByMovieId() {
     String query ="SELECT mv.name FROM movie mv.WHERE idel";
		Connection connection=null;
		Statement statement = null;
		ResultSet resultSet=null;
		
		try {
			connection=DriverManager.getConnection("jdbc:mysql://connection:3306/jdbc","root","root");
			statement=connection.createStatement();
			resultSet= statement.executeQuery(query);
			
			while(resultSet.next()) {
				//String movieName=resultSet.getString("name");
				String movieName=resultSet.getString(1);
				System.out.println("Movie Name: " +movieName);
				
			}
		}catch(SQLException e ) {
			e.printStackTrace();
				
		}
		finally {
			try {
			if(connection !=null)
				connection.close();
			if(statement !=null)
				connection.close();
			if(resultSet !=null);
			resultSet.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
		}
	}
		public void getAll() {
			
		}
		public void getLanguageAndBudgetBymovieName() {
			
		}

}
