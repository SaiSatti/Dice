package util;

public class FiveDices {
	private int die1;   // Number showing on the first die.
	private int die2;   // Number showing on the second die.
	private int die3;   // Number showing on the third die.
	private int die4;   // Number showing on the fourth die.
	private int die5;   // Number showing on the fifth die.
    
    public int getDie1() {
		return die1;
	}

	public void setDie1(int die1) {
		this.die1 = die1;
	}

	public int getDie2() {
		return die2;
	}

	public void setDie2(int die2) {
		this.die2 = die2;
	}

	public int getDie3() {
		return die3;
	}

	public void setDie3(int die3) {
		this.die3 = die3;
	}

	public int getDie4() {
		return die4;
	}

	public void setDie4(int die4) {
		this.die4 = die4;
	}

	public int getDie5() {
		return die5;
	}

	public void setDie5(int die5) {
		this.die5 = die5;
	}

	public FiveDices() {
            // Constructor.  Rolls the dice, so that they initially
            // show some random values.
        roll();  // Call the roll() method to roll the dice.
    }
    
    public void roll() {
            // Roll the dice by setting each of the dice to be
            // a random number between 1 and 6.
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        die3 = (int)(Math.random()*6) + 1;
        die4 = (int)(Math.random()*6) + 1;
        die5 = (int)(Math.random()*6) + 1;  
    }

}
