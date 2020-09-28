import java.awt.BorderLayout;


import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.*;



public class MainDisplay extends JPanel{
	
	private JPanel mainPanel;
	private JButton btnSubmit;
	
	JRadioButton radioBtnFemale,radioBtnMale, radioBtnAgeUp, radioBtnAgeD, 
	radioBtnDisabledYes, radioBtnDisabledNo, radioBtnFreedomYes, 
	radioBtnFreedomNo, radioBtnChildrenYes, radioBtnChildrenNo;
	ButtonGroup btnGrpGender,btnGrpAge,btnGrpDisabled,btnGrpFreedom,btnGrpChild;
	
	JLabel lblTaxCalculator,lblInfo,lblGender, lblAge, lblDisable,lblICT,lblBD,lblDeveloped,
	lblFreedom, lblChildren,lblLogo;
	
	ImageIcon Nbr;
	
	public MainDisplay(JPanel mainPanel) 
	{
		this.mainPanel = mainPanel;
	
		this.mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		this.mainPanel.setLayout(new BorderLayout(10, 10));
		this.mainPanel.setBackground(new Color(82,183,70));  
		this.setBackground(new Color(82,183,70));
		
		lblTaxCalculator = new JLabel("Income Tax Calculator");
		lblTaxCalculator.setFont(new Font("Arial Black",Font.PLAIN, 50));
		lblTaxCalculator.setBounds(400,10,700,90);
		lblTaxCalculator.setForeground(new Color(0,64,128));
		
		
		lblICT = new JLabel();
		lblICT.setText("<HTML><U>National Board Of Revenue</U></HTML>");
		lblICT.setFont(new Font("Century",Font.PLAIN, 35));
		lblICT.setBounds(200,220,500,60);
		lblICT.setForeground( Color.RED);
		
		lblBD = new JLabel();
		lblBD.setText("Government of the People's Republic of Bangladesh");
		lblBD.setFont(new Font("Times New Roman",Font.PLAIN, 22));
		lblBD.setBounds(200,265,500,30);
		lblBD.setForeground( Color.white);
		
		Nbr=new ImageIcon("C:\\Users\\MDTariqur\\workspace\\JavaProjectFinal\\src\\image\\bd_govt_logo.png");
		lblLogo=new JLabel(Nbr);
		lblLogo.setBounds(260,305,300,299);
		
		

		lblInfo = new JLabel();
		lblInfo.setText("<HTML><U>Information Desk:</U></HTML>");
		lblInfo.setFont(new Font("Times New Roman",Font.PLAIN, 35));
		lblInfo.setBounds(850,125,280,40);
		
		lblGender = new JLabel("1. Gender ");
		lblGender.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		lblGender.setBounds(850,200,110,40);
		
		lblAge = new JLabel("2. Age ");
		lblAge.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		lblAge.setBounds(850,257,110,40);
		
		lblDisable = new JLabel("3. Disabled ");
		lblDisable.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		lblDisable.setBounds(850,314,110,55);
		
		lblFreedom = new JLabel("4. Freedom Fighter ");
		lblFreedom.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		lblFreedom.setBounds(850,371,170,55);
		
		lblChildren = new JLabel("5. Having disable child? ");
		lblChildren.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		lblChildren.setBounds(850,430,200,55);
		
		
		
		
		radioBtnMale=new JRadioButton();
		radioBtnMale.setText("Male");
		radioBtnMale.setBounds(1070,200,100,40);
		radioBtnMale.setContentAreaFilled(false);
		
		radioBtnFemale=new JRadioButton();
		radioBtnFemale.setText("Female");
		radioBtnFemale.setBounds(1160,200,100,40);
		radioBtnFemale.setContentAreaFilled(false);
		
		radioBtnAgeUp=new JRadioButton();
		radioBtnAgeUp.setText("Above 65");
		radioBtnAgeUp.setBounds(1070,260,100,40);
		radioBtnAgeUp.setContentAreaFilled(false);
		
		radioBtnAgeD=new JRadioButton();
		radioBtnAgeD.setText("Below 65");
		radioBtnAgeD.setBounds(1160,260,100,40);
		radioBtnAgeD.setContentAreaFilled(false);
		
		radioBtnDisabledYes=new JRadioButton();
		radioBtnDisabledYes.setText("Yes");
		radioBtnDisabledYes.setBounds(1070,320,100,40);
		radioBtnDisabledYes.setContentAreaFilled(false);
		
		
		radioBtnDisabledNo=new JRadioButton();
		radioBtnDisabledNo.setText("No");
		radioBtnDisabledNo.setBounds(1160,320,100,40);
		radioBtnDisabledNo.setContentAreaFilled(false);
		
		radioBtnFreedomYes=new JRadioButton();
		radioBtnFreedomYes.setText("Yes");
		radioBtnFreedomYes.setBounds(1070,380,100,40);
		radioBtnFreedomYes.setContentAreaFilled(false);
		
		
		radioBtnFreedomNo=new JRadioButton();
		radioBtnFreedomNo.setText("No");
		radioBtnFreedomNo.setBounds(1160,380,100,40);
		radioBtnFreedomNo.setContentAreaFilled(false);
		
		radioBtnChildrenYes=new JRadioButton();
		radioBtnChildrenYes.setText("Yes");
		radioBtnChildrenYes.setBounds(1070,440,100,40);
		radioBtnChildrenYes.setContentAreaFilled(false);
		
		radioBtnChildrenNo=new JRadioButton();
		radioBtnChildrenNo.setText("No");
		radioBtnChildrenNo.setBounds(1160,440,100,40);
		radioBtnChildrenNo.setContentAreaFilled(false);
		
		
		
		ButtonGroup btnGrpGender = new ButtonGroup();
		btnGrpGender.add(radioBtnMale);
		btnGrpGender.add(radioBtnFemale);
		
		ButtonGroup btnGrpAge = new ButtonGroup();
		btnGrpAge.add(radioBtnAgeUp);
		btnGrpAge.add(radioBtnAgeD);
		
		ButtonGroup btnGrpDisabled = new ButtonGroup();
		btnGrpDisabled.add(radioBtnDisabledYes);
		btnGrpDisabled.add(radioBtnDisabledNo);
		
		ButtonGroup btnGrpFreedom = new ButtonGroup();
		btnGrpFreedom.add(radioBtnFreedomYes);
		btnGrpFreedom.add(radioBtnFreedomNo);
		
		ButtonGroup btnGrpChild = new ButtonGroup();
		btnGrpChild.add(radioBtnChildrenYes);
		btnGrpChild.add(radioBtnChildrenNo);

		
		

		
		btnSubmit= new JButton("Submit");
		btnSubmit.setBounds(1150,550,170,70);
		btnSubmit.setFont(new Font("Comic Sans MS", Font.PLAIN, 37));
		btnSubmit.setBackground(Color.lightGray);
		btnSubmit.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		btnSubmit.setFocusPainted(false);
		btnSubmit.setContentAreaFilled(false);
			
			
			
	    init();
	      
}
	
	

