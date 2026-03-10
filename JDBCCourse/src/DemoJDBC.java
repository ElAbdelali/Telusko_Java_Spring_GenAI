import java.sql.*; // 1

public class DemoJDBC {
    public static void main(String[] args) throws SQLException {
        /*
        1. import package
        2. load and register
        3. create connection
        4. create statement
        5. execute statement
        6. process the results
        7. close
         */
        //2
        // Class.forName("org.postgresql.Driver");
        // 3
        int sid = 6;
        String sname = "Jacob";
        int marks = 100;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String password = "Ae25979!3";
        String sql = "select sname from \"studentInfo\".student where sid = 1";
        String sql1 = "select * from \"studentInfo\".student";
        String insertSql = "insert into \"studentInfo\".student values(6,'Ayan', 100)";
        String updateSql = "update \"studentInfo\".student set sname='Abdelali' where sid=1";
        String deleteSql = "delete from \"studentInfo\".student where sid=6";
        String preparedSql = "insert into \"studentInfo\".student values (?,?,?)";

        Connection conn = DriverManager.getConnection(url,uname,password);
        System.out.println("Connection Established");
        // 4
        Statement st = conn.createStatement();
        Statement st1 = conn.createStatement();
        Statement insertStatement = conn.createStatement();
        Statement updateStatement = conn.createStatement();
        Statement deleteStatement = conn.createStatement();
        PreparedStatement psql = conn.prepareStatement(preparedSql);
        psql.setInt(1, sid);
        psql.setString(2, sname);
        psql.setInt(3, marks);
        // 5 execute
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        ResultSet rs1 = st1.executeQuery(sql1);
        //boolean status = st2.execute(insertSql);
        //updateStatement.executeUpdate(updateSql);
        //deleteStatement.execute(deleteSql);
        //psql.execute();
        // 6
        String name = rs.getString("sname");
        System.out.println(name);

        while(rs1.next()){
            System.out.print(rs1.getInt(1) + " - ");
            System.out.print(rs1.getString(2) + " - ");
            System.out.println(rs1.getInt(3));
        }

        //System.out.println(status);
        conn.close();
        System.out.println("Connection closed");


    }
}
