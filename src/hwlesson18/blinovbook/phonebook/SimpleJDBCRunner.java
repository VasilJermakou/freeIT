package hwlesson18.blinovbook.phonebook;

import java.sql.*;
import java.util.Properties;

public class SimpleJDBCRunner {
    public static void main(String[] args) {

        //Variant 1
        //final String URL = "jdbc:mysql://localhost:3306/freeit_db";   //?useSSL=false&amp;serverTimezone=UTC
        //Properties properties = new Properties();
        //properties.put("user", "bestuser");
        //properties.put("password", "bestuser");

        Connection connection = null;
        Statement statement = null;

        try{
            System.out.println("Trying to connect to database ...");

            //Variant 1
            //connection = DriverManager.getConnection(URL, properties);

            //Variant 2
            connection = ConnectorDB.getConnection();
            System.out.println("Connection successful!\n");

            //#1 to explore info about DB
            System.out.println("#1 to explore info about DB");
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM phonebook");        //SELECT * FROM phonebook where id=1;

            DatabaseMetaData databaseMetaData = connection.getMetaData();
            System.out.println(databaseMetaData.getDatabaseProductName());
            System.out.println(databaseMetaData.getDatabaseProductVersion());
            System.out.println(databaseMetaData.getDriverName());
            System.out.println(databaseMetaData.getUserName());
            System.out.println(databaseMetaData.getURL());
            System.out.println(" ");

            //#2 to explore info about DB table
            System.out.println("#2 to explore info about DB table");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM phonebook");

            ResultSetMetaData metaData =  resultSet.getMetaData();

            int temp = metaData.getColumnCount();
            System.out.println("number of columns: " + temp);

            System.out.println("");

            //#3 get all columns info from DB using SQL query
            System.out.println("#3 get all columns info from DB using SQL query");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM phonebook");

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String surName = resultSet.getString(2);
                int phoneNumber = resultSet.getInt(3);

                //System.out.println("id = " + id + ", surName = " + surName + ", phoneNumber =  " + phoneNumber + ";");
                Abonent abonent1 = new Abonent(id, surName, phoneNumber);
                System.out.println(abonent1.toString());
            }
            System.out.println("");

            //#4 using PreparedStatement
            System.out.println("#4 using PreparedStatement");

            //create new Abonent
            Abonent abonent2 = new Abonent(4, "Obama", 4569832);

            String addAbonentQuery = "INSERT INTO phonebook(id, lastname, phone) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(addAbonentQuery);

            preparedStatement.setInt(1, abonent2.getId());
            preparedStatement.setString(2, abonent2.getSurName());
            preparedStatement.setInt(3, abonent2.getPhoneNumber());

            preparedStatement.executeUpdate();
            System.out.println("");

            //#5 read abonent from DB
            System.out.println("#5 read abonent from DB");
            String readAbonentQuery = "SELECT * from phonebook where id=?";
            preparedStatement = connection.prepareStatement(readAbonentQuery);

            preparedStatement.setInt(1, 1);
            preparedStatement.execute();
            ResultSet resultSet2 = preparedStatement.getResultSet();
            while (resultSet2.next()){
                int id = resultSet2.getInt(1);
                String surName = resultSet2.getString(2);
                int phoneNumber = resultSet2.getInt(3);

                System.out.println("id = " + id + ", surName = " + surName + ", phoneNumber =  " + phoneNumber + ";");
            }
            System.out.println("");


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();

                System.out.println("Connection closed!");

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }//main ends
}//class ends
