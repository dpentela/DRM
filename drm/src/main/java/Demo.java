import java.sql.*;

public class Demo {
    public static void main(String[] args) throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/drmdb";
        String uname = "drm";
        String password = "drm";

        String name = "Radhika";
        int farm_id = 1;
        //String query = "SELECT * FROM dairy_farm WHERE farm_id = ?;";
        String query = " insert into employee(name, farm_id) values(?, ?);";

//  employee_id | name      | farm_id | start_date | end_date |

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, password);

        //Statement st = con.createStatement();
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, name);
        st.setInt(2, farm_id);
        int count = st.executeUpdate();
        System.out.println(count + "rows are affected.");

        /* ResultSet rs = st.executeQuery(query);

        while(rs.next()) {
            String data = rs.getString(1) + " " + rs.getString(2);

            System.out.println(data);
        } */
        st.close();
        con.close();

    }
}
