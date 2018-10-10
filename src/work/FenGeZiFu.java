package work;

public class FenGeZiFu {

	public static void main(String[] args) {
		String s = "1,2;3,4,5;6,7,8";
		double d[][] =jieXi(s);
		for(int i=0;i<d.length;i++)
			for(int j=0;j<d[i].length;j++){
				System.out.println("d["+i+"]["+j+"]"+d[i][j]);
			}
	}
/*	public static double[][] jieXi(String s){//方法一
		String []split1 = s.split(";");
		String [][]a = new String[split1.length][];
		for(int i=0;i<split1.length;i++){
			a[i] = split1[i].split(",");
		}
		double [][]b = new double[a.length][];
		for(int i=0;i<a.length;i++){
			b[i] = new double[a[i].length];
			for(int j=0;j<a[i].length;j++){
				b[i][j] = Double.parseDouble(a[i][j]);
			}
		}
		return b;
	}
*/
	public static double[][] jieXi(String s){//方法二
		String []split1 = s.split(";");
		double [][]a = new double[split1.length][];
		for(int i=0;i<split1.length;i++){
			String []split2 = split1[i].split(",");
			a[i] = new double[split2.length];
			for(int j=0;j<split2.length;j++){
					a[i][j] = Double.parseDouble(split2[j]);
			}
		}
		return a;
	}


}
