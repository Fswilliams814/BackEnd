/**
 * 
 */
package week05;

/**
 * @author pooh
 *
 */
public enum Ranks {
	Ace(1),
	Two(2),
	Three(3),
	Four(4),
	Five(5),
	Six(6),
	Seven(7),
	Eight(8),
	Nine(9),
	Ten(10),
	Jack(11),
	Queen(12),
	King(13);


private int rankValue;

private Ranks (int value) {
	this.rankValue = value;
}

public int getRankValue() {
	return rankValue;
}

public void setRankValue(int rankValue) {
	this.rankValue = rankValue;
}

}