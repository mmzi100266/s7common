package cn.sunjiachao.s7common.benchmark.mq;

import cn.sunjiachao.s7common.utils.BytesMaker;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

public class Producer {

	static String newlog = "{\"status\":\"n\",\"hdtcid\":\"CAESEHhczeECGlfnYZmYTaU5N9g\",\"bidRequestObject\":{\"id\":\"ad82c900696c60bf7ef1b3376c654018\",\"imp\":[{\"id\":\"0\",\"banner\":{\"id\":\"mm_123_456_789\",\"h\":250,\"w\":250,\"battr\":[104,103]},\"tagid\":\"mm_123_456_789\",\"bidfloor\":10000.0,\"bidfloorcur\":\"CNY\",\"ext\":{\"viewType\":[4],\"excludedAdCategory\":[60102],\"excludedSensitiveCategory\":[50002]}}],\"site\":{\"id\":\"\",\"cat\":\"IAB1-6\",\"page\":\"http://www.google.com/finance?hl=en&ned=us&tab=ne\"},\"device\":{\"ip\":\"180.137.96.1\",\"ua\":\"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.8.1.2pre)\",\"language\":\"en\"},\"user\":{\"id\":\"CAESEHhczeECGlfnYZmYTaU5N9g\"},\"badv\":[\"http://www.hdtmedia.com\"],\"ext\":{\"category_version\":1,\"tid_version\":1,\"timezone_offset\":480,\"is_ping\":0,\"is_test\":0},\"requestSrc\":\"tanx\",\"bidRequestParser\":{\"clientIpAddress\":\"180.137.96.1\"}},\"hdtBid\":null,\"beginDate\":1356317560517}";
	static String bidlog = "{\"bidRequestID\":\"1234534625254\",\"campaignID\":201,\"ckey\":\"shanda_banner_js_image\",\"class\":\"com.hdtmedia.dsp.common.model.HdtBid\",\"clickUrls\":\"http://www.baidu.com\",\"createID\":605,\"creativeType\":\"JPG\",\"date\":1357881962544,\"flightID\":416,\"hdtcid\":\"456789876567897654678987656789\",\"id\":\"45afb04f94c68dd9\",\"impID\":\"3000\",\"isTest\":0,\"nurl\":\"http://map.ra.icast.cn:8000/dsp-adserver/shanda/win?hdtid=Cg0xMjM0NTM0NjI1MjU0EgZzaGFuZGEaBDMwMDAiEDQ1YWZiMDRmOTRjNjhkZDkqAzIwMTIDNDE2OgM2MDVCHjQ1Njc4OTg3NjU2Nzg5NzY1NDY3ODk4NzY1Njc4OUjAhD1SFnNoYW5kYV9iYW5uZXJfanNfaW1hZ2VYAGIeNDU2Nzg5ODc2NTY3ODk3NjU0Njc4OTg3NjU2Nzg5\",\"price\":1000000,\"resourceName\":\"shanda\",\"status\":null,\"url\":\"http://10.10.4.58/4161355970219632641866.jpg\",\"userCookieID\":\"456789876567897654678987656789\"}";
	static String winlog1 = "{\"bidID\":\"e3b87218a7fb3f59\",\"ckeID\":\"c1foXbD1UMIfn8XQBiO5Obxv\",\"ckey\":\"tanx_banner_iframe_image\",\"class\":\"com.hdtmedia.dsp.common.model.HdtWinNotice\",\"clkURL\":null,\"cpnID\":201,\"ctvID\":605,\"fltID\":416,\"hdtcid\":\"c1foXbD1UMIfn8XQBiO5Obxv\",\"impID\":\"0\",\"isTest\":0,\"price\":1000000,\"receivedDate\":1357458057926,\"reqID\":\"96c4394c01bb7952a9fad94c5d3d1cd6\",\"src\":\"tanx\",\"ua\":null,\"winingPrice\":null}";

	/**
	 * @param args
	 * @throws Exception
	 *             消息入队列测试，接受三个参数： 1、队列名，默认为single。 2、每条消息大小，，默认值为1kByte。
	 *             3、消息是否持久化，默认为不持久化。 使用示例：SignleSender myqueue 1024 true
	 */
	public static void main(String[] args) throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();

		byte[] data = BytesMaker.make1k();
		data = newlog.getBytes();
		boolean durable = false;
		String queue = "single";
		int count = 100000;

		if (args.length > 0) {
			queue = args[0];
		}

		if (args.length > 1) {
			data = BytesMaker.makeBytes(Integer.valueOf(args[1]));
			System.out.println(args[1] + " Bytes per msg");
		}

		if (args.length > 2) {
			// durable = Boolean.valueOf(args[2]);
			durable = true;
		}

		if (args.length > 3) {
			count = Integer.valueOf(args[3]);
		}

		// BasicProperties props = durable ?
		// MessageProperties.PERSISTENT_TEXT_PLAIN : null;

		BasicProperties props = MessageProperties.PERSISTENT_TEXT_PLAIN;
		// BasicProperties props = null;
		channel.queueDeclare(queue, true, false, false, null);

		long start = System.currentTimeMillis();
		for (int i = 0; i < count / 10000; i++) {
			long inner_start = System.currentTimeMillis();
			for (int j = 0; j < 10000; j++)
				channel.basicPublish("", queue, props, data);
			long inner_end = System.currentTimeMillis();
			System.out.println("round " + (i + 1) + " takes "
					+ (inner_end - inner_start) + " millseconds ");
		}
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("It takes " + time + " millseconds to send " + count
				+ " message to queue");
		channel.close();
		connection.close();
	}

}
