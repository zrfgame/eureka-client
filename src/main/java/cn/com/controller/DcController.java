package cn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DcController {
	@Autowired
    DiscoveryClient discoveryClient;//通过DiscoveryClient对象，在日志中打印出服务实例的相关内容。
	@ResponseBody
	@RequestMapping("/dc")
	public String dc() {
		 String services = "Services: " + discoveryClient.getServices();
	     System.out.println(services);
	     return services;
	}
}
