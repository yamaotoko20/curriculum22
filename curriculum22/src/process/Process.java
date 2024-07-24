package process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Process {
		private String location;//変数locationを設定
	    private String sushiTaste;//変数sushiTasteを設定
	    private String sushiType;//変数sushiTypeを設定
	    private LocalDateTime currentDateTime;//変数currentDateTimeを設定

	    
	    
	    public Process() {
	        this.location = "日本";//locationに"日本"を出力
	        this.sushiTaste = "うまい";//sushiTasteに"うまい"を出力
	        this.sushiType = "和食";//sushiTypeに"和食"を出力
	        this.currentDateTime = LocalDateTime.now();//currentDateTimeに現在の日時を出力
	    }

	    public void greet() {
	        if (this.location != null) {
	            System.out.println("こんにちは！ここは" + this.location + "です！");
	        } else {
	            System.out.println("場所がnullです。処理を続行できません。");
	        }
	    }

	    public void sushiInfo() {
	        if (this.sushiTaste != null && this.sushiType != null) {
	            System.out.println("この寿司は" + this.sushiTaste);
	            System.out.println("寿司は" + this.sushiType + "です");
	        } else {
	            System.out.println("寿司の情報がnullです。処理を続行できません。");
	        }
	    }

	    public void dateTimeInfo() {
	        if (this.currentDateTime != null) {
	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	            String formattedDateTime = currentDateTime.format(formatter);
	            System.out.println("今の現在日時は" + formattedDateTime + "です");
	        } else {
	            System.out.println("日時情報がnullです。処理を続行できません。");
	        }
	    }
}
