package a3tech_Mock.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import a3tech_Mock.A3techNotification;
import a3tech_Mock.interfaces.IA3techNotification;

@Controller
public class NotificationController implements IA3techNotification{

	@RequestMapping(method = RequestMethod.POST, value = "/notification/createNotification")
	@ResponseBody
	@Override
	public String createNotification(@RequestParam("lang") String  notification) {
		A3techNotification notificationToCreate = new Gson().fromJson(notification, A3techNotification.class);
		Gson ss = new Gson();
		JsonObject jj = new JsonObject();
		jj.addProperty("result", new Gson().toJson(notificationToCreate));
		return jj.toString();
	}

	@Override
	public List<A3techNotification> filtreNotification(String lang, Long connectedUser, String keyWord, String start,
			String limit, String key, Long missionID, Long userTechID, String password, int order, int type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteNotification(Long idNotification, Long idUser, String password, boolean isTech) {
		// TODO Auto-generated method stub
		return null;
	}

}
