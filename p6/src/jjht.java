
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class jjht
{
    private JFrame frame;
    private JPanel panel;
    private JPanel panelCall;
    private JPanel panelCat;
    private JPanel panelKey;
    private JPanel panelSub1;
    private JPanel panelSub2;
    private JPanel panelSub3;
    private JScrollPane pane;

    private JLabel labelCall;
    private JLabel labelCat;
    private JLabel labelKey;
    private JLabel labelSub1;
    private JLabel labelSub2;
    private JLabel labelSub3;
    private JLabel labelKeyText;

    private JTextField textField;

    public static void main(String[] args)
    {
        jjht gui = new jjht();
        gui.go();
    }


    public void go()
    {
        //-- Maak nieuw JFrame en JPanel aan.
        frame 			    = new JFrame();
        panel 			    = new JPanel();


        //-- BoxLayout Y_AXIS
        panelCall			= new JPanel();
        panelCall.setLayout(new BoxLayout(panelCall, BoxLayout.Y_AXIS));
        panelCat 			= new JPanel();
        panelCat.setLayout(new BoxLayout(panelCat, BoxLayout.Y_AXIS));
        panelKey 			= new JPanel();
        panelKey.setLayout(new BoxLayout(panelKey, BoxLayout.Y_AXIS));
        panelSub1 			= new JPanel();
        panelSub1.setLayout(new BoxLayout(panelSub1, BoxLayout.Y_AXIS));
        panelSub2			= new JPanel();
        panelSub2.setLayout(new BoxLayout(panelSub2, BoxLayout.Y_AXIS));
        panelSub3 			= new JPanel();
        panelSub3.setLayout(new BoxLayout(panelSub3, BoxLayout.Y_AXIS));
        pane = new JScrollPane();

        //-- BoxLayout Y_AXIS
        labelCall            = new JLabel("Label Call");
        labelCat             = new JLabel("Label Cat");
        labelKey             = new JLabel("Label Key");
        labelSub1            = new JLabel("Label Sub 1");
        labelSub2            = new JLabel("Label Sub 2");
        labelSub3            = new JLabel("Label Sub 3");

        labelKeyText         = new JLabel("     KEY     ");

        //-- Voeg het 1e JLabel en het 1e ScrollPanel toe aan het 1e panel
        panelCall.add(labelCall);
        panelCall.add(listCall());
        panel.add(panelCall);

        //-- Vpeg het panel to aan het frame.
        frame.add(BorderLayout.CENTER, panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,300);
        frame.setVisible(true);
    }


    public JScrollPane listCall()
    {
        String[] jlist0 		= {"post","get"};
        JList list0				= new JList(jlist0);
        list0.setVisibleRowCount(1);
        list0.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list0.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {

                    JScrollPane TEST = listGetPost(list0.getSelectedValue().toString());
                    String waarde = (list0.getSelectedValue().toString());

                    panelSub1.removeAll();
                    panelKey.removeAll();
                    panelCat.removeAll();

                    panelCat.add(labelCat);
                    panelCat.add(TEST);

                    panel.add(panelCat);

                    if(waarde == "get") {
                        panelKey.add(labelKey);
                        panelKey.add(labelKeyText);
                        panel.add(panelKey);
                    }
                    //-- Plaats de nieuwe panelCat op het hoofd panel en repaint daarna het panel



                    panel.revalidate();
                    panel.repaint();

                }
            }
        });

        JScrollPane scrollPaneCall	= new JScrollPane(list0);
        scrollPaneCall.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPaneCall.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        return scrollPaneCall;
    }


