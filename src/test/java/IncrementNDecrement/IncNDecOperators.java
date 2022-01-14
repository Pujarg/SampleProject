package IncrementNDecrement;

public class IncNDecOperators {
		public static void main(String[] args) {
			
			//++ And --
			int a = 1;
			a = a+1;
			System.out.println(a); //2
			System.out.println(++a); //a=2 then 2+1=3
			
			//Pre-Increment (++Variable)
			int i = 1;
			int j = ++i;
			System.out.println(i);//2-->Top to Bottom
			System.out.println(j);//2
			
			//Post-Increment (Variable++)
			int p = 1;
			int q = p++;
			System.out.println(p);//2-->first coming variable got assigned and then p got update
			System.out.println(q);//1--> left to right execution
			
			
			//Pre-decrement (--Variable)
			int m = 2;
			int n = --m;
			System.out.println(m);//1
			System.out.println(n);//1
			
			//Post-Decrement (Variable--)
			int c = 0;
			int d = c--;
			System.out.println(c);//-1
			System.out.println(d);//0
			
			int f = -1;
			int g = --f;
			System.out.println(f); //-2
			System.out.println(g); //-2 (f-1)
		}

}
