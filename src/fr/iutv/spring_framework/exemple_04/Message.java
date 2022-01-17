package fr.iutv.spring_framework.exemple_04;

public class Message {

	String text;

	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Message(String text) {
		this.text = text;
	}

	public Message(int id) {
		this.text = "Toto";
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String info() {
		return "Id:" + this.id + ", Message:" + this.text;
	}

}
