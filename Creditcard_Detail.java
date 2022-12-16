package com.training.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Creditcard_Details {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/infinite";
        String user = "root";
        String password = "priyanka@1";
        Connection con = null;


        try {

            con = DriverManager.getConnection(url, user, password);

            System.out.println("Enter Account details");
            System.out.println("Enter account number :");
            String account_no=sc.next();
            System.out.println("Enter Transaction month :");
            int month=sc.nextInt();


            String sql = " {call GET_TRANS_AMT(?,?,?) }";

            CallableStatement stmt =  con.prepareCall(sql);

            stmt.setString(2,account_no);
            stmt.setInt(3,month);
            stmt.registerOutParameter(1, Types.INTEGER);

            stmt.execute();
            int price = stmt.getInt(1);

            System.out.println("Account Number: "+account_no);
            System.out.println("Bill Month: "+month);
            System.out.println("Bill Amount: "+price);


        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try{
                con.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }

        }


    }
}

