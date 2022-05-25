import java.sql.*;
import javax.swing.table.AbstractTableModel;

public class ResultSetTableModel extends AbstractTableModel {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private ResultSetMetaData metaData;
    private int numberOfRows;
    private boolean connectedToDatabase = false;

    ResultSetTableModel(String url, String username, String password, String query) throws SQLException {

        connection = DriverManager.getConnection(url, username, password);

        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        connectedToDatabase = true;

        setQuery(query);

    }

    public void setQuery(String query) throws SQLException, IllegalStateException {
        if (!connectedToDatabase) {
            throw new IllegalStateException("We Are Not Connected To The Database");
        }

        resultSet = statement.executeQuery(query);
        metaData = resultSet.getMetaData();

        resultSet.last(); // ! Go The Last Row At The Table
        numberOfRows = resultSet.getRow(); // ! Get The Row Count

        fireTableStructureChanged(); // ! Method At JTable To Notify That Model Has Changed

    }

    public void disconnectFromDatabase() {
        if (connectedToDatabase) {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (Exception e) {
                System.out.println("Could Not Disconnect From Database : " + e.getMessage());
            } finally {
                connectedToDatabase = false;
            }
        }
    }

    public Class getColumnClass(int column) throws IllegalStateException {

        if (!connectedToDatabase) {
            throw new IllegalStateException("We Are Not Connected To The Database");
        }

        try {
            String className = metaData.getColumnClassName(column + 1);
            return Class.forName(className);

        } catch (Exception e) {
            System.out.println("Error At Get Column Class Method : " + e.getMessage());
        }

        return Object.class;

    }

    @Override
    public int getRowCount() {

        if (!connectedToDatabase) {
            throw new IllegalStateException("We Are Not Connected To The Database");
        }

        return numberOfRows;

    }

    public Object getValueAt(int row, int column) throws IllegalStateException {
        if (!connectedToDatabase) {
            throw new IllegalStateException("We Are Not Connected To The Database");
        }

        try {
            resultSet.absolute(row + 1);
            return resultSet.getObject(column + 1);
        } catch (Exception e) {
            System.out.println("Error At Get Value At Method : " + e.getMessage());
        }

        return "";
    }

    @Override
    public int getColumnCount() throws IllegalStateException {
        if (!connectedToDatabase) {
            throw new IllegalStateException("We Are Not Connected To The Database");
        }

        try {
            return metaData.getColumnCount();
        } catch (Exception e) {
            System.out.println("Error At Get Get Column Count Method : " + e.getMessage());
        }

        return 0;
    }

    public String getColumnName(int column) throws IllegalStateException {
        if (!connectedToDatabase) {
            throw new IllegalStateException("We Are Not Connected To The Database");
        }

        try {
            return metaData.getColumnName(column + 1);
        } catch (Exception e) {
            System.out.println("Error At Get Get Column Name Method : " + e.getMessage());
        }

        return "";
    }

}
