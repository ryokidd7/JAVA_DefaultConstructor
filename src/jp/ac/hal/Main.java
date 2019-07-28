package jp.ac.hal;

class Book {
	String title;
	String writer;

	Book(String t, String w){
		title = t;
		writer = w;
	}

	Book(Book copy){
		title = copy.title;
		writer = copy.writer;
	}

	void print() {
		System.out.println(" 名前:" + title);
		System.out.println(" 趣味:" + writer);
	}
}

class Books {
	public static void main(String[] args) {
		Book book1 = new Book(" 私は","ジャバ");
		book1.print();
		Book book2 = new Book(book1);
		book2.title = "勉強してるのは";
		book2.print();
	}
}
