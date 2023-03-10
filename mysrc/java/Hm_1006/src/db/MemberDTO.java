package db;

import java.util.ArrayList;

import shopping.Basket;

public class MemberDTO {
	private String id = null;
	private String name = null;
	private String pass = null;
	private String addr = null;
	private int point = 0;
	private ArrayList<Basket> basketList= new ArrayList<>();

	public ArrayList<Basket> getBasketList() {
		return basketList;
	}
	public void setBasketList(ArrayList<Basket> basketList) {
		this.basketList = basketList;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}
