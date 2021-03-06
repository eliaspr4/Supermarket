package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import models.ClientesModel;
import views.CustomersView;

public class ClientesController implements ActionListener {
    ClientesModel customersModel;
    CustomersView customersView;

    public ClientesController(ClientesModel customersModel, CustomersView customersView) {
        this.customersModel = customersModel;
        this.customersView = customersView;
        this.customersView.jtf_id.setVisible(false);
        
        this.customersView.jbtn_first.addActionListener(this);
        this.customersView.jbtn_previous.addActionListener(this);
        this.customersView.jbtn_next.addActionListener(this);
        this.customersView.jbtn_last.addActionListener(this);
        
        this.customersView.jbtn_add.addActionListener(this);
        this.customersView.jbtn_edit.addActionListener(this);
        this.customersView.jbtn_remove.addActionListener(this);
        this.customersView.jbtn_find.addActionListener(this);
        
        initView();
        showRecords();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == customersView.jbtn_first)
            firstCustomer();
        else if(a.getSource() == customersView.jbtn_previous)
            previousCustomer();
        else if(a.getSource() == customersView.jbtn_next)
            nextCustomer();
        else if(a.getSource() == customersView.jbtn_last)
            lastCustomer();
        else if(a.getSource() == customersView.jbtn_add)
            addCustomer();
        else if(a.getSource() == customersView.jbtn_edit)
            editCustomer();
        else if(a.getSource() == customersView.jbtn_remove)
            removeCustomer();
        else if(a.getSource() == customersView.jbtn_find)
            findCustomer();
    }
    
    public void initView() {
        customersView.setVisible(true);
        customersModel.initValues();
        customersModel.setValues();
    }
    
    public void showValues() {
        customersView.jtf_id.setText("" + customersModel.getCustomerID());
        customersView.jtf_name.setText(customersModel.getName());
        customersView.jtf_surname1.setText(customersModel.getSurname1());
        customersView.jtf_surname2.setText(customersModel.getSurname2());
        customersView.jtf_phone.setText(customersModel.getPhone());
        customersView.jtf_email.setText(customersModel.getEmail());
        customersView.jtf_rfc.setText(customersModel.getRfc());
        customersView.jtf_street.setText(customersModel.getStreet());
        customersView.jtf_number.setText("" + customersModel.getNumber());
        customersView.jtf_suburb.setText(customersModel.getSuburb());
        customersView.jtf_city.setText(customersModel.getCity());
        customersView.jtf_state.setText(customersModel.getState());
    }
    
    public void firstCustomer() {
        customersModel.moveToFirst();
        showValues();
    }
    
    public void previousCustomer() {
        customersModel.moveToPrevious();
        showValues();
    }
    
    public void nextCustomer() {
        customersModel.moveToNext();
        showValues();
    }
    
    public void lastCustomer() {
        customersModel.moveToLast();
        showValues();
    }
    
    public void addCustomer() {
        try {
        String name = customersView.jtf_name.getText();
        String surname1 = customersView.jtf_surname1.getText();
        String surname2 = customersView.jtf_surname2.getText();
        String phone = customersView.jtf_phone.getText();
        String email = customersView.jtf_email.getText();
        String rfc = customersView.jtf_rfc.getText();
        String street = customersView.jtf_street.getText();
        int number = Integer.parseInt(customersView.jtf_number.getText());
        String suburb = customersView.jtf_suburb.getText();
        String city = customersView.jtf_city.getText();
        String state = customersView.jtf_state.getText();
        customersModel.addCustomer(name, surname1, surname2, phone, email, rfc, street, number, suburb, city, state);
        customersModel.setValues();
        showValues();
        }
        catch(NumberFormatException error) {
            
            
        }
    }
    
    public void editCustomer() {
        try {
        int customerID = Integer.parseInt(customersView.jtf_id.getText());
        String name = customersView.jtf_name.getText();
        String surname1 = customersView.jtf_surname1.getText();
        String surname2 = customersView.jtf_surname2.getText();
        String phone = customersView.jtf_phone.getText();
        String email = customersView.jtf_email.getText();
        String rfc = customersView.jtf_rfc.getText();
        String street = customersView.jtf_street.getText();
        int number = Integer.parseInt(customersView.jtf_number.getText());
        String suburb = customersView.jtf_suburb.getText();
        String city = customersView.jtf_city.getText();
        String state = customersView.jtf_state.getText();
        customersModel.editCustomer(customerID, name, surname1, surname2, phone, email, rfc, street, number, suburb, city, state);
        customersModel.setValues();
        showValues();
        }
        catch(NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Datos no validos ,Rellena correctamente todos los campos ", "Error 66" , JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void removeCustomer() {
        int customerID = Integer.parseInt(customersView.jtf_id.getText());
         customersModel.removeCustomer(customerID);
        customersModel.setValues();
        
        showValues();
    }
    
    public void findCustomer() {
     String name = JOptionPane.showInputDialog(null, "Introduce un nombre para ser buscado:", "Búsqueda por nombre", JOptionPane.INFORMATION_MESSAGE);
        if(name.equals(customersView.jtf_name.getText()))
            JOptionPane.showMessageDialog(null, name + " Se encuentra en la base de datos", "Resultados", JOptionPane.INFORMATION_MESSAGE);
        else 
            JOptionPane.showMessageDialog(null, name + " No se encuentra en la base de datos. Intenta de nuevo", "Alerta", JOptionPane.ERROR_MESSAGE);
    }
    
    public void showRecords() {
        customersView.jt_customersTable.setModel(customersModel.tableModel);
        customersModel.populateTable();
    }
}

