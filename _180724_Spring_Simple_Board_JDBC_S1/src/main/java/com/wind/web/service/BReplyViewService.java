package com.wind.web.service;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import com.wind.web.dao.BDao;
import com.wind.web.dto.BDto;

public class BReplyViewService implements BService {

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bId = request.getParameter("bId");
		
		BDao dao = new BDao();
		BDto dto = dao.reply_view(bId);
		
		model.addAttribute("reply_view", dto);		
	}

}
