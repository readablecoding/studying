// 陥製引 旭戚 窒径
// 沿けけ 28室 18.7 舛雌
// 沿けけ 21室 55.1 搾幻
// 沿けけ 28室 18.7 舛雌
// 沿けけ 28室 18.7 舛雌
// 沿けけ 28室	 18.7 舛雌

import java.util.Scanner;
public class Membertest2 
{
	public static void main(String[] args) 
	{
		// 5誤税 噺据舛左研 眼聖 壕伸 持失
		Member array[];
		array = new Member[5];
		

		// 徹左球稽 鋼差庚聖 戚遂馬食 5誤 噺据税 舛左研 脊径閤澗陥.
		Scanner scan = new Scanner(System.in);

		String name;
		String birth;
		double height;
		double weight;
		String type;


		for(int i = 0; i < array.length; i++)
		{
			System.out.print((i + 1) + "腰属 噺据税 戚硯聖 脊径馬室推 : ");
			name = scan.next();
			

			System.out.print((i + 1) + "腰属 噺据税 持鰍杉析聖 脊径馬室推 : ");
			birth = scan.next();
			

			System.out.print((i + 1) + "腰属 噺据税 徹研 脊径馬室推 : ");
			height = scan.nextDouble();
			

			System.out.print((i + 1) + "腰属 噺据税 倖巷惟研 脊径馬室推 : ");
			weight = scan.nextDouble();

			System.out.print((i + 1) + "腰属 噺据税 迫衝莫聖 脊径馬室推 : ");
			type = scan.next();
			
			array[i] = new Member(name, birth, height, weight, type);
			System.out.println();
				
		}

		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i].getName() + " " + array[i].getAge() + "室 " + array[i].getBmi() + " " + array[i].getBmi("GRADE") +  " " +array[i].getType() + "莫");
		}
		

	} //main
} //class

/*

1腰属 噺据税 戚硯聖 脊径馬室推 : a
1腰属 噺据税 持鰍杉析聖 脊径馬室推 : 101010
1腰属 噺据税 徹研 脊径馬室推 : 185
1腰属 噺据税 倖巷惟研 脊径馬室推 : 87
1腰属 噺据税 迫衝莫聖 脊径馬室推 : a

2腰属 噺据税 戚硯聖 脊径馬室推 : b
2腰属 噺据税 持鰍杉析聖 脊径馬室推 : 050505
2腰属 噺据税 徹研 脊径馬室推 : 175
2腰属 噺据税 倖巷惟研 脊径馬室推 : 95
2腰属 噺据税 迫衝莫聖 脊径馬室推 : b

3腰属 噺据税 戚硯聖 脊径馬室推 : c
3腰属 噺据税 持鰍杉析聖 脊径馬室推 : 020202
3腰属 噺据税 徹研 脊径馬室推 : 162
3腰属 噺据税 倖巷惟研 脊径馬室推 : 45
3腰属 噺据税 迫衝莫聖 脊径馬室推 : o

4腰属 噺据税 戚硯聖 脊径馬室推 : d
4腰属 噺据税 持鰍杉析聖 脊径馬室推 : 040404
4腰属 噺据税 徹研 脊径馬室推 : 170
4腰属 噺据税 倖巷惟研 脊径馬室推 : 65
4腰属 噺据税 迫衝莫聖 脊径馬室推 : a

5腰属 噺据税 戚硯聖 脊径馬室推 : e
5腰属 噺据税 持鰍杉析聖 脊径馬室推 : 060606
5腰属 噺据税 徹研 脊径馬室推 : 173
5腰属 噺据税 倖巷惟研 脊径馬室推 : 95
5腰属 噺据税 迫衝莫聖 脊径馬室推 : b

a 9室 25.0 搾幻 A莫
b 14室 31.0 搾幻 B莫
c 17室 17.0 煽端掻 O莫
d 15室 22.0 舛雌端掻 A莫
e 13室 32.0 搾幻 B莫

*/