package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicArrowButton;
import launcher.Start;
import map.Player;
import building.Building;
import building.Fishinghouse;
import building.Lumberjack;
import building.Wheatfield;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import map.Map;

public class Bar extends JInternalFrame {

    int width, height;
    static String Placement = null;
    HashMap<String, ImageIcon> icons;

    public Bar(int width, int height, Map m) {
        super();
        this.width = width;
        this.height = height;
        JTabbedPane tabs = new JTabbedPane(SwingConstants.TOP);
        
        // Icons laden
        icons = new HashMap<>();
        
        icons.put("fishinghouse", new ImageIcon("src/gui/res/building/fishinghouse.png"));
        icons.put("mine", new ImageIcon("src/gui/res/building/mine.png"));
        icons.put("townhall", new ImageIcon("src/gui/res/building/townhall.png"));
        icons.put("windmill", new ImageIcon("src/gui/res/building/windmill.png"));
        
        icons.put("warrior", new ImageIcon("src/gui/res/warrior1/idle/idle_1.png"));
        icons.put("archer", new ImageIcon("src/gui/res/archer/idel/archer_idel1.png"));
        icons.put("", new ImageIcon("src/gui/res/"));
        
        icons.put("empty", new ImageIcon("src/gui/res/"));
        
        

        this.setSize(width, height / 3);
        this.setLocation(0, height - height / 3);
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        // entfernt leiste bei tabbedpane
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        Color internalBorderColor = new Color(85, 53, 5);
        this.setBorder(BorderFactory.createLineBorder(internalBorderColor, 4));

        // widht -8 für "sauberen" Rahmen
        tabs.setPreferredSize(new Dimension(width - 8, height / 3));

        //Tab für Gebeude
        JPanel panelBuildings = new JPanel();
        panelBuildings.setLayout(null);

        JButton barracksButton = new JButton();
        barracksButton.setIcon(icons.get("empty"));
        barracksButton.setText("Barracks");
        barracksButton.setVerticalTextPosition(JButton.BOTTOM);
        barracksButton.setHorizontalTextPosition(JButton.CENTER);
        barracksButton.setSize(new Dimension(200, 200));
        barracksButton.setLocation(0, 0);
        barracksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("barracksButton pressed");
                Placement = "barracks";
            }
        });
        panelBuildings.add(barracksButton);

        JButton fishingButton = new JButton();
        fishingButton.setIcon(icons.get("fishinghouse"));
        fishingButton.setText("Fish");
        fishingButton.setVerticalTextPosition(JButton.BOTTOM);
        fishingButton.setHorizontalTextPosition(JButton.CENTER);
        fishingButton.setSize(new Dimension(200, 200));
        fishingButton.setLocation(200, 0);
        fishingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("warriorButton pressed");
            }
        });
        panelBuildings.add(fishingButton);

        JButton lumberjackButton = new JButton();
        lumberjackButton.setIcon(icons.get("empty"));
        lumberjackButton.setText("Lumberjack");
        lumberjackButton.setVerticalTextPosition(JButton.BOTTOM);
        lumberjackButton.setHorizontalTextPosition(JButton.CENTER);
        lumberjackButton.setSize(new Dimension(200, 200));
        lumberjackButton.setLocation(400, 0);
        lumberjackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("warriorButton pressed");
            }
        });
        panelBuildings.add(lumberjackButton);

        JButton mineButton = new JButton();
        mineButton.setIcon(icons.get("mine"));
        mineButton.setText("Mine");
        mineButton.setVerticalTextPosition(JButton.BOTTOM);
        mineButton.setHorizontalTextPosition(JButton.CENTER);
        mineButton.setSize(new Dimension(200, 200));
        mineButton.setLocation(600, 0);
        mineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("warriorButton pressed");
            }
        });
        panelBuildings.add(mineButton);

        JButton theatreButton = new JButton();
        theatreButton.setIcon(icons.get("empty"));
        theatreButton.setText("Theatre");
        theatreButton.setVerticalTextPosition(JButton.BOTTOM);
        theatreButton.setHorizontalTextPosition(JButton.CENTER);
        theatreButton.setSize(new Dimension(200, 200));
        theatreButton.setLocation(800, 0);
        theatreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("warriorButton pressed");
            }
        });
        panelBuildings.add(theatreButton);

        JButton tower = new JButton();
        tower.setIcon(icons.get("empty"));
        tower.setText("Tower");
        tower.setVerticalTextPosition(JButton.BOTTOM);
        tower.setHorizontalTextPosition(JButton.CENTER);
        tower.setSize(new Dimension(200, 200));
        tower.setLocation(1000, 0);
        tower.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("warriorButton pressed");
            }
        });
        panelBuildings.add(tower);

        JButton townhallButton = new JButton();
        townhallButton.setIcon(icons.get("townhall"));
        townhallButton.setText("Townhall");
        townhallButton.setVerticalTextPosition(JButton.BOTTOM);
        townhallButton.setHorizontalTextPosition(JButton.CENTER);
        townhallButton.setSize(new Dimension(200, 200));
        townhallButton.setLocation(1200, 0);
        townhallButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("warriorButton pressed");
            }
        });
        panelBuildings.add(townhallButton);

        JButton wheatfieldButton = new JButton();
        wheatfieldButton.setIcon(icons.get("empty"));
        wheatfieldButton.setText("Wheatfield");
        wheatfieldButton.setVerticalTextPosition(JButton.BOTTOM);
        wheatfieldButton.setHorizontalTextPosition(JButton.CENTER);
        wheatfieldButton.setSize(new Dimension(200, 200));
        wheatfieldButton.setLocation(1400, 0);
        wheatfieldButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("warriorButton pressed");
            }
        });
        panelBuildings.add(wheatfieldButton);
        
        JButton windmillButton = new JButton();
        windmillButton.setIcon(icons.get("windmill"));
        windmillButton.setText("Windmill");
        windmillButton.setVerticalTextPosition(JButton.BOTTOM);
        windmillButton.setHorizontalTextPosition(JButton.CENTER);
        windmillButton.setSize(new Dimension(200, 200));
        windmillButton.setLocation(1400, 0);
        windmillButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("warriorButton pressed");
            }
        });
        panelBuildings.add(windmillButton);

        //Tab für die Auswahl von Truppen
        JPanel panelTroops = new JPanel();
        panelTroops.setLayout(null);

        JButton warriorButton = new JButton();
        warriorButton.setIcon(icons.get("warrior"));
        warriorButton.setText("test");
        warriorButton.setVerticalTextPosition(JButton.BOTTOM);
        warriorButton.setHorizontalTextPosition(JButton.CENTER);
        warriorButton.setSize(new Dimension(200, 200));
        warriorButton.setLocation(0, 0);
        warriorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("warriorButton pressed");
                Placement = "warrior";
            }
        });
        panelTroops.add(warriorButton);

        JButton archer = new JButton();
        archer.setIcon(icons.get("archer"));
        archer.setText("archer");
        archer.setVerticalTextPosition(JButton.BOTTOM);
        archer.setHorizontalTextPosition(JButton.CENTER);
        archer.setSize(new Dimension(200, 200));
        archer.setLocation(200, 0);
        archer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("archer pressed");
            }
        });
        panelTroops.add(archer);

        JButton catapult = new JButton();
        catapult.setIcon(icons.get("empty"));
        catapult.setText("catapult");
        catapult.setVerticalTextPosition(JButton.BOTTOM);
        catapult.setHorizontalTextPosition(JButton.CENTER);
        catapult.setSize(new Dimension(200, 200));
        catapult.setLocation(400, 0);
        catapult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("catapult pressed");
            }
        });
        panelTroops.add(catapult);

        JButton horse = new JButton();
        horse.setIcon(icons.get("empty"));
        horse.setText("horse");
        horse.setVerticalTextPosition(JButton.BOTTOM);
        horse.setHorizontalTextPosition(JButton.CENTER);
        horse.setSize(new Dimension(200, 200));
        horse.setLocation(600, 0);
        horse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("horse pressed");
            }
        });
        panelTroops.add(horse);

        // Tab für das Beenden eines Zuges
        JPanel panelTurn = new JPanel();
        JButton EndTurn = new JButton("End Turn");
        EndTurn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Runden Button Turn End noch init
                // Das in ActionPerformed vom ButtonTurnEnd übernehmen
                Player[] players = Start.getPlayers();
                for (int i = 0; i < players.length; i++) {
                    if (players[i].isAtTurn()) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException ex) {
                        }
                        for (int q = 0; q < players[i].getCharacterAmount(); q++) {
                            players[i].setCharacterMovementAllowed(q);
                        }
                        players[i].setAtTurn(false);
                        if (i + 1 == players.length) {
                            players[0].setAtTurn(true);
                            MainWindow.AtTurn.setText("Am Zug:" + players[0].getPlayername());
                            MainWindow.AtTurn.setBackground(players[0].getColour());
                            //recourcen auffuellen
                            for (int j = 0; j < players[0].getBuildingAmount(); j++) {
                                Building build = players[0].getBuilding2(j);
                                switch (build.getbuilding(build)) {
                                    case 1:
                                        Lumberjack lumb = (Lumberjack) (build);
                                        lumb.woodchop(players[0], m);
                                        break;
                                    case 2:
                                        Fishinghouse fish = (Fishinghouse) (build);
                                        fish.fish(players[0]);
                                        break;
                                    case 3:
                                        Wheatfield weed = (Wheatfield) (build);
                                        //lel hier bidde noch ma neu machen
                                        weed.harvest();
                                        break;
                                }
                            }
                        } else {
                            players[i + 1].setAtTurn(true);
                            MainWindow.AtTurn.setText("Am Zug:" + players[i + 1].getPlayername());
                            MainWindow.AtTurn.setBackground(players[i + 1].getColour());
                            //recourcen auffuellen
                            for (int j = 0; j < players[1].getBuildingAmount(); j++) {
                                Building build = players[0].getBuilding2(j);
                                switch (build.getbuilding(build)) {
                                    case 1:
                                        Lumberjack lumb = (Lumberjack) (build);
                                        lumb.woodchop(players[0], m);
                                        break;
                                    case 2:
                                        Fishinghouse fish = (Fishinghouse) (build);
                                        fish.fish(players[1]);
                                        break;
                                    case 3:
                                        Wheatfield weed = (Wheatfield) (build);
                                        //harvest mehtode bidde neu
                                        weed.harvest();
                                        break;
                                }
                            }
                        }
                        break;
                    }
                }
                for (int i = 0; i < players.length; i++) {
                    Player.checkElements(players[i]);
                }

            }
        });
        panelTurn.add(EndTurn);

        tabs.addTab("Gebäude", panelBuildings);
        tabs.addTab("Truppen", panelTroops);
        tabs.addTab("End Turn", panelTurn);
        tabs.setVisible(true);

        this.add(tabs);
        this.requestFocus();

        // immer am Ende
        this.setVisible(true);
    }

    public BasicArrowButton closeBarButton() {
        BasicArrowButton close = new BasicArrowButton(BasicArrowButton.SOUTH);
        close.setLocation(width - 50, height - height / 3 - 20);
        close.setText("v");
        close.setSize(50, 20);
        close.setVisible(true);
        return close;
    }

    public BasicArrowButton openBarButton() {
        BasicArrowButton open = new BasicArrowButton(BasicArrowButton.NORTH);
        open.setLocation(width - 50, height - 20);
        open.setSize(50, 20);
        open.setVisible(true);
        return open;
    }

    // Anzeige wer am Zug ist, noch Text zentrieren
    public JLabel AtTurn() {
        JLabel AtTurn = new JLabel();
        AtTurn.setLocation(width / 2 - 100, 20);
        AtTurn.setSize(200, 40);
        AtTurn.setOpaque(true);
        AtTurn.setBackground(Color.cyan);
        AtTurn.setText("Am Zug: Spieler 1");
        //AtTurn.setHorizontalTextPosition(JLabel.CENTER);
        AtTurn.setVisible(true);
        return AtTurn;
    }

    public static String getPlacement() {
        return Placement;
    }

    public static void setPlacement(String i) {
        Placement = i;
    }
    
    public Image getIconImage(String name){
        
        if (!icons.containsKey(name)){
            System.out.println("Dieses Icon existiert nicht!");
            return icons.get("empty").getImage();
        }
        
        return icons.get(name).getImage();
    }

    public JPanel minimap() {
        JPanel minimap = new JPanel();
        minimap.setLocation(width - 50, 0);
        minimap.setSize(50, 50);
        minimap.setBackground(Color.orange);
        minimap.setBorder(BorderFactory.createLineBorder(Color.black));
        minimap.setVisible(true);
        return minimap;
    }

}