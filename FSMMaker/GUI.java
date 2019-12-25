import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
public class GUI extends JFrame implements ActionListener
{
    String[] chList =
    {
      "Captain Falcon", "Donkey Kong", "Fox", "Game & Watch", 
      "Kirby", "Bowser", "Link", "Luigi", 
      "Mario", "Marth", "Mewtwo", "Ness", 
      "Peach", "Pikachu", "Ice Climbers", "Jigglypuff", 
      "Samus", "Yoshi", "Zelda", "Sheik", 
      "Falco", "Young Link", "Dr Mario", "Roy", 
      "Pichu", "Ganondorf", "Popo"
    };
    
    public ArrayList<String> fsmList = new ArrayList<>();
    public ArrayList<String> sfsmList = new ArrayList<>();
    
    String cID = "00";
    String fr = "0";
    String sID = "00A";
    String mlt = "3F800000";
    String FSM = "";
    
    String scID = "Captain Falcon";
    String sfr = "0";
    String ssID = "10";
    String smlt = "1";
    String sFSM = "";
    
    JTextArea FSMTextArea = new JTextArea();
    
    JButton makeFSM = new JButton("Make FSM");
    JButton addFSM = new JButton("Add FSM");
    JButton saveFSMs = new JButton("Save FSMs");
    
    JComboBox chBox = new JComboBox(chList);
    JComboBox subBox = new JComboBox(CaptainFalcon.subList);
    JTextField frmField = new JTextField();
    JTextField fltField = new JTextField();
    JTextField FSMField = new JTextField();
    
