package com.UI.Table;

import javax.swing.*;

public class TableFrame extends JFrame {
    private JTable table;
    private String[] cols={"No.","Item Name","Item Price","Count","Item Total"};
    private String[][] data={
            {"3","Fridge","25000","25"},
            {"5","Microwave","2000","27"},
            {"4","Oven","6000","28"},
            {"8","Air Fryer","8000","26"},
    };

    public TableFrame(){
        super("Invoice Items");
        // Create Table
        table=new JTable(data,cols);
        add(table);
        table.setVisible(true);

        setSize(400,500);
        setLocation(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new TableFrame().setVisible(true);
    }
}
