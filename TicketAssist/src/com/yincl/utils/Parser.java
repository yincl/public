package com.yincl.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import com.yincl.vo.Ticket;

/**
 * @todo 车票信息解析类
 * @author qdyincl
 * @since 2013-01-17
 */
public class Parser {

	String html = "0,<span id='id_240000D33102' class='base_txtdiv' onmouseover=javascript:onStopHover('240000D33102#VNP#QDK') onmouseout='onStopOut()'>D331</span>,<img src='/otsweb/images/tips/first.gif'>&nbsp;&nbsp;&nbsp;&nbsp;北京南&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;07:10,<img src='/otsweb/images/tips/last.gif'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;青岛&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;12:22,05:12,19,--,<font color='#008800'>有</font>,<font color='#008800'>有</font>,--,--,--,--,--,<font color='darkgray'>无</font>,--,<a name='btn130_2' class='btn130_2' style='text-decoration:none;' onclick=javascript:getSelected('D331#05:12#07:10#240000D33102#VNP#QDK#12:22#北京南#青岛#01#10#O*****03139*****0019M*****0087O*****3000#7C88495769FBB7BBC64A1B34ADDD2ECBDD154E7C57A596ADF6EAF245#P2')>预&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订</a>\n1,<span id='id_240000G18500' class='base_txtdiv' onmouseover=javascript:onStopHover('240000G18500#VNP#QDK') onmouseout='onStopOut()'>G185</span>,<img src='/otsweb/images/tips/first.gif'>&nbsp;&nbsp;&nbsp;&nbsp;北京南&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;07:45,<img src='/otsweb/images/tips/last.gif'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;青岛&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;12:06,04:21,20,--,<font color='#008800'>有</font>,<font color='#008800'>有</font>,--,--,--,--,--,--,--,<a name='btn130_2' class='btn130_2' style='text-decoration:none;' onclick=javascript:getSelected('G185#04:21#07:45#240000G18500#VNP#QDK#12:06#北京南#青岛#01#05#O*****0581M*****01099*****0020#240BF9626901644C12241A3E7156023F452C2DEEECF159946B110739#P2')>预&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订</a>\n2,<span id='id_240000D33303' class='base_txtdiv' onmouseover=javascript:onStopHover('240000D33303#VNP#QDK') onmouseout='onStopOut()'>D333</span>,<img src='/otsweb/images/tips/first.gif'>&nbsp;&nbsp;&nbsp;&nbsp;北京南&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;08:53,<img src='/otsweb/images/tips/last.gif'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;青岛&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;14:09,05:16,18,--,<font color='#008800'>有</font>,<font color='darkgray'>无</font>,--,--,--,--,--,<font color='darkgray'>无</font>,--,<a name='btn130_2' class='btn130_2' style='text-decoration:none;' onclick=javascript:getSelected('D333#05:16#08:53#240000D33303#VNP#QDK#14:09#北京南#青岛#01#10#O*****00009*****0018O*****3000M*****0076#A6344D22C0925221F0A310AB07E080D53095AE1310FEEFACF0398074#P2')>预&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订</a>\n3,<span id='id_240000D33502' class='base_txtdiv' onmouseover=javascript:onStopHover('240000D33502#VNP#QDK') onmouseout='onStopOut()'>D335</span>,<img src='/otsweb/images/tips/first.gif'>&nbsp;&nbsp;&nbsp;&nbsp;北京南&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;10:21,<img src='/otsweb/images/tips/last.gif'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;青岛&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;15:44,05:23,19,--,<font color='#008800'>有</font>,<font color='darkgray'>无</font>,--,--,--,--,--,<font color='darkgray'>无</font>,--,<a name='btn130_2' class='btn130_2' style='text-decoration:none;' onclick=javascript:getSelected('D335#05:23#10:21#240000D33502#VNP#QDK#15:44#北京南#青岛#01#09#O*****00009*****0019M*****0039O*****3000#AB2B8B544F908BAC1B961E36916649292C41B967B163CAD547D153B5#P2')>预&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订</a>\n4,<span id='id_240000D33702' class='base_txtdiv' onmouseover=javascript:onStopHover('240000D33702#VNP#QDK') onmouseout='onStopOut()'>D337</span>,<img src='/otsweb/images/tips/first.gif'>&nbsp;&nbsp;&nbsp;&nbsp;北京南&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;11:24,<img src='/otsweb/images/tips/last.gif'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;青岛&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;16:51,05:27,20,--,<font color='#008800'>有</font>,<font color='darkgray'>无</font>,--,--,--,--,--,1,--,<a name='btn130_2' class='btn130_2' style='text-decoration:none;' onclick=javascript:getSelected('D337#05:27#11:24#240000D33702#VNP#QDK#16:51#北京南#青岛#01#10#O*****00009*****0020M*****0083O*****3001#385C46B2468164061AEAD02978588CF5AA84FE6FA8B48B4FAD71E9AC#P2')>预&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订</a>\n5,<span id='id_240000G18700' class='base_txtdiv' onmouseover=javascript:onStopHover('240000G18700#VNP#QDK') onmouseout='onStopOut()'>G187</span>,<img src='/otsweb/images/tips/first.gif'>&nbsp;&nbsp;&nbsp;&nbsp;北京南&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;13:11,<img src='/otsweb/images/tips/last.gif'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;青岛&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;17:50,04:39,20,--,<font color='#008800'>有</font>,<font color='#008800'>有</font>,--,--,--,--,--,--,--,<a name='btn130_2' class='btn130_2' style='text-decoration:none;' onclick=javascript:getSelected('G187#04:39#13:11#240000G18700#VNP#QDK#17:50#北京南#青岛#01#08#O*****0612M*****00819*****0020#A4D26E541FD243CC17B7EF39FA8AD9A189AABED56E50E16C17BD5C6A#P3')>预&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订</a>\n6,<span id='id_240000G18901' class='base_txtdiv' onmouseover=javascript:onStopHover('240000G18901#VNP#QDK') onmouseout='onStopOut()'>G189</span>,<img src='/otsweb/images/tips/first.gif'>&nbsp;&nbsp;&nbsp;&nbsp;北京南&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;13:48,<img src='/otsweb/images/tips/last.gif'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;青岛&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;18:11,04:23,18,--,<font color='#008800'>有</font>,<font color='#008800'>有</font>,--,--,--,--,--,--,--,<a name='btn130_2' class='btn130_2' style='text-decoration:none;' onclick=javascript:getSelected('G189#04:23#13:48#240000G18901#VNP#QDK#18:11#北京南#青岛#01#05#O*****0657M*****00929*****0018#A375D05D7B3CF6C0EB9B3A1557F24D66974680EF075C157C585A9E1F#P2')>预&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订</a>\n7,<span id='id_240000D33905' class='base_txtdiv' onmouseover=javascript:onStopHover('240000D33905#VNP#QDK') onmouseout='onStopOut()'>D339</span>,<img src='/otsweb/images/tips/first.gif'>&nbsp;&nbsp;&nbsp;&nbsp;北京南&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;14:29,<img src='/otsweb/images/tips/last.gif'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;青岛&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;19:48,05:19,--,<font color='#008800'>有</font>,<font color='#008800'>有</font>,<font color='#008800'>有</font>,--,--,--,--,--,1,--,<a name='btn130_2' class='btn130_2' style='text-decoration:none;' onclick=javascript:getSelected('D339#05:19#14:29#240000D33905#VNP#QDK#19:48#北京南#青岛#01#11#O*****0226M*****0127O*****3001P*****0027#6595A1866579F09116B71CBBA8335A7158D49B2669708CFA0730E977#P2')>预&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订</a>\n8,<span id='id_240000G19103' class='base_txtdiv' onmouseover=javascript:onStopHover('240000G19103#VNP#QDK') onmouseout='onStopOut()'>G191</span>,<img src='/otsweb/images/tips/first.gif'>&nbsp;&nbsp;&nbsp;&nbsp;北京南&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;15:44,<img src='/otsweb/images/tips/last.gif'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;青岛&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;20:14,04:30,--,12,<font color='#008800'>有</font>,<font color='#008800'>有</font>,--,--,--,--,--,--,--,<a name='btn130_2' class='btn130_2' style='text-decoration:none;' onclick=javascript:getSelected('G191#04:30#15:44#240000G19103#VNP#QDK#20:14#北京南#青岛#01#06#O*****0184M*****0077P*****0012#6898ADC662985AC791A60037CD680BBDB6673977FFAE65D6D13DF15E#P3')>预&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订</a>\n9,<span id='id_240000G19301' class='base_txtdiv' onmouseover=javascript:onStopHover('240000G19301#VNP#QDK') onmouseout='onStopOut()'>G193</span>,<img src='/otsweb/images/tips/first.gif'>&nbsp;&nbsp;&nbsp;&nbsp;北京南&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;16:37,<img src='/otsweb/images/tips/last.gif'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;青岛&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;21:11,04:34,20,--,<font color='#008800'>���</font>,<font color='#008800'>有</font>,--,--,--,--,--,--,--,<a name='btn130_2' class='btn130_2' style='text-decoration:none;' onclick=javascript:getSelected('G193#04:34#16:37#240000G19301#VNP#QDK#21:11#北京南#青岛#01#07#O*****0658M*****01079*****0020#B0CDFFC4759CBF303A03A52C6EBF034EB9B85ADE7D76E9912C8E9AFA#P2')>预&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订</a>\n10,<span id='id_240000G19505' class='base_txtdiv' onmouseover=javascript:onStopHover('240000G19505#VNP#QDK') onmouseout='onStopOut()'>G195</span>,<img src='/otsweb/images/tips/first.gif'>&nbsp;&nbsp;&nbsp;&nbsp;北京南&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;17:10,<img src='/otsweb/images/tips/last.gif'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;青岛&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;22:04,04:54,20,--,<font color='#008800'>有</font>,<font color='#008800'>有</font>,--,--,--,--,--,--,--,<a name='btn130_2' class='btn130_2' style='text-decoration:none;' onclick=javascript:getSelected('G195#04:54#17:10#240000G19505#VNP#QDK#22:04#北京南#青岛#01#09#O*****0662M*****01029*****0020#27EF50F1CD935B91D6465898A38C92BB49189209A8F956D871D86D86#P3')>预&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订</a>\n11,<span id='id_240000D34105' class='base_txtdiv' onmouseover=javascript:onStopHover('240000D34105#VNP#QDK') onmouseout='onStopOut()'>D341</span>,<img src='/otsweb/images/tips/first.gif'>&nbsp;&nbsp;&nbsp;&nbsp;北京南&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;17:31,<img src='/otsweb/images/tips/last.gif'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;青岛&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;22:38,05:07,--,<font color='#008800'>有</font>,<font color='#008800'>有</font>,<font color='#008800'>有</font>,--,--,--,--,--,<font color='#008800'>有</font>,--,<a name='btn130_2' class='btn130_2' style='text-decoration:none;' onclick=javascript:getSelected('D341#05:07#17:31#240000D34105#VNP#QDK#22:38#北京南#青岛#01#11#O*****0505O*****3107M*****0134P*****0030#257EB10766843415D20C77B0CEA67626053BA6761B5AEECD410564C3#P2')>预&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订</a>";

