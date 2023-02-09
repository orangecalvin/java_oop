package ezen.shopingmall;


public class ESM {

	public static void main(String[] args) {
		Cart myCart = new Cart(100);
		
		Album album = new Album(10, "Butter", 10000,"BTS");
		
		// 카트에 상품 담기
		myCart.addItem(album);
		
		Movie movie = new Movie(11, "아바타2",15000, "춘식이", "개식이");
		myCart.addItem(movie);
		
		// 카트 상품 목록 조회
		Item[] myItems = myCart.getItems();
		for (int i = 0; i < myCart.getCount(); i++) {
			System.out.println(myItems[i]); 
		}
		System.out.println("------검색 테스트------");
		// 카트 상품 검색
		System.out.println("------상품 검색 ------");
		String searchName = "Butter";
		Item searchItem = myCart.findByName(searchName);
		if (searchItem != null) {
			System.out.println(searchItem);
			Album al = (Album)searchItem;
			System.out.println(al.getArtist());
		}else {
			System.out.println("검색된 상품 없음");
		}
		System.out.println("----- 장바구니 상품 삭제 ------");
		
		boolean nobuy = myCart.remonveItem("아바타2");
		if (nobuy) {
			System.out.println("상품 삭제하였습니다");
			System.out.println(myCart.getCount());
		} else {
			System.out.println("삭제 오류 (해당 상품없거나 이미 삭제됨)");
		}
		System.out.println("------상품 목록------");
		myItems = myCart.getItems();
		for (int i = 0; i < myCart.getCount(); i++) {
			System.out.println(myItems[i]); 
		}
		System.out.println("------상품 목록------");
		myCart.remonveAll();
		System.out.println(myCart.getCount());
			}

}
