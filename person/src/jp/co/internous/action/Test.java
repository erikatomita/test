package jp.co.internous.action;

public class Test{
	public static void main(String[]args){
	Person taro=new Person();
	taro.name="山田太郎";
	taro.age=20;
	taro.phoneNumber="090-1111-1111";
	taro.address="東京都";

	System.out.println(taro.name);
	System.out.println(taro.age);
	System.out.println(taro.phoneNumber);
	System.out.println(taro.address);
	taro.talk();
	taro.walk();
	taro.run();



    Person jiro=new Person();
    jiro.name="木村次郎";
    jiro.age=18;
    jiro.phoneNumber="090-2222-2222";
	jiro.address="千葉県";



    System.out.println(jiro.name);
    System.out.println(jiro.age);
    System.out.println(jiro.phoneNumber);
    System.out.println(jiro.address);

    Person hanako=new Person();
    hanako.name="鈴木花子";
    hanako.age=16;
    hanako.phoneNumber="090-3333-3333";
	hanako.address="神奈川県";

    System.out.println(hanako.name);
    System.out.println(hanako.age);
    System.out.println(hanako.phoneNumber);
    System.out.println(hanako.address);


    Person erika=new Person();
    erika.name="富田絵里香";
    erika.age=30;
    erika.phoneNumber="090-4444-4444";
	erika.address="茨城県";


    System.out.println(erika.name);
    System.out.println(erika.age);
    System.out.println(erika.phoneNumber);
    System.out.println(erika.address);


		    Robot aibo=new Robot();
		    aibo.name="アイボ";
		    aibo.talk();
		    aibo.walk();
		    aibo.run();


		    Robot asimo=new Robot();
		    asimo.name="アシモ";
		    asimo.talk();
		    asimo.walk();
		    asimo.run();


		    Robot pepper=new Robot();
		    pepper.name="ペッパー";
		    pepper.talk();
		    pepper.walk();
		    pepper.run();

		}
	}

