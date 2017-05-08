
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
    private JPanel paneSub1;
    private JScrollPane pane;

    private JLabel labelCall;
    private JLabel labelCat;
    private JLabel labelKey;
    private JLabel labelSub1;
    private JLabel labelKeyText;

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
        paneSub1 			= new JPanel();
        paneSub1.setLayout(new BoxLayout(paneSub1, BoxLayout.Y_AXIS));
        pane = new JScrollPane();

        //-- BoxLayout Y_AXIS
        labelCall            = new JLabel("Label 0");
        labelCat             = new JLabel("Label 1");
        labelKey             = new JLabel("Label 2");
        labelSub1            = new JLabel("Sub 1");

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

                    //-- Controleer de huidige waarde om daarmee de oude waarde te kunnen verwijderen.
                    if(waarde == "get" )
                    {
                        panelCat.removeAll();
                        panelCat.add(labelCat);
                        panelCat.add(TEST);
                        panelCat.revalidate();
                        panelCat.repaint();
                    }
                    else if (waarde == "post" )
                    {
                        panelCat.removeAll();
                        panelCat.add(labelCat);
                        panelCat.add(TEST);
                        panelCat.revalidate();
                        panelCat.repaint();
                    }

                    //-- Plaats de nieuwe panelCat op het hoofd panel en repaint daarna het panel
                    panel.add(panelCat);
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
        System.out.println("list_get");

        String[] jlist1 = {"Hunter", "Vos", "Meta", "Sc", "Foto", "Gebruiker", "Fcm"};
        JList list1 = new JList(jlist1);
        list1.setVisibleRowCount(1);

        JScrollPane scrollPane1Cat = new JScrollPane(list1);
        scrollPane1Cat.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1Cat.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        return scrollPane1Cat;
    }


    public JScrollPane list_sub1()
    {
        System.out.println("list_sub1");

        String[] jlist1 = {"Hunter", "Vos", "Meta", "Sc", "Foto", "Gebruiker", "Fcm"};
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
        System.out.println("list_post");

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


}


