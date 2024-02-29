import java.sql.*;

public class HotelManagementSystem {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/hotel";
    private static final String USERNAME = "localhost";
    private static final String PASSWORD = "ppshppdh";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            initializeHotel(connection);

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nWelcome to the Hotel Management System\n");
                System.out.println("1. Check-In");
                System.out.println("2. Check-Out");
                System.out.println("3. View Occupancy");
                System.out.println("4. Exit");
                System.out.print("\nEnter your choice: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        checkIn(connection, scanner);
                        break;
                    case 2:
                        checkOut(connection, scanner);
                        break;
                    case 3:
                        viewOccupancy(connection);
                        break;
                    case 4:
                        connection.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\nInvalid choice. Please try again.");
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void initializeHotel(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS rooms (room_number INT PRIMARY KEY, guest_name VARCHAR(255))";
        Statement statement = connection.createStatement();
        statement.executeUpdate(createTableSQL);
    }

    private static void checkIn(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("\nEnter room number: ");
        int roomNumber = scanner.nextInt();

        String checkRoomSQL = "SELECT guest_name FROM rooms WHERE room_number = ?";
        PreparedStatement checkRoomStatement = connection.prepareStatement(checkRoomSQL);
        checkRoomStatement.setInt(1, roomNumber);
        ResultSet resultSet = checkRoomStatement.executeQuery();

        if (resultSet.next()) {
            System.out.println("\nSorry, this room is already occupied.");
        } else {
            System.out.print("\nEnter guest name: ");
            String guestName = scanner.next();

            String checkInSQL = "INSERT INTO rooms (room_number, guest_name) VALUES (?, ?)";
            PreparedStatement checkInStatement = connection.prepareStatement(checkInSQL);
            checkInStatement.setInt(1, roomNumber);
            checkInStatement.setString(2, guestName);
            checkInStatement.executeUpdate();

            System.out.println("\nCheck-in successful.");
        }
    }

    private static void checkOut(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("\nEnter room number: ");
        int roomNumber = scanner.nextInt();

        String checkRoomSQL = "SELECT guest_name FROM rooms WHERE room_number = ?";
        PreparedStatement checkRoomStatement = connection.prepareStatement(checkRoomSQL);
        checkRoomStatement.setInt(1, roomNumber);
        ResultSet resultSet = checkRoomStatement.executeQuery();

        if (resultSet.next()) {
            String guestName = resultSet.getString("guest_name");
            String checkOutSQL = "DELETE FROM rooms WHERE room_number = ?";
            PreparedStatement checkOutStatement = connection.prepareStatement(checkOutSQL);
            checkOutStatement.setInt(1, roomNumber);
            checkOutStatement.executeUpdate();

            System.out.println("\nGuest " + guestName + " has checked out of room " + roomNumber + ".");
        } else {
            System.out.println("\nSorry, this room is already vacant.");
        }
    }

    private static void viewOccupancy(Connection connection) throws SQLException {
        System.out.println("\nRoom\tGuest");
        String viewOccupancySQL = "SELECT * FROM rooms";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(viewOccupancySQL);

        while (resultSet.next()) {
            int roomNumber = resultSet.getInt("room_number");
            String guestName = resultSet.getString("guest_name");
            System.out.println(roomNumber + "\t" + guestName);
        }
    }
}
