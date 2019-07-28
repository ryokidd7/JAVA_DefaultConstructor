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

}