//-- GET
    public JScrollPane list_get()
    {
        String[] jlist1 = {"Hunter", "Vos", "Meta", "Sc", "Foto", "Gebruiker", "Fcm"};
        JList list1 = new JList(jlist1);
        list1.setVisibleRowCount(1);

        JScrollPane scrollPane1Cat = new JScrollPane(list1);
        scrollPane1Cat.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1Cat.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {

                    JScrollPane TEST = listSub1(list1.getSelectedValue().toString());
                    String waarde = (list1.getSelectedValue().toString());

                    panelSub2.removeAll();
                    panelSub1.removeAll();
                    panelSub1.add(labelSub1);
                    panelSub1.add(TEST);
                    //-- Plaats de nieuwe panelSub1 op het hoofd panel en repaint daarna het panel
                    panel.add(panelSub1);
                    panel.revalidate();
                    panel.repaint();

                }
            }
        });
        return scrollPane1Cat;
    }




    public JScrollPane list_sub1_hunter()
    {
        String[] jlist1 = {"Hunter_namen", "All", "Naam", "Andere", "{id}"};
        JList list1 = new JList(jlist1);
        list1.setVisibleRowCount(1);

        JScrollPane scrollPane1Cat = new JScrollPane(list1);
        scrollPane1Cat.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1Cat.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {

                    //JScrollPane TEST = listSub2(list1.getSelectedValue().toString());
                    String waarde = (list1.getSelectedValue().toString());


                    panelSub2.removeAll();
                    panelSub2.add(labelSub2);

                    if(waarde == "Hunter_namen")
                    {
                        JTextField hunterNamen = new JTextField();
                        textField = hunterNamen;
                    }
                    else if(waarde == "All")
                    {
                        pane = list_sub1_vos();
                    }
                    else if(waarde == "Naam")
                    {
                        pane = list_sub1_meta();
                    }
                    else if(waarde == "Andere")
                    {
                        pane = list_sub1_sc();
                    }
                    else if(waarde == "{id}")
                    {
                        pane = list_sub1_foto();
                    }

                    if(textField != null)
                    {
                        panelSub2.add(textField);
                    } else if (pane != null )
                    {
                        panelSub2.add(pane);
                    }





                    //-- Plaats de nieuwe panelSub1 op het hoofd panel en repaint daarna het panel
                    panel.add(panelSub2);
                    panel.revalidate();
                    panel.repaint();

                }
            }
        });
        return scrollPane1Cat;
    }

    public JScrollPane list_sub1_vos()
    {
        String[] jlist1 = {"Last", "All", "{id}"};
        JList list1 = new JList(jlist1);
        list1.setVisibleRowCount(1);

        JScrollPane scrollPane1Cat = new JScrollPane(list1);
        scrollPane1Cat.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1Cat.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        return scrollPane1Cat;
    }
    public JScrollPane list_sub1_meta()
    {
        String[] jlist1 = {"NULL"};
        JList list1 = new JList(jlist1);
        list1.setVisibleRowCount(1);

        JScrollPane scrollPane1Cat = new JScrollPane(list1);
        scrollPane1Cat.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1Cat.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        return scrollPane1Cat;
    }
    public JScrollPane list_sub1_sc()
    {
        String[] jlist1 = {"All"};
        JList list1 = new JList(jlist1);
        list1.setVisibleRowCount(1);

        JScrollPane scrollPane1Cat = new JScrollPane(list1);
        scrollPane1Cat.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1Cat.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        return scrollPane1Cat;
    }
    public JScrollPane list_sub1_foto()
    {
        String[] jlist1 = {"All", "id"};
        JList list1 = new JList(jlist1);
        list1.setVisibleRowCount(1);

        JScrollPane scrollPane1Cat = new JScrollPane(list1);
        scrollPane1Cat.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1Cat.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        return scrollPane1Cat;
    }
    public JScrollPane list_sub1_gebruiker()
    {
        String[] jlist1 = {"Info", "SleutelExcists"};
        JList list1 = new JList(jlist1);
        list1.setVisibleRowCount(1);

        JScrollPane scrollPane1Cat = new JScrollPane(list1);
        scrollPane1Cat.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1Cat.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        return scrollPane1Cat;
    }
    public JScrollPane list_sub1_fcm()
    {
        String[] jlist1 = {"{gebruiker}", "{FVM_Token"};
        JList list1 = new JList(jlist1);
        list1.setVisibleRowCount(1);

        JScrollPane scrollPane1Cat = new JScrollPane(list1);
        scrollPane1Cat.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1Cat.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        return scrollPane1Cat;
    }



//-- POST
    public JScrollPane list_post()
    {
        String[] jlist1 = {"Login", "Hunter", "Vos"};
        JList list1 = new JList(jlist1);
        list1.setVisibleRowCount(1);

        JScrollPane scrollPane1Cat = new JScrollPane(list1);
        scrollPane1Cat.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1Cat.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        return scrollPane1Cat;
    }


    public JScrollPane listGetPost(String temp)
    {
        if(temp == "get")
        {
            pane = list_get();
        }
        else if(temp == "post")
        {
            pane = list_post();
        }
        return pane;
    }

    public JScrollPane listSub1(String temp)
    {
        if(temp == "Hunter")
        {
            pane = list_sub1_hunter();
        }
        else if(temp == "Vos")
        {
            pane = list_sub1_vos();
        }
        else if(temp == "Meta")
        {
            pane = list_sub1_meta();
        }
        else if(temp == "Sc")
        {
            pane = list_sub1_sc();
        }
        else if(temp == "Foto")
        {
            pane = list_sub1_foto();
        }
        else if(temp == "Gebruiker")
        {
            pane = list_sub1_gebruiker();
        }
        else if(temp == "Fcm")
        {
            pane = list_sub1_fcm();
        }

        return pane;
    }

    public JScrollPane listSub2(String temp)
    {
        if(temp == "Hunter_namen")
        {
            pane = list_sub1_hunter();
        }
        else if(temp == "All")
        {
            pane = list_sub1_vos();
        }
        else if(temp == "Naam")
        {
            pane = list_sub1_meta();
        }
        else if(temp == "Andere")
        {
            pane = list_sub1_sc();
        }
        else if(temp == "{id}")
        {
            pane = list_sub1_foto();
        }

        return pane;
    }
}



