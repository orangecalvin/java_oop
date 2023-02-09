package ezen.shopingmall;

/**
 * 쇼핑몰에서 취급하는 모든 상품들을 담고, 제거하고, 검색하고 등의 가능 제공
 * @author 김규래
 * @Date 2023. 1. 5.
 */
public class Cart {
	// 필드의 다향성
	private Item[] items;
	private int count;
	private int capcity;
	
	public Cart() {}
	
	public Cart(int capacity) {
		items = new Item[capacity];
	}
	// 카트에 담긴 전체 상품 목록 반환
	public Item[] getItems() {
		return items;
	}


	public int getCount() {
		return count;
	}
	// 카트에 상품 담기
	// 매개변수 다형성
	public void addItem(Item item){
		items[count++] = item;
		
	}
	//상품이름으로 상품검색
	public Item findByName(String name) {
		for (int i = 0; i < count; i++) {
//			Item item = items[i];
//			boolean exit = item.getName().equals(name);
//			if(exit) {
			if(items[i].getName().equals(name)) {
//				return item;
				return items[i];
			}
			}
		return null;
	}
	// 카트 상품 제거 하기
	public boolean remonveItem(String name) {
		for (int i = 0; i < count; i++) {
			if(items[i].getName().equals(name)) {
				for (int j = i; j < count-1; j++) {
					items[j] = items[j+1];
				}
				count--;
				return true;
			}
			
		}
		return false;
	}
	// 카트에서 모든 상품제거 
	public void remonveAll() {
//		for (int i = 0; i < count; i++) {
//			items[i] = null;
//		}
		
		items = new Item[capcity];
		count = 0;
		
	}
	
	
	
}
	
