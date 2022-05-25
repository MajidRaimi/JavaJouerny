import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;



public class DisplayQueryResults extends JFrame {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/jdbc";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin";

    private static final String QUERY = "SELECT * FROM Students ; ";

    private static ResultSetTableModel tableModel;

    public static void main(String[] args) {

        try {

            tableModel = new ResultSetTableModel(URL, USERNAME, PASSWORD, QUERY);

            final JTextArea queryArea = new JTextArea(QUERY, 3, 100);
            queryArea.setWrapStyleWord(true);
            queryArea.setLineWrap(true);
            queryArea.setEditable(true);

            JScrollPane scrollPane = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                    ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

            JButton submitButton = new JButton("Run");

            Box boxNorth = Box.createHorizontalBox();
            boxNorth.add(queryArea);
            boxNorth.add(scrollPane);
            boxNorth.add(submitButton);

            JTable resultTable = new JTable(tableModel);

            JLabel filterLabel = new JLabel("Filter : ");
            final JTextField filterText = new JTextField("Apply Filter");
            JButton applyFilter = new JButton("Apply Filter");

            final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableModel);
            resultTable.setRowSorter(sorter);

            applyFilter.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = filterText.getText().trim();

                    if (text.length() == 0) {
                        sorter.setRowFilter(null);
                    } else {
                        try {
                            sorter.setRowFilter(RowFilter.regexFilter(text));
                        } catch (Exception ex) {

                        }
                    }

                }

            });

            Box boxSouth = Box.createHorizontalBox();

            boxSouth.add(filterLabel);
            boxSouth.add(filterText);
            boxSouth.add(applyFilter);

            JFrame window = new JFrame("Table");
            window.add(boxNorth, BorderLayout.NORTH);
            window.add(new JScrollPane(resultTable), BorderLayout.CENTER);

            window.add(boxSouth, BorderLayout.SOUTH);

            submitButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        tableModel.setQuery(queryArea.getText().trim());
                    } catch (Exception ex) {
                        System.out.println("Mistake In Your Syntax : " + ex.getMessage());
                    }

                }
            });

            window.setVisible(true);
            window.setDefaultCloseOperation(EXIT_ON_CLOSE);
            window.setSize(500, 500);

        } catch (Exception e) {
            System.out.println("Error Running This Class : " + e.getStackTrace());
        }

    }

}
