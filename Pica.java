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
    private JTextField table_no_tf, name_tf, address_tf, contact_tf;
    private JPanel input_panel, sutijums_panel, piedeval_panel, piedevas2_panel, daudzums_panel, pica_panel, izmers_panel, initial_panel, buttons_panel;
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


    Public pica(){

        //super("Picas Paūtījums");
        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 15));
		initial_panel = new JPanel();
		initial_panel.setLayout(new GridLayout(2, 1));		
			
			
		add(initial_panel);	

    }


}









public class Pica {
    public static void main(String[] args) {

        
    }
}