import java.awt.BorderLayout;
import java.awt.ComponentOrientation;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class DYesCYesPrvt extends JPanel{
	
	private JPanel mainPanel;	
	private JLabel lblDisplay8;
	private JButton btnBack;
    JButton btnTaskCalculate;
	JRadioButton radioBtnDhaka,radioBtnCity,radioBtnNoncity;
	ButtonGroup btnGrpLocation;
	
	
	
	JLabel lblIncomeSource,lblBasicSalary,lblDueSalary,lblHouseRent,lblEidBonus,lblIncentiveBonus,lblLocation,lbloverTime,lblshareInvest,lbltotalIncome,lbltotalInvest,
	lblAllowance,lblMadical,lblMutualFundInterest,lblMutualFundInterestTax,
	lblBankInterest,lblBankInterestTax,lblEntertainment,lblTranspot,lblTada,lblHouseAssetIncome,lblAgriIncome,
	lblOthersIncome,lblInvestment,lblProvident,lblWelfare,lblInsurance,lblSavings,lblOthersInvestment,lblNetAsset,lblMonthly,lblYearly;
	
	JTextField txtBasicSalary,txtDueSalary,txtHouseRent,txtEidBonus,txtIncentiveBonus,
	txtMadical,txtMutualFundInterest,txtMutualFundInterestTax,txtoverTime,txtshareInvest,txttotalIncome,txttotalInvest,
	txtBankInterest,txtBankInterestTax,txtEntertainment,txtTranspot,txtTada,txtHouseAssetIncome,txtAgriIncome,
	txtOthersIncome,txtProvident,txtWelfare,txtInsurance,txtSavings,txtTaskCalculate,txtOthersInvestment,txtNetAsset;
	
	static String sSalary,sDueSalary,sRent,sEid,sIncentive,sMedical,sMutual,sMutualTax,
	sBank,sBankTax,sEntertainment,sTranspot,sTada,sHouseAsset,sAgriIncome,sOthers,sProvident,sWelfare,sInsurance,sSavings,
	sOthersInvest,sNetAsset,sOverTime,sShareInvest;
	

	public  DYesCYesPrvt  (JPanel mainPanel) {
		this.mainPanel = mainPanel;
		lblDisplay8 = new JLabel("Male && Disabled Yes && Private", SwingConstants.CENTER);
		lblDisplay8.setFont(new Font("Times New Roman",Font.PLAIN, 18));
		this.mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		this.mainPanel.setLayout(new BorderLayout(10, 10));
		
		this.mainPanel.setBackground(new Color(91,91,255));
		this.setBackground(new Color(197,197,137));
		btnBack = new JButton("Home");
		btnBack.setBounds(1200, 620, 100, 60);
		
		btnBack.setFont(new Font("Airl", Font.PLAIN, 37));
		 btnBack.setBackground(Color.lightGray);
			btnBack.setBorder(null); //remove border
			btnBack.setFocusPainted(false);
			btnBack.setContentAreaFilled(false);
		
		
		
		
		
		
		btnTaskCalculate = new JButton("CALCULATE");
	    btnTaskCalculate.setBounds(850,80,200,60);
		btnTaskCalculate.setFont(new Font("Arial", Font.PLAIN, 25));
	    btnTaskCalculate.setBackground(Color.gray);
		btnTaskCalculate.setBackground(new Color(230,230,230));
		btnTaskCalculate.setBorder(null); //remove border
		btnTaskCalculate.setFocusPainted(false);
		
		
		
		txtTaskCalculate = new JTextField();
		txtTaskCalculate.setBounds(1070,80,200,60);
		txtTaskCalculate.setFont(new Font("SansSerif", Font.PLAIN, 30));
		txtTaskCalculate.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtTaskCalculate.setBackground(new Color(197,197,137));
		txtTaskCalculate.setBorder(BorderFactory.createLineBorder(Color.black));
		
		lblMonthly = new JLabel("*    Monthly Income");
		lblMonthly.setFont(new Font("Times New Roman",Font.PLAIN, 16));
		lblMonthly.setBounds(20,10,250,25);
		lblYearly = new JLabel("**  Annual Income");
		lblYearly.setFont(new Font("Times New Roman",Font.PLAIN, 16));
		lblYearly.setBounds(20,35,250,25);
		
		
		lblIncomeSource=new JLabel();
		lblIncomeSource.setText("<HTML><U>Income Source</U></HTML>");
		lblIncomeSource.setFont(new Font("Times New Roman",Font.PLAIN, 30));
		lblIncomeSource.setBounds(350,10,200,100);
		
		lblBasicSalary=new JLabel("   *Basic Salary");
		lblBasicSalary.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		lblBasicSalary.setBounds(250,80,280,40);
		txtBasicSalary = new JTextField("0");
		txtBasicSalary.setBounds(500,88,95,25);
		txtBasicSalary.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txtBasicSalary.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtBasicSalary.setBackground(new Color(197,197,137));
		txtBasicSalary.setBorder(BorderFactory.createLineBorder(Color.black));
		
		lblHouseRent=new JLabel("   *Rent Allowance");
		lblHouseRent.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		lblHouseRent.setBounds(250,120,280,40);
		txtHouseRent = new JTextField("0");
		txtHouseRent.setBounds(500,128,95,25);
		txtHouseRent.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txtHouseRent.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtHouseRent.setBackground(new Color(197,197,137));
		txtHouseRent.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		  lblEidBonus=new JLabel("**Total Eid Bonous ");
		  lblEidBonus.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lblEidBonus.setBounds(250,160,280,40);
		  txtEidBonus = new JTextField("0");
		  txtEidBonus.setBounds(500,168,95,25);
		  txtEidBonus.setFont(new Font("SansSerif", Font.PLAIN, 20));
		  txtEidBonus.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		  txtEidBonus.setBackground(new Color(197,197,137));
		  txtEidBonus.setBorder(BorderFactory.createLineBorder(Color.black));
		  
		  lblAllowance=new JLabel("Allowance :");
		  lblAllowance.setFont(new Font("Times New Roman",Font.PLAIN, 24));
		  lblAllowance.setBounds(380,200,200,50);
		  
		  lblMadical=new JLabel("**Medical ");
		  lblMadical.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lblMadical.setBounds(20,255,280,40);
		  txtMadical = new JTextField("0");
		  txtMadical.setBounds(310,263,95,25);
		  txtMadical.setFont(new Font("SansSerif", Font.PLAIN, 20));
		  txtMadical.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		  txtMadical.setBackground(new Color(197,197,137));
		  txtMadical.setBorder(BorderFactory.createLineBorder(Color.black));
		  
		  
		  lblMutualFundInterest=new JLabel("**Mutual Fund Interest ");
		  lblMutualFundInterest.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lblMutualFundInterest.setBounds(20,295,280,40);
		  txtMutualFundInterest = new JTextField("0");
		  txtMutualFundInterest.setBounds(310,303,95,25);
		  txtMutualFundInterest.setFont(new Font("SansSerif", Font.PLAIN, 20));
		  txtMutualFundInterest.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		  txtMutualFundInterest.setBackground(new Color(197,197,137));
		  txtMutualFundInterest.setBorder(BorderFactory.createLineBorder(Color.black));
		  
		  lblMutualFundInterestTax=new JLabel("**Mutual Fund in % (If Paid) ");
		  lblMutualFundInterestTax.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lblMutualFundInterestTax.setBounds(20,335,280,40);
		  txtMutualFundInterestTax = new JTextField("0");
		  txtMutualFundInterestTax.setBounds(310,343,95,25);
		  txtMutualFundInterestTax.setFont(new Font("SansSerif", Font.PLAIN, 20));
		  txtMutualFundInterestTax.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		  txtMutualFundInterestTax.setBackground(new Color(197,197,137));
		  txtMutualFundInterestTax.setBorder(BorderFactory.createLineBorder(Color.black));
		  
		  lblBankInterest=new JLabel("**Bank Interest ");
		  lblBankInterest.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lblBankInterest.setBounds(20,375,280,40);
		  txtBankInterest = new JTextField("0");
		  txtBankInterest.setBounds(310,383,95,25);
		  txtBankInterest.setFont(new Font("SansSerif", Font.PLAIN, 20));
		  txtBankInterest.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		  txtBankInterest.setBackground(new Color(197,197,137));
		  txtBankInterest.setBorder(BorderFactory.createLineBorder(Color.black));
		  
		  lblBankInterestTax=new JLabel("**Bank Interest in % (If Paid)  ");
		  lblBankInterestTax.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lblBankInterestTax.setBounds(20,415,280,40);
		  txtBankInterestTax = new JTextField("0");
		  txtBankInterestTax.setBounds(310,423,95,25);
		  txtBankInterestTax.setFont(new Font("SansSerif", Font.PLAIN, 20));
		  txtBankInterestTax.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		  txtBankInterestTax.setBackground(new Color(197,197,137));
		  txtBankInterestTax.setBorder(BorderFactory.createLineBorder(Color.black));
		  
		  lblEntertainment=new JLabel("**Entertainment ");
		  lblEntertainment.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lblEntertainment.setBounds(20,455,280,40);
		  txtEntertainment = new JTextField("0");
		  txtEntertainment.setBounds(310,463,95,25);
		  txtEntertainment.setFont(new Font("SansSerif", Font.PLAIN, 20));
		  txtEntertainment.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		  txtEntertainment.setBackground(new Color(197,197,137));
		  txtEntertainment.setBorder(BorderFactory.createLineBorder(Color.black));
		  
		  lblOthersIncome=new JLabel("**Others Income ");
		  lblOthersIncome.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lblOthersIncome.setBounds(20,495,280,40);
		  txtOthersIncome = new JTextField("0");
		  txtOthersIncome.setBounds(310,503,95,25);
		  txtOthersIncome.setFont(new Font("SansSerif", Font.PLAIN, 20));
		  txtOthersIncome.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		  txtOthersIncome.setBackground(new Color(197,197,137));
		  txtOthersIncome.setBorder(BorderFactory.createLineBorder(Color.black));
		  
		  lblDueSalary=new JLabel("**Due Salary(If not counted for tax) ");
		  lblDueSalary.setFont(new Font("Times New Roman",Font.PLAIN, 18));
		  lblDueSalary.setBounds(440,255,280,40);
		  txtDueSalary = new JTextField("0");
		  txtDueSalary.setBounds(710,263,95,25);
		  txtDueSalary.setFont(new Font("SansSerif", Font.PLAIN, 20));
	      txtDueSalary.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	      txtDueSalary.setBackground(new Color(197,197,137));
	      txtDueSalary.setBorder(BorderFactory.createLineBorder(Color.black));
		  
	      lblIncentiveBonus=new JLabel("**Incentive Bonus ");
		  lblIncentiveBonus.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lblIncentiveBonus.setBounds(440,295,280,40);
		  txtIncentiveBonus = new JTextField("0");
		  txtIncentiveBonus.setBounds(710,303,95,25);
		  txtIncentiveBonus.setFont(new Font("SansSerif", Font.PLAIN, 20));
	      txtIncentiveBonus.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	      txtIncentiveBonus.setBackground(new Color(197,197,137));
	      txtIncentiveBonus.setBorder(BorderFactory.createLineBorder(Color.black));
		  
	      lblTranspot=new JLabel("**Transpot Allowance ");
		  lblTranspot.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lblTranspot.setBounds(440,335,280,40);
		  txtTranspot = new JTextField("0");
		  txtTranspot.setBounds(710,343,95,25);
		  txtTranspot.setFont(new Font("SansSerif", Font.PLAIN, 20));
	      txtTranspot.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	      txtTranspot.setBackground(new Color(197,197,137));
	      txtTranspot.setBorder(BorderFactory.createLineBorder(Color.black));
	      
	      lblTada=new JLabel("**TADA ");
		  lblTada.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lblTada.setBounds(440,375,280,40);
		  txtTada = new JTextField("0");
		  txtTada.setBounds(710,383,95,25);
		  txtTada.setFont(new Font("SansSerif", Font.PLAIN, 20));
	      txtTada.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	      txtTada.setBackground(new Color(197,197,137));
	      txtTada.setBorder(BorderFactory.createLineBorder(Color.black));
	      
	      lblHouseAssetIncome=new JLabel("**House Asset Income ");
		  lblHouseAssetIncome.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lblHouseAssetIncome.setBounds(440,415,280,40);
		  txtHouseAssetIncome = new JTextField("0");
		  txtHouseAssetIncome.setBounds(710,423,95,25);
		  txtHouseAssetIncome.setFont(new Font("SansSerif", Font.PLAIN, 20));
	      txtHouseAssetIncome.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	      txtHouseAssetIncome.setBackground(new Color(197,197,137));
	      txtHouseAssetIncome.setBorder(BorderFactory.createLineBorder(Color.black));
	      
	      lblAgriIncome=new JLabel("**Agriculture Income ");
		  lblAgriIncome.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lblAgriIncome.setBounds(440,455,280,40);
		  txtAgriIncome = new JTextField("0");
		  txtAgriIncome.setBounds(710,463,95,25);
		  txtAgriIncome.setFont(new Font("SansSerif", Font.PLAIN, 20));
	      txtAgriIncome.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	      txtAgriIncome.setBackground(new Color(197,197,137));
	      txtAgriIncome.setBorder(BorderFactory.createLineBorder(Color.black));
	      
	      lbloverTime=new JLabel("**Over Time ");
		  lbloverTime.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lbloverTime.setBounds(440,495,280,40);
		  txtoverTime = new JTextField("0");
		  txtoverTime.setBounds(710,503,95,25);
		  txtoverTime.setFont(new Font("SansSerif", Font.PLAIN, 20));
	      txtoverTime.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	      txtoverTime.setBackground(new Color(197,197,137));
	      txtoverTime.setBorder(BorderFactory.createLineBorder(Color.black));
	      
	      
	      lblInvestment=new JLabel();
	      lblInvestment.setText("<HTML><U>Investment</U></HTML>");
			lblInvestment.setFont(new Font("Times New Roman",Font.PLAIN, 30));
		  lblInvestment.setBounds(1030,200,200,50);
		  
		  lblProvident=new JLabel("*Provident");
		  lblProvident.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lblProvident.setBounds(900,255,280,40);
		  txtProvident = new JTextField("0");
		  txtProvident.setBounds(1190,263,95,25);
		  txtProvident.setFont(new Font("SansSerif", Font.PLAIN, 20));
	      txtProvident.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	      txtProvident.setBackground(new Color(197,197,137));
	      txtProvident.setBorder(BorderFactory.createLineBorder(Color.black));
	      
		  lblWelfare=new JLabel("*Welfare Fund");
		  lblWelfare.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lblWelfare.setBounds(900,303,280,40);
		  txtWelfare = new JTextField("0");
		  txtWelfare.setBounds(1190,311,95,25);
		  txtWelfare.setFont(new Font("SansSerif", Font.PLAIN, 20));
	      txtWelfare.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	      txtWelfare.setBackground(new Color(197,197,137));
	      txtWelfare.setBorder(BorderFactory.createLineBorder(Color.black));
	      
		  lblInsurance=new JLabel("**Insurance ");
		  lblInsurance.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lblInsurance.setBounds(900,343,280,40);
		  txtInsurance = new JTextField("0");
		  txtInsurance.setBounds(1190,351,95,25);
		  txtInsurance.setFont(new Font("SansSerif", Font.PLAIN, 20));
	      txtInsurance.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	      txtInsurance.setBackground(new Color(197,197,137));
	      txtInsurance.setBorder(BorderFactory.createLineBorder(Color.black));
	      
		  lblSavings=new JLabel("**Savings ");
		  lblSavings.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lblSavings.setBounds(900,383,280,40);
		  txtSavings = new JTextField("0");
		  txtSavings.setBounds(1190,391,95,25);
		  txtSavings.setFont(new Font("SansSerif", Font.PLAIN, 22));
	      txtSavings.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	      txtSavings.setBackground(new Color(197,197,137)); 
	      txtSavings.setBorder(BorderFactory.createLineBorder(Color.black));
	      
	      lblOthersInvestment=new JLabel("**Others Investment ");
		  lblOthersInvestment.setFont(new Font("Times New Roman",Font.PLAIN, 22));
		  lblOthersInvestment.setBounds(900,423,280,40);
		  txtOthersInvestment = new JTextField("0");
		  txtOthersInvestment.setBounds(1190,431,95,25);
		  txtOthersInvestment.setFont(new Font("SansSerif", Font.PLAIN, 22));
	      txtOthersInvestment.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	      txtOthersInvestment.setBackground(new Color(197,197,137));
	      txtOthersInvestment.setBorder(BorderFactory.createLineBorder(Color.black));
	      
	      lblshareInvest=new JLabel("**Share Invest ");
		  lblshareInvest.setFont(new Font("Times New Roman",Font.PLAIN, 22));
		  lblshareInvest.setBounds(900,463,280,40);
		  txtshareInvest = new JTextField("0");
		  txtshareInvest.setBounds(1190,471,95,25);
		  txtshareInvest.setFont(new Font("SansSerif", Font.PLAIN, 22));
	      txtshareInvest.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	      txtshareInvest.setBackground(new Color(197,197,137));
	      txtshareInvest.setBorder(BorderFactory.createLineBorder(Color.black));
	      
	      lblNetAsset=new JLabel("**Net Asset ");
		  lblNetAsset.setFont(new Font("Times New Roman",Font.PLAIN, 22));
		  lblNetAsset.setBounds(900,503,280,40);
		  txtNetAsset = new JTextField("0");
		  txtNetAsset.setBounds(1190,511,95,25);
		  txtNetAsset.setFont(new Font("SansSerif", Font.PLAIN, 22));
	      txtNetAsset.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	      txtNetAsset.setBackground(new Color(197,197,137));
	      txtNetAsset.setBorder(BorderFactory.createLineBorder(Color.black));
	      
	      lbltotalIncome=new JLabel("Total Income ");
		  lbltotalIncome.setFont(new Font("Times New Roman",Font.PLAIN, 25));
		  lbltotalIncome.setBounds(350,555,280,40);
		  txttotalIncome = new JTextField();
		  txttotalIncome.setBounds(500,558,120,35);
		  txttotalIncome.setFont(new Font("SansSerif", Font.PLAIN, 22));
	      txttotalIncome.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	      txttotalIncome.setBackground(new Color(197,197,137));
	      txttotalIncome.setBorder(BorderFactory.createLineBorder(Color.black));
	      
	      lbltotalInvest=new JLabel("Total Invest ");
		  lbltotalInvest.setFont(new Font("Times New Roman",Font.PLAIN, 25));
		  lbltotalInvest.setBounds(1040,555,280,40);
		  txttotalInvest = new JTextField();
		  txttotalInvest.setBounds(1170,558,120,35);
		  txttotalInvest.setFont(new Font("SansSerif", Font.PLAIN, 22));
	      txttotalInvest.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	      txttotalInvest.setBackground(new Color(197,197,137));
	      txttotalInvest.setBorder(BorderFactory.createLineBorder(Color.black));
	     
	      
	    
	      
	      lblLocation=new JLabel("Location : ");
		  lblLocation.setFont(new Font("Times New Roman",Font.PLAIN, 20));
		  lblLocation.setBounds(20,590,200,100);
	      
	        radioBtnDhaka=new JRadioButton();
		    radioBtnDhaka.setText("Dhaka or Chittagong city");
	    	radioBtnDhaka.setBounds(280,620,250,40);
			radioBtnDhaka.setContentAreaFilled(false);
			
			radioBtnCity=new JRadioButton();
			radioBtnCity.setText("Others city corporation");
			radioBtnCity.setBounds(540,620,250,40);
			radioBtnCity.setContentAreaFilled(false);
			
			radioBtnNoncity=new JRadioButton();
			radioBtnNoncity.setText("Outside City corporation");
			radioBtnNoncity.setBounds(790,620,250,40);
			radioBtnNoncity.setContentAreaFilled(false);
	      
			ButtonGroup btnGrpLocation = new ButtonGroup();
			btnGrpLocation.add(radioBtnDhaka);
			btnGrpLocation.add(radioBtnCity);
			btnGrpLocation.add(radioBtnNoncity);
	      
	        
			
			init();
		
		
	}
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.black);
		g.drawLine(840, 256,840, 510);
		
		g.setColor(Color.black);
		g.drawLine(850, 256,850, 510);
	}
	private void init() {

	mainPanel.add(lblMonthly);
	mainPanel.add(lblYearly);
	
	mainPanel.add(lblIncomeSource);
	mainPanel.add(lblBasicSalary);
	mainPanel.add(txtBasicSalary);
	mainPanel.add(lblHouseRent);
	mainPanel.add(txtHouseRent);
	mainPanel.add(lblEidBonus);
	mainPanel.add(txtEidBonus);
	mainPanel.add(lblAllowance);
	mainPanel.add(lblMadical);
	mainPanel.add(txtMadical);
	mainPanel.add(lblMutualFundInterest);
	mainPanel.add(txtMutualFundInterest);
	mainPanel.add(lblMutualFundInterestTax);
	mainPanel.add(txtMutualFundInterestTax);
	mainPanel.add(lblBankInterest);
	mainPanel.add(txtBankInterest);
	mainPanel.add(lblBankInterestTax);
	mainPanel.add(txtBankInterestTax);
	mainPanel.add(lblEntertainment);
	mainPanel.add(txtEntertainment);
	mainPanel.add(lblOthersIncome);
	mainPanel.add(txtOthersIncome);
	mainPanel.add(lblDueSalary);
	mainPanel.add(txtDueSalary);
	mainPanel.add(lblIncentiveBonus);
	mainPanel.add(txtIncentiveBonus);
	mainPanel.add(lblTranspot);
	mainPanel.add(txtTranspot);
	mainPanel.add(lblTada);
	mainPanel.add(txtTada);
	mainPanel.add(lblHouseAssetIncome);
	mainPanel.add(txtHouseAssetIncome);
	mainPanel.add(lblAgriIncome);
	mainPanel.add(txtAgriIncome);
	mainPanel.add(lbloverTime);
	mainPanel.add(txtoverTime);
	mainPanel.add(lblInvestment);
    mainPanel.add(lblProvident);
    mainPanel.add(txtProvident);
   mainPanel.add(lblWelfare);
    mainPanel.add(txtWelfare);
    mainPanel.add(lblInsurance);
    mainPanel.add(txtInsurance);
    mainPanel.add(lblSavings);
    mainPanel.add(txtSavings);
    mainPanel.add(lblOthersInvestment);
	mainPanel.add(txtOthersInvestment);
	mainPanel.add(lblshareInvest);
	mainPanel.add(txtshareInvest);
	mainPanel.add(lblNetAsset);
	mainPanel.add(txtNetAsset);
	mainPanel.add(lbltotalIncome);
	mainPanel.add(txttotalIncome);
	mainPanel.add(lbltotalInvest);
	mainPanel.add(txttotalInvest);
   mainPanel.add(btnTaskCalculate);
mainPanel.add(txtTaskCalculate);
	mainPanel.add(lblLocation);
	mainPanel.add(radioBtnDhaka);
	mainPanel.add(radioBtnCity);
	mainPanel.add(radioBtnNoncity);

	
	
	
	

	
	
	mainPanel.add(btnBack);	
	
	btnBack.addActionListener(new ActionListener() {
		
		
		public void actionPerformed(ActionEvent arg0) {
			lblDisplay8.setVisible(false);
			mainPanel.removeAll();
			mainPanel.add(new MainDisplay(mainPanel));
		}
	});
	
	txtBasicSalary.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtBasicSalary.setText("");
	    }
	});
    txtDueSalary.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtDueSalary.setText("");
	    }
	});
    txtHouseRent.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtHouseRent.setText("");
	    }
	});
    txtEidBonus.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtEidBonus.setText("");
	    }
	});
    txtIncentiveBonus.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtIncentiveBonus.setText("");
	    }
	});
    txtMadical.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtMadical.setText("");
	    }
	});
    txtMutualFundInterest.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtMutualFundInterest.setText("");
	    }
	});
    txtMutualFundInterestTax.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtMutualFundInterestTax.setText("");
	    }
	});
    txtBankInterest.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtBankInterest.setText("");
	    }
	});
    txtBankInterestTax.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtBankInterestTax.setText("");
	    }
	});
    txtoverTime.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtoverTime.setText("");
	    }
	});
    txtshareInvest.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtshareInvest.setText("");
	    }
	});
    txtEntertainment.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtEntertainment.setText("");
	    }
	});
    txtTranspot.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtTranspot.setText("");
	    }
	});
    txtTada.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtTada.setText("");
	    }
	});
    txtHouseAssetIncome.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtHouseAssetIncome.setText("");
	    }
	});
    txtAgriIncome.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtAgriIncome.setText("");
	    }
	});
    txtOthersIncome.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtOthersIncome.setText("");
	    }
	});
    txtProvident.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtProvident.setText("");
	    }
	});
    txtWelfare.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtWelfare.setText("");
	    }
	});
    txtInsurance.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtInsurance.setText("");
	    }
	});
    txtSavings.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtSavings.setText("");
	    }
	});
    txtOthersInvestment.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtOthersInvestment.setText("");
	    }
	});
    txtNetAsset.addMouseListener(new MouseAdapter() {
	    
	    public void mouseClicked(MouseEvent e) {
	        txtNetAsset.setText("");
	    }
	});
		
		btnTaskCalculate.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent arg0) {
				
				
				sSalary=txtBasicSalary.getText();
				sDueSalary=txtDueSalary.getText();
				sIncentive=txtIncentiveBonus.getText();
				sRent=txtHouseRent.getText();
				sEid=txtEidBonus.getText();
				sMedical=txtMadical.getText();
				sMutual=txtMutualFundInterest.getText();
				sMutualTax=txtMutualFundInterestTax.getText();
				sBank=txtBankInterest.getText();
				sBankTax=txtBankInterestTax.getText();
				sEntertainment=txtEntertainment.getText();
				sTranspot=txtTranspot.getText();
				sHouseAsset=txtHouseAssetIncome.getText();
				sAgriIncome=txtAgriIncome.getText();
				sTada=txtTada.getText();
				sNetAsset=txtNetAsset.getText();
				sOthers=txtOthersIncome.getText();
				sProvident=txtProvident.getText();
				sWelfare=txtWelfare.getText();
				sInsurance=txtInsurance.getText();
				sSavings=txtSavings.getText();
				sOthersInvest=txtOthersInvestment.getText();
				sOverTime=txtoverTime.getText();
				sShareInvest=txtshareInvest.getText();
				
				double dSalary=Double.valueOf(sSalary);
				double dDueSalary=Double.valueOf(sDueSalary);
				double dIncentive=Double.valueOf(sIncentive);
				double dRent=Double.valueOf(sRent);
				double dEid=Double.valueOf(sEid);
				double dMedical=Double.valueOf(sMedical);
				double dMutual=Double.valueOf(sMutual);
				double dMutualTax=Double.valueOf(sMutualTax);
				double dBank=Double.valueOf(sBank);
				double dBankTax=Double.valueOf(sBankTax);
				double dEntertainment=Double.valueOf(sEntertainment);
				double dTranspot=Double.valueOf(sTranspot);
				double dTada=Double.valueOf(sTada);
				double dHouseAsset=Double.valueOf(sHouseAsset);
				double dAgri=Double.valueOf(sAgriIncome);
				double dNetAsset=Double.valueOf(sNetAsset);
				double dOthers=Double.valueOf(sOthers);
				double dProvident=Double.valueOf(sProvident);
				double dWelfare=Double.valueOf(sWelfare);
				double dInsurance=Double.valueOf(sInsurance);
				double dSavings=Double.valueOf(sSavings);
				double dOthersInvest=Double.valueOf(sOthersInvest);
				double dOverTime=Double.valueOf(sOverTime);
				double dShareInvest=Double.valueOf(sShareInvest);
				double totalIncome=0;
				double incomeTax=0;
				double assetTax=0;
				double totalInvest=0;
				dSalary=dSalary*12;
				
				double dTempCmp=dSalary*.10;
				if(dMedical>dTempCmp && dTempCmp<1000000){
					dMedical=dMedical-dTempCmp;
				}else if(dMedical>dTempCmp && dTempCmp>1000000){
					dMedical=dMedical-1000000;
				}else dMedical=0;
	
				
				dRent=dRent*12;
				dTempCmp=dSalary*.50;
				if(dRent>dTempCmp && dTempCmp<300000){
					dRent=dRent-dTempCmp;
				}else if(dRent>dTempCmp && dTempCmp>300000){
					dRent=dRent-300000;
				}else dRent=0;

				if(dTranspot>0){
				dTempCmp=dSalary*.05;
				if(dTempCmp<60000){
					dTranspot=60000;
				}else dTranspot=dTempCmp;
				}
				if(dTada>30000){
					dTada=dTada-30000;
				}else dTada=0;
				double dMutualpre=dMutual;
				if(dMutual>25000){
					dMutual=dMutual-25000;
				}
				
				totalIncome=(dSalary+dDueSalary+dIncentive+dEid+dMedical+dEntertainment+dRent+dTranspot+dTada+dHouseAsset+dAgri+dOthers+dMutual+dBank+dOverTime);
				txttotalIncome.setText(""+totalIncome);
				System.out.println(""+totalIncome);
				double forReayat=totalIncome;
				double income=totalIncome*.25;
				System.out.println(""+income);
			
				if(totalIncome<400000){
					JOptionPane.showMessageDialog(null, "Your Total Income is less than BDT:400000.So,You are not able to pay Income TAX");
					lblDisplay8.setVisible(false);
					mainPanel.removeAll();
					mainPanel.add(new MainDisplay(mainPanel));
				}
				else if(totalIncome>400000 && totalIncome<=800000){
					totalIncome=totalIncome-400000;
					incomeTax=incomeTax+(totalIncome*.10);
				}else if(totalIncome>800000 && totalIncome<=1300000){
					totalIncome=totalIncome-800000;
					incomeTax=40000;
					incomeTax=incomeTax+(totalIncome*.15);
					}else if(totalIncome>1300000 && totalIncome<=1900000){
						totalIncome=totalIncome-1300000;
						incomeTax=40000+75000;
						incomeTax=incomeTax+(totalIncome*.20);
					}else if(totalIncome>1900000 && totalIncome<=4900000){
						totalIncome=totalIncome-1900000;
						incomeTax=40000+75000+120000;
						incomeTax=incomeTax+(totalIncome*.25);
					}else if(totalIncome>4900000){
						totalIncome=totalIncome-4900000;
						incomeTax=40000+75000+120000+750000;
						incomeTax=incomeTax+(totalIncome*.30);
					}
				dProvident=dProvident*12;
				dWelfare=dWelfare*12;
				
				totalInvest=(dProvident+dWelfare+dSavings+dInsurance+dOthersInvest+dShareInvest);
				txttotalInvest.setText(""+totalInvest);
				if(forReayat<=1000000){
					if(totalInvest<income){
						incomeTax=incomeTax-(totalInvest*.15);
					}else incomeTax=incomeTax-(income*.15);
					}else if(forReayat>1000000 && forReayat<=3000000){
						if(totalInvest<income){
							incomeTax=incomeTax-(250000*.15);
							totalInvest=totalInvest-250000;
							incomeTax=incomeTax-(totalInvest*.12);
						}else {
							incomeTax=incomeTax-(250000*.15);
							income=income-250000;
							incomeTax=incomeTax-(income*.12);
						}
					}else if(forReayat>3000000){
						if(totalInvest<income){
							incomeTax=incomeTax-(250000*.15);
							totalInvest=totalInvest-250000;
							incomeTax=incomeTax-(500000*.12);
							totalInvest=totalInvest-500000;
							incomeTax=incomeTax-(totalInvest*.10);
						}else {
							incomeTax=incomeTax-(250000*.15);
							income=income-250000;
							incomeTax=incomeTax-(500000*.12);
							income=income-500000;
							incomeTax=incomeTax-(income*.10);
						}
					}
				
				if(dNetAsset>22500000 && dNetAsset<=50000000){
					assetTax=incomeTax*.10;
					if(assetTax<3000){assetTax=3000;}
				}else if(dNetAsset>50000000 && dNetAsset<=100000000){
					assetTax=incomeTax*.15;
					if(assetTax<3000){assetTax=3000;}
					}else if(dNetAsset>100000000 && dNetAsset<=150000000){
						assetTax=incomeTax*.20;
						if(assetTax<3000){assetTax=3000;}
					}else if(dNetAsset>150000000 && dNetAsset<=200000000){
						assetTax=incomeTax*.25;
						if(assetTax<3000){assetTax=3000;}
					}else if(dNetAsset>200000000){
						assetTax=incomeTax*.30;
						if(assetTax<3000){assetTax=3000;}
					}
				incomeTax=incomeTax+assetTax;
				
				if(dMutualTax>0 || dBankTax>0){
					double temp=dMutualpre*(dMutualTax/100);
					temp=temp+(dBank*(dBankTax/100));
					incomeTax=incomeTax-temp;
				}
				
                if(radioBtnDhaka.isSelected() && incomeTax<5000){
					
					incomeTax=5000;
				}else if(radioBtnCity.isSelected() && incomeTax<4000){
					
					incomeTax=4000;
				}else if(radioBtnNoncity.isSelected() && incomeTax<3000){
					
					incomeTax=3000;
				}
				
				txtTaskCalculate.setText(""+incomeTax);
			}
		});
	
	
	
	}

}