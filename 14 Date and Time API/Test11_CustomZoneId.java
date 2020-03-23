//Test11_CustomZoneId.java

import java.time.ZoneId;
import java.time.ZonedDateTime;

class Test11_CustomZoneId {
	
	public static void main(String[] args) {
		ZoneId la = ZoneId.of("America/Los_Angles");
		ZonedDateTime zdt = ZonedDateTime.now(la);
		System.out.println(zdt);
	}
}
