import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PriceGUI extends JFrame implements ActionListener
{
    private JTextField txtName;
    private JTextField txtSalary;

    private JComboBox<String> cboProduct;

    private JLabel lblPrice;

    private JButton btnCheck;
    private JButton btnClear;

    private JTextArea txtOutput;

    public PriceGUI()
    {
        setTitle("Price Checker");
        setSize(550,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JLabel lblTitle = new JLabel("PRICE CHECKER", SwingConstants.CENTER);

        lblTitle.setFont(
                new Font("Arial",Font.BOLD,20));

        add(lblTitle, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4,2,5,5));

        panel.add(new JLabel("Customer Name"));
        txtName = new JTextField();
        panel.add(txtName);

        panel.add(new JLabel("Salary (RM)"));
        txtSalary = new JTextField();
        panel.add(txtSalary);

        panel.add(new JLabel("Product"));

        cboProduct = new JComboBox<>();

        cboProduct.addItem("Iphone 14 ProMax");
        cboProduct.addItem("Lenovo Yoga");
        cboProduct.addItem("BMW");

        panel.add(cboProduct);

        panel.add(new JLabel("Item Price"));

        lblPrice = new JLabel("RM5500.00");
        panel.add(lblPrice);

        add(panel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();

        btnCheck = new JButton("Check");
        btnClear = new JButton("Clear");

        buttonPanel.add(btnCheck);
        buttonPanel.add(btnClear);

        add(buttonPanel, BorderLayout.SOUTH);

        txtOutput = new JTextArea(10,25);
        txtOutput.setEditable(false);

        add(new JScrollPane(txtOutput), BorderLayout.EAST);

        btnCheck.addActionListener(this);
        btnClear.addActionListener(this);

        cboProduct.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        // Update price automatically
        if(e.getSource() == cboProduct)
        {
            String product = cboProduct.getSelectedItem().toString();

            if(product.equals("Iphone 14 ProMax"))
            {
                lblPrice.setText("RM5500.00");
            }

            else if(product.equals("Lenovo Yoga"))
            {
                lblPrice.setText("RM6000.00");
            }

            else if(product.equals("BMW"))
            {
                lblPrice.setText("RM200000.00");
            }
        }

        // Check button
        if(e.getSource() == btnCheck)
        {
            try
            {
                String name = txtName.getText();

                double salary = Double.parseDouble(txtSalary.getText());

                String product = cboProduct.getSelectedItem().toString();

                if(product.equals("Iphone 14 ProMax"))
                {
                    txtOutput.setText("The product is Iphone 14 ProMax.\n" + "Price : RM5500.00\n\n");

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
                    txtOutput.setText(
                        "The product is Lenovo Yoga.\n" + "Price : RM6000.00\n\n");

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
                    txtOutput.setText("The car brand is BMW.\n" + "Price : RM200000.00\n\n");

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

            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(this, "Please enter a valid salary!", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if(e.getSource() == btnClear)
        {
            txtName.setText("");
            txtSalary.setText("");
            txtOutput.setText("");

            cboProduct.setSelectedIndex(0);
            lblPrice.setText("RM5500.00");
        }
    }

    public static void main(String[] args)
    {
        new PriceGUI();
    }
}

//References: Copilot
