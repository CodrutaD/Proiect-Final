import Memorie.*;
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
    private ArrayList<String> Cos_cumparaturi;
    private String denumire;

    public Magazin() {
        this.Cos_cumparaturi = new ArrayList();
        laptopuriButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame1 = new JFrame("Laptopuri");
                JPanel panel = new JPanel();
                ButtonGroup g = new ButtonGroup();
                JButton btn_aleg_laptop = new JButton("Plaseaza produsul in cos.");
                ArrayList<JRadioButton> radio = new ArrayList<JRadioButton>();

                ArrayList<Laptop> laptop = new ArrayList<Laptop>();
                ArrayList<Intel> intel = new ArrayList<Intel>();
                ArrayList<AMD> amd = new ArrayList<AMD>();
                ArrayList<RAM> ram = new ArrayList<RAM>();
                ArrayList<PlacaVideo> placaVideo = new ArrayList<PlacaVideo>();
                ArrayList<HDD> hdd = new ArrayList<HDD>();
                ArrayList<SSD> ssd = new ArrayList<SSD>();

                intel.add(0, new Intel(Intel.INTEL_CORE_I3, 2, 1200, "DDR4"));
                intel.add(1, new Intel(Intel.INTEL_CORE_I5, 4, 4000, "DDR4"));
                intel.add(2, new Intel(Intel.INTEL_CORE_I7, 6, 4500, "DDR4"));

                amd.add(0, new AMD(AMD.RYZEN3, 2, 1200, "DDR4"));
                amd.add(1, new AMD(AMD.RYZEN5, 4, 4000, "DDR4"));
                amd.add(2, new AMD(AMD.RYZEN7, 6, 4500, "DDR4"));
                amd.add(2, new AMD(AMD.RYZEN9, 8, 4500, "DDR4"));

                ram.add(0, new RAM(4, 2450, "DDR4"));
                ram.add(1, new RAM(8, 2933, "DDR4"));

                placaVideo.add(0, new PlacaVideo(14, 1, 1100, PlacaVideo.AMD, "DDR4"));
                placaVideo.add(1, new PlacaVideo(14, 4, 1650, PlacaVideo.NVIDIA, "GDDR6"));
                placaVideo.add(2, new PlacaVideo(20, 2, 1100, PlacaVideo.NVIDIA, "GDDR5"));
                placaVideo.add(3, new PlacaVideo(16, 4, 3050, PlacaVideo.NVIDIA, "GDDR6"));

                hdd.add(0, new HDD(1024, 90, 3.5));

                ssd.add(0, new SSD(512, 90, 3.5));
                ssd.add(1, new SSD(256, 90, 1.2));
                ssd.add(1, new SSD(256, 90, 3.5));

                laptop.add(0, new Laptop(intel.get(1), ram.get(1), ssd.get(0), placaVideo.get(1), "ASUS", "FX506LH"));
                laptop.add(1, new Laptop(intel.get(0), ram.get(1), ssd.get(1), placaVideo.get(0), "HP", "250G8"));
                laptop.add(2, new Laptop(intel.get(1), ram.get(1), ssd.get(2), placaVideo.get(1), "Dell", "Inspiron5510"));
                laptop.add(3, new Laptop(intel.get(0), ram.get(0), hdd.get(0), placaVideo.get(2), "ASUS", "X509JB"));
                laptop.add(4, new Laptop(intel.get(1), ram.get(1), ssd.get(0), placaVideo.get(3), "ACER", "NITRO AN 515"));

                for (int i = 0; i < laptop.size(); i++) {
                    radio.add(new JRadioButton(laptop.get(i).getBrandModel()));
                    g.add(radio.get(i));
                }

                panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
                for (int i = 0; i < laptop.size(); i++) {
                    if (i == 0) {
                        panel.add(new JLabel(new ImageIcon("ASUS_FX506LH.jpg")));
                    }
                    if (i == 1) {
                        panel.add(new JLabel(new ImageIcon("HP_250G8.jpg")));
                    }
                    if (i == 2) {
                        panel.add(new JLabel(new ImageIcon("DELL_INSPIRON_5510.jpg")));
                    }
                    if (i == 3) {
                        panel.add(new JLabel(new ImageIcon("ASUS_X509JB.jpg")));
                    }
                    if (i == 4) {
                        panel.add(new JLabel(new ImageIcon("ACER_NITRO5_AN515.jpg")));
                    }
                    panel.add(radio.get(i));
                    panel.add(new JLabel(laptop.get(i).getProcesor()));
                    panel.add(new JLabel(laptop.get(i).getRAM()));
                    panel.add(new JLabel(laptop.get(i).getROM()));
                    panel.add(new JLabel(laptop.get(i).getPlacaVideo()));
                }
                panel.add(btn_aleg_laptop);
                JScrollPane panel1 = new JScrollPane(panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

                frame1.setBounds(400, 150, 700, 600);
                frame1.add(panel1);
                frame1.setVisible(true);


                btn_aleg_laptop.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        boolean ok = false;
                        Laptop l1=new Laptop();

                        for (int i = 0; i < radio.size() && !ok; ++i) {
                            if (((JRadioButton) radio.get(i)).isSelected()) {
                                JOptionPane.showMessageDialog((Component) null, "Ati adaugat in cos laptopul "+(i+1));
                                ok = true;
                                Magazin.this.Cos_cumparaturi.add("Laptop varianta " + (i+1));
                            }
                        }
                        if (!ok) {
                            JOptionPane.showMessageDialog((Component) null, "Nu ati selectat nici un laptop.");
                        }
                    }
                });
            }
        });
        personalizarePCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                final ArrayList<JRadioButton> r = new ArrayList();
                ArrayList<Intel> intel = new ArrayList<Intel>();
                ArrayList<AMD> amd = new ArrayList<AMD>();
                ArrayList<PlacaVideo> placaVideo = new ArrayList<PlacaVideo>();
                ArrayList<HDD> hdd = new ArrayList<HDD>();
                ArrayList<SSD> ssd = new ArrayList<SSD>();

                JButton btn_aleg_component = new JButton("Alegere categorie");
                r.add(new JRadioButton("Procesor"));
                r.add(new JRadioButton("Memorie"));
                r.add(new JRadioButton("Placa Video"));
                ButtonGroup g = new ButtonGroup();
                g.add((AbstractButton) r.get(0));
                g.add((AbstractButton) r.get(1));
                g.add((AbstractButton) r.get(2));
                JPanel panel = new JPanel();
                JDialog d = new JDialog();
                d.setLocation(300, 100);
                panel.setPreferredSize(new Dimension(800, 600));
                panel.setLayout(new FlowLayout());
                panel.add(new JLabel(new ImageIcon("Procesor.jpg")));
                panel.add((Component) r.get(0));
                panel.add(new JLabel(new ImageIcon("Memorie.jpg")));
                panel.add((Component) r.get(1));
                panel.add(new JLabel(new ImageIcon("Placa video.jpg")));
                panel.add((Component) r.get(2));
                panel.add(btn_aleg_component);
                d.add(panel);
                d.pack();
                d.setVisible(true);
                btn_aleg_component.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int ok = -1;
                        for (int i = 0; i < r.size(); i++) {
                            if (r.get(i).isSelected()) {
                                ok = i;
                            }
                        }
                        if (ok == -1) {
                            JOptionPane.showMessageDialog(null, "Nu ati ales o componenta!");
                        }

                        if (ok == 0) {
                            JPanel panel = new JPanel();
                            JDialog d1 = new JDialog();
                            d1.setLocation(550, 150);
                            panel.setPreferredSize(new Dimension(230, 300));
                            panel.setLayout(new FlowLayout(FlowLayout.CENTER));
                            ButtonGroup g1 = new ButtonGroup();

                            Intel intel1 = new Intel();
                            AMD amd1 = new AMD();
                            String[] tip_p = {intel1.INTEL_CORE_I3, intel1.INTEL_CORE_I5, intel1.INTEL_CORE_I7, amd1.RYZEN3, amd1.RYZEN5, amd1.RYZEN7, amd1.RYZEN9};
                            JComboBox cb1 = new JComboBox(tip_p);
                            cb1.setBounds(100, 100, 100, 20);
                            JSpinner sp_nuclee = new JSpinner(new SpinnerNumberModel(0, 0, 20, 2));
                            JSpinner sp_frecventa = new JSpinner(new SpinnerNumberModel(0, 0, 4500, 500));
                            String[] suport_m = {"DDR3", "DDR3L", "DDR3L", "DDR4"};
                            JComboBox cb2 = new JComboBox(suport_m);
                            JButton btn_gata = new JButton("Seteaza procesorul");

                            panel.add(new JLabel("Tip procesor"));
                            panel.add(cb1);
                            panel.add(new JLabel("Numar nuclee"));
                            panel.add(sp_nuclee);
                            panel.add(new JLabel("Frecevanta(in MHZ)"));
                            panel.add(sp_frecventa);
                            panel.add(new JLabel("Suport memorie procesor"));
                            panel.add(cb2);
                            panel.add(btn_gata);
                            d1.add(panel);
                            d1.pack();
                            d1.setVisible(true);
                            btn_gata.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    int ok = -1;
                                    int optiune;
                                    for (optiune = 0; optiune < r.size() && ok == -1; ++optiune) {
                                        if (((JRadioButton) r.get(optiune)).isSelected()) {
                                            ok = optiune;
                                        }
                                    }

                                    if (sp_nuclee.getValue().equals(0)) {
                                        JOptionPane.showMessageDialog((Component) null, "Nu ati introdus nr de nuclee!");
                                    } else if (sp_frecventa.getValue().equals(0)) {
                                        JOptionPane.showMessageDialog((Component) null, "Nu ati introdus frcventa!");
                                    } else {
                                        optiune = JOptionPane.showConfirmDialog((Component) null, "Sunteti sigur ca doriti sa plasati produsul in cos?", "Confirmare produs", 1, 3);
                                        if (optiune == 0) {
                                            Magazin.this.Cos_cumparaturi.add("Procesor " + cb1.getSelectedItem() + "cu frecventa de " + sp_frecventa.getValue() + ", nr nuclee: " + sp_nuclee.getValue() + " si suport memorie "+ cb2.getSelectedItem() );
                                            JOptionPane.showMessageDialog((Component) null, "Produsul a fost adaugat in cos");
                                        } else {
                                            JOptionPane.showMessageDialog((Component) null, "Produsul nu a fost adaugat in cos");
                                        }
                                    }
                                }
                            });
                        }


                        if (ok == 1) {
                            JPanel panel = new JPanel();
                            JDialog d1 = new JDialog();
                            d1.setLocation(550, 150);
                            panel.setPreferredSize(new Dimension(350, 200));
                            panel.setLayout(new FlowLayout(FlowLayout.CENTER));
                            ButtonGroup g1 = new ButtonGroup();
                            ArrayList<JRadioButton> memorie = new ArrayList<JRadioButton>();
                            memorie.add(new JRadioButton("RAM"));
                            memorie.add(new JRadioButton("ROM"));
                            g1.add(memorie.get(0));
                            g1.add(memorie.get(1));
                            JButton btn_alege_mem = new JButton("Alege memorie");

                            panel.add(new JLabel("ALegeti tipul de memorie pe care doriti sa il personalizati"));
                            panel.add(memorie.get(0));
                            panel.add(memorie.get(1));
                            panel.add(btn_alege_mem);
                            d1.add(panel);
                            d1.pack();
                            d1.setVisible(true);
                            btn_alege_mem.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    if (!memorie.get(0).isSelected() && !memorie.get(1).isSelected()) {
                                        JOptionPane.showMessageDialog(null, "Nu ati ales nici un tip de memorie");
                                    } else {
                                        if (memorie.get(0).isSelected()) {
                                            JDialog d2 = new JDialog();
                                            d2.setLocation(600, 150);
                                            JPanel panel = new JPanel();
                                            panel.setLayout(new FlowLayout());
                                            panel.setPreferredSize(new Dimension(250, 300));


                                            String[] tip_ram = {"DDR2", "DDR3", "DDR4", "DDR5"};
                                            JComboBox cb_tip = new JComboBox(tip_ram);
                                            JSpinner frecventa = new JSpinner(new SpinnerNumberModel(0, 0, 4500, 500));
                                            String[] capacitate = {"2", "4", "8", "16", "32", "64", "128", "256"};
                                            JComboBox cb_capacitate = new JComboBox(capacitate);
                                            JButton btn_set_mem_ram = new JButton("Setare memorie RAM");

                                            panel.add(new JLabel("Alegeti tipul de memorie RAM dorit"));
                                            panel.add(new JLabel("Tip memorie: "));
                                            panel.add(cb_tip);
                                            panel.add(new JLabel("Frecventa (in MHZ): "));
                                            panel.add(frecventa);
                                            panel.add(new JLabel("Capacitate memorie: "));
                                            panel.add(cb_capacitate);
                                            panel.add(btn_set_mem_ram);

                                            d2.add(panel);
                                            d2.pack();
                                            d2.setVisible(true);
                                            btn_set_mem_ram.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    int ok = -1;
                                                    int optiune;
                                                    for (optiune = 0; optiune < r.size() && ok == -1; ++optiune) {
                                                        if (((JRadioButton) r.get(optiune)).isSelected()) {
                                                            ok = optiune;
                                                        }
                                                    }

                                                    if (frecventa.getValue().equals(0)) {
                                                        JOptionPane.showMessageDialog((Component) null, "Nu ati introdus frecventa!");
                                                    } else {
                                                        optiune = JOptionPane.showConfirmDialog((Component) null, "Sunteti sigur ca doriti sa plasati produsul in cos?", "Confirmare produs", 1, 3);
                                                        if (optiune == 0) {
                                                            Magazin.this.Cos_cumparaturi.add("Memorie " + cb_tip.getSelectedItem() + " cu frecventa de " + frecventa.getValue() + " si capacitatea de  "+ cb_capacitate.getSelectedItem() );
                                                            JOptionPane.showMessageDialog((Component) null, "Produsul a fost adaugat in cos");
                                                        } else {
                                                            JOptionPane.showMessageDialog((Component) null, "Produsul nu a fost adaugat in cos");
                                                        }
                                                    }
                                                }
                                            });
                                        } else {
                                            JDialog d2 = new JDialog();
                                            d2.setLocation(500, 150);
                                            JPanel panel = new JPanel();
                                            panel.setLayout(new FlowLayout());
                                            panel.setPreferredSize(new Dimension(400, 300));


                                            String[] tip_rom = {"HDD", "SSD"};
                                            JComboBox cb_tip = new JComboBox(tip_rom);
                                            JSpinner frecventa = new JSpinner(new SpinnerNumberModel(0, 0, 4500, 500));
                                            String[] capacitate = {"2", "4", "8", "16", "32", "64", "128", "256"};
                                            JComboBox cb_capacitate = new JComboBox(capacitate);
                                            JTextField dimensiune = new JTextField();
                                            dimensiune.setPreferredSize(new Dimension(60, 30));
                                            JTextField brand = new JTextField();
                                            brand.setPreferredSize(new Dimension(60, 30));
                                            JButton btn_set_mem_rom = new JButton("Setare memorie ROM");

                                            panel.add(new JLabel("Alegeti tipul de memorie ROM dorit"));
                                            panel.add(new JLabel("Tip memorie: "));
                                            panel.add(cb_tip);
                                            panel.add(new JLabel("Frecventa (in MHZ): "));
                                            panel.add(frecventa);
                                            panel.add(new JLabel("Capacitate memorie: "));
                                            panel.add(cb_capacitate);
                                            panel.add(new JLabel("Dimensiune (variante disponibile: 1.2, 2, 3.5 inch.)"));
                                            panel.add(dimensiune);
                                            panel.add(new JLabel("Brand (disponibil Samsung, Kingstone, Adata)"));
                                            panel.add(brand);
                                            panel.add(btn_set_mem_rom);

                                            d2.add(panel);
                                            d2.pack();
                                            d2.setVisible(true);
                                            btn_set_mem_rom.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    int ok = -1;
                                                    int optiune;
                                                    for (optiune = 0; optiune < r.size() && ok == -1; ++optiune) {
                                                        if (((JRadioButton) r.get(optiune)).isSelected()) {
                                                            ok = optiune;
                                                        }
                                                    }
                                                    if (frecventa.getValue().equals(0)) {
                                                        JOptionPane.showMessageDialog((Component) null, "Nu ati introdus frcventa!");
                                                    }
                                                    else if(dimensiune.getText().isEmpty()){
                                                        JOptionPane.showMessageDialog((Component) null, "Nu ati introdus dimensiunea!");
                                                    }
                                                    else if(brand.getText().isEmpty()){
                                                        JOptionPane.showMessageDialog((Component) null, "Nu ati introdus brandul!");
                                                    }
                                                    else {
                                                        optiune = JOptionPane.showConfirmDialog((Component) null, "Sunteti sigur ca doriti sa plasati produsul in cos?", "Confirmare produs", 1, 3);
                                                        if (optiune == 0) {
                                                            Magazin.this.Cos_cumparaturi.add("Memorie " + cb_tip.getSelectedItem() + " de la " + brand.getText()  + " cu frecventa de " + frecventa.getValue() + " ,dimensiunea de "+ dimensiune.getText() + " si capacitatea de  "+ cb_capacitate.getSelectedItem()  );

                                                            JOptionPane.showMessageDialog((Component) null, "Produsul a fost adaugat in cos");
                                                        } else {
                                                            JOptionPane.showMessageDialog((Component) null, "Produsul nu a fost adaugat in cos");
                                                        }
                                                    }
                                                }
                                            });
                                        }
                                    }
                                }
                            });
                        }

                        if (ok == 2) {
                            JPanel panel = new JPanel();
                            JDialog d1 = new JDialog();
                            d1.setLocation(550, 150);
                            panel.setPreferredSize(new Dimension(280, 200));
                            panel.setLayout(new FlowLayout(FlowLayout.CENTER));
                            JButton btn_seteaza_placa = new JButton("Seteaza placa video");
                            PlacaVideo placa = new PlacaVideo();
                            String[] brand = {placa.NVIDIA, placa.AMD};
                            JComboBox cb_brand = new JComboBox(brand);
                            JSpinner sp_tech_fabr = new JSpinner(new SpinnerNumberModel(0, 0, 20, 2));
                            String[] tip_mem = {"DDR4", "GDDR", "GDDR2", "GDDR3", "GDDR5"};
                            JComboBox cb_tip_mem = new JComboBox(tip_mem);
                            String[] cap_mem = {"1", "4", "8", "16"};
                            JComboBox cb_cap_mem = new JComboBox(cap_mem);
                            JSpinner frecventa = new JSpinner(new SpinnerNumberModel(0, 0, 4500, 500));

                            panel.add(new JLabel("ALegeti tipul de placa video.      "));
                            panel.add(new JLabel("Brand placa video"));
                            panel.add(cb_brand);
                            panel.add(new JLabel("Tehnologie de fabricatie (in nm)"));
                            panel.add(sp_tech_fabr);
                            panel.add(new JLabel("Tip memorie placa video"));
                            panel.add(cb_tip_mem);
                            panel.add(new JLabel("Capacitate memorie placa video (in GB)"));
                            panel.add(cb_cap_mem);
                            panel.add(new JLabel("Frecventa"));
                            panel.add(frecventa);
                            panel.add(btn_seteaza_placa);
                            d1.add(panel);
                            d1.pack();
                            d1.setVisible(true);
                            btn_seteaza_placa.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    int ok = -1;
                                    int optiune;
                                    for (optiune = 0; optiune < r.size() && ok == -1; ++optiune) {
                                        if (((JRadioButton) r.get(optiune)).isSelected()) {
                                            ok = optiune;
                                        }
                                    }
                                    if (sp_tech_fabr.getValue().equals(0)) {
                                        JOptionPane.showMessageDialog((Component) null, "Nu ati introdus tehnologia de fabricate!");
                                    } else if (frecventa.getValue().equals(0)) {
                                        JOptionPane.showMessageDialog((Component) null, "Nu ati introdus frecventa!");
                                    } else {
                                        optiune = JOptionPane.showConfirmDialog((Component) null, "Sunteti sigur ca doriti sa plasati produsul in cos?", "Confirmare produs", 1, 3);
                                        if (optiune == 0) {
                                            Magazin.this.Cos_cumparaturi.add("Placa video " + cb_brand.getSelectedItem() + " cu memoria de " + cb_tip_mem.getSelectedItem() + "  capacitatea de  "+ cb_cap_mem.getSelectedItem() + " tehnologia de fabricatie " + sp_tech_fabr.getValue() + " si frecventa de " + frecventa.getValue()  );

                                            JOptionPane.showMessageDialog((Component) null, "Produsul a fost adaugat in cos");
                                        } else {
                                            JOptionPane.showMessageDialog((Component) null, "Produsul nu a fost adaugat in cos");
                                        }
                                    }
                                }
                            });
                        }
                    }
                });
            }
        });
        cosCumparaturiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog df = new JDialog();
                JPanel panel = new JPanel();
                panel.setPreferredSize(new Dimension(600, 500));
                panel.setLayout(new FlowLayout());
                if (!Magazin.this.Cos_cumparaturi.isEmpty()) {
                    for(int i = 0; i <Magazin.this.Cos_cumparaturi.size(); ++i) {
                        panel.add(new JLabel((String)Magazin.this.Cos_cumparaturi.get(i)));
                    }

                } else {
                    panel.add(new JLabel("Cosul de cumparaturi este gol."));
                }

                df.add(panel);
                df.pack();
                df.setVisible(true);
            }
        });
    }






                    public static void main(String args[]) {
                        JFrame frame = new JFrame("MagazinPC");
                        frame.setContentPane(new Magazin().rootPanel);
                        frame.setBounds(500, 150, 500, 500);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setVisible(true);


                    }
            }
