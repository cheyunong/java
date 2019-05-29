package che.day11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
class Card implements Comparable<Card>{
	String type;
	String value;
	int realvalue;	
	public Card(String type, String value, int realvalue) {
		super();
		this.type = type;
		this.value = value;
		this.realvalue = realvalue;
	}
	@Override
	public String toString() {
		return "Card=[" + type +value + "]";
	}
	@Override
	public int compareTo(Card o) {
		return this.realvalue-o.realvalue;
	}
}
class Cards{
	static Random r=new Random();
	int a;
	List<Card> cardlist=new ArrayList<Card>();
	List<Card> samplelist=new ArrayList<Card>();
	public Cards() {
		List<String> types=new ArrayList<String>();
		types.add("黑桃");
		types.add("红桃");
		types.add("梅花");
		types.add("方块");
		List<String> value=new ArrayList<String>();
		for(int i=0;i<9;i++) {
			value.add(String.valueOf(i+2));
		}
		value.add("J");
		value.add("Q");
		value.add("K");
		value.add("A");
		for(String string:types) {
			int i=0;
			for(String string2:value) {
				this.cardlist.add(new Card(string,string2,i));
				i++;
			}
		}
//		for(Card c:this.cardlist) {
//			System.out.println(c.type+c.value);//输出52张牌
//		}
	}
	public List<Card> getCardlist() {
		return cardlist;
	}
	public void setCardlist(List<Card> cardlist) {
		this.cardlist = cardlist;
	}
	public void sample() {
		List<Card> cardlist=this.getCardlist();
		int i=0;
		while(true) {
			if(this.samplelist.size()>=3)
				break;
			int index=r.nextInt(cardlist.size());
			if(cardlist.get(index)==null)
				continue;
			this.samplelist.add(cardlist.get(index));
			cardlist.set(index, null);
			i++;
		}
	}
	public void getResult(){
		List<Card> samplelist=this.samplelist;
		Collections.sort(samplelist);
		for(Card card:samplelist) {
			System.out.println(card.toString());
		}
		Card c1=samplelist.get(0);
		Card c2=samplelist.get(1);
		Card c3=samplelist.get(2);
		if((c1.realvalue==c2.realvalue)&&(c1.realvalue==c3.realvalue)) {
			System.out.println("豹子");
		}else if((c1.realvalue==c2.realvalue)||(c2.realvalue==c3.realvalue)){
			System.out.println("一对");
		}else if((c1.realvalue+1==c2.realvalue)&&(c2.realvalue+1==c3.realvalue)
			&&(c1.type.equals(c2))&&(c2.type.equals(c3))) {
			System.out.println("同花顺");
		}else if((c1.realvalue+1==c2.realvalue)&&(c2.realvalue+1==c3.realvalue)) {
			System.out.println("顺子");
		}else if((c1.type.equals(c2))&&(c2.type.equals(c3))){
			System.out.println("同花");
		}else {
			System.out.println("散牌");
		}
	}
}
public class Zy3 {
	public static void main(String[] args) {
		Cards cs=new Cards();
		List<Card> css=cs.cardlist;
		List<Card> cardlist=cs.getCardlist();
		cs.sample();
		cs.getResult();
	}
}