import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;

public class SetGui {
	private JButton ageButton;
	private JButton buyButton;
	private JFrame frame;
	private JLabel startlabel;
	private JLabel label;
	private JLabel moneylabel;
	private JLabel shoplabel;
	private JPanel panel;
	private int width;
	private int height;
	int i = 0;
	int y = 0;
	int z = 0;
	int totalmoney = 0;
	int endLife = (int)(Math.random()*70 + 1);
	String randomEvent [][] = {
			//1-5
			{"Your Family Got a Dog ", "You Visited Vegas ", "Your Family Got a New Car ", "You Visited New York ", "You Ate Your First Slice of Pizza ", "Your Uncle Got Chicken Pox", "You did your first finger painting ", "You Were Given Your First Toy Car","You Dressed up as Superman for Halloween", "You Baked Christmas Cookies for Santa", "A Meteor Shower Hit the Earth ", "You Learned how to Read ", "Your aunt was sentenced to 5 years in Jail ", "You were Diagnosed with Diabetes ", "You Played Basketball for the First Time ", "You Played Soccer for the First Time ", "You Broke Your Leg Running  Down the Street ", "There Was a Pirate Attack in Somalia ", "You Travelled to France ", "You Started Playing the Trombone "},
			//6-10
			{"You Visited India", "You Got a Pet Fish", "You Took Your First Pottery Class", "You Hiked For the First Time", "You Joined the Local Soccer Team", "You Went Bowling for the First Time", "You Coded for the First Time", "You Watched Avatar the Last Airbender", "Katy Perry is Now Your Favorite Artist", "You Beat Your Brother in a Race", "Your Sister was Born", "Your Grandpa took you Fishing", "You Went Camping With Your Friends", "You Went to Jones Beach With Your Family", "You Learned How to Write in Cursive", "You Wrote Your First Short Story", "You told a Story to your Little Brother", "You Watched Avengers: Endgame in Theaters", "Bermuda became Independent", "You Travelled to Japan"},
			//11-15
			{"You Joined the Basketball Team at Your School", "You moved to Washington DC", "You Learned How to Play the Guitar", "You Coded your first Java Program", "You Joined the Speech and Debate Club at School", "You Moved to Brazil", "You Went on a Mission Trip", "You Learned Spanish", "You Learned Malayalam", "You Won the Paper Airplane Competition at Your School", "You tried Calamari for the First Time", "You bowled an 100 at Your Friends Birthday Party", "You Visited San Diego", "You Discovered Your New Favorite Food: Fish and Chips", "You Spent Your Summer Volunteering at a Shelter", "You Played Your First Video Game: Super Smash Bros", "You Met Your New Best Friend Joe", "You Visited Russia", "You Fell Off a Trampoline and Broke Your Arm", "You Joined the Archery Club at Your School"},
			//16-20
			{"You Downloaded a Virus On Your Computer", "You Joined the Varsity Tennis Team", "You Got a Pet Salamander", "You got an Instagram", "You got Twitter", "You Joined Deca", "You were named Mathalete of the year", "You Met Your New Best Friend Arthur", "You Watched Lucifer For the First Time", "You Lost Your First Minigolf Game", "You got Strep Throat", "You Played Call of Duty For the First Time", "You Got a Pet Cat", "You Produced Your First Song", "You Were Gifted a Gucci Hat", "You Posted Your First Youtube Video", "You Spent Your Summer Planting a Community Garden", "You Visited Your Cousins for Easter", "You Went to Italy", "You Published One of Your Poems in the Local Paper" },
			//21-25
			{"You Tried Chicken 65 for the First Time", "You Bought a new Computer", "You Learned Python", "You took an ancestry test: You are mostly from Italy and India", "You Joined an Environmentalist Club", "You Learned Japanese", "You Visited Iceland", "You Played Overwatch 2", "You moved to Boston", "You Moved to Kyoto", "You Joined a Local Band", "You Tried Caviar For the First Time", "You Went to a Michelin Star Restraunt", "Your Parents moved to Ghana", "Your Uncle was Arrested for Tax evasion", "Eminem Became Your Favorite Artist", "El Chapo Escaped Prison", "Elon Musk Went Bankrupt", "Amazon was dissolved under the Sherman Anti-Trust Law", "Civil War erupted in Afghanistan"},
			//26-30
			{"The Local Bagel Place Burned Down", "You Moved to North Korea", "Your New Favorite Food is Sushi", "AI has Taken 60 Percent of the Jobs in the Trucking Sector", "Jack Ma got Exposed For Money Laundering", "You Were Named as the Employee of the Year", "You and your s/o went to St. Lucia for Vacation", "The Toucan is now Extinct", "Your Parents Retired", "Your Parents moved to Argentina", "Your Uncle won the Lottery", "You Caught the Common Cold", "You hit 1000 followers on Instagram", "A man was caught trying to climb the Empire State Building", "The Mississippi River Evaporated", "The Amazon Rainforest was Revitalized by Walmart", "Bitcoin Became the Official currency of China", "Turkey is Now divided by communist East Turkey and capitalist West Turkey", "Your Email got Hacked", "Mark Zuckerberg Has Decided to Sell Facebook"},
			//31-35
			{"The Last Movie Theater Has Been Torn Down", "Australia has Been Completely Submerged due to Global Warming", "The average AQI is now 40 due to Technological Advancements", "The First Colony on Mars Has Been Established", "You tried Matsutake Mushrooms", "You toured Universal Studios", "North and South Korea have become United Under One Republic", "Your Parents Decided to Move in With You", "Your Uncle is Broke and You Decide to let Him Stay at your Place", "You Went to DisneyLand", "You moved to Las Vegas", "The Cure For Cancer Was Discovered", "Urban Centers Have been Evacuated for A New Disease Called Divoc 91", "Russia has Descended Into Anarchy", "The United States has Been Renamed the New States", "The Iphone 30 Has been released", "The United States has dissolved The UN after a conflict with China", "Your New Favorite Genre of Music is Rap", "Vincent Van Gogh's Great Great Nephew Recreated Starry Night, It Sold for 1 billion dollars", "Gold has become Scarce: Gold is Now Selling For 50,000 per ounce"},
			//36-40
			{"Blackberry surpasses Iphone Profits for the first time in 60 years", "Widespread water shortages in the UK causes mass migration to Asia", "You volunteer as a lifeguard at your local pool", "Your Uncle has Created a Revolutionary Idea and he's now a billionaire", "You Hit a PR of 200 LBS on the Bench", "You deadlifted a new PR: 280 LBS", "You Squatted 300 LBS", "Your Parents have Decided to Divorce", "You Became the Youngest Manager at Your Job", "The IVY league has added Stanford to it", "Pakistan and India Have Decided to Merge", "El Chapo died", "The FBI and CIA Were Exposed for Being Controlled by a Secret Society", "Nostalgia has hit and Pop is Now Your Favorite Genre", "Hulu's Success has Caused Netflix to go Bankrupt", "Prisons have been Abolished","The Global Effort to Decriminalize Drugs is Finally Over","Drake has announced his retirement", "You Decided to Become a Member of the Democratic Party", "The Existence of Aliens has Been Confirmed by the CIA"},
			//41-45
			{"World War 3 Starts", "Robots Have Replaced Surgeons", "You Received A Flatscreen TV as a gift","Advanced Tech Made It Possible to Purify Flint's Water", "9.7 Billion People Currently Live On Earth", "Signs of Life Have Been Detected on Venus","Toucans Have Become Extinct", "You Created Your Own Personal Website", "Snapchat Has Become the Most Popular Social Media Platform", "You decided to go to the Gym", "Your Uncle Was Discovered Exploring the Bermuda Triangle Half Alive", "You Fell Off Your Skateboard and Had To Take A Month Off From Work","Your Mom Moved to Venezuela","Luminosity Gaming has Partnered with LG in a 5 billion dollar deal", "The FBI has been Renamed the IBF in a Rebranding Attempt","Twitch Merges With Youtube in a 500 Billion Dollar Deal", "Indian Pop has Passed K-Pop Numbers For the First Time","The First Pro Ultimate Frisbee League Has Been Created", "The Iphone Infinity Has Came Out", "A Replica of Harry Potter's Invisibility Cloak  has Been Manufactured"},
			//46-50
			{"Sunshine Bagels has Become The Biggest Breakfast Franchise","You Received a Vintage DS as a Gift From Your Friend","Japan has Been Submerged","You Learned how to Make A Machine Learning Model","You Tried Beyond Burger","You Were Part of a Jury","The CIA Tried to Recruit You","Your Employer Tried to Get You to Relocate to Antarctica","You Moved to South Sudan","You Helped Make Your Friends Home Aquarium","CSGO Has 0 Current Active Players","The Game of Life has Been Named The Best Board Game of the Decade","Monopoly has Been Named The Best Board Game of the Century","You Visited Your Cousin in Australia","Object Oriented Programming has Been Replaced","The X Drive has Replaced the C Drive","Supercomputers are Able to Predict the Major Events That Will Happen in the Next 5 Years","You Met Dua Lipa","You Made Your First Vlog","The Nuclear Arms Race Between Russia and The US has Started Again"},
			//51-55
			{"Huge Gold Veins Were Discovered in India","South Africa Got Hit by The Biggest Storm of the Century","Iridium Is Now the Most Expensive Item In The World","Venus's Sun Has Erupted", "You Get A Mild Concussion Playing Soccer","You Take Your Kids To DisneyLand","You Go On Vacation With your Family To Bali","You Hit a Deadlift PR of 330 LBS", "You Hit a Squat PR of 400","You Tried Out A New Gym","You Ran a 15 second 100 Meter Dash","You Went to the First SuperTarget in New York","You Invested in Hilton Hotels","You Became A Costco Member","High Tech Suits That Can Withstand the Sun's Heat Have Been Developed","Robots Have Replaced All Truck Driving Jobs","UBI is Implemented","Faze Clan is Sold to Disney","Valorant's Player Count is now 0","The Second American Civil War has Started"},
			//56-60
			{"You and Your Family Move to Angola","Civil War in India Causes Mass Indian Migration to Russia","You Met Eminem","Your Aunt Has Passed Away","Sri Lanka Has Been Submerged","The Great Coral Reef is Now Desolate","CSGO Has Made A Comeback is Now the Most Popular Game","The First Batman Comic sells for 1 billion dollars","You Found Exotic Truffle Mushrooms in your Neighbors Yard","Your Son Has Graduated High School","You Got Employee of the Year","Best Buy Has set up their Headquarters in The Amazon Rain Forest","VR Can Be Used to Visit Space","Black Holes are Able to be Neutralized by Advanced Technology","India has Descended Into Anarchy","The DIVOC 52 Epidemic has Been Declared A Pandemic","Denmark, Sweden, and Norway Have United","Avatar the Last Airbender is Reknewed for a Fourth Season","You're Stock Portfolio has Doubled"},
			//61-65
			{"Pokemon Season 100 Came Out","Some Individuals are Reported to Have Obtained Super Powers","A Chunk of the Sun has hit Earth","South Africa has Broken off the Continent","CVS Went Bankrupt","Target Went Bankrupt","Dota 3 Came Out","Tesla went Bankrupt","There is a Global Economic Depression","The Only Company Growing is Gamestop","You Tried a White Macadamia Cookie","You Spent Christmas in the Bahamas","You Got Laid Off","You Got a New Job","You Bought A Playground for Your Kids","You Donated Your Pokemon Cards to Charity","You Ran a Mile in 8 minutes","You Painted Your House Blue","You Painted Your House White","A Civil War in Iceland Has Broke Out"},
			//66-70
			{"Meningitis has Been Cured","You Bought an HBO Max Account","Lucifer season 20 Came Out","A small Town in New York, Ardsley Becomes The Capital of the United States","UV Rays Are Being Used For HIV Treatment","Aids has Been Cured", "The Black Plague Has Resurfaced in Tibet","Hong Kong has Been Freed","Lego has Gone Bankrupt","You go on Vacation With Your Family to Alaska","You Spent Easter in Brazil","You Spent Your New Years in Kansas","Your Daughter Moved to Portland","Your Son Moved in","You Fell Down the Stairs","You Caught the Common Cold","You got Strep Throat","You Painted Your House Pink","Robots are now Classified as Living Beings","Barack Obama JR. Has Won the Election"}
			
	};
	String shop [][] = {
			//1000 dollar treshold items $100 max
			{"Suit", "Nintendo DS", "Necklace", "Pokemon Booster Box", "Heated Massager", "Perfume", "Ipod", "Headphones", "Toy Car", "Remote Control Car", "Monitor", "Chair", "Soccer Ball", "Basketball", "Mouse", "Fruit Snack Package", "Netflix Subscription", "Bench Setup", "Star Wars lego Set", "Supreme Sticker"},
			//2000 dollar treshold items $500 max
			{"Ipad","Computer","Watch","Ultimate Pokemon Booster Box", "Pair of Yeezy's", "Golf Club","Baseball Bat", "Mini Television", "Amazon $100 Gift Card", "Taylor Swift Concert Tickets", "Gucci Jacket", "Balenciaga Hoodie", "DJI Drone", "$300 in Doge Coin", "Twin Bed", "Kindle Fire", "10000 Piece Lego Set", "Compass","World's Largest Cookie","Assorted Free Weights"},
			//50000 dollar treshold items $5000 max
			{"Five Year Supply of Starbucks","3090 PC","Limited Edition 1998 Pokemon Booster Box","ATV","Hot Tub","Inflatable Twister","Iphone 13","Cat","Dog","Kobi Beef Burger (6 pack)","Gucci Sweatshirt","Supreme Sweatshirt","Jetski","Five Year Supply of Massages","Motorcycle","100000 Piece Lego Set","30 Minute Private Flight","Clive Christian Perfume","Home Gym Setup","100 Inch Flatscreen TV"},
			// $15000 max
			{"Season Football Pass","Suite Class Seat From SF to HK","Master's Key Prize Card","Chevorlet Spark","Tiffany Setting one Carat Engagement Ring","Fendi Baugette Bag","St Laurent Embroided Jacket","Supreme Suitcase","Supreme Skateboard","Gucci Biker Jacket","Chanel Coco Crush Bracelet","Armani Jumpsuit","Pair of Virgil Abloh Jordans","Pair Of Red Octobers","Diamond Studded Jeans","Movie Theater Setup","Bluetooth Surround Sound System","Pizza With Gold Flaked Crust","PSA 8 Charizard","PSA 9 Blaustoise"},
			//75000 dollar treshold items 70000 max
			{"Honda Pilot","Rolex Watch","Audi Q8","Private Jet","NBA Championship Ring","Babe Ruth Baseball Card","Paneroi Luminor Watch","Five LBS Wasabi Pea Bag","The First Spider Man Comic","Diamond Encrusted Headphones","Gold and Diamond Gameboy","Hermes Bag","Sennheiser HE 1 Headphones","Dodge Viper GT","Pilot License Training Course","Water Jet Pack","Eco Friendly Bed","60 Bars of Gold","PSA 9 Charizard","PSA 10 Blaustoise"}
			
	};
	int shopPrices [][] = {
			{100,95,30,50,75,90,99,45,5,25,100,50,25,25,30,15,30,100,20,50},
			{300,500,250,200,500,450,300,250,100,150,500,500,500,300,500,399,500,150,150,150},
			{2500,4500,5000,5000,3500,3000,2000,2500,2500,4000,5000,4500,4000,4000,2500,5000,2500,5000,2800,2000},
			{13000,14000,9000,12710,11000,14000,14000,6500,8500,12500,7500,7000,3000,15000,10000,10000,4000,5000,13000,14000},
			{40000,50000,60000,33000,75000,60000,40000,50000,75000,50000,25000,70000,59000,96000,55000,30000,60000,72000,35000,35000}
			
	};

