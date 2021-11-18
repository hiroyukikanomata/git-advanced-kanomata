package com.example;

/**
 * 車のドメイン
 * 
 * @author kano
 *
 */
public class Car {

	// ごめんなさい
	
	private int speed;
	private String name;
	
	/**
	 * 引数なしコンストラクタ
	 */
	public Car() {}
	
	/**
	 * 初期化用の引数ありコンストラクタ
	 * 
	 * @param speed 速度
	 * @param name 名前
	 */
	public Car(int speed, String name) {
		super();
		this.speed = speed;
		this.name = name;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", name=" + name + "]";
	}	
}
