import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


class pica extends JFrame{

    private Component Picas;
    private JRadioButton lidz, pie;	
    private ButtonGroup group;
    private JLabel delivery_type, vards, adrese, pica_Label, pica2_Label, izmers_label, izmers2_label, nummurs, piedevas_label, daudzums_label;
    private JTextField vards_tf, adrese_tf, nummurs_tf;
    private JPanel input_panel, delivery_panel, piedevas_panel, piedevas2_panel, daudzums_panel, pica_panel, izmers_panel, initial_panel, buttons_panel;
    private JPanel pied1_panel, pied2_panel;
    private JCheckBox top_sipoli, top_senes, top_brokolis, top_kokuruza, top_salami, top_siers;
    private JComboBox quantity_box, picas_box, lielums_Box;
    public Double a, sum = 0.0;
    public String b, c;

    private JLabel quantity_op_label, quantity_op, pica_op, lielums_op;
    private JButton print, clear, calculate;
    private ImageIcon print_icon, clear_icon;
    private JLabel name_op, address_op, contact_op;
    String name_str, address_str, contact_str;
    private JLabel vards2, adrese2, nummurs2;


	public pica() {
		super("Pizza Palace");
		setLayout(new FlowLayout(FlowLayout.CENTER, 30, 15));
		initial_panel = new JPanel();
		initial_panel.setLayout(new GridLayout(2, 1));		
			
			
		add(initial_panel);	
	}

    public void Input(){
        input_panel = new JPanel();
        input_panel.setLayout(new GridLayout(5, 2, 5, 5));

        delivery_panel = new JPanel();
        delivery_panel.setLayout(new GridLayout(1, 3));

        delivery_type = new JLabel("Pasūtijma veids:");
        lidz = new JRadioButton("Līdzņemšana");
        lidz.setActionCommand("lidz");
        pie = new JRadioButton("Pasūtījums");
        pie.setActionCommand("pie");

        group = new ButtonGroup();
        group.add(lidz);
        group.add(pie);
        delivery_panel.add(lidz);
        delivery_panel.add(pie);

        input_panel.add(delivery_type);
        input_panel.add(delivery_panel);

        vards = new JLabel("Vārds");
        adrese = new JLabel("Adrese");
        nummurs = new JLabel("Kontakta Nummurs");
        vards_tf = new JTextField("", 10);
        adrese_tf = new JTextField("", 20);
        nummurs_tf = new JTextField("", 10);
        input_panel.add(vards);
        input_panel.add(vards_tf);
        input_panel.add(adrese);
        input_panel.add(adrese_tf);
        input_panel.add(nummurs);
        input_panel.add(nummurs_tf);

        add(input_panel);

    }


    public void Piedevas(){
        pied1_panel = new JPanel();
        pied1_panel.setLayout(new GridLayout(1, 3));

        pied2_panel = new JPanel();
		pied2_panel.setLayout(new GridLayout(1, 3));
		
		piedevas_panel = new JPanel();
		piedevas_panel.setLayout(new GridLayout(2, 1));
		
		piedevas2_panel = new JPanel();
	    piedevas2_panel.setLayout(new GridLayout(2, 1));
		
		piedevas_label = new JLabel("Piedevas:");	
		
		top_sipoli = new JCheckBox("Sīpoļi +0,20", false);
		top_senes = new JCheckBox("Sēnes +0,20", false);
		top_brokolis = new JCheckBox("Brokoļi +0.20", false);
		top_kokuruza = new JCheckBox("kokurūza +0.20", false);
		top_salami = new JCheckBox("Salamī +0,20", false);
		top_siers = new JCheckBox("Siers +0.20", false);

		ItemListener itemListener = new ItemListener()
		{
			public void itemStateChanged(ItemEvent itemEvent)
			{
				AbstractButton abstractButton = (AbstractButton) itemEvent.getSource();
				int state = itemEvent.getStateChange();
				if(state == ItemEvent.SELECTED)
				{
					sum = sum + 0.20;
				}
			}
		};
			
		top_sipoli.addItemListener(itemListener);
		top_senes.addItemListener(itemListener);
		top_brokolis.addItemListener(itemListener);
		top_kokuruza.addItemListener(itemListener);
		top_salami.addItemListener(itemListener);
		top_siers.addItemListener(itemListener);
		
		pied1_panel.add(top_sipoli);
		pied1_panel.add(top_senes);
	    pied1_panel.add(top_brokolis);	
		pied2_panel.add(top_kokuruza);
		pied2_panel.add(top_salami);	
		pied2_panel.add(top_siers);					
	
		piedevas_panel.add(pied1_panel);
		piedevas_panel.add(pied2_panel);
					
		piedevas2_panel.add(piedevas_label);
		piedevas2_panel.add(piedevas_panel);
		add(piedevas2_panel);
    }
}

class Picas {
    public static void main(String[] args) {

        pica gui_obj = new pica();
        gui_obj.Input();
        gui_obj.Piedevas();
        

        gui_obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui_obj.setLocationByPlatform(true);
		gui_obj.setSize(575,500);
		gui_obj.setVisible(true);


    }
}