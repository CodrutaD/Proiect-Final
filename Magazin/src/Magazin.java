import Memorie.HDD;
import Memorie.IROM;
import Memorie.RAM;
import Memorie.SSD;
import Procesor.AMD;
import Procesor.IProcesor;
import Procesor.Intel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Magazin {
    private JButton laptopuriButton;
    private JButton personalizarePCButton;
    private JButton cosCumparaturiButton;
    private JPanel rootPanel;

    public Magazin() {
        laptopuriButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame1= new JFrame("Laptopuri");
                JPanel panel =new JPanel();
                ButtonGroup g= new ButtonGroup();
                JButton btn_aleg_laptop= new JButton("Plaseaza produsul in cos.");
                //JLabel spatiu= new JLabel();
                //spatiu.setBorder(new EmptyBorder(40,0,0,0));
                ArrayList<JRadioButton> radio= new ArrayList<JRadioButton>();

                ArrayList<Laptop> laptop =new ArrayList<Laptop>();
                ArrayList<Intel> intel =new ArrayList<Intel>();
                ArrayList<AMD> amd =new ArrayList<AMD>();
                ArrayList<RAM> ram =new ArrayList<RAM>();
                ArrayList<PlacaVideo> placaVideo =new ArrayList<PlacaVideo>();
                ArrayList<HDD> hdd =new ArrayList<HDD>();
                ArrayList<SSD> ssd =new ArrayList<SSD>();

                intel.add(0, new Intel(Intel.INTEL_CORE_I3,2, 1200, "DDR4"));
                intel.add(1, new Intel(Intel.INTEL_CORE_I5,4, 4000, "DDR4"));
                intel.add(2, new Intel(Intel.INTEL_CORE_I7,6, 4500, "DDR4"));

                amd.add(0, new AMD(AMD.RYZEN3,2, 1200, "DDR4"));
                amd.add(1, new AMD(AMD.RYZEN5,4, 4000, "DDR4"));
                amd.add(2, new AMD(AMD.RYZEN7,6, 4500, "DDR4"));
                amd.add(2, new AMD(AMD.RYZEN9,8, 4500, "DDR4"));

                ram.add(0,new RAM(4, 2450,"DDR4"));
                ram.add(1,new RAM(8, 2933,"DDR4"));

                placaVideo.add(0, new PlacaVideo(14, 1,1100, PlacaVideo.AMD, "DDR4"));
                placaVideo.add(1, new PlacaVideo(14, 4,1650, PlacaVideo.NVIDIA, "GDDR6"));
                placaVideo.add(2,new PlacaVideo(20, 2,1100, PlacaVideo.NVIDIA, "GDDR5"));
                placaVideo.add(3,new PlacaVideo(16, 4,3050, PlacaVideo.NVIDIA, "GDDR6"));

                hdd.add(0,new HDD(1024,90,3.5));

                ssd.add(0,new SSD(512, 90,3.5 ));
                ssd.add(1,new SSD(256,90,1.2));
                ssd.add(1,new SSD(256,90,3.5));

                laptop.add(0, new Laptop(intel.get(1), ram.get(1), ssd.get(0), placaVideo.get(1), "ASUS","FX506LH"));
                laptop.add(1, new Laptop(intel.get(0), ram.get(1), ssd.get(1), placaVideo.get(0), "HP","250G8"));
                laptop.add(2, new Laptop(intel.get(1), ram.get(1), ssd.get(2), placaVideo.get(1), "Dell","Inspiron5510"));
                laptop.add(3, new Laptop(intel.get(0), ram.get(0), hdd.get(0), placaVideo.get(2), "ASUS","X509JB"));
                laptop.add(4, new Laptop(intel.get(1), ram.get(1), ssd.get(0), placaVideo.get(3), "ACER","NITRO AN 515"));

                for(int i=0; i<laptop.size();i++)
                {
                    radio.add(new JRadioButton(laptop.get(i).getBrandModel()));
                    g.add(radio.get(i));
                }

                panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
                for(int i=0; i< laptop.size();i++)
                {
                    if(i==0)
                    {
                        panel.add(new JLabel(new ImageIcon("ASUS_FX506LH.jpg")));
                    }
                    if(i==1)
                    {
                        panel.add(new JLabel(new ImageIcon("HP_250G8.jpg")));
                    }
                    if(i==2)
                    {
                        panel.add(new JLabel(new ImageIcon("DELL_INSPIRON_5510.jpg")));
                    }
                    if(i==3)
                    {
                        panel.add(new JLabel(new ImageIcon("ASUS_X509JB.jpg")));
                    }
                    if(i==4)
                    {
                        panel.add(new JLabel(new ImageIcon("ACER_NITRO5_AN515.jpg")));
                    }
                        panel.add(radio.get(i));
                        panel.add(new JLabel(laptop.get(i).getProcesor()));
                        panel.add(new JLabel(laptop.get(i).getRAM()));
                        panel.add(new JLabel(laptop.get(i).getROM()));
                        panel.add(new JLabel(laptop.get(i).getPlacaVideo()));
                    }
                panel.add(btn_aleg_laptop);
                JScrollPane panel1= new JScrollPane(panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

                frame1.setBounds(400, 150, 700, 600);
                frame1.add(panel1);
                frame1.setVisible(true);


                btn_aleg_laptop.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
                }
        });
    }

    public static void main (String args[])
    {
            JFrame frame= new JFrame("MagazinPC");
            frame.setContentPane(new Magazin().rootPanel);
            frame.setBounds(500 ,150, 500, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);


    }
}
