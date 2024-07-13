import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoField;
import java.util.Date;

public class Time {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

	public static void getTime() {
		
		LocalDateTime now = LocalDateTime.now();
		
		int hour = now.getHour();
		int min = now.getMinute();
		int sec = now.getSecond();
		int millis = now.get(ChronoField.MILLI_OF_SECOND);
		
	}

}
