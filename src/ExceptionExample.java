import java.io.IOException;
import java.sql.SQLException;



public class ExceptionExample {
    public static void main(String[] args) {
        try {
            method1();
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }

        try {
            method2();
        } catch (SQLException e) {
            System.out.println("SQLException occurred: " + e.getMessage());
        }

        try {
            method3();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }
    }

    public static void method1() throws IOException {
        throw new IOException("IOException occurred");
    }

    public static void method2() throws SQLException {
        throw new SQLException("SQLException occurred");
    }

    public static void method3() throws NullPointerException {
        throw new NullPointerException("NullPointerException occurred");
    }
}
