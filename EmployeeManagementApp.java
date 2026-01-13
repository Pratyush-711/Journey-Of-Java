import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class EmployeeManagementApp extends JFrame {
    private JTextField txtName, txtId, txtDept;
    private DefaultTableModel tableModel;
    private JTable table;

    public EmployeeManagementApp() {
        setTitle("Employee Management App");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Top panel for input
        JPanel inputPanel = new JPanel(new GridLayout(2, 4, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Add New Employee"));

        txtName = new JTextField();
        txtId = new JTextField();
        txtDept = new JTextField();
        JButton btnAdd = new JButton("Add Employee");

        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(txtName);
        inputPanel.add(new JLabel("ID:"));
        inputPanel.add(txtId);
        inputPanel.add(new JLabel("Department:"));
        inputPanel.add(txtDept);
        inputPanel.add(new JLabel());
        inputPanel.add(btnAdd);

        // Table for displaying employees
        tableModel = new DefaultTableModel(new String[]{"Name", "ID", "Department"}, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        // Bottom panel with delete button
        JPanel bottomPanel = new JPanel();
        JButton btnDelete = new JButton("Delete Selected");
        bottomPanel.add(btnDelete);

        // Action Listeners
        btnAdd.addActionListener(e -> addEmployee());
        btnDelete.addActionListener(e -> deleteSelectedEmployee());

        // Layout
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void addEmployee() {
        String name = txtName.getText().trim();
        String id = txtId.getText().trim();
        String dept = txtDept.getText().trim();

        if (name.isEmpty() || id.isEmpty() || dept.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        tableModel.addRow(new Object[]{name, id, dept});
        txtName.setText("");
        txtId.setText("");
        txtDept.setText("");
    }

    private void deleteSelectedEmployee() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Delete Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        tableModel.removeRow(selectedRow);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EmployeeManagementApp::new);
    }
}
