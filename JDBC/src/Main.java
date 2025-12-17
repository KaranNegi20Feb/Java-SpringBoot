import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String url =
                "jdbc:postgresql://ep-twilight-feather-ahdpla7y-pooler.c-3.us-east-1.aws.neon.tech:5432/neondb?sslmode=require";

        String user = "neondb_owner";
        String password = "npg_ba4eknl6Pzjm";

        try (Connection con = DriverManager.getConnection(url, user, password)) {

            // 1️⃣ Create table
            String createTable = """
                CREATE TABLE IF NOT EXISTS students (
                    id SERIAL PRIMARY KEY,
                    name VARCHAR(50),
                    marks INT
                )
            """;

            Statement stmt = con.createStatement();
            stmt.execute(createTable);

            // 2️⃣ Insert data (PreparedStatement)
            String insertSql = "INSERT INTO students(name, marks) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(insertSql);

            ps.setString(1, "Karan");
            ps.setInt(2, 100);
            ps.executeUpdate();

            ps.setString(1, "Aman");
            ps.setInt(2, 85);
            ps.executeUpdate();

            // 3️⃣ Read data
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("ID | Name | Marks");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getInt("marks")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
