package che.day14;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
class Card {
	private String type;
	private String value;
	private int realvalue;
	public Card(String type, String value, int realvalue) {
		this.type = type;
		this.value = value;
		this.realvalue = realvalue;
	}
	@Override
	public String toString() {
		return "【" + type.substring(1) + value + "】";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getRealvalue() {
		return realvalue;
	}
	public void setRealvalue(int realvalue) {
		this.realvalue = realvalue;
	}
}
class Player {
	private String name;
	private String resultStr;// 存储抽取的三张牌显示结果（【♠5】【♠6】【♠7】三条）
//  将每个人最终的结果存储到Integer[]中，{级别 ，同级别的规则}
	private List<Card> samplelist = new ArrayList();
//	抽取三张牌sample
	public void sample(Cards cards) {
		List<Card> li = new ArrayList<Card>();
		Random r = new Random();
		List<Card> cardlist = cards.getCardlist();
		for (int i = 0; i < 3; i++) {
			int index = r.nextInt(cardlist.size());
			li.add(cardlist.get(index));
			cardlist.remove(index);
		}
		this.samplelist = li;
	}
//	抽取三张牌获得结果
//	将结果存储到getResult的返回值中，形式Integer[]
	public Integer[] getResult() {
		Integer[] result;
		this.resultStr = "";
		for (Card card : this.samplelist) {
			this.resultStr += card.toString();
		}
		samplelist.sort((c1, c2) -> c1.getRealvalue() - c2.getRealvalue());
//		samplelist.forEach(System.out::println);
		Card c1 = this.samplelist.get(0);
		Card c2 = this.samplelist.get(1);
		Card c3 = this.samplelist.get(2);
		// 三条：三张牌value一样
		// 一对：两张value一样
		// 顺子：三张牌挨着 realvalue 3 5 4 3 4 5
		// 同花：三张牌type一样
		// 同花顺：挨着，类型一样
		// 其余都是散牌
		if (c1.getRealvalue() == c2.getRealvalue() && c1.getRealvalue() == c3.getRealvalue()) {
			this.resultStr += "三条";
			result = new Integer[] { 6, c1.getRealvalue(), 0, 0, 0 };
		} else if (c1.getRealvalue() == c2.getRealvalue()) {
			this.resultStr += "一对";// 334
			result = new Integer[] { 2, c2.getRealvalue(), c3.getRealvalue(),
					Integer.parseInt(c3.getType().substring(0, 1)), 0 };
		} else if (c2.getRealvalue() == c3.getRealvalue()) {
			this.resultStr += "一对";// 566
			result = new Integer[] { 2, c2.getRealvalue(), c1.getRealvalue(),
					Integer.parseInt(c1.getType().substring(0, 1)), 0 };
		} else if (c1.getRealvalue() + 1 == c2.getRealvalue() && c2.getRealvalue() + 1 == c3.getRealvalue()
				&& c1.getType().equals(c2.getType()) && c2.getType().equals(c3.getType())) {
			this.resultStr += "同花顺";
			result = new Integer[] { 5, c3.getRealvalue(), Integer.parseInt(c3.getType().substring(0, 1)), 0, 0 };
		} else if (c1.getRealvalue() + 1 == c2.getRealvalue() && c2.getRealvalue() + 1 == c3.getRealvalue()) {
			this.resultStr += "顺子";
			result = new Integer[] { 3, c3.getRealvalue(), Integer.parseInt(c3.getType().substring(0, 1)), 0, 0 };
		} else if (c1.getType().equals(c2.getType()) && c2.getType().equals(c3.getType())) {
			this.resultStr += "同花";
			result = new Integer[] { 4, c3.getRealvalue(), c2.getRealvalue(), c1.getRealvalue(),
					Integer.parseInt(c3.getType().substring(0, 1)) };
		} else {
			this.resultStr += "散牌";
			result = new Integer[] { 1, c3.getRealvalue(), c2.getRealvalue(), c1.getRealvalue(),
					Integer.parseInt(c3.getType().substring(0, 1)) };
		}
//		System.out.println(this.resultStr);
		return result;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Card> getSamplelist() {
		return samplelist;
	}
	public void setSamplelist(List<Card> samplelist) {
		this.samplelist = samplelist;
	}
	public Player(String name) {
		super();
		this.name = name;
	}
	public String getResultStr() {
		return resultStr;
	}
	public void setResultStr(String resultStr) {
		this.resultStr = resultStr;
	}
}
class Cards {
	private static Random r = new Random();
	// 52张牌，52个Card类型的对象
	private List<Card> cardlist = new ArrayList();
	public Cards() {
		// {card1,card2,card3 }
		// 拼凑52张牌
		String[] types = new String[] { "4♠", "3♥", "2♦", "1♣" };
		String[] values = new String[13];
		for (int i = 0; i < 9; i++) {
			values[i] = String.valueOf(i + 2);
		}
//		 2 3 4 5 6 7....10  J    Q   K   A
//		 2 3                11   12  13  14
		values[9] = "J";//
		values[10] = "Q";
		values[11] = "K";
		values[12] = "A"; // 14
//		int index=0;
		for (String t : types) {
			for (int i = 0; i < values.length; i++) {
				this.cardlist.add(new Card(t, values[i], i + 2));
//				index++;
			}
		}
	}
	public List<Card> getCardlist() {
		return cardlist;
	}
	public void setCardlist(List<Card> cardlist) {
		this.cardlist = cardlist;
	}
}
//[1,2,3]
//[1,5,3]
class MyCompartor implements Comparator<Integer[]> {
	@Override
	public int compare(Integer[] o1, Integer[] o2) {
		int v = 0;
		for (int i = 0; i < o1.length; i++) {
			v = o1[i] - o2[i];
			if (v != 0)
				break;
		}
		return v;// 一定是正数或者是负数，不可能是0
	}
}
public class Game {
	private List<Player> players;
	public void playerSample(Cards cs) {
		for (Player player : players) {
			player.sample(cs);
		}
	}
	public void compare() {
//		需要选择一个集合类型容器装入所有的结果
//		SortedSet和SortedMap
//		结果中，不仅要比较大小，还需要知道哪一个是最大的  所以选择map
//		map中可以使用（比较的 结果key）  把人当value
		SortedMap<Integer[], Player> map = new TreeMap<Integer[], Player>(new MyCompartor());
		for (Player player : this.players) {
			map.put(player.getResult(), player);
			System.out.println(player.getName() + "," + player.getResultStr());
		}
// 		显示最终的赢家
		System.out.println("赢家：" + map.get(map.lastKey()).getName());
	}
	public List<Player> creatPlayer(int count) {
		List<Player> list = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			list.add(new Player("玩家" + (i + 1)));
		}
		return list;
	}
	public static void main(String[] args) {
//	   组成52张牌
		Cards cs = new Cards();
		Game g = new Game();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入有多少个玩家（不超过17人）：");
		g.setPlayers(g.creatPlayer(sc.nextInt()));
		g.playerSample(cs);
		g.compare();
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
}
