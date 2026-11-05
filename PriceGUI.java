import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PriceGUI extends JFrame implements ActionListener
{
    private JTextField txtName;
    private JTextField txtSalary;

    private JComboBox<String> cboProduct;

    private JButton btnCheck;
    private JButton btnClear;

    private JTextArea txtOutput;

    public PriceGUI()
    {
        setTitle("Price Checker");
        setSize(500,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JLabel lblTitle = new JLabel("PRICE CHECKER", SwingConstants.CENTER);

        lblTitle.setFont(new Font("Arial",Font.BOLD,18));

        add(lblTitle, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(3,2));

        panel.add(new JLabel("Customer Name"));
        txtName = new JTextField();
        panel.add(txtName);

        panel.add(new JLabel("Salary"));
        txtSalary = new JTextField();
        panel.add(txtSalary);

        panel.add(new JLabel("Product"));

        cboProduct = new JComboBox<>();

        cboProduct.addItem("Iphone 14 ProMax");
        cboProduct.addItem("Lenovo Yoga");
        cboProduct.addItem("BMW");

        panel.add(cboProduct);

        add(panel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();

        btnCheck = new JButton("Check");
        btnClear = new JButton("Clear");

        buttonPanel.add(btnCheck);
        buttonPanel.add(btnClear);

        add(buttonPanel, BorderLayout.SOUTH);

        txtOutput = new JTextArea(8,20);
        txtOutput.setEditable(false);

        add(new JScrollPane(txtOutput), BorderLayout.EAST);

        btnCheck.addActionListener(this);
        btnClear.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnCheck)
        {
            String name = txtName.getText();

            double salary = Double.parseDouble(txtSalary.getText());

            Customer c = new Customer(name,salary);

            String product = cboProduct.getSelectedItem().toString();

            if(product.equals("Iphone 14 ProMax"))
            {
                txtOutput.setText("The product is Iphone 14 ProMax.\n\n");

                if(salary > 4000)
                {
                    txtOutput.append("The customer's name is " + name + " with salary RM" + salary + " can buy this product.\n\n" + "Your salary is higher than the product price.");
                }
                else
                {
                    txtOutput.append("The customer's name is " + name + " with salary RM" + salary + " cannot buy this product.\n\n" + "The product price is more than your salary.");
                }
            }

            else if(product.equals("Lenovo Yoga"))
            {
                txtOutput.setText( "The product is Lenovo Yoga.\n\n");

                if(salary > 4000)
                {
                    txtOutput.append("The customer's name is " + name + " with salary RM" + salary + " can buy this product.\n\n" + "Your salary is higher than the product price.");
                }
                else
                {
                    txtOutput.append("The customer's name is " + name + " with salary RM" + salary + " cannot buy this product.\n\n" + "The product price is more than your salary.");
                }
            }

            else
            {
                txtOutput.setText("The car brand is BMW with price RM200000.\n\n");

                if(salary > 8000)
                {
                    txtOutput.append("The customer's name is " + name + " with salary RM" + salary + " can buy this car.\n\n" + "Your salary is higher than the car price.");
                }
                else
                {
                    txtOutput.append("The customer's name is " + name + " with salary RM" + salary + " cannot buy this car.");
                }
            }
        }

        if(e.getSource() == btnClear)
        {
            txtName.setText("");
            txtSalary.setText("");
            txtOutput.setText("");
        }
    }

    public static void main(String[] args)
    {
        new PriceGUI();
    }
}

//References: Copilot