    /**
     * Creates and displays the GUI with all its components.
     */
    public GUI()
    {
        super("FSM Maker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 500);
        this.setLayout(null);
        
        makeFSM.setBounds(10, 10, 150, 40);
        makeFSM.addActionListener(this);
        
        addFSM.setBounds(160, 10, 150, 40);
        addFSM.addActionListener(this);
        
        saveFSMs.setBounds(310, 10, 150, 40);
        saveFSMs.addActionListener(this);
        
        FSMTextArea.setBounds(470, 150, 300, 250);
        FSMTextArea.setEditable(false);
        
        chBox.setSelectedIndex(0);
        chBox.addActionListener(this);
        chBox.setEditable(false);
        chBox.setBounds(10, 90, 150, 30);
        JTextField charDis = new JTextField("Character");
        charDis.setBounds(10, 60, 150, 30);
        charDis.setEditable(false);
        
        subBox.setSelectedIndex(0);
        subBox.addActionListener(this);
        subBox.setEditable(false);
        subBox.setBounds(160, 90, 250, 30);
        JTextField subDis = new JTextField("Subaction");
        subDis.setBounds(160, 60, 250, 30);
        subDis.setEditable(false);
        
        frmField.setBounds(410, 90, 40, 30);
        frmField.setText(fr);
        JTextField frmDis = new JTextField("Frame");
        frmDis.setBounds(410, 60, 40, 30);
        frmDis.setEditable(false);
        
        fltField.setBounds(450, 90, 150, 30);
        fltField.setText("1");
        JTextField fltDis = new JTextField("Multiplier");
        fltDis.setBounds(450, 60, 150, 30);
        fltDis.setEditable(false);
        
        FSMField.setBounds(620, 90, 150, 30);
        FSMField.setEditable(false);
        FSMField.setText(FSM);
        JTextField FSMDis = new JTextField("FSM");
        FSMDis.setBounds(620, 60, 150, 30);
        FSMDis.setEditable(false);
        
        this.add(makeFSM);
        this.add(addFSM);
        this.add(saveFSMs);
        this.add(FSMTextArea);
        this.add(chBox);
        this.add(subBox);
        this.add(frmField);
        this.add(fltField);
        this.add(FSMField);
        this.add(charDis);
        this.add(subDis);
        this.add(frmDis);
        this.add(fltDis);
        this.add(FSMDis);
        this.setVisible(true);
    }
    public void updateFSMList()
    {
        FSMTextArea.setText(""); String s = "";
        for (int i = 0; i < fsmList.size(); i++)
        {
            s += fsmList.get(i).substring(0, 2);
            for (int p = 2; p < fsmList.get(i).length(); p++)
            {
                if (p % 2 == 0)
                {
                    s += " ";
                    s += fsmList.get(i).charAt(p);
                }
                else
                    s += fsmList.get(i).charAt(p);
            }
            if (i % 2 == 1)    
                FSMTextArea.append(s + "\n");
            else
                FSMTextArea.append(s + " ");
            s = "";
        }
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == makeFSM)
        {
            try
            {
                if (!frmField.getText().isEmpty() && 
                !fltField.getText().isEmpty())
                {
                    int a = Integer.parseInt(frmField.getText());
                    sfr = "" + a;
                    smlt = fltField.getText();
                    mlt = Special.toHex(fltField.getText());
                    scID = (String)chBox.getSelectedItem();
                    ssID = (String)subBox.getSelectedItem();
                    if (a < 256 && a > -1)
                    {   
                        fr = Integer.toString(a, 16).toUpperCase();
                        if (fr.length() < 2)
                            fr = "0" + fr;
                        FSM = cID + fr + "8" + sID + mlt;
                        sFSM = scID + ", " + ssID + ", " + smlt + ", " + sfr;
                        FSMField.setText(FSM);
                    }
                }
            }
            catch (Exception ex)
            {
                if (!frmField.getText().isEmpty() && 
                !fltField.getText().isEmpty())
                {
                    int a = Integer.parseInt(frmField.getText());
                    sfr = "" + a;
                    smlt = fltField.getText();
                    mlt = Special.toHex(fltField.getText());
                    scID = (String)chBox.getSelectedItem();
                    ssID = (String)subBox.getSelectedItem();
                    if (a < 256 && a > -1)
                    {   
                        fr = Integer.toString(a, 16).toUpperCase();
                        if (fr.length() < 2)
                            fr = "0" + fr;
                        FSM = cID + fr + "8" + sID + mlt;
                        sFSM = scID + ", " + ssID + ", " + smlt + ", " + sfr;
                        FSMField.setText(FSM);
                    }
                }
            }
        }
        else if (e.getSource() == addFSM)
        {
            fsmList.add(FSM);
            sfsmList.add(sFSM);
            Special.sortFSMList(fsmList, sfsmList);
            updateFSMList();
        }
        else if (e.getSource() == saveFSMs)
        {
            Special.createFile(fsmList, sfsmList);
        }
        else if ((JComboBox)e.getSource() == chBox)
        {
            try
            {
                String ch = (String)chBox.getSelectedItem();
                switch (ch)
                {
                    case "Captain Falcon":
                    cID = "00";
                    subBox.removeAllItems();
                    for (int i = 0; i < CaptainFalcon.subList.length; i++)
                        subBox.addItem(CaptainFalcon.subList[i]);
                    break;
                    case "Donkey Kong":
                    cID = "01";
                    subBox.removeAllItems();
                    for (int i = 0; i < DonkeyKong.subList.length; i++)
                        subBox.addItem(DonkeyKong.subList[i]);
                    break;
                    case "Fox":
                    cID = "02";
                    subBox.removeAllItems();
                    for (int i = 0; i < Fox.subList.length; i++)
                        subBox.addItem(Fox.subList[i]);
                    break;
                    case "Game & Watch":
                    cID = "03";
                    subBox.removeAllItems();
                    for (int i = 0; i < GameNWatch.subList.length; i++)
                        subBox.addItem(GameNWatch.subList[i]);
                    break;
                    case "Kirby":
                    cID = "04";
                    subBox.removeAllItems();
                    for (int i = 0; i < Kirby.subList.length; i++)
                        subBox.addItem(Kirby.subList[i]);
                    break;
                    case "Bowser":
                    cID = "05";
                    subBox.removeAllItems();
                    for (int i = 0; i < Bowser.subList.length; i++)
                        subBox.addItem(Bowser.subList[i]);
                    break;
                    case "Link":
                    cID = "06";
                    subBox.removeAllItems();
                    for (int i = 0; i < Link.subList.length; i++)
                        subBox.addItem(Link.subList[i]);
                    break;
                    case "Luigi":
                    cID = "07";
                    subBox.removeAllItems();
                    for (int i = 0; i < Luigi.subList.length; i++)
                        subBox.addItem(Luigi.subList[i]);
                    break;
                    case "Mario":
                    cID = "08";
                    subBox.removeAllItems();
                    for (int i = 0; i < Mario.subList.length; i++)
                        subBox.addItem(Mario.subList[i]);
                    break;
                    case "Marth":
                    cID = "09";
                    subBox.removeAllItems();
                    for (int i = 0; i < Marth.subList.length; i++)
                        subBox.addItem(Marth.subList[i]);
                    break;
                    case "Mewtwo":
                    cID = "0A";
                    subBox.removeAllItems();
                    for (int i = 0; i < Mewtwo.subList.length; i++)
                        subBox.addItem(Mewtwo.subList[i]);
                    break;
                    case "Ness":
                    cID = "0B";
                    subBox.removeAllItems();
                    for (int i = 0; i < Ness.subList.length; i++)
                        subBox.addItem(Ness.subList[i]);
                    break;
                    case "Peach":
                    cID = "0C";
                    subBox.removeAllItems();
                    for (int i = 0; i < Peach.subList.length; i++)
                        subBox.addItem(Peach.subList[i]);
                    break;
                    case "Pikachu":
                    cID = "0D";
                    subBox.removeAllItems();
                    for (int i = 0; i < Pikachu.subList.length; i++)
                        subBox.addItem(Pikachu.subList[i]);
                    break;
                    case "Ice Climbers":
                    cID = "0E";
                    subBox.removeAllItems();
                    for (int i = 0; i < IceClimbers.subList.length; i++)
                        subBox.addItem(IceClimbers.subList[i]);
                    break;
                    case "Jigglypuff":
                    cID = "0F";
                    subBox.removeAllItems();
                    for (int i = 0; i < Jigglypuff.subList.length; i++)
                        subBox.addItem(Jigglypuff.subList[i]);
                    break;
                    case "Samus":
                    cID = "10";
                    subBox.removeAllItems();
                    for (int i = 0; i < Samus.subList.length; i++)
                        subBox.addItem(Samus.subList[i]);
                    break;
                    case "Yoshi":
                    cID = "11";
                    subBox.removeAllItems();
                    for (int i = 0; i < Yoshi.subList.length; i++)
                        subBox.addItem(Yoshi.subList[i]);
                    break;
                    case "Zelda":
                    cID = "12";
                    subBox.removeAllItems();
                    for (int i = 0; i < Zelda.subList.length; i++)
                        subBox.addItem(Zelda.subList[i]);
                    break;
                    case "Sheik":
                    cID = "13";
                    subBox.removeAllItems();
                    for (int i = 0; i < Sheik.subList.length; i++)
                        subBox.addItem(Sheik.subList[i]);
                    break;
                    case "Falco":
                    cID = "14";
                    subBox.removeAllItems();
                    for (int i = 0; i < Falco.subList.length; i++)
                        subBox.addItem(Falco.subList[i]);
                    break;
                    case "Young Link":
                    cID = "15";
                    subBox.removeAllItems();
                    for (int i = 0; i < YoungLink.subList.length; i++)
                        subBox.addItem(YoungLink.subList[i]);
                    break;
                    case "Dr Mario":
                    cID = "16";
                    subBox.removeAllItems();
                    for (int i = 0; i < DrMario.subList.length; i++)
                        subBox.addItem(DrMario.subList[i]);
                    break;
                    case "Roy":
                    cID = "17";
                    subBox.removeAllItems();
                    for (int i = 0; i < Roy.subList.length; i++)
                        subBox.addItem(Roy.subList[i]);
                    break;
                    case "Pichu":
                    cID = "18";
                    subBox.removeAllItems();
                    for (int i = 0; i < Pichu.subList.length; i++)
                        subBox.addItem(Pichu.subList[i]);
                    break;
                    case "Ganondorf":
                    cID = "19";
                    subBox.removeAllItems();
                    for (int i = 0; i < Ganondorf.subList.length; i++)
                        subBox.addItem(Ganondorf.subList[i]);
                    break;
                    case "Popo":
                    cID = "1A";
                    subBox.removeAllItems();
                    for (int i = 0; i < Popo.subList.length; i++)
                        subBox.addItem(Popo.subList[i]);
                    break;
                }
            }
            catch (Exception ex)
            {
                String ch = (String)chBox.getSelectedItem();
                switch (ch)
                {
                    case "Captain Falcon":
                    cID = "00";
                    subBox.removeAllItems();
                    for (int i = 0; i < CaptainFalcon.subList.length; i++)
                        subBox.addItem(CaptainFalcon.subList[i]);
                    break;
                    case "Donkey Kong":
                    cID = "01";
                    subBox.removeAllItems();
                    for (int i = 0; i < DonkeyKong.subList.length; i++)
                        subBox.addItem(DonkeyKong.subList[i]);
                    break;
                    case "Fox":
                    cID = "02";
                    subBox.removeAllItems();
                    for (int i = 0; i < Fox.subList.length; i++)
                        subBox.addItem(Fox.subList[i]);
                    break;
                    case "Game & Watch":
                    cID = "03";
                    subBox.removeAllItems();
                    for (int i = 0; i < GameNWatch.subList.length; i++)
                        subBox.addItem(GameNWatch.subList[i]);
                    break;
                    case "Kirby":
                    cID = "04";
                    subBox.removeAllItems();
                    for (int i = 0; i < Kirby.subList.length; i++)
                        subBox.addItem(Kirby.subList[i]);
                    break;
                    case "Bowser":
                    cID = "05";
                    subBox.removeAllItems();
                    for (int i = 0; i < Bowser.subList.length; i++)
                        subBox.addItem(Bowser.subList[i]);
                    break;
                    case "Link":
                    cID = "06";
                    subBox.removeAllItems();
                    for (int i = 0; i < Link.subList.length; i++)
                        subBox.addItem(Link.subList[i]);
                    break;
                    case "Luigi":
                    cID = "07";
                    subBox.removeAllItems();
                    for (int i = 0; i < Luigi.subList.length; i++)
                        subBox.addItem(Luigi.subList[i]);
                    break;
                    case "Mario":
                    cID = "08";
                    subBox.removeAllItems();
                    for (int i = 0; i < Mario.subList.length; i++)
                        subBox.addItem(Mario.subList[i]);
                    break;
                    case "Marth":
                    cID = "09";
                    subBox.removeAllItems();
                    for (int i = 0; i < Marth.subList.length; i++)
                        subBox.addItem(Marth.subList[i]);
                    break;
                    case "Mewtwo":
                    cID = "0A";
                    subBox.removeAllItems();
                    for (int i = 0; i < Mewtwo.subList.length; i++)
                        subBox.addItem(Mewtwo.subList[i]);
                    break;
                    case "Ness":
                    cID = "0B";
                    subBox.removeAllItems();
                    for (int i = 0; i < Ness.subList.length; i++)
                        subBox.addItem(Ness.subList[i]);
                    break;
                    case "Peach":
                    cID = "0C";
                    subBox.removeAllItems();
                    for (int i = 0; i < Peach.subList.length; i++)
                        subBox.addItem(Peach.subList[i]);
                    break;
                    case "Pikachu":
                    cID = "0D";
                    subBox.removeAllItems();
                    for (int i = 0; i < Pikachu.subList.length; i++)
                        subBox.addItem(Pikachu.subList[i]);
                    break;
                    case "Ice Climbers":
                    cID = "0E";
                    subBox.removeAllItems();
                    for (int i = 0; i < IceClimbers.subList.length; i++)
                        subBox.addItem(IceClimbers.subList[i]);
                    break;
                    case "Jigglypuff":
                    cID = "0F";
                    subBox.removeAllItems();
                    for (int i = 0; i < Jigglypuff.subList.length; i++)
                        subBox.addItem(Jigglypuff.subList[i]);
                    break;
                    case "Samus":
                    cID = "10";
                    subBox.removeAllItems();
                    for (int i = 0; i < Samus.subList.length; i++)
                        subBox.addItem(Samus.subList[i]);
                    break;
                    case "Yoshi":
                    cID = "11";
                    subBox.removeAllItems();
                    for (int i = 0; i < Yoshi.subList.length; i++)
                        subBox.addItem(Yoshi.subList[i]);
                    break;
                    case "Zelda":
                    cID = "12";
                    subBox.removeAllItems();
                    for (int i = 0; i < Zelda.subList.length; i++)
                        subBox.addItem(Zelda.subList[i]);
                    break;
                    case "Sheik":
                    cID = "13";
                    subBox.removeAllItems();
                    for (int i = 0; i < Sheik.subList.length; i++)
                        subBox.addItem(Sheik.subList[i]);
                    break;
                    case "Falco":
                    cID = "14";
                    subBox.removeAllItems();
                    for (int i = 0; i < Falco.subList.length; i++)
                        subBox.addItem(Falco.subList[i]);
                    break;
                    case "Young Link":
                    cID = "15";
                    subBox.removeAllItems();
                    for (int i = 0; i < YoungLink.subList.length; i++)
                        subBox.addItem(YoungLink.subList[i]);
                    break;
                    case "Dr Mario":
                    cID = "16";
                    subBox.removeAllItems();
                    for (int i = 0; i < DrMario.subList.length; i++)
                        subBox.addItem(DrMario.subList[i]);
                    break;
                    case "Roy":
                    cID = "17";
                    subBox.removeAllItems();
                    for (int i = 0; i < Roy.subList.length; i++)
                        subBox.addItem(Roy.subList[i]);
                    break;
                    case "Pichu":
                    cID = "18";
                    subBox.removeAllItems();
                    for (int i = 0; i < Pichu.subList.length; i++)
                        subBox.addItem(Pichu.subList[i]);
                    break;
                    case "Ganondorf":
                    cID = "19";
                    subBox.removeAllItems();
                    for (int i = 0; i < Ganondorf.subList.length; i++)
                        subBox.addItem(Ganondorf.subList[i]);
                    break;
                    case "Popo":
                    cID = "1A";
                    subBox.removeAllItems();
                    for (int i = 0; i < Popo.subList.length; i++)
                        subBox.addItem(Popo.subList[i]);
                    break;
                }
            }
        }
        else if ((JComboBox)e.getSource() == subBox)
        {
            String ch = (String)chBox.getSelectedItem();
            String at = (String)subBox.getSelectedItem();
            switch (ch)
            {
                case "Captain Falcon": sID = CaptainFalcon.getSubactionID(at); break;
                case "Donkey Kong": sID = DonkeyKong.getSubactionID(at); break;
                case "Fox": sID = Fox.getSubactionID(at); break;
                case "Game & Watch": sID = GameNWatch.getSubactionID(at); break;
                case "Kirby": sID = Kirby.getSubactionID(at); break;
                case "Bowser": sID = Bowser.getSubactionID(at); break;
                case "Link": sID = Link.getSubactionID(at); break;
                case "Luigi": sID = Luigi.getSubactionID(at); break;
                case "Mario": sID = Mario.getSubactionID(at); break;
                case "Marth": sID = Marth.getSubactionID(at); break;
                case "Mewtwo": sID = Mewtwo.getSubactionID(at); break;
                case "Ness": sID = Ness.getSubactionID(at); break;
                case "Peach": sID = Peach.getSubactionID(at); break;
                case "Pikachu": sID = Pikachu.getSubactionID(at); break;
                case "Ice Climbers": sID = IceClimbers.getSubactionID(at); break;
                case "Jigglypuff": sID = Jigglypuff.getSubactionID(at); break;
                case "Samus": sID = Samus.getSubactionID(at); break;
                case "Yoshi": sID = Yoshi.getSubactionID(at); break;
                case "Zelda": sID = Zelda.getSubactionID(at); break;
                case "Sheik": sID = Sheik.getSubactionID(at); break;
                case "Falco": sID = Falco.getSubactionID(at); break;
                case "Young Link": sID = YoungLink.getSubactionID(at); break;
                case "Dr Mario": sID = DrMario.getSubactionID(at); break;
                case "Roy": sID = Roy.getSubactionID(at); break;
                case "Pichu": sID = Pichu.getSubactionID(at); break;
                case "Ganondorf": sID = Ganondorf.getSubactionID(at); break;
                case "Popo":  sID = Popo.getSubactionID(at); break;
            }
        }
    }
}
