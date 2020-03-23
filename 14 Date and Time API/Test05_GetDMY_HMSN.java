//Test05_GetDMY_HMSN.java

import java.time.LocalDateTime;

class Test05_GetDMY_HMSN {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yyyy = dt.getYear();
		System.out.printf("%d-%d-%d\n",dd,mm,yyyy);

		int h = dt.getHour();
		int m = dt.getMinute();
		int s = dt.getSecond();
		int n = dt.getNano();
		System.out.printf("%d:%d:%d:%d\n",h,m,s,n);
	}
}

