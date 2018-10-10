package testShuZhu;
class Date{
	int year,month,day;
	Date(int y,int m,int d){
		year = y;
		month = m;
		day = d;
	}
	Date(){
	}
	public  int Compare(Date d){
		return year>d.year?1:year<d.year?-1
				:month>d.month?1:d.month<month?-1
						:day>d.day?1:-1;
	}
	  public String toString(){
			return "Year:Month:Day -- " + year + "-" + month + "-" + day;
		  }
}
public class XuanZePaiXu {

	public static void main(String[] args) {
		Date[]date = new Date[5];
		date[0] = new Date(2012,12,20);
		date[1] = new Date(2013,1,20);
		date[2] = new Date(2016,11,20);
		date[3] = new Date(2022,12,22);
		date[4] = new Date(2010,12,10);
		Date temp = new Date();
		int k;
		for(int i=0;i<date.length;i++){//Ñ¡ÔñÅÅÐò  
			k = i;
			for(int j=i+1;j<date.length;j++){
				if(date[k].Compare(date[j])>0){
					k = j;
				}
			}
			temp = date[i];
			date[i] = date[k];
			date[k] = temp;
		}
		for(int i=0;i<date.length;i++)
			System.out.println(date[i]);
	}
}