	private void init()
	{
		mainPanel.add(lblLogo);
		mainPanel.add(lblICT);
		mainPanel.add(lblBD);
		mainPanel.add(lblTaxCalculator);
		mainPanel.add(lblGender);
		mainPanel.add(lblInfo);
		mainPanel.add(lblAge);
		mainPanel.add(lblDisable);
		mainPanel.add(lblFreedom);
		mainPanel.add(lblChildren);
		mainPanel.add(radioBtnFemale);
		mainPanel.add(radioBtnMale);
		mainPanel.add(radioBtnAgeD);
		mainPanel.add(radioBtnAgeUp);
		mainPanel.add(radioBtnDisabledYes);
		mainPanel.add(radioBtnDisabledNo);
		mainPanel.add(radioBtnFreedomNo);
		mainPanel.add(radioBtnFreedomYes);
		mainPanel.add(radioBtnChildrenYes);
		mainPanel.add(radioBtnChildrenNo);

		
		
		
		
	   mainPanel.add(btnSubmit);
	   btnSubmit.addActionListener(new ActionListener() 
		{
		
			public void actionPerformed(ActionEvent arg0) {
				{
					
					 if
					  (radioBtnFreedomYes.isSelected()&& radioBtnChildrenYes.isSelected()){
						btnSubmit.setVisible(false);
						mainPanel.removeAll();
						mainPanel.add(new FYesCYesPrvt(mainPanel));
						
					}
					 else  if
					  (radioBtnFreedomYes.isSelected()&& radioBtnChildrenNo.isSelected()){
						btnSubmit.setVisible(false);
						mainPanel.removeAll();
						mainPanel.add(new FYesCNoPrvt(mainPanel));
						
					 }else if
					  (radioBtnDisabledYes.isSelected()&& radioBtnChildrenYes.isSelected()){
						btnSubmit.setVisible(false);
						mainPanel.removeAll();
						mainPanel.add(new DYesCYesPrvt(mainPanel));
					 }else  if
					  (radioBtnDisabledYes.isSelected()&& radioBtnChildrenNo.isSelected()){
						btnSubmit.setVisible(false);
						mainPanel.removeAll();
						mainPanel.add(new DYesCNoPrvt(mainPanel));
					 }else if
					 (((radioBtnFemale.isSelected()|| (radioBtnMale.isSelected()&&radioBtnAgeUp.isSelected())))&&radioBtnChildrenYes.isSelected()){
						 btnSubmit.setVisible(false);
						 mainPanel.removeAll();
						mainPanel.add(new FemOrSixtyFiveCYesPrvt(mainPanel));
					 }else if
					 (((radioBtnFemale.isSelected()|| (radioBtnMale.isSelected()&&radioBtnAgeUp.isSelected())))&&radioBtnChildrenNo.isSelected()){
						 btnSubmit.setVisible(false);
						 mainPanel.removeAll();
						mainPanel.add(new FemOrSixtyFiveCNoPrvt(mainPanel));
					 }else if
						  ((radioBtnMale.isSelected()&&radioBtnChildrenNo.isSelected())){
							btnSubmit.setVisible(false);
							mainPanel.removeAll();
							mainPanel.add(new MalePrivateDisplay(mainPanel));
						}else if
					  ((radioBtnMale.isSelected()&&radioBtnChildrenYes.isSelected())){
						btnSubmit.setVisible(false);
						mainPanel.removeAll();
						mainPanel.add(new MalePrivateDisplayCYes(mainPanel));
					}
						
					
					
				}
			}
		});
	
	
}
}
