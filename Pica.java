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
    private JPanel input_panel, delivery_panel, piedeval_panel, piedevas2_panel, daudzums_panel, pica_panel, izmers_panel, initial_panel, buttons_panel;
    private JPanel peid1_panel, pied2_panel;
    private JCheckBox top_sipoli, top_senes, top_brokolis, top_kokuruza, top_salami, top_siers;
    private JComboBox quantity_box, picas_box, lielums_Box;
    public Double a, sum = 0.0;
    public String b, c;

    private JLabel quantity_op_label, quantity_op, pica_op, lielums_op;
    private JButton print, clear, calculate;
    private ImageIcon print_icon, clear_icon;
    private JLabel name_op, address_op, contact_op;
    String name_str, address_str, contact_str;
    private JLabel name2, address2, contact2;


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


}

class Picas {
    public static void main(String[] args) {

        pica gui_obj = new pica();
        gui_obj.Input();
        

        gui_obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui_obj.setLocationByPlatform(true);
		gui_obj.setSize(575,500);
		gui_obj.setVisible(true);

        
    }
}