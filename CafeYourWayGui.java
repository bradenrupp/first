package cafeYourWayGui;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class CafeYourWayGui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel topPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CafeYourWayGui frame = new CafeYourWayGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the frame.
	 */
	public CafeYourWayGui() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 275, 479);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		topPanel.setBackground(new Color(255, 165, 0));
		topPanel.setForeground(Color.GRAY);
		topPanel.setBounds(0, 0, 275, 39);
		contentPane.add(topPanel);
		topPanel.setLayout(null);
		
		JLabel lblCafeYourWay = new JLabel("Caf\u00E9 Your Way");
		lblCafeYourWay.setForeground(new Color(255, 255, 255));
		lblCafeYourWay.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCafeYourWay.setFont(new Font("MAXIMO", Font.BOLD, 24));
		lblCafeYourWay.setBounds(122, 6, 147, 27);
		topPanel.add(lblCafeYourWay);
		
		JLabel backButton = new JLabel("");
		backButton.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/backButton.png")));
		backButton.setBounds(0, 0, 39, 39);
		topPanel.add(backButton);
		
		final JLabel lblClickToSearch = new JLabel("Click to search ->");
		lblClickToSearch.setFont(new Font("MAXIMO", Font.BOLD, 12));
		lblClickToSearch.setBounds(64, 16, 73, 16);
		topPanel.add(lblClickToSearch);
		
		JLayeredPane ratingPanel = new JLayeredPane();
		ratingPanel.setLayer(contentPane, 0);
		ratingPanel.setOpaque(true);
		ratingPanel.setBackground(Color.WHITE);
		ratingPanel.setBounds(0, 39, 275, 205);
		contentPane.add(ratingPanel);
		ratingPanel.setLayout(null);
		
		JLabel lblAtsmosphere = new JLabel("Atsmosphere");
		lblAtsmosphere.setFont(new Font("MAXIMO", Font.BOLD, 20));
		lblAtsmosphere.setBounds(6, 5, 94, 26);
		ratingPanel.add(lblAtsmosphere);
		
		JLabel lblStudyAbility = new JLabel("Study Ability");
		lblStudyAbility.setFont(new Font("MAXIMO", Font.BOLD, 20));
		lblStudyAbility.setBounds(6, 70, 94, 26);
		ratingPanel.add(lblStudyAbility);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("MAXIMO", Font.BOLD, 20));
		lblDrinks.setBounds(6, 135, 56, 26);
		ratingPanel.add(lblDrinks);
		
		final JSlider atsmosphereSlider = new JSlider();
		atsmosphereSlider.setBounds(6, 30, 223, 40);
		Font font = new Font("Maximo", Font.BOLD, 8);
		atsmosphereSlider.setValue(5);
		atsmosphereSlider.setFont(font);
		atsmosphereSlider.setMinimum(1);
		atsmosphereSlider.setMaximum(10);
		atsmosphereSlider.setSnapToTicks(true);
		atsmosphereSlider.setMajorTickSpacing(1);
		atsmosphereSlider.setMinorTickSpacing(1);
		atsmosphereSlider.setPaintTicks(true);
		atsmosphereSlider.setPaintLabels(true);
		ratingPanel.add(atsmosphereSlider);
		
		JLabel lblAtsmosphereDesc = new JLabel("Music/Lighting/Seating");
		lblAtsmosphereDesc.setBackground(Color.GRAY);
		lblAtsmosphereDesc.setForeground(Color.GRAY);
		lblAtsmosphereDesc.setFont(new Font("MAXIMO", Font.PLAIN, 17));
		lblAtsmosphereDesc.setBounds(99, 7, 165, 26);
		ratingPanel.add(lblAtsmosphereDesc);
		
		JLabel lblStudyDesc = new JLabel("Tables/Outlets/Wifi\n");
		lblStudyDesc.setFont(new Font("MAXIMO", Font.PLAIN, 17));
		lblStudyDesc.setForeground(Color.GRAY);
		lblStudyDesc.setBounds(99, 73, 152, 24);
		ratingPanel.add(lblStudyDesc);
		
		JLabel lblTastevarietyprice = new JLabel("Taste/Variety/Price");
		lblTastevarietyprice.setForeground(Color.GRAY);
		lblTastevarietyprice.setFont(new Font("MAXIMO", Font.PLAIN, 17));
		lblTastevarietyprice.setBounds(99, 142, 127, 16);
		ratingPanel.add(lblTastevarietyprice);
		
		
		
		final JSlider studySlider = new JSlider();
		studySlider.setBounds(6, 95, 223, 40);
		studySlider.setValue(5);
		studySlider.setFont(font);
		studySlider.setMinimum(1);
		studySlider.setMaximum(10);
		studySlider.setSnapToTicks(true);
		studySlider.setMajorTickSpacing(1);
		studySlider.setMinorTickSpacing(1);
		studySlider.setPaintTicks(true);
		studySlider.setPaintLabels(true);
		ratingPanel.add(studySlider);
		
		final JSlider drinkSlider = new JSlider();
		drinkSlider.setBounds(6, 160, 223, 40);
		drinkSlider.setValue(5);
		drinkSlider.setFont(font);
		drinkSlider.setMinimum(1);
		drinkSlider.setMaximum(10);
		drinkSlider.setSnapToTicks(true);
		drinkSlider.setMajorTickSpacing(1);
		drinkSlider.setMinorTickSpacing(1);
		drinkSlider.setPaintTicks(true);
		drinkSlider.setPaintLabels(true);
		ratingPanel.add(drinkSlider);
		
		final JLabel lblADesc = new JLabel("");
		// create a line border with the specified color and width
		Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED, Color.BLACK, Color.LIGHT_GRAY);
		// set the border of this component
		lblADesc.setBorder(border);
		lblADesc.setVisible(false);

		lblADesc.setBackground(Color.WHITE);
		lblADesc.setForeground(new Color(0, 0, 0));
		lblADesc.setFont(new Font("MAXIMO", Font.BOLD, 18));
		lblADesc.setBounds(16, 30, 210, 38);
		ratingPanel.add(lblADesc);
		
		final JLabel lblSDesc = new JLabel("");
		lblSDesc.setFont(new Font("MAXIMO", Font.BOLD, 18));
		lblSDesc.setBorder(border);
		lblSDesc.setVisible(false);
		lblSDesc.setBounds(16, 95, 210, 38);
		ratingPanel.add(lblSDesc);
		
		final JLabel lblDDesc = new JLabel("");
		lblDDesc.setFont(new Font("MAXIMO", Font.BOLD, 18));
		lblDDesc.setBorder(border);
		lblDDesc.setVisible(false);
		lblDDesc.setBounds(16, 160, 210, 38);
		ratingPanel.add(lblDDesc);
		
		
		final JLayeredPane cafePanel = new JLayeredPane();
		cafePanel.setOpaque(true);
		cafePanel.setBackground(Color.WHITE);
		cafePanel.setBounds(0, 244, 275, 213);
		contentPane.add(cafePanel);
		cafePanel.setLayout(null);
		
		final JLabel lblCoffePic = new JLabel("");
		lblCoffePic.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/coffeePic.png")));
		lblCoffePic.setBounds(220, 151, 49, 53);
		cafePanel.add(lblCoffePic);
		
		final JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/backgroundImage.png")));
		lblBackground.setBounds(6, 7, 263, 197);
		cafePanel.add(lblBackground);
		
		final JLabel lblCafeName = new JLabel("");
		lblCafeName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCafeName.setFont(new Font("MAXIMO", Font.BOLD, 25));
		lblCafeName.setBounds(6, 6, 263, 33);
		cafePanel.add(lblCafeName);
		
		final JLabel lblMap = new JLabel("");
		Border blackLine = BorderFactory.createLineBorder(Color.black);
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border mapBorder;
		mapBorder = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
		lblMap.setBorder(mapBorder);
		mapBorder = BorderFactory.createCompoundBorder(blackLine, mapBorder);
		lblMap.setBorder(mapBorder);
		lblMap.setForeground(new Color(0, 0, 0));
		lblMap.setBounds(67, 44, 140, 80);
		cafePanel.add(lblMap);
		
		final JLabel lblMenu = new JLabel("M E N U");
		lblMenu.setVisible(false);
		lblMenu.setFont(new Font("MAXIMO", Font.BOLD, 15));
		lblMenu.setBounds(210, 130, 61, 16);
		cafePanel.add(lblMenu);
		
		final JLabel lblTime = new JLabel("T I M E S :");
		lblTime.setVisible(false);
		lblTime.setForeground(new Color(0, 0, 0));
		lblTime.setFont(new Font("MAXIMO", Font.BOLD, 15));
		lblTime.setBounds(6, 130, 61, 16);
		cafePanel.add(lblTime);
		
		final JLabel lblGoodTime = new JLabel("");
		lblGoodTime.setToolTipText("slow");
		lblGoodTime.setForeground(new Color(0, 0, 255));
		lblGoodTime.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblGoodTime.setBounds(6, 145, 216, 16);
		cafePanel.add(lblGoodTime);
		
		final JLabel lblBadTime = new JLabel("");
		lblBadTime.setToolTipText("busy");
		lblBadTime.setForeground(new Color(165, 42, 42));
		lblBadTime.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblBadTime.setBounds(6, 160, 216, 16);
		cafePanel.add(lblBadTime);
		
		textField = new JTextField();
		textField.setBorder(border);
		textField.setBackground(Color.BLACK);
		textField.setBounds(0, 0, 275, 7);
		cafePanel.add(textField);
		textField.setColumns(10);
		
		final JLabel lblYouMightAlso = new JLabel("You might also enjoy:");
		lblYouMightAlso.setVisible(false);
		lblYouMightAlso.setFont(new Font("MAXIMO", Font.PLAIN, 13));
		lblYouMightAlso.setBounds(16, 188, 106, 16);
		cafePanel.add(lblYouMightAlso);
		
		final JLabel lblSecondChoice = new JLabel("");
		lblSecondChoice.setFont(new Font("MAXIMO", Font.PLAIN, 13));
		lblSecondChoice.setBounds(117, 188, 105, 16);
		cafePanel.add(lblSecondChoice);
		
		final JLabel lblRightArrow = new JLabel("New label");
		lblRightArrow.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/backButtonRight.png")));
		lblRightArrow.setBounds(216, 82, 25, 25);
		cafePanel.add(lblRightArrow);
		
		final JLabel lblLeftArrow = new JLabel("New label");
		lblLeftArrow.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/backButtonLeft.png")));
		lblLeftArrow.setBounds(30, 82, 25, 25);
		cafePanel.add(lblLeftArrow);
		
		final JLabel lblPictureCounter = new JLabel("1/3");
		lblPictureCounter.setEnabled(false);
		lblPictureCounter.setBounds(210, 110, 23, 16);
		cafePanel.add(lblPictureCounter);
		
		final JLabel lblBigPicture = new JLabel("");
		lblBigPicture.setVisible(false);
		lblBigPicture.setBounds(0, 42, 275, 162);
		lblBigPicture.setBorder(mapBorder);
		cafePanel.add(lblBigPicture);
		
		
		//ACTION LISTENERS
		
		//*** BIG PICTURE ***
		lblBigPicture.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Sets back to blank for mouse reasons
				lblMap.setText("");
				lblBigPicture.setVisible(false);
				lblPictureCounter.setVisible(true);

				lblGoodTime.setVisible(true);
				lblBadTime.setVisible(true);
				lblTime.setVisible(true);
				lblMenu.setVisible(true);
				lblMap.setVisible(true);
				lblRightArrow.setVisible(true);
				lblLeftArrow.setVisible(true);
				lblSecondChoice.setVisible(true);
				lblYouMightAlso.setVisible(true);
				lblCoffePic.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				if (lblMap.getText().equals("open"))
				{
					setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

				}
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor (Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
		//***WHEN CAFE YOUR WAY BUTTON IS CLICKED***
		lblCafeYourWay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if (lblCafeName.getText().equals(""))
				{
					
				//hides click to search
				lblClickToSearch.setVisible(false);
				
				//sets pictureCOunter to 1/3
				lblPictureCounter.setText("1/3");
				
				//hides sliders
				atsmosphereSlider.setVisible(false);
				studySlider.setVisible(false);
				drinkSlider.setVisible(false);
				
				//Shows borders
				lblADesc.setVisible(true);
				lblSDesc.setVisible(true);
				lblDDesc.setVisible(true);
				
				//Gets Values from Slider
				double aVal = atsmosphereSlider.getValue() / 2.0;
				double sVal = studySlider.getValue() /2.0;
				double dVal = drinkSlider.getValue() * 1.0;
				//Declares String of Company Name
				String bestCafeMatch = getBestMatch(aVal, sVal, dVal);
				
				if (bestCafeMatch.equals("Gerdin"))
				{
					lblBackground.setVisible(false);
					lblCafeName.setText("Gerdin Business Cafe");
					lblGoodTime.setText("8:00-10:00");
					lblBadTime.setText("11:00-1:00");
					lblGoodTime.setVisible(true);
					lblBadTime.setVisible(true);
					lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/gerdinCafe.png")));
					lblTime.setVisible(true);
					lblMenu.setVisible(true);
					lblSecondChoice.setText("Caribou Coffee");
					lblYouMightAlso.setVisible(true);
					lblADesc.setText("  Lots of seating");
					lblSDesc.setText("  Lots of tables/outlets");
					lblDDesc.setText("  Serves coffee and hot food");


				}
				
				if (bestCafeMatch.equals("Memorial Union"))
				{
					lblBackground.setVisible(false);
					lblCafeName.setText("MU Market & Cafe");
					lblGoodTime.setText("9:00-11:00");
					lblBadTime.setText("12:00-1:00");
					lblGoodTime.setVisible(true);
					lblBadTime.setVisible(true);
					lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/memorialCafe.png")));
					lblTime.setVisible(true);
					lblMenu.setVisible(true);
					lblSecondChoice.setText("Design Cafe");
					lblYouMightAlso.setVisible(true);
					lblADesc.setText("  Convenience store");
					lblSDesc.setText("  Only 2 tables");
					lblDDesc.setText("  Lots of Variety");

				}
				
				if (bestCafeMatch.equals("Laggo"))
				{
					lblBackground.setVisible(false);
					lblCafeName.setText("Courtyard Cafe");
					lblGoodTime.setText("8:00-10:00");
					lblBadTime.setText("11:00-12:00");
					lblGoodTime.setVisible(true);
					lblBadTime.setVisible(true);
					lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/laggoCafe.png")));
					lblTime.setVisible(true);
					lblMenu.setVisible(true);
					lblSecondChoice.setText("Bookends Cafe");
					lblYouMightAlso.setVisible(true);
					lblADesc.setText("  Small cafe feel");
					lblSDesc.setText("  A few tables");
					lblDDesc.setText("  Great drinks");

					
				}
				
				if (bestCafeMatch.equals("Global"))
				{
					lblBackground.setVisible(false);
					lblCafeName.setText("Global Cafe");
					lblGoodTime.setText("10:00-12:00");
					lblBadTime.setText("12:00-2:00");
					lblGoodTime.setVisible(true);
					lblBadTime.setVisible(true);
					lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/globalCafe.png")));
					lblTime.setVisible(true);
					lblMenu.setVisible(true);
					lblSecondChoice.setText("Gentle Doctor Cafe");
					lblYouMightAlso.setVisible(true);
					lblADesc.setText("  Quiet");
					lblSDesc.setText("  Big lounge area");
					lblDDesc.setText("  Smaller selection");

				}
				
				if (bestCafeMatch.equals("Library"))
				{
					lblBackground.setVisible(false);
					lblCafeName.setText("Bookends Cafe");
					lblGoodTime.setText("1:30-3:00");
					lblBadTime.setText("11:30:-1:30");
					lblGoodTime.setVisible(true);
					lblBadTime.setVisible(true);
					lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/libraryCafe.png")));
					lblTime.setVisible(true);
					lblMenu.setVisible(true);
					lblSecondChoice.setText("Courtyard Cafe");
					lblYouMightAlso.setVisible(true);
					lblADesc.setText("  Warm and inviting");
					lblSDesc.setText("  Small study area");
					lblDDesc.setText("  Food and drink options");

				}
				
				if (bestCafeMatch.equals("Caribou"))
				{
					lblBackground.setVisible(false);
					lblCafeName.setText("Caribou Coffee");
					lblGoodTime.setText("2:00-4:00");
					lblBadTime.setText("11:30-2:00");
					lblGoodTime.setVisible(true);
					lblBadTime.setVisible(true);
					lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/caribouCafe.png")));
					lblTime.setVisible(true);
					lblMenu.setVisible(true);
					lblSecondChoice.setText("Gerdin Business Cafe");
					lblYouMightAlso.setVisible(true);
					lblADesc.setText("  Traditional Cafe");
					lblSDesc.setText("  Lots of study areas");
					lblDDesc.setText("  Quality Drinks");

				}
				
				if (bestCafeMatch.equals("Design"))
				{
					lblBackground.setVisible(false);
					lblCafeName.setText("Design Cafe");
					lblGoodTime.setText("9:00-10:30");
					lblBadTime.setText("11:00-12:30");
					lblGoodTime.setVisible(true);
					lblBadTime.setVisible(true);
					lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/designCafe.png")));
					lblTime.setVisible(true);
					lblMenu.setVisible(true);
					lblSecondChoice.setText("MU Market & Cafe");
					lblYouMightAlso.setVisible(true);
					lblADesc.setText("  Small cafe");
					lblSDesc.setText("  Open seating area");
					lblDDesc.setText("  Food and drink variety");

				}
				
				if (bestCafeMatch.equals("Vet Med"))
				{
					lblBackground.setVisible(false);
					lblCafeName.setText("Gentle Doctor Cafe");
					lblGoodTime.setText("10:00-12:00");
					lblBadTime.setText("12:00-2:00     *In VetMed Campus");
					lblGoodTime.setVisible(true);
					lblBadTime.setVisible(true);
					lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/vetmedCafe.png")));
					lblTime.setVisible(true);
					lblMenu.setVisible(true);
					lblSecondChoice.setText("Global Cafe");
					lblYouMightAlso.setVisible(true);
					lblADesc.setText("  Friendly environment");
					lblSDesc.setText("  A few tables, no outlets");
					lblDDesc.setText("  Lots of Variety");

				}
				}
			}
			
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				if (lblCafeName.getText().equals(""))
				{
				setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor (Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
		//***BACK BUTTON***
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblBackground.setVisible(true);
				lblBigPicture.setVisible(false);
				lblClickToSearch.setVisible(true);
				atsmosphereSlider.setValue(5);
				studySlider.setValue(5);
				drinkSlider.setValue(5);
				lblMap.setIcon(null);
				lblCafeName.setText("");
				lblTime.setVisible(false);
				lblGoodTime.setVisible(false);
				lblBadTime.setVisible(false);
				lblMenu.setVisible(false);
				lblSecondChoice.setText("");
				lblPictureCounter.setText("1/3");
				//shows sliders
				atsmosphereSlider.setVisible(true);
				studySlider.setVisible(true);
				drinkSlider.setVisible(true);
				lblADesc.setText("");
				lblSDesc.setText("");
				lblDDesc.setText("");
				lblADesc.setVisible(false);
				lblSDesc.setVisible(false);
				lblDDesc.setVisible(false);




			}
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor (Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
		//**SECOND CHOICE***
		lblSecondChoice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String secondChoice = lblSecondChoice.getText();
				
				//sets pictureCOunter to 1/3
				lblPictureCounter.setText("1/3");
				
				if (secondChoice.equals("Gerdin Business Cafe"))
				{
					lblBackground.setVisible(false);
					lblCafeName.setText("Gerdin Business Cafe");
					lblGoodTime.setText("8:00-10:00");
					lblBadTime.setText("11:00-1:00");
					lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/gerdinCafe.png")));
					lblTime.setVisible(true);
					lblMenu.setVisible(true);
					lblSecondChoice.setText("Caribou Coffee");
					lblYouMightAlso.setVisible(true);
					lblADesc.setText("  Lots of seating");
					lblSDesc.setText("  Lots of tables/outlets");
					lblDDesc.setText("  Serves coffee and hot food");

				}
				
				if (secondChoice.equals("MU Market & Cafe"))
				{
					lblBackground.setVisible(false);
					lblCafeName.setText("MU Market & Cafe");
					lblGoodTime.setText("9:00-11:00");
					lblBadTime.setText("12:00-1:00");
					lblGoodTime.setVisible(true);
					lblBadTime.setVisible(true);
					lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/memorialCafe.png")));
					lblTime.setVisible(true);
					lblMenu.setVisible(true);
					lblSecondChoice.setText("Design Cafe");
					lblYouMightAlso.setVisible(true);
					lblADesc.setText("  Convenience store");
					lblSDesc.setText("  Only 2 tables");
					lblDDesc.setText("  Lots of Variety");


				}
				
				if (secondChoice.equals("Courtyard Cafe"))
				{
					lblBackground.setVisible(false);
					lblCafeName.setText("Courtyard Cafe");
					lblGoodTime.setText("8:00-10:00");
					lblBadTime.setText("11:00-12:00");
					lblGoodTime.setVisible(true);
					lblBadTime.setVisible(true);
					lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/laggoCafe.png")));
					lblTime.setVisible(true);
					lblMenu.setVisible(true);
					lblSecondChoice.setText("Bookends Cafe");
					lblYouMightAlso.setVisible(true);
					lblADesc.setText("  Small cafe feel");
					lblSDesc.setText("  A few tables");
					lblDDesc.setText("  Great drinks");

					
				}
				
				if (secondChoice.equals("Global Cafe"))
				{
					lblBackground.setVisible(false);
					lblCafeName.setText("Global Cafe");
					lblGoodTime.setText("10:00-12:00");
					lblBadTime.setText("12:00-2:00");
					lblGoodTime.setVisible(true);
					lblBadTime.setVisible(true);
					lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/globalCafe.png")));
					lblTime.setVisible(true);
					lblMenu.setVisible(true);
					lblSecondChoice.setText("Gentle Doctor Cafe");
					lblYouMightAlso.setVisible(true);
					lblADesc.setText("  Quiet");
					lblSDesc.setText("  Big lounge area");
					lblDDesc.setText("  Smaller selection");

				}
				
				if (secondChoice.equals("Bookends Cafe"))
				{
					lblBackground.setVisible(false);
					lblCafeName.setText("Bookends Cafe");
					lblGoodTime.setText("1:30-3:00");
					lblBadTime.setText("11:30:-1:30");
					lblGoodTime.setVisible(true);
					lblBadTime.setVisible(true);
					lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/libraryCafe.png")));
					lblTime.setVisible(true);
					lblMenu.setVisible(true);
					lblSecondChoice.setText("Courtyard Cafe");
					lblYouMightAlso.setVisible(true);
					lblADesc.setText("  Warm and inviting");
					lblSDesc.setText("  Small study area");
					lblDDesc.setText("  Food and drink options");

				}
				
				if (secondChoice.equals("Caribou Coffee"))
				{
					lblBackground.setVisible(false);
					lblCafeName.setText("Caribou Coffee");
					lblGoodTime.setText("2:00-4:00");
					lblBadTime.setText("11:30-2:00");
					lblGoodTime.setVisible(true);
					lblBadTime.setVisible(true);
					lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/caribouCafe.png")));
					lblTime.setVisible(true);
					lblMenu.setVisible(true);
					lblSecondChoice.setText("Gerdin Business Cafe");
					lblYouMightAlso.setVisible(true);
					lblADesc.setText("  Traditional Cafe");
					lblSDesc.setText("  Lots of study areas");
					lblDDesc.setText("  Quality Drinks");


				}
				
				if (secondChoice.equals("Design Cafe"))
				{
					lblBackground.setVisible(false);
					lblCafeName.setText("Design Cafe");
					lblGoodTime.setText("9:00-10:30");
					lblBadTime.setText("11:00-12:30");
					lblGoodTime.setVisible(true);
					lblBadTime.setVisible(true);
					lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/designCafe.png")));
					lblTime.setVisible(true);
					lblMenu.setVisible(true);
					lblSecondChoice.setText("MU Market & Cafe");
					lblYouMightAlso.setVisible(true);
					lblADesc.setText("  Small cafe");
					lblSDesc.setText("  Open seating area");
					lblDDesc.setText("  Food and drink variety");
				}
				
				if (secondChoice.equals("Gentle Doctor Cafe"))
				{
					lblBackground.setVisible(false);
					lblCafeName.setText("Gentle Doctor Cafe");
					lblGoodTime.setText("10:00-12:00");
					lblBadTime.setText("12:00-2:00     *In VetMed Campus");
					lblGoodTime.setVisible(true);
					lblBadTime.setVisible(true);
					lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource("/resources/vetmedCafe.png")));
					lblTime.setVisible(true);
					lblMenu.setVisible(true);
					lblSecondChoice.setText("Global Cafe");
					lblYouMightAlso.setVisible(true);
					lblADesc.setText("  Friendly environment");
					lblSDesc.setText("  A few tables, no outlets");
					lblDDesc.setText("  Lots of Variety");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				String secondChoice = lblSecondChoice.getText();
				if (!secondChoice.equals(""))
				{
				setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor (Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
		//***MENU BUTTON***
		lblMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
				
				String cafeName = lblCafeName.getText();
				
				if (!cafeName.equals(""))
				{
				String url = "";
				
				if (cafeName.equals("Gerdin Business Cafe")) url = "http://www.dining.iastate.edu/places/venue?id=11";
				if (cafeName.equals("MU Market & Cafe")) url = "http://www.dining.iastate.edu/places/venue?id=22";
				if (cafeName.equals("Courtyard Cafe")) url = "http://www.dining.iastate.edu/places/venue?id=13";
				if (cafeName.equals("Global Cafe")) url = "http://www.dining.iastate.edu/places/venue?id=28";
				if (cafeName.equals("Bookends Cafe")) url = "http://www.dining.iastate.edu/places/venue?id=21";
				if (cafeName.equals("Caribou Coffee")) url = "http://www.dining.iastate.edu/places/venue?id=18";
				if (cafeName.equals("Design Cafe")) url = "http://www.dining.iastate.edu/places/venue?id=14";
				if (cafeName.equals("Gentle Doctor Cafe")) url = "http://www.dining.iastate.edu/places/venue?id=15";
				
				//call openInBrowser Method, takes url from above on whatever company is open at the moment
				openInBrowser(url);
				
			}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if (!lblCafeName.getText().equals(""))
				{
					setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor (Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

			}
		});
		
		//***SMALL MAP***
		lblMap.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String cafeName = lblCafeName.getText();
				
				if (lblPictureCounter.getText().equals("1/3"))
				{
				if (!cafeName.equals(""))
				{
				String url = "";
				
				if (cafeName.equals("Gerdin Business Cafe")) url = "http://www.fpm.iastate.edu/maps/default.asp?zoom=2&xcenter=1896&ycenter=2226&xshow=1896&yshow=2226";
				if (cafeName.equals("MU Market & Cafe")) url = "http://www.fpm.iastate.edu/maps/default.asp?zoom=2&xcenter=1779&ycenter=2409&xshow=1779&yshow=2409";
				if (cafeName.equals("Courtyard Cafe")) url = "http://www.fpm.iastate.edu/maps/default.asp?zoom=2&xcenter=1823&ycenter=1726&xshow=1823&yshow=1726";
				if (cafeName.equals("Global Cafe")) url = "http://www.fpm.iastate.edu/maps/default.asp?zoom=2&xcenter=1873&ycenter=2130&xshow=1873&yshow=2130";
				if (cafeName.equals("Bookends Cafe")) url = "http://www.fpm.iastate.edu/maps/default.asp?zoom=2&xcenter=1529&ycenter=1937&xshow=1529&yshow=1937";
				if (cafeName.equals("Caribou Coffee")) url = "http://www.fpm.iastate.edu/maps/default.asp?zoom=2&xcenter=1568&ycenter=2017&xshow=1568&yshow=2017";
				if (cafeName.equals("Design Cafe")) url = "http://www.fpm.iastate.edu/maps/default.asp?zoom=2&xcenter=1185&ycenter=1874&xshow=1185&yshow=1874";
				if (cafeName.equals("Gentle Doctor Cafe")) url = "http://www.fpm.iastate.edu/maps/default.asp?zoom=2&xcenter=2868&ycenter=4240&xshow=2868&yshow=4240";
				
				//call openInBrowser Method, takes url from above on whatever company is open at the moment
				openInBrowser(url);
			}
			}
			
			
			if (lblPictureCounter.getText().equals("2/3") || lblPictureCounter.getText().equals("3/3"))
			{
				lblMap.setText("open");
				
				lblBigPicture.setVisible(true);
				lblGoodTime.setVisible(false);
				lblBadTime.setVisible(false);
				lblPictureCounter.setVisible(false);
				lblTime.setVisible(false);
				lblMenu.setVisible(false);
				lblMap.setVisible(false);
				lblRightArrow.setVisible(false);
				lblLeftArrow.setVisible(false);
				lblSecondChoice.setVisible(false);
				lblYouMightAlso.setVisible(false);
				lblCoffePic.setVisible(false);
				lblBigPicture.setIcon(new ImageIcon(CafeYourWayGui.class.getResource(changeBigPicture(lblCafeName.getText(), lblPictureCounter.getText()))));
				
				
			}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if (!lblCafeName.getText().equals(""))
				{
					setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
					setCursor (Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
				
			}
		});
		
		//*** RIGHT ARROW ***
		lblRightArrow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					String pictureCounter = lblPictureCounter.getText();
					String pictureSource = "";
					
					if (pictureCounter.equals("1/3"))
					{
						lblPictureCounter.setText("2/3");
						pictureSource = changeMapPicture(lblCafeName.getText(), "2/3");
						lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource(pictureSource)));
						
					}
					
					else if (pictureCounter.equals("2/3"))
					{
						lblPictureCounter.setText("3/3");
						pictureSource = changeMapPicture(lblCafeName.getText(), "3/3");
						lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource(pictureSource)));
						
					}
					
					else if (pictureCounter.equals("3/3"))
					{
						lblPictureCounter.setText("1/3");
						pictureSource = changeMapPicture(lblCafeName.getText(), "1/3");
						lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource(pictureSource)));
						
					}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				if (!lblCafeName.getText().equals(""))
				{
					setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor (Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

			}
		});
		
		//*** LEFT ARROW ***
		lblLeftArrow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					String pictureCounter = lblPictureCounter.getText();
					
					if (pictureCounter.equals("1/3"))
					{
						lblPictureCounter.setText("3/3");
						lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource(changeMapPicture(lblCafeName.getText(), "3/3"))));
					
					}
					
					else if (pictureCounter.equals("2/3"))
					{
						lblPictureCounter.setText("1/3");
						lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource(changeMapPicture(lblCafeName.getText(), "1/3"))));
						

					}

					else if (pictureCounter.equals("3/3"))
					{
						lblPictureCounter.setText("2/3");
						lblMap.setIcon(new ImageIcon(CafeYourWayGui.class.getResource(changeMapPicture(lblCafeName.getText(), "2/3"))));

					}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if (!lblCafeName.getText().equals(""))
				{
					setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor (Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

			}
		});
	}
	
	public String getBestMatch(double aRating, double sRating, double tRating)
	{
		//Declares the arrays filled with rating and also declares a compare array for the user input preferences
		//Which gets the totals from the Jsliders
		 double[] compareArray = new double[3];
	     double[] gerdinArray = {4.5,4.5,7.5};
	     double[] memorialArray = {3,2.5,9};
	     double[] laggoArray = {5,2,7.5};
	     double[] globalArray = {4,5,6.5};
	     double[] libraryArray = {4,3.5,8};
	     double[] caribouArray = {4,5,8};
	     double[] designArray = {3.5,4,8};
	     double[] vetmedArray = {2.5,4,8};
	     
	        
	     //Fills compare Array with numbers from sliders
	     compareArray[0] = aRating; //atsmosphere Rating
	     compareArray[1] = sRating; //Study ability Rating
	     compareArray[2] = tRating; // taste/drinks rating
	     
	     //Declares difference ratings Array
	     /* 0) Gerdin
	      * 1) Memorial Union
	      * 2) Laggo
	      * 3) Global
	      * 4) Library
	      * 5) Caribou
	      * 6) Design
	      * 7) VetMed
	      */
	     
	     double[] difRatingArray = new double[8];
	     
	     
	     //******DIFFERENCE RATINGS BELOW******
	     
	     //GERDRIN
	     for(int i=0; i<3; i++)
         {
             double dif = compareArray[i] - gerdinArray[i];
             difRatingArray[0] = difRatingArray[0] + Math.abs(dif);
         }
         
         //MEMORIAL UNION
         for(int i=0; i<3; i++)
         {
             double dif = compareArray[i] - memorialArray[i];
             difRatingArray[1] = difRatingArray[1] + Math.abs(dif);
         }
         
         //LAGGO
         for(int i=0; i<3; i++)
         {
             double dif = compareArray[i] - laggoArray[i];
             difRatingArray[2] = difRatingArray[2] + Math.abs(dif);
         }
         
         //GLOBAL
         for(int i=0; i<3; i++)
         {
             double dif = compareArray[i] - globalArray[i];
             difRatingArray[3] = difRatingArray[3] + Math.abs(dif);
         }
         
         //LIBRARY
         for(int i=0; i<3; i++)
         {
             double dif = compareArray[i] - libraryArray[i];
             difRatingArray[4] = difRatingArray[4] + Math.abs(dif);
         }
         
         //CARIBOU
         for(int i=0; i<3; i++)
         {
             double dif = compareArray[i] - caribouArray[i];
             difRatingArray[5] = difRatingArray[5] + Math.abs(dif);
         }
         
         //DESIGN
         for(int i=0; i<3; i++)
         {
             double dif = compareArray[i] - designArray[i];
             difRatingArray[6] = difRatingArray[6] + Math.abs(dif);
         }
         
         //VET MED (THE GENTLE DOCTOR)
         for(int i=0; i<3; i++)
         {
             double dif = compareArray[i] - vetmedArray[i];
             difRatingArray[7] = difRatingArray[7] + Math.abs(dif);
         }
         

         
         
         //***Gets lowest difference Rating***
         //Assume that Gerdin is the lowest, then compares below and switches to the lowest.
         	 double lowDifRating = difRatingArray[0];
            
             for(int i=1; i<8;i++)
             {
            	 if (difRatingArray[i] < lowDifRating) lowDifRating = difRatingArray[i];
             }
         
           //Declares String and int for the Best Cafe 
             
             int bestMatchCafeNumber =0;
             String bestMatchCafe ="";
             
             
           //Says which number of the array has the best match, quits after first match is found
            
            
             for(int i =0; i<8; i++)
             {
            	 if (lowDifRating == difRatingArray[i]) 
            		 {
            		 bestMatchCafeNumber = i;
            		 i = 7; //Stops after the first match is found
            		 }
             }
             
             //Inputs best match cafe into the string
             
             if (bestMatchCafeNumber == 0) bestMatchCafe = "Gerdin";
             if (bestMatchCafeNumber == 1) bestMatchCafe = "Memorial Union";
             if (bestMatchCafeNumber == 2) bestMatchCafe = "Laggo";
             if (bestMatchCafeNumber == 3) bestMatchCafe = "Global";
             if (bestMatchCafeNumber == 4) bestMatchCafe = "Library";
             if (bestMatchCafeNumber == 5) bestMatchCafe = "Caribou";
             if (bestMatchCafeNumber == 6) bestMatchCafe = "Design";
             if (bestMatchCafeNumber == 7) bestMatchCafe = "Vet Med";
        
       			return  bestMatchCafe;
       				
        	}
	
		public void openInBrowser(String url)
		{
			if(Desktop.isDesktopSupported())
				try {
					Desktop.getDesktop().browse(new URI(url));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
		
		public String changeMapPicture(String cafeName, String pictureNumber)
		{
			String pictureSource = "";
			if (cafeName.equals("Gerdin Business Cafe") && pictureNumber.equals("1/3")) pictureSource = "/resources/gerdinCafe.png";
			if (cafeName.equals("Gerdin Business Cafe") && pictureNumber.equals("2/3")) pictureSource = "/resources/testS.JPG";
			if (cafeName.equals("Gerdin Business Cafe") && pictureNumber.equals("3/3")) pictureSource = "/resources/testS.JPG";
			
			if (cafeName.equals("MU Market & Cafe") && pictureNumber.equals("1/3")) pictureSource = "/resources/memorialCafe.png";
			if (cafeName.equals("MU Market & Cafe") && pictureNumber.equals("2/3")) pictureSource = "/resources/memorialS1.JPG";
			if (cafeName.equals("MU Market & Cafe") && pictureNumber.equals("3/3")) pictureSource = "/resources/memorialS2.JPG";

			
			
			if (cafeName.equals("Courtyard Cafe") && pictureNumber.equals("1/3")) pictureSource = "/resources/laggoCafe.png";
			if (cafeName.equals("Courtyard Cafe") && pictureNumber.equals("2/3")) pictureSource = "/resources/courtyardS1.JPG";
			if (cafeName.equals("Courtyard Cafe") && pictureNumber.equals("3/3")) pictureSource = "/resources/courtyardS2.JPG";

			
			
			if (cafeName.equals("Global Cafe") && pictureNumber.equals("1/3")) pictureSource = "/resources/globalCafe.png";
			if (cafeName.equals("Global Cafe") && pictureNumber.equals("2/3")) pictureSource = "/resources/globalS1.JPG";
			if (cafeName.equals("Global Cafe") && pictureNumber.equals("3/3")) pictureSource = "/resources/globalS2.JPG";

			
			if (cafeName.equals("Bookends Cafe") && pictureNumber.equals("1/3")) pictureSource = "/resources/libraryCafe.png";
			if (cafeName.equals("Bookends Cafe") && pictureNumber.equals("2/3")) pictureSource = "/resources/bookendsS1.JPG";
			if (cafeName.equals("Bookends Cafe") && pictureNumber.equals("3/3")) pictureSource = "/resources/bookendsS2.JPG";

			if (cafeName.equals("Caribou Coffee") && pictureNumber.equals("1/3")) pictureSource = "/resources/caribouCafe.png";
			if (cafeName.equals("Caribou Coffee") && pictureNumber.equals("2/3")) pictureSource = "/resources/caribouS1.JPG";
			if (cafeName.equals("Caribou Coffee") && pictureNumber.equals("3/3")) pictureSource = "/resources/caribouS2.JPG";
			
			
			if (cafeName.equals("Design Cafe") && pictureNumber.equals("1/3")) pictureSource = "/resources/designCafe.png";
			if (cafeName.equals("Design Cafe") && pictureNumber.equals("2/3")) pictureSource = "/resources/designS1.JPG";
			if (cafeName.equals("Design Cafe") && pictureNumber.equals("3/3")) pictureSource = "/resources/designS2.JPG";

			
			if (cafeName.equals("Gentle Doctor Cafe") && pictureNumber.equals("1/3")) pictureSource = "/resources/vetmedCafe.png";
			if (cafeName.equals("Gentle Doctor Cafe") && pictureNumber.equals("2/3")) pictureSource = "/resources/testS.JPG";
			if (cafeName.equals("Gentle Doctor Cafe") && pictureNumber.equals("3/3")) pictureSource = "/resources/testS.JPG";

			
			
			
			return pictureSource;
		}
		
		public String changeBigPicture(String cafeName, String pictureNumber)
		{
			String pictureSource = "";
			if (cafeName.equals("Gerdin Business Cafe") && pictureNumber.equals("2/3")) pictureSource = "/resources/testB.JPG";
			if (cafeName.equals("Gerdin Business Cafe") && pictureNumber.equals("3/3")) pictureSource = "/resources/testB.JPG";
			
			if (cafeName.equals("MU Market & Cafe") && pictureNumber.equals("2/3")) pictureSource = "/resources/memorialB1.JPG";
			if (cafeName.equals("MU Market & Cafe") && pictureNumber.equals("3/3")) pictureSource = "/resources/memorialB2.JPG";
			
			if (cafeName.equals("Courtyard Cafe") && pictureNumber.equals("2/3")) pictureSource = "/resources/courtyardB1.JPG";
			if (cafeName.equals("Courtyard Cafe") && pictureNumber.equals("3/3")) pictureSource = "/resources/courtyardB2.JPG";
			
			if (cafeName.equals("Global Cafe") && pictureNumber.equals("2/3")) pictureSource = "/resources/globalB1.JPG";
			if (cafeName.equals("Global Cafe") && pictureNumber.equals("3/3")) pictureSource = "/resources/globalB2.JPG";
			
			
			if (cafeName.equals("Bookends Cafe") && pictureNumber.equals("2/3")) pictureSource = "/resources/bookendsB1.JPG";
			if (cafeName.equals("Bookends Cafe") && pictureNumber.equals("3/3")) pictureSource = "/resources/bookendsB2.JPG";

			if (cafeName.equals("Caribou Coffee") && pictureNumber.equals("2/3")) pictureSource = "/resources/caribouB1.JPG";
			if (cafeName.equals("Caribou Coffee") && pictureNumber.equals("3/3")) pictureSource = "/resources/caribouB2.JPG";
			
			if (cafeName.equals("Design Cafe") && pictureNumber.equals("2/3")) pictureSource = "/resources/designB1.JPG";
			if (cafeName.equals("Design Cafe") && pictureNumber.equals("3/3")) pictureSource = "/resources/designB2.JPG";
			
			if (cafeName.equals("Gentle Doctor Cafe") && pictureNumber.equals("2/3")) pictureSource = "/resources/testB.JPG";
			if (cafeName.equals("Gentle Doctor Cafe") && pictureNumber.equals("3/3")) pictureSource = "/resources/testB.JPG";
			
			
			
			return pictureSource;
		}
	}
	




