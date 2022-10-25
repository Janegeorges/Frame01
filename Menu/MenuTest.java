package com.UI.Table.Menu;

import javax.swing.*;

public class MenuTest extends JFrame {
    private JMenuBar menubar;
    private JMenu filemenu;
    private JMenu editmenu;
    private JMenuItem loadfile;
    private JMenuItem savefile;

    public MenuTest(){
        super("File");
        loadfile=new JMenuItem("Load File");
        savefile=new JMenuItem("Save File");
        filemenu=new JMenu("File");
        filemenu.add(loadfile);
        filemenu.add(savefile);
        setMenuBar(menubar);

        setSize(40,50);
        setLocation(20,20);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
