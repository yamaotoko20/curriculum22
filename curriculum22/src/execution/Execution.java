package execution;

import process.Process;


public class Execution {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Process processor = new Process();	//Processクラスのインスタンスprocessorを生成
        processor.greet();		//processorインスタンスのgreet()メソッドを呼び出し
        processor.sushiInfo();	//sushiInfo()メソッドを呼び出し
        processor.dateTimeInfo(); //dateTimeInfo()メソッドを呼び出し
    
	}

}
/*

下記がコンソールに出力されるように作成してください

	こんにちは！ここは日本です！
	この寿司はうまい
	寿司は和食です
	今の現在日時は2023/03/09 10:23:39です

【条件】
	・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
	・適切なファイルにフィールドで変数を必要な数作ってください。
	・thisを使って作成してください。
	・日時は今日の日付を取得してください。
	
*/