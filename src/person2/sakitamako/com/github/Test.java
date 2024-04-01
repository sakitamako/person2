package person2.sakitamako.com.github;

public class Test {
	public static void main(String[] args) {
		
		Person taro = new Person();
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		Person jiro = new Person("jiro", 20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		Person saburo = new Person("saburo", 0);
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		
		Person noName = new Person("名前なし", 25);
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person hanako = new Person("hanako", 17);
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		
	}

}
