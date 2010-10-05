package jowambi.springapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.log.LogService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {
	private LogService logService;
	protected final Log logger = LogFactory.getLog(getClass());
	
	public void setLogService(LogService logService) {
		this.logService = logService;
		System.out.println("Set LogService...");
	}

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("Returning hello view");
		logService.log(LogService.LOG_INFO, "===== Returning hello view =====");
		System.out.println("stdout - Returning hello view");

		return new ModelAndView("hello.jsp");
	}
}