	public List<Ticket> doParse(String html) throws Exception {
		List<Ticket> tickets = new ArrayList<Ticket>();

		String[] msgs = html.split("\n");
		for (int i = 0; i < msgs.length; i++) {
			String line = msgs[i].replace("&nbsp;", "");
			String[] columns = line.split(",");
			Ticket ticket = new Ticket();
			// 列车班次
			Element span = Jsoup.parseBodyFragment(columns[1]).body().getElementsByTag("span").get(0);
			ticket.setTransCode(span.text());
			// 列车信息
			Element link = Jsoup.parseBodyFragment(columns[16]).body().getElementsByTag("a").get(0);
			String[] basicInfos = link.attr("onclick").split("#");
			ticket.setSn(basicInfos[3]);
			ticket.setCostTime(basicInfos[1]);
			ticket.setFromTime(basicInfos[2]);
			ticket.setFromName(basicInfos[7]);
			ticket.setFromCode(basicInfos[4]);
			ticket.setToCode(basicInfos[5]);
			ticket.setToName(basicInfos[8]);
			ticket.setToTime(basicInfos[6]);
			ticket.setVerifySn(basicInfos[12]);
			// 商务座
			ticket.setBusinessChair(this.processChair(columns[5]));
			// 特等座
			ticket.setSpecialChair(this.processChair(columns[6]));
			// 一等座
			ticket.setFirstChair(this.processChair(columns[7]));
			// 二等座
			ticket.setSecondChair(this.processChair(columns[8]));
			// 高级软卧
			ticket.setAdvancedSoftBed(this.processChair(columns[9]));
			// 软卧
			ticket.setSoftBed(this.processChair(columns[10]));
			// 硬卧
			ticket.setHardBed(this.processChair(columns[11]));
			// 软座
			ticket.setSoftChair(this.processChair(columns[12]));
			// 硬座
			ticket.setHardChair(this.processChair(columns[13]));
			// 无座
			ticket.setNoChair(this.processChair(columns[14]));
			// 其他
			ticket.setOtherChair(this.processChair(columns[15]));
			tickets.add(ticket);
		}
		return tickets;
	}

	/**
	 * @todo 票座信息处理
	 * @param chairColumn
	 * @return
	 * @throws Exception
	 */
	private String processChair(String chairColumn) throws Exception {
		// 参数检查
		if (chairColumn == null) {
			throw new Exception("非法参数异常！");
		}
		if ("--".equals(chairColumn.trim())) {
			return null;
		}
		if (chairColumn.contains("font")) {
			Element font = Jsoup.parseBodyFragment(chairColumn).body().getElementsByTag("font").get(0);
			return font.text();
		}
		return chairColumn;
	}

	public static void main(String[] args) throws Exception {
		Parser parser = new Parser();
		List<Ticket> tickets = parser.doParse(parser.html);
		for (Iterator<Ticket> iterator = tickets.iterator(); iterator.hasNext();) {
			Ticket t = iterator.next();
			System.out.println(t.getSn());
			System.out.println(t.getFromCode() + "/" + t.getToName() + "/" + t.getCostTime());
			System.out.println(t.getAdvancedSoftBed());
			System.out.println(t.getFirstChair());
			System.out.println(t.getSecondChair());
		}

	}
}
