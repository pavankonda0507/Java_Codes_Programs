package ATMINTERFACE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMApp {
    private ATM atm;
    private JFrame frame;
    private JTextField amountField;
    private JLabel balanceLabel;

    public ATMApp(ATM atm) {
        this.atm = atm;
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("ATM Machine");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        JLabel amountLabel = new JLabel("Enter amount:");
        amountField = new JTextField();
        balanceLabel = new JLabel("Balance: $" + atm.checkBalance());

        JButton depositButton = new JButton("Deposit");
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleDeposit();
            }
        });

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleWithdraw();
            }
        });

        JButton balanceButton = new JButton("Check Balance");
        balanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleCheckBalance();
            }
        });

        frame.add(amountLabel);
        frame.add(amountField);
        frame.add(depositButton);
        frame.add(withdrawButton);
        frame.add(balanceButton);
        frame.add(new JLabel());
        frame.add(balanceLabel);

        frame.setVisible(true);
    }

    private void handleDeposit() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            if (amount <= 0) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid amount.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            atm.deposit(amount);
            JOptionPane.showMessageDialog(frame, "Deposit successful.");
            updateBalance();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void handleWithdraw() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            if (amount <= 0) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid amount.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (atm.withdraw(amount)) {
                JOptionPane.showMessageDialog(frame, "Withdrawal successful.");
            } else {
                JOptionPane.showMessageDialog(frame, "Insufficient balance.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            updateBalance();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void handleCheckBalance() {
        updateBalance();
        JOptionPane.showMessageDialog(frame, "Current balance: $" + atm.checkBalance());
    }

    private void updateBalance() {
        balanceLabel.setText("Balance: $" + atm.checkBalance());
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0); 
        ATM atm = new ATM(account);
        new ATMApp(atm);
    }
}
