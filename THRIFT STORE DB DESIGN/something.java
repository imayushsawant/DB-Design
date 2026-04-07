import java.sql.*;
import java.util.Scanner;

public class App {

    static final String URL = "jdbc:mysql://localhost:3306/a66student";
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            while (true) {
                System.out.println("\n1. Insert\n2. View\n3. Update\n4. Delete\n5. Exit");
                System.out.print("Enter choice: ");
                int ch = sc.nextInt();

                switch (ch) {

                    case 1: // INSERT
                        System.out.println("Enter the id of student");
                        int id = sc.nextByte();
                        System.out.print("Enter Name: ");
                        String name = sc.next();
                        System.out.print("Enter Course: ");
                        String course = sc.next();

                        String insertQuery = "INSERT INTO student(id,name, course) VALUES(?,?, ?)";
                        PreparedStatement ps1 = con.prepareStatement(insertQuery);
                        ps1.setInt(1,id);
                        ps1.setString(2, name);
                        ps1.setString(3, course);
                        ps1.executeUpdate();

                        System.out.println("Student inserted!");
                        break;

                    case 2: // VIEW
                        String selectQuery = "SELECT * FROM student";
                        PreparedStatement ps2 = con.prepareStatement(selectQuery);
                        ResultSet rs = ps2.executeQuery();

                        System.out.println("\nID  Name  Course");
                        while (rs.next()) {
                            System.out.println(rs.getInt("id") + "  " +
                                    rs.getString("name") + "  " +
                                    rs.getString("course"));
                        }
                        break;

                    case 3: // UPDATE
                        System.out.print("Enter ID to update: ");
                        int uid = sc.nextInt();
                        System.out.print("Enter New Name: ");
                        String newName = sc.next();
                        System.out.print("Enter New Course: ");
                        String newCourse = sc.next();

                        String updateQuery = "UPDATE student SET name=?, course=? WHERE id=?";
                        PreparedStatement ps3 = con.prepareStatement(updateQuery);
                        ps3.setString(1, newName);
                        ps3.setString(2, newCourse);
                        ps3.setInt(3, uid);
                        ps3.executeUpdate();

                        System.out.println("Student updated!");
                        break;

                    case 4: // DELETE
                        System.out.print("Enter ID to delete: ");
                        int did = sc.nextInt();

                        String deleteQuery = "DELETE FROM student WHERE id=?";
                        PreparedStatement ps4 = con.prepareStatement(deleteQuery);
                        ps4.setInt(1, did);
                        ps4.executeUpdate();

                        System.out.println("Student deleted!");
                        break;

                    case 5:
                        con.close();
                        System.out.println("Exited.");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}