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
    private JComboBox daudzums_box, picas_box, izmers_Box;
    public Double a, sum = 0.0;
    public String b, c;

    private JLabel daudzums_op_label, daudzums_op, pica_op, izmers_op;
    private JButton print, clear, calculate;
    private ImageIcon print_icon, clear_icon;
    private JLabel vards_op, adrese_op, nummurs_op;
    String vards_str, adrese_str, nummurs_str;
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

    public void Pica(){
		
		pica_Label = new JLabel("Picas: ");
		pica2_Label = new JLabel("Pica: ");
		pica_op = new JLabel();
		pica_panel = new JPanel();
		pica_panel.setLayout(new GridLayout(4, 5));
		DefaultComboBoxModel Picas = new DefaultComboBoxModel(new String[] {"Kapri Pica", "Kalifornijas Pica", "Lauku pica", "Pepperoni Pica", "Vezuma pica", "Čempionu pica"});
		JComboBox picas_box = new JComboBox(Picas);
		picas_box.setSelectedIndex(-1);
		pica_panel.add(pica_Label);
		pica_panel.add(picas_box);	



		picas_box.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				pica_op.setText((String)((JComboBox)e.getSource()).getSelectedItem());
				b = (picas_box.getSelectedItem().toString());
			}	
		});

		add(pica_panel);


    }

    public void Izmers()
	{
		izmers_label = new JLabel("Izmērs: ");
		izmers2_label = new JLabel("Izmērs: ");
		izmers_op = new JLabel();
		izmers_panel = new JPanel();
		izmers_panel.setLayout(new GridLayout(3, 4));
		
		DefaultComboBoxModel izmers = new DefaultComboBoxModel(new String[] {"20", "30", "50"});
		JComboBox<Object> izmers_box = new JComboBox<Object>(izmers);

		izmers_box.setSelectedIndex(-1);
		izmers_panel.add(izmers_label);
		izmers_panel.add(izmers_box);
		

		
		izmers_box.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				izmers_op.setText((String)((JComboBox)e.getSource()).getSelectedItem());
				c = (izmers_box.getSelectedItem().toString());
			}	
		});

		

		add(izmers_panel);
	
}

public void Daudzums() 
{

    daudzums_label = new JLabel("Daudzums: ");
    daudzums_op_label = new JLabel("Daudzums: ");
    daudzums_op = new JLabel();
    daudzums_panel = new JPanel();
    daudzums_panel.setLayout(new GridLayout(2, 2));
    String[] daudzums = {"1", "2", "3", "4", "5"};


    
    JComboBox<String>daudzums_box = new JComboBox<String>();
    for(int i = 0; i < daudzums.length; i++)		
        daudzums_box.addItem(daudzums[i]);
        daudzums_box.setSelectedIndex(-1);



                    
    daudzums_panel.add(daudzums_label);
    daudzums_panel.add(daudzums_box);
    
    
    daudzums_box.addActionListener(new ActionListener() 
    {
        public void actionPerformed(ActionEvent e)
        {
            daudzums_op.setText((String)((JComboBox)e.getSource()).getSelectedItem());
            a = Double.parseDouble(daudzums_box.getSelectedItem().toString());
        }	
    });
    

    add(daudzums_panel);
} 

public void Output()
{	
    print_icon = new ImageIcon("print.png");
    clear_icon = new ImageIcon("clear.png");
    
    buttons_panel = new JPanel();
    buttons_panel.setLayout(new GridLayout(1, 2, 10, 0));
                
    Picas = new JLabel("Pica: ");
    vards2 = new JLabel("Name: ");
    adrese2 = new JLabel("Address: ");
    nummurs2= new JLabel("Contact Number: ");

    String sum_str;
    sum_str = Double.toString(sum);
    JLabel sum_label = new JLabel("Sum: ");
    JLabel sum_op_label = new JLabel(sum_str);
    
    print = new JButton("Print");
    print.setRolloverIcon(print_icon);
    print.setRolloverEnabled(true);
    clear = new JButton("Clear");

    
    buttons_panel.add(print);
    buttons_panel.add(clear);		
        
    add(buttons_panel);
                    
            
    clear.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            vards_tf.setText("");
            adrese_tf.setText("");
            nummurs_tf.setText("");
            group.clearSelection();
            vards.setEnabled(true);
            adrese.setEnabled(true);
            nummurs.setEnabled(true); 
                
            vards_tf.setEditable(true);
            adrese_tf.setEditable(true);
            nummurs_tf.setEditable(true);	
            vards_tf.setEnabled(true);
            adrese_tf.setEnabled(true);
            nummurs_tf.setEnabled(true);
            
            top_brokolis.setSelected(false);
            top_salami.setSelected(false);
            top_siers.setSelected(false);
            top_kokuruza.setSelected(false);
            top_senes.setSelected(false);
            top_sipoli.setSelected(false);
            
                
        }
    });
    
    print.addActionListener(new ActionListener()
    {


        public void actionPerformed(ActionEvent e)
        {	
            if(b == "Studentu Pica"){
                sum = sum + 3.25;
            }else if(b  == "Vistas Kariju pica"){
                sum = sum + 2.34;
            }else if(b  == "Zemnieku Pica"){
                sum = sum + 3.23;
            }else if(b  == "Havaju pica"){
                sum = sum + 5.75;
            }else if(b  == "Kalifornijas Pica"){
                sum = sum + 8.42;
            }else if(b  == "amerikāņu pica"){
                sum = sum + 9.22;
            }

            if(c == "20"){
                sum = sum + 2.50;
            }else if(c  == "30"){
                sum = sum + 4.50;
            }else if(c  == "50"){
                sum = sum + 7.0;
            }

            sum = sum * a;

            String sum_str;
            sum_str = Double.toString(sum);
            JLabel sum_label = new JLabel("Sum: ");
            JLabel sum_op_label = new JLabel(sum_str);
            
            JFrame output = new JFrame();
            output.setLayout(new GridLayout(10, 5));									
            
            vards_str = vards_tf.getText();
            adrese_str = adrese_tf.getText();
            nummurs_str = nummurs_tf.getText();
            
            vards_op = new JLabel(vards_str);
            adrese_op = new JLabel(adrese_str);
            nummurs_op = new JLabel(nummurs_str);
            
            output.add(vards2);
            output.add(vards_op);
            output.add(adrese2);
            output.add(adrese_op);
            output.add(nummurs2);
            output.add(nummurs_op);	

            output.add(pica2_Label);
            output.add(pica_op);
            output.add(izmers2_label);
            output.add(izmers_op);
            output.add(sum_label);
            output.add(sum_op_label);
            output.add(daudzums_op_label);				
            output.add(daudzums_op);
            output.pack();
            output.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            output.setLocationRelativeTo(null);
            output.setSize(450, 250);
            output.setVisible(true);
        }
    });
    
}


}

class Picas {
    public static void main(String[] args) {

        pica gui_obj = new pica();
        gui_obj.Input();
        gui_obj.Piedevas();
        gui_obj.Pica();
        gui_obj.Izmers();
        gui_obj.Daudzums();
        gui_obj.Output();
        

        gui_obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui_obj.setLocationByPlatform(true);
		gui_obj.setSize(575,500);
		gui_obj.setVisible(true);


    }
}