package crawler.example;

import com.github.abola.crawler.CrawlerPack;

import org.apache.commons.logging.impl.SimpleLog;
import org.jsoup.select.Elements;

/**
 * 爬蟲包程式的全貌，就只有這固定的模式
 * 
 * @author Abola Lee
 *
 */
public class Ptttest {
	// commit test test
	public static void main(String[] args) {

		// set to debug level
		//CrawlerPack.setLoggerLevel(SimpleLog.LOG_LEVEL_DEBUG);

		// turn off logging
		CrawlerPack.setLoggerLevel(SimpleLog.LOG_LEVEL_OFF);

		// 遠端資料路徑
		String uri = "https://www.ptt.cc/bbs/Gossiping/M.1512869983.A.0F1.html";
		Elements jsoup =CrawlerPack.start()

				// 參數設定
			    .addCookie("over18","1")	// 設定cookie


				
				// 選擇資料格式 (三選一)
				.getFromHtml(uri)

			    // 這兒開始是 Jsoup Document 物件操作
			    .select("#main-content");

				System.out.println(jsoup.select("span,div").remove().text());


	}
}
