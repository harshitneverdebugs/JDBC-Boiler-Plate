import java.sql.*;
public class Main {
    private static final String url="jdbc:mysql://localhost:3306/?user=root";
    private static final String username="root";
    private static final String password="wj28@krhps";
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection=DriverManager.getConnection(url, username, password);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}