	public SetGui(int h, int w) {
		panel = new JPanel();
		frame = new JFrame();
		startlabel = new JLabel("Welcome To Life");
		label = new JLabel("Your Life Begins Here!");
		shoplabel = new JLabel("I Wonder What Items You Will Buy");
		moneylabel = new JLabel("You have 0 dollars");
		ageButton = new JButton("Increment Age ");
		ageButton.setBackground(Color.YELLOW);
		buyButton = new JButton("Buy Something");
		buyButton.setBackground(Color.YELLOW);
		height = h;
		width = w;
		
	}
	public void createFrame() {
		Container pane = frame.getContentPane();
	//	FlowLayout flow = new FlowLayout();
		BoxLayout blayout = new BoxLayout(pane, BoxLayout.PAGE_AXIS);
		pane.setLayout(blayout);
		frame.setSize(width, height);
		frame.setTitle("Life Simulator");
		startlabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		shoplabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		moneylabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		label.setFont(new Font("Verdana", Font.PLAIN, 14));
		pane.add(startlabel);
		pane.add(ageButton);
		pane.add(buyButton);
		pane.add(moneylabel);
		pane.add(shoplabel);
		pane.add(label);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		//ageButton.setBounds(80, 100, 80, 100);
		//ageButton.setLocation(100, 100);
		//buyButton.setBounds(80, 100, 80, 100);	
	}
	public void setListeners() {
			ActionListener buttonlistener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				Object ageButtonClicked = ae.getSource();
				if(ageButtonClicked == ageButton) {
					//System.out.println(endLife);
					if(y < endLife) {
						y+=1;
						//System.out.println(y);
						if(1 <= y && y <= 5) {
							label.setText("You Are" + " " + y + " " + "and" + " " + randomEvent[0][randomCol()]);
							moneygenerator();
							
						}
						if(6 <= y && y <= 10) {
							label.setText("You Are" + " " + y + " " + "and" + " " + randomEvent[1][randomCol()]);
							moneygenerator();
						}
						if(11 <= y && y <= 15) {
							label.setText("You Are" + " " + y + " " + "and" + " " + randomEvent[2][randomCol()]);
							moneygenerator();
						}
						if(16 <= y && y <= 20) {
							label.setText("You Are" + " " + y + " " + "and" + " " + randomEvent[3][randomCol()]);
							moneygenerator();
						}
						if(21 <= y && y <= 25 ) {
							label.setText("You Are" + " " + y + " " + "and" + " " + randomEvent[4][randomCol()]);
							moneygenerator();
						}
						if(26 <= y && y <= 30 ) {
							label.setText("You Are" + " " + y + " " + "and" + " " + randomEvent[5][randomCol()]);
							moneygenerator();

						}
						if(31 <= y && y <= 35 ) {
							label.setText("You Are" + " " + y + " " + "and" + " " + randomEvent[6][randomCol()]);
							moneygenerator();

						}
						if(36 <= y && y <= 40 ) {
							label.setText("You Are" + " " + y + " " + "and" + " " + randomEvent[7][randomCol()]);
							moneygenerator();
						}
						if(41 <= y && y <= 45 ) {
							label.setText("You Are" + " " + y + " " + "and" + " " + randomEvent[8][randomCol()]);
							moneygenerator();
						}
						if(46 <= y && y <= 50 ) {
							label.setText("You Are" + " " + y + " " + "and" + " " + randomEvent[9][randomCol()]);
							moneygenerator();
						}
						if(51 <= y && y <= 55) {
							label.setText("You Are" + " " + y + " " + "and" + " " + randomEvent[10][randomCol()]);
							moneygenerator();
						}
						if(56 <= y && y <= 60) {
							label.setText("You Are" + " " + y + " " + "and" + " " + randomEvent[11][randomCol()]);
							moneygenerator();
						}
						if(61 <= y && y <= 65 ) {
							label.setText("You Are" + " " + y + " " + "and" + " " + randomEvent[12][randomCol()]);
							moneygenerator();
						}
						if(66 <= y && y <= 70 ) {
							label.setText("You Are" + " " + y + " " + "and" + " " + randomEvent[13][randomCol()]);
							moneygenerator();
						}
					}else if(y == endLife) {
						y+=1;
						label.setText("You Died at" + " " + y + " years old");
						
					}
				}
			}
		};
		ActionListener buttonlistener3 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				Object shopButtonClicked = ae.getSource();
				if(shopButtonClicked == buyButton) {
						int rRow = randomRow();
						int rCol = randomCol();
						if(shopPrices[rRow][rCol] <= totalmoney) {
							totalmoney -= shopPrices[rRow][rCol];
							moneylabel.setText(String.valueOf("$" + totalmoney));
							shoplabel.setText("You bought a" + " " + shop[rRow][rCol]); 
						}else {
							shoplabel.setText("The Item You Selected is too Expensive Try Buying Something Else");
						}
				}
			}
		};
		ageButton.addActionListener(buttonlistener2);
		buyButton.addActionListener(buttonlistener3);
	}
		public int randomCol() {
		int randomCol = (int)(Math.random()*20);
		return randomCol;
		}
		public int randomRow() {
			int randomRow = (int)(Math.random()*5);
			return randomRow;

		}
		public void moneygenerator() {
			if(1 <= y && y <= 10) {
				int pone = 0;
				totalmoney += pone;
				 moneylabel.setText("$" + String.valueOf(totalmoney));
			}
			if(11 <= y && y <= 15) {
				 int ptwo = (int)(Math.random()*1000+1);
				 totalmoney += ptwo;
				 moneylabel.setText("$" + String.valueOf(totalmoney));
			}
			if(16 <= y && y <= 20) {
				 int pthree = (int)(Math.random()*2000+1);
				 totalmoney += pthree;
				 moneylabel.setText("$" + String.valueOf(totalmoney));
			}
			if(21 <= y && y <= 25) {
				int pfour = (int)(Math.random()*50000+1);
				totalmoney += pfour;
				 moneylabel.setText("$" + String.valueOf(totalmoney));
			}
		    if(26 <= y && y <= 40) {
		    	int pfive = (int)(Math.random()*75000+1);
		    	 totalmoney += pfive;
				 moneylabel.setText("$" + String.valueOf(totalmoney));
		    }
	  }
	  public int rMoney() {
		  return totalmoney;
	  }
		
}
