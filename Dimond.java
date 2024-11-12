import java.util.*;
class Main
{
	public static void main(String[]argsa)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("----------Welcom to Dimond Pattern Project----------");
		System.out.println("Enter 1 : EMPTY DIMOND PATTERN");
		System.out.println("Enter 2 : FULL DIMOND PATTERN");
		System.out.println("Enter 3 : INVERSE DIMOND PATTERN");
		System.out.println("Enter 4 : DIMOND PATTERN USING NUMBER");
		System.out.println("Enter 5 : DIFFERENT DIMOND PATTERN USING NUMBER");
		System.out.println("Enter 6 : HALF DIMOND PATTERN 1");
		System.out.println("Enter 7 : HALF DIMOND PATTERN 2");
		System.out.println("Enter 8 : EXIT");
		System.out.println("----------Thank you----------");
		int choice=sc.nextInt();
		while(true)
		{
			switch(choice)
			{
				case 1:
				A a=new A();
				a.pattern1();
				break;
			
				
				case 2:
				B b=new B();
				b.pattern2();
				break;
				
				case 3:
				C c=new C();
				c.pattern3();
				break;
				
				
				case 4:
				D d=new D();
				d.pattern4();
				break;
				
				
				case 5:
				E e=new E();
				e.pattern5();
				break;
				
				
				case 6:
				F f=new F();
				f.pattern6();
				break;
				
				
				case 7:
				G g=new G();
				g.pattern7();
				break;
				
				case 8:
				System.exit(0);
				break;
				
				default:
				System.out.println("Invalid choice, please try again");
			}

		}
		
	}
}
class A
{
	void pattern1()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.print("enter the symbol=");
		String m=sc.nextLine();
		System.out.println("--------------------------------------");
		System.out.print("enter a num=");
		int n=sc.nextInt();
		System.out.println("--------------------------------------");
		
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<n;j++)
			{
				if(i==j)
				{
					System.out.print(m);
				}
				else
				{					
					System.out.print(" ");
				}
			}
			for(int j=n;j>=1;j--)
			{
				if(i==j)
				{
				System.out.print(m);
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		for(int i =1;i<n+1;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(i==j)
				System.out.print(m);
				else 
					System.out.print(" ");
			}
			for(int j=n;j>=1;j--)
			{
				if(i==j)
				System.out.print(m);
				else 
					System.out.print(" ");
			}
			
			System.out.println();
		}
		System.out.println("--------------------------------------");
	}
}
class B
{
	void pattern2()
	{
		int r,i,j;
		int space=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.print("enter the symbol=");
		String o=sc.nextLine();
		System.out.println("--------------------------------------");
		System.out.print("enter the number of row=");
		r = sc.nextInt();
		System.out.println("--------------------------------------");
		space=r-1;
		
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=space;j++)
			{ 
				System.out.print(" ");
			}
			space--;
			for(j=1;j<=2*i-1;j++)
			{
				System.out.print(o);
			}
			System.out.println("");
		}
		space=1;
		for(i=1;i<=r-1;i++)
		{
			for(j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space++;
			for(j=1;j<=2*(r-i)-1;j++)
			{
				System.out.print(o);
			}
			
			System.out.println("");
		}
		System.out.println("--------------------------------------");
	}
}
class C
{
	void pattern3()
	{
		System.out.println();
		int i,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.print("enter the symbol=");
		String m=sc.nextLine();
		System.out.println("--------------------------------------");
		System.out.print("Inverse Dimond Pattern for number=");
		int l=sc.nextInt();
		System.out.println("--------------------------------------");
		
		for(i=0; i<l; i++)
		{
			for(j=i; j<l; j++)
			{
				System.out.print(m);
			}
			for(j=0; j<2*i+1; j++)
			{
				System.out.print(" ");
			}
			for(j=i; j<l; j++)
			{
				System.out.print(m);
			}
			System.out.println();
		}
		for(i=0; i<l-1; i++)
		{
			for(j=0; j<i+2; j++)
			{
				System.out.print(m);
			}
			for(j=0; j<2*(l-1-i)-1; j++)
			{
				System.out.print(" ");
			}
			for(j=0; j<i+2; j++)
			{
				System.out.print(m);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("--------------------------------------");
	}
}
class D
{
	void pattern4()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.print("enter the odd number=");
		int k=sc.nextInt();
		System.out.println("--------------------------------------");
		int space=k/2,number=1;
		for(int i=1; i<=k; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			int count=number/2 + 1;
			for(int p=1; p<=number; p++)
			{
				System.out.print(count);
				if(p<=number/2)
				{
					count--;
				}
				else
				{
					count++;
				}
			}
				System.out.println();
				if(i<=k/2)
				{
					space=space-1;
					number=number+2;
				}
				else
				{
					space=space+1;
					number=number-2;
				}
		}System.out.println("--------------------------------------");
	}
}
class E
{
	void pattern5()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.print("enter a num=");
		int n=sc.nextInt();
		System.out.println("--------------------------------------");
		
		for(int i=1 ;i<=n; i++)
		{
			for(int j=n; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print(k+" ");
			}
			
			System.out.println();
		}
		
		for(int i =1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{ 
				System.out.print(" ");
			}
			for(int k=1; k<=n-i; k++)
			{
				System.out.print(k+" ");
			}
			
			System.out.println();
		}
		System.out.println("--------------------------------------");
	}
}
class F
{
	void pattern6()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.print("enter the symbol=");
		String r=sc.nextLine();
		System.out.println("--------------------------------------");
		System.out.print("enter number =");
		int n=sc.nextInt();
		System.out.println("--------------------------------------");
		for(int i=1 ;i<=n; i++)
		{
			for(int j=n; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print(r);
			}
			
			System.out.println();
		}
		
		for(int i=1; i<=n-1; i++)
		{
			for(int j=1; j<=i; j++)
			{ 
				System.out.print(" ");
			}
			for(int k=n-1; k>=i; k--)
			{
				System.out.print(r);
			}
			
			System.out.println();
		}
		System.out.println("--------------------------------------");
	}
}
class G
{
	void pattern7()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.print("enter the symbol=");
		String m=sc.nextLine();
		System.out.println("--------------------------------------");
		System.out.print("enter number =");
		int n=sc.nextInt();
		System.out.println("--------------------------------------");
		for(int i=1 ;i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(m);
			}
			
			System.out.println();
		}
		
		for(int i=1; i<=n-1; i++)
		{
			for(int j=n-1; j>=i; j--)
			{ 
				System.out.print(m);
			}
			for(int k=1; k<i; k++)
			{
				System.out.print(" ");
			}
			
			System.out.println();
		}
		System.out.println("--------------------------------------");
	}
}