package jp.ac.hal;

class Book {
	String title;
	String writer;

	Book(String t, String w){
		title = t;
		writer = w;
	}
	//コピー
	Book(Book copy){
		title = copy.title;
		writer = copy.writer;
	}

	void print() {
		System.out.println(" タイトル:" + title);
		System.out.println(" 名前:" + writer);
	}
}

class Books {
	public static void main(String[] args) {
		Book book1 = new Book(" 頑張りたい","ジャバ");
		book1.print();
		Book book2 = new Book(book1);
		book2.title = "勉強してるのは";
		book2.print();
	}
		//実行結果
		//タイトル: 頑張りたい
		//名前:ジャバ
		//タイトル:勉強してるのは
		//名前:ジャバ
		//on